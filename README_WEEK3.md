Jeg har ikke haft meget mulighed for at arbejde på opgaven i denne uge, så det er langtfra alt jeg har lavet, mest dét vi har gennemgået sammen i klassen. Jeg vil dog forsøge at svare på spørgsmålene så godt jeg kan.
Fra den kommende uge bør jeg dog have meget bedre mulighed for at arbejde mere på opgaverne, og få lavet det meste, hvis ikke det hele. Undskyld, på forhånd.

- Where and why you have used a @OneToMany annotation
  Jeg har brugt @OneToMany i Car og Member-klasserne, da hver enkelt reservation kun kan holde et enkelt medlem og en enkel bil i hvert tilfælde.
  
- Where an why you have used a @ManyToOne annotation
  Jeg har brugt @ManyToOne i Reservation-klassen, kort sagt af samme årsag som foroven: En enkelt reservation kan kun holde én bil og ét medlem, men hver bil og hvert medlem kan godt være tilkyttet flere reservationer.
  
- The purpose of the CascadeType, FetchType and mappedBy attributes you can use with one-to-many
  CascadeType bruges til at definere hvordan en Entity's 'børn' opfører sig i forhold til dens 'parent' Entity. F.eks. hvis 'child' også bliver slettet når 'parent' bliver det, eller ej.
  FetchType beskriver hvad der skal hentes fra en 'child entity', når en 'parent entity' bliver indlæst. Hvis FetchType:EAGER bruges, bliver alt fra 'child' hentet med det samme, hvor imod hvis FetchType.LAZY bruges, bliver de relavante data først hentet, når der specifikt bliver bedt om det.
  MappedBy bruges til at sørge for, at to entities har et forhold som går i begge retninger. MappedBy bruges af den entity, som ikke har en 'foreign key column'. Dette er godt for at undgå unødvendige 'join table' operationer eller 'foreign key' tabeller.

Resten kan jeg ikke svare ordentligt på på nuværende tidspunkt,desværre,  men er noget jeg vil vende tilbage til.

- How/where you have (if done) added user defined queries to you repositories
  
- a few words, explaining what you had to do on your Azure App Service in order to make your Spring Boot App connect to your Azure MySqlDatabase
- 
- a few words about where you have used inheritance in your project, and how it's reflected in your database
- 
- What are the pros & cons of using the Single Table Strategy for inheritance?
- 
- how are passwords stored in the database with the changes suggested in part-6 of the exercise
