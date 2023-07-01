package one.digitalinnovation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		/*List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("GM"));
		listaCarros.add(new Carro("Volksvagen"));
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
		System.out.println(new Carro("Ford").hashCode());
		System.out.println(new Carro("Ford1").hashCode());
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("GM");
		
		System.out.println(carro1.equals(carro2));;
		*/
		/*
		Stack<Carro> stackCarros = new Stack<>();
		stackCarros.push(new Carro(("Ford")));
		stackCarros.push(new Carro(("GM")));
		stackCarros.push(new Carro(("Volksvagen")));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros);
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);
		System.out.println(stackCarros.empty());
		System.out.println(stackCarros);
		*/
		/*
		Queue<Carro> queueCarros = new LinkedList<>();
		queueCarros.add(new Carro(("Ford")));
		queueCarros.add(new Carro(("GM")));
		queueCarros.add(new Carro(("Volksvagen")));
		
		System.out.println(queueCarros.add(new Carro("Peugeot")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.offer(new Carro("Renault")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());
		System.out.println(queueCarros);
		*/
		/*
		List<Carro> listCarros = new ArrayList<>();
		listCarros.add(new Carro(("Ford")));
		listCarros.add(new Carro(("GM")));
		listCarros.add(new Carro(("Volksvagen")));
		listCarros.add(new Carro(("Peugeot")));
		
		System.out.println(listCarros.contains(new Carro("Ford")));
		
		System.out.println(listCarros.get(2));
		
		System.out.println(listCarros.contains(new Carro("Fiat")));
		*/
		Set<Carro> hashSetCarros = new HashSet<>();

		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("GM"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Volkswagen"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("Kia"));
		hashSetCarros.add(new Carro("Jac"));

		System.out.println(hashSetCarros);

		Set<Carro> treeSetCarros = new TreeSet<>();

		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("GM"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Volkswagen"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("Kia"));
		hashSetCarros.add(new Carro("Jac"));

		System.out.println(treeSetCarros);
	}
}
