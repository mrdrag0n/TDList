public class Main {
    public static void main(String[] args) {
        University espritVector = new EspritVector();
        University espritArrayList = new EspritArrayList();


        Etudiant etudiant1 = new Etudiant(1, "Test 1", "Test 1");
        Etudiant etudiant2 = new Etudiant(2, "Test 2", "Test 2");
        Etudiant etudiant3 = new Etudiant(3, "Test 3", "Test 3");

        System.out.println("EspritVector:");
        espritVector.ajouterEtudiant(etudiant1);
        espritVector.ajouterEtudiant(etudiant2);
        espritVector.ajouterEtudiant(etudiant3);
        espritVector.displayEtudiants();

        espritVector.trierEtudiantsParNom();
        System.out.println("Order par nom:");
        espritVector.displayEtudiants();

        espritVector.supprimerEtudiant(etudiant2);
        System.out.println("Apres suppression test 2");
        espritVector.displayEtudiants();


        System.out.println("\n EspritArrayList:");
        espritArrayList.ajouterEtudiant(etudiant1);
        espritArrayList.ajouterEtudiant(etudiant2);
        espritArrayList.ajouterEtudiant(etudiant3);
        espritArrayList.displayEtudiants();

        espritArrayList.trierEtudiantsParId();
        System.out.println("Order par ID:");
        espritArrayList.displayEtudiants();

        espritArrayList.supprimerEtudiant(etudiant1);
        System.out.println("Apres supression test 1");
        espritArrayList.displayEtudiants();
    }
}
