/**
 * 
 * Copyright (C) 2017 Emmanuel DESMONTILS
 * 
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 * 
 * 
 * 
 * E-mail:
 * Emmanuel.Desmontils@univ-nantes.fr
 * 
 * 
 **/


/**
 * JFSM.java
 *
 *
 * Created: 2017-08-25
 *
 * @author Emmanuel Desmontils
 * @version 1.0
 */

import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import java.util.Iterator;


public class JFSM {
	public static void main(String argv []) throws JFSMException {
    	///* Partie II
    	//A alphabet
   	 Set<String> A = new HashSet<String>();      
   	 A.add("Da");A.add("ba");

   	 //Q les états
   	 Set<Etat> Q = new HashSet<Etat>();
   	 Q.add(new Etat("Pim"));Q.add(new Etat("Pam"));Q.add(new Etat("Pipo"));Q.add(new Etat("Poum"));

   	 //mu transition 
   	 Set<Transition> mu = new HashSet<Transition>();
   	 mu.add(new Transition("Pim","Da","Pam"));
   	 mu.add(new Transition("Pim","Da","Poum"));
   	 mu.add(new Transition("Poum","ba","Pam"));
   	 mu.add(new Transition("Pam","ba","Pim"));
   	 mu.add(new Transition("Pam","ba","Pipo"));
   	 mu.add(new Transition("Pipo","Da","Poum"));
   	mu.add(new Transition("Pipo","Da","Pam"));
   	 
   	 //état final
   	 Set<String> F = new HashSet<String>();
   	 F.add("Poum");F.add("Pipo");
   	 
   //état initial
   	 Set<String> I = new HashSet<String>();
   	 I.add("Pim");I.add("Poum");
   	 
   	 
   	 //construction de l'automage
   	 Automate afn = new AutomateNonDeter(A, Q, I, F, mu);
   	 
   	 //saisie des trucs
   	 afn.next("Da");
   	 afn.next("ba");

   	 //si les saisies sont accepté
   	 System.out.println(afn.accepte());
   	 //montrer les saisie
   	 System.out.println(afn.histo);

   	 
   	 //*/
    	/* Partie I.B
    	//A alphabet
   	 Set<String> A = new HashSet<String>();      
   	 A.add("tri");A.add("cat");A.add("mar");A.add("ran");

   	 //Q les états
   	 Set<Etat> Q = new HashSet<Etat>();
   	 Q.add(new Etat("De"));Q.add(new Etat("Ho"));Q.add(new Etat("Fi"));Q.add(new Etat("Ba"));

   	 //mu transition 
   	 Set<Transition> mu = new HashSet<Transition>();
   	 mu.add(new Transition("De","tri","Ho"));
   	 mu.add(new Transition("De","cat","Ba"));
   	 mu.add(new Transition("Ho","mar","Fi"));
   	 mu.add(new Transition("Fi","ran","Ba"));
   	 mu.add(new Transition("Ba","tam","Ho"));
   	 mu.add(new Transition("Fi","mar","Fi"));
   	mu.add(new Transition("Ho","tam","--Trash--"));
   	 
   	 //état final
   	 Set<String> F = new HashSet<String>();
   	 F.add("Fi");F.add("Ba");
   	 
   	 //construction de l'automage
   	 Automate afn = new AFD(A, Q, "Ba", F, mu);
   	 
   	 //saisie des trucs
   	 //afn.next("cat");
   	 afn.next("tam");
   	 afn.next("mar");
   	afn.next("ran");
   	 
   	 //si les saisies sont accepté
   	 System.out.println(afn.accepte());
   	 //montrer les saisie
   	 System.out.println(afn.histo);
    	*/
   	 
    	/* Partie test
    	//A alphabet
    	 Set<String> A = new HashSet<String>();      
    	 A.add("a");A.add("b");A.add("c");

    	 //Q les états
    	 Set<Etat> Q = new HashSet<Etat>();
    	 Q.add(new Etat("1"));Q.add(new Etat("2"));Q.add(new Etat("3"));

    	 //mu transition 
    	 Set<Transition> mu = new HashSet<Transition>();
    	 mu.add(new Transition("1","a","2"));
    	 mu.add(new Transition("1","b","3"));
    	 mu.add(new Transition("2","a","1"));
    	 mu.add(new Transition("2","c","3"));
    	 mu.add(new Transition("2","b","2"));
    	 mu.add(new Transition("3","b","2"));
    	 
    	 //état final
    	 Set<String> F = new HashSet<String>();
    	 F.add("3");
    	 
    	 //construction de l'automage
    	 Automate afn = new AFD(A, Q, "1", F, mu);
    	 
    	 //saisie des trucs
    	 afn.next("a");
    	 afn.next("c");
    	 
    	 //si les saisies sont accepté
    	 System.out.println(afn.accepte());
    	 //montrer les saisie
    	 System.out.println(afn.histo);*/

    	/*?????
    	  Set<String> A = new HashSet<String>();      
    	A.add("a");A.add("b");A.add("c");

    	Set<Etat> Q = new HashSet<Etat>();
    	Q.add(new Etat("1"));Q.add(new Etat("2"));Q.add(new Etat("3"));

    	Set<Transition> mu = new HashSet<Transition>();
    	mu.add(new TransitionMealy("1","a","1","2"));
    	mu.add(new TransitionMealy("1","b","0","3"));
    	mu.add(new TransitionMealy("2","a","0","1"));
    	mu.add(new TransitionMealy("2","c","1","3"));
    	mu.add(new TransitionMealy("2","b","1","2"));
    	mu.add(new TransitionMealy("3","b","0","2"));

    	Set<String> F = new HashSet<String>();
    	F.add("3");
    	Mealy afn = new Mealy(A, Q, "1", F, mu);

    	List<String> l = new ArrayList<String>();
    	l.add("a");l.add("c");
    	afn.run(l);
    	System.out.println(afn.accepte());
    	System.out.println(afn.histo);
    	System.out.println(afn.res);

    	afn.run(l);
    	System.out.println(afn.accepte());
    	System.out.println(afn.histo);


		Set<Etat> Q2 = new HashSet<Etat>();
    	Q2.add(new EtatMoore("1","0"));Q2.add(new EtatMoore("2","1"));Q2.add(new EtatMoore("3","0"));
    	Moore afn2 = new Moore(A,Q2,"1",F,mu);
    	afn2.run(l);
    	System.out.println(afn2.accepte());
    	System.out.println(afn2.histo);
    	System.out.println(afn2.res); */   	
   }
}
