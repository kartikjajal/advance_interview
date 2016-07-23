package com.jpmorgan.example.shortes.path;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
	public static void computePaths(Vertex source) {
		source.minDistance = 0.;
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(source);

		while (!vertexList.isEmpty()) {
			Vertex u = vertexList.remove(0);

			// Visit each edge exiting u
			for (Edge e : u.adjacencies) {
				Vertex v = e.target;
				double weight = e.weight;
				double distanceThrough = u.minDistance + weight;
				if (distanceThrough < v.minDistance) {
					vertexList.remove(v);

					v.minDistance = distanceThrough;
					v.previous = u;
					vertexList.add(v);
				}
			}
		}
	}

	public static List<Vertex> getShortestPathTo(Vertex target) {
		List<Vertex> path = new ArrayList<Vertex>();
		for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
			path.add(vertex);

		//Collections.reverse(path);
		return path;
	}

	public static void main(String[] args) {
		/*Vertex v0 = new Vertex("Harrisburg");
		Vertex v1 = new Vertex("Baltimore");
		Vertex v2 = new Vertex("Washington");
		Vertex v3 = new Vertex("Philadelphia");
		Vertex v4 = new Vertex("Binghamton");
		Vertex v5 = new Vertex("Allentown");
		Vertex v6 = new Vertex("New York");
		v0.adjacencies = new Edge[] { new Edge(v1, 79.83), new Edge(v5, 81.15) };
		v1.adjacencies = new Edge[] { new Edge(v0, 79.75), new Edge(v2, 39.42),
				new Edge(v3, 103.00) };
		v2.adjacencies = new Edge[] { new Edge(v1, 38.65) };
		v3.adjacencies = new Edge[] { new Edge(v1, 102.53),
				new Edge(v5, 61.44), new Edge(v6, 96.79) };
		v4.adjacencies = new Edge[] { new Edge(v5, 133.04) };
		v5.adjacencies = new Edge[] { new Edge(v0, 81.77), new Edge(v3, 62.05),
				new Edge(v4, 134.47), new Edge(v6, 91.63) };
		v6.adjacencies = new Edge[] { new Edge(v3, 97.24), new Edge(v5, 87.94) };
		Vertex[] vertices = { v0, v1, v2, v3, v4, v5, v6 };

		computePaths(v0);
		for (Vertex v : vertices) {
			System.out.println("Distance to " + v + ": " + v.minDistance);
			List<Vertex> path = getShortestPathTo(v);
			System.out.println("Path: " + path);
		}
		
		
*/
		Vertex v0 = new Vertex("A");
		Vertex v1 = new Vertex("B");
		Vertex v2 = new Vertex("C");
		Vertex v3 = new Vertex("D");
		
		v0.adjacencies = new Edge[] { new Edge(v1, 5), new Edge(v2, 10) };
		v1.adjacencies = new Edge[] { new Edge(v0, 5),new Edge(v3, 11), new Edge(v2, 4)};
		v2.adjacencies = new Edge[] {new Edge(v0, 10), new Edge(v1, 4),new Edge(v3, 5) };
		v3.adjacencies = new Edge[] { new Edge(v2, 5),new Edge(v1, 11)};
		
		Vertex[] vertices = { v0, v1, v2, v3 };

		computePaths(v3);
		for (Vertex v : vertices) {
			System.out.println("Distance to " + v + ": " + v.minDistance);
			List<Vertex> path = getShortestPathTo(v);
			System.out.println("Path: " + path);
		}

		
	}
}
