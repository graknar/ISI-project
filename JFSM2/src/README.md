# FSM


Exemple :

      Set<String> A = new HashSet<String>();      
    	A.add("a");A.add("b");A.add("c");

    	Set<Etat> Q = new HashSet<Etat>();
    	Q.add(new Etat("1"));Q.add(new Etat("2"));Q.add(new Etat("3"));

    	Set<Transition> mu = new HashSet<Transition>();
    	mu.add(new Transition("1","a","2"));
    	mu.add(new Transition("1","b","3"));
    	mu.add(new Transition("2","a","1"));
    	mu.add(new Transition("2","c","3"));
    	mu.add(new Transition("2","b","2"));
    	mu.add(new Transition("3","b","2"));

    	Set<String> F = new HashSet<String>();
    	F.add("3");
    	Automate afn = new AFD(A, Q, "1", F, mu);
    	afn.next("a");
    	afn.next("c");
    	System.out.println(afn.accepte());
    	
    	List<String> l = new ArrayList<String>();
    	l.add("a");l.add("c");
    	afn.run(l);
    	System.out.println(afn.accepte());
    	System.out.println(afn.histo);
