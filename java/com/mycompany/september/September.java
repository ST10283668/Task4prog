
package com.mycompany.september;


interface  Searchable {
    void search(String keyword);
}

abstract class Document implements Searchable {
    private String text;

    public Document(String text) {
        this.text = text;
    }
    abstract class WebPage implements Searchable {
        private String word ;
        
      public WebPage(String word ) {
        this.word = word ;
    }
    @Override
    public void search(String keyword) {
        if (text.contains(keyword)) {
            System.out.println("Keyword found ");
        } else {
            System.out.println("Keyword not found.");
        }
    }
}
    
    @Override 
    public void search(String keyword){
    if (word.contains(keyword)){
        System.out.println("Keyword found. ");  
    }
    else {System.out.println("Keyword not found. ");
    }
    
    
    
    }
         
    
    
    }
