
public interface Kassenautomatabel {
	float preisBerechnen(Parkschein p);
	float geldRueckgabe(float preis,float guthaben);
	void parkscheinFreigeben(Parkschein p);
}
