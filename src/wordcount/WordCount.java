package wordcount;

public class WordCount 
{
   private String declaration;

   public WordCount(String declaration)
   {
       this.declaration = declaration;
   }

   public String getDeclaration() {
       return declaration;
   }

   public void setDeclaration(String declaration) {
       this.declaration = declaration;
   }

   @Override
    public String toString()
    {
        return "Words{" +
            "declaration='" + declaration + '\'' +
            // ", avgWeight=" + avgWeight +
            // ", apartment=" + apartment +
            '}';
    }
}