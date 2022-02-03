package com.ai;
import java.util.*;

public class DFS 
{
	public static void dfs(int[][] g,int start)
	{
		boolean[] visited=new boolean[g.length];
		visited[start-1] = true;
	    Stack<Integer> stack = new Stack<>();
	    stack.push(start);
	    int i,x;
	    System.out.println("The depth first order till goal node is:");
        System.out.println(start);
        while(!stack.isEmpty())
        {
        	x = stack.pop();
            for(i=0; i<g.length; i++)
            {
                if(g[x-1][i] == 1 && visited[i] == false)
                {
                	stack.push(x);
                    visited[i] = true;
                    System.out.println(i+1);
                    x = i+1;
                    i = -1;
                }
            }
        }
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of vertices of graph:");
		int v=s.nextInt();
		int g[][]=new int[v][v];
		System.out.println("Enter the adjacency matrix of the graph:");
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				g[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter start vertex of graph:");
		int start=s.nextInt();
		System.out.println("Enter goal vertex of graph:");
		int goal=s.nextInt();
		dfs(g,start);
	}
}