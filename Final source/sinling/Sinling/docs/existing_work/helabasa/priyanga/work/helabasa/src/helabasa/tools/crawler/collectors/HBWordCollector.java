 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r . c o l l e c t o r s ;  
  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t I t e r a t o r ;  
  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . t o o l s . c r a w l e r . H B S i n h a l a C r a w l e r ;  
 i m p o r t   h e l a b a s a . t o o l s . c r a w l e r . H B T e x t C o l l e c t o r ;  
  
 p u b l i c   c l a s s   H B W o r d C o l l e c t o r   e x t e n d s   H B T e x t C o l l e c t o r  
 {  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   C o l l e c t T e x t ( S t r i n g   s T e x t )    
 	 {  
 	 	  
 	 	 L i s t < S t r i n g >   l s t W o r d s   =   S p l i t I n T o W o r d s ( s T e x t ) ;  
 	 	 f o r   ( L i s t I t e r a t o r < S t r i n g >   i t e r   =   l s t W o r d s . l i s t I t e r a t o r ( ) ;   i t e r . h a s N e x t ( ) ;   )    
 	 	 {  
 	 	       S t r i n g   s W o r d   =   i t e r . n e x t ( ) ;  
 	 	       i f ( H e l a b a s a . I s S i n h a l a W o r d ( s W o r d ) )  
 	 	       {  
 	 	 	       H B S i n h a l a C r a w l e r . o _ S t o r a g e . A d d T e x t ( s W o r d ,   H B T e x t C o l l e c t o r . H B _ T X T _ W O R D ) ;  
 	 	       }  
 	 	 } 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   L i s t < S t r i n g >   S p l i t I n T o W o r d s ( S t r i n g   s T e x t )  
 	 {  
 	 	 / / T O D O  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
  
 }  
