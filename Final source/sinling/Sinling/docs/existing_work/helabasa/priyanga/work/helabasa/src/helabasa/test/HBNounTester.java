 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n A n a l y z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . u t i l s . H B N u t r a l P r i n t W r i t e r ;  
  
  
 p u b l i c   c l a s s   H B N o u n T e s t e r   {  
  
 	 p u b l i c   H B N o u n T e s t e r ( )   {  
  
 	 }  
  
 	 p u b l i c   v o i d   T e s t ( S t r i n g   s W o r d )  
 	 {  
 	 	 H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e   o C o n j u g a t i o n R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ( ) ;  
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
 	 	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
 	 	 H B N o u n   o N o u n   =   H B N o u n A n a l y z e r . A n a l y z e ( s W o r d ,   o C o n j u g a t i o n R u l e s ,   o N o u n A l g o ,   o J o i n A l g o ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " A n a l y s i n g   W o r d   :   "   +   s W o r d ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 i f ( o N o u n ! = n u l l )  
 	 	 {  
 	 	 	 o N o u n . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( I d e n t i f y F o r m s ( o N o u n ,   s W o r d ) ) ;  
 	 	 	  
 	 	 }  
 	 	 e l s e  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N O   S O L U T I O N S ! " ) ;  
 	 	  
 	 	  
 	 	  
 	 }  
 	  
         p r i v a t e   S t r i n g   I d e n t i f y F o r m s ( H B N o u n   o N o u n ,   S t r i n g   s I n p u t )  
         {  
         	 S t r i n g   s O u t   =   " " ;  
         	 L i s t < H B F o r m >   l i s t F o r m s   =   o N o u n . I d e n t i f y ( s I n p u t ) ;  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s   . g e t ( i ) ;  
 	 	 	  
 	 	 	 i f ( i > 0 )  
 	 	 	 {  
 	 	 	 	 s O u t   + =   " ,   " ;  
 	 	 	 }  
 	 	 	  
 	 	 	 s O u t   + =   " [ T y p e = "   +   H B N o u n . a r r _ N o u n C a t e g o r i e s _ s [ o F o r m . G e t S u b T y p e ( ) ]   +   "   :   S u b T y p e = "   +   H B N o u n . a r r _ V i b h a k t h i _ s [ o F o r m . G e t T y p e ( ) ]   +   " ] " ;  
 	 	 }  
         	 r e t u r n   s O u t ;  
         }  
 	  
 	 p u b l i c   v o i d   T e s t 3 ( S t r i n g   s W o r d )  
 	 {  
 	 	 H B W o r d   o W o r d   =   n e w   H B W o r d ( s W o r d ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = =   T e s t i n g   [ "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   " ]   = = = = = = = " ) ;  
 	 	  
 	 	  
 	 	 H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ( ) ;  
 	 	 L i s t < H B W o r d >   l i s t J o i n S u f f i x s   =   o R u l e s . G e t B a s e S u f f i x e s ( ) . G e t J o i n S u f f i x L i s t ( ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t J o i n S u f f i x s . s i z e ( ) ;  
  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = =   J o i n   S u f f i x e s   [ "   +   i C o u n t   +   " ]   = = = = = = = " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o S u f f i x   =   l i s t J o i n S u f f i x s . g e t ( i ) ; 	 	  
 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " S u f f i x [ "   +   i   +   " ] = "   +   o S u f f i x . G e t N a t u r a l F o r m ( ) ) ;  
 	 	  
 	 	 	 H B J o i n R e s u l t s S e t   o R S   =   H B W o r d J o i n e r . D i s j o i n ( o W o r d ,   o S u f f i x ,   0 ) ;  
 	 	 	 i f ( o R S . G e t R e s u l t s C o u n t ( ) > 0 )  
 	 	 	 {  
 	 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " J o i n   M a t c h   :   S u f f i x [ "   +   i   +   " ] = "   +   o S u f f i x . G e t N a t u r a l F o r m ( ) ) ; 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " J o i n   M a t c h e s   f o r   "   +   o S u f f i x . G e t N a t u r a l F o r m ( )   +   "   :   "   +   o R S . G e t R e s u l t s C o u n t ( ) ) ;  
 	 	 	 	 f o r ( i n t   k = 0 ;   k < o R S . G e t R e s u l t s C o u n t ( ) ;   k + + )  
 	 	 	 	 {  
 	 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " \ t "   +   o R S . G e t R e s u l t s A t ( k ) . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( )   +   "   :   J o i n   M e t h o d = "   +   o R S . G e t R e s u l t s A t ( k ) . G e t J o i n M e t h o d ( ) ) ;  
 	 	 	 	 }  
 	 	 	 } 	 	 	 	  
 	 	 } 	 	 	 	 	  
  
 	 	 L i s t < H B W o r d >   l i s t A p p e n d S u f f i x s   =   o R u l e s . G e t B a s e S u f f i x e s ( ) . G e t A p p e n d S u f f i x L i s t ( ) ;  
 	 	  
 	 	 i C o u n t   =   l i s t A p p e n d S u f f i x s . s i z e ( ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = =   A p p e n d   S u f f i x e s   [ "   +   i C o u n t   +   " ]   = = = = = = = " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o S u f f i x   =   l i s t A p p e n d S u f f i x s . g e t ( i ) ; 	 	  
 	 	 	 i f ( o S u f f i x . M a t c h P a t t e r n ( o W o r d ) > 0 )  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " A p p e n d   :   S u f f i x [ "   +   i   +   " ] = "   +   o S u f f i x . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 	  
 	 	 	 	 i n t   i E n d   =   o W o r d . G e t N a t u r a l C h a r a c t e r C o u n t ( )   -   o S u f f i x . G e t N a t u r a l C h a r a c t e r C o u n t ( ) ;  
 	 	 	 	  
 	 	 	 	 S t r i n g   s L e m m a   =   o W o r d . S u b N a t u r a l F o r m S t r i n g ( 0 ,   i E n d ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " L e m m a [ "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   " ] = "   +   s L e m m a ) ;  
 	 	 	 } 	  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " A p p e n d   :   S u f f i x [ "   +   i   +   " ] = "   +   o S u f f i x . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 }  
 	 	 } 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   v o i d   T e s t 2 ( )  
 	 {  
 	 	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;  
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
 	 	  
 	 	 L i s t < H B N o u n >   l i s t N o u n s   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n s ( "���� " ,   o R u l e s ,   o J o i n S c o r e A l g o ,   1 0 ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t N o u n s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = [ "   +   i   +   " ] = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 H B N o u n   o N o u n   =   l i s t N o u n s . g e t ( i ) ; 	  
 	 	 	 o N o u n . D e b u g P r i n t ( ) ;  
 	 	 }  
 	 	  
 	 	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ; 	 	  
 	 	 H B N o u n   o B e s t N o u n   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n ( "���� " ,   o R u l e s ,   o N o u n S c o r e A l g o ,   o J o i n S c o r e A l g o ,   1 0 ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = [ B e s t ] = = = = = = = = = = = = = = = = = = = = = " ) ; 	 	  
 	 	 o B e s t N o u n . D e b u g P r i n t ( ) ; 	  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = =   B e g i n   T e s t   :   H B N o u n T e s t e r   = = = = = = = = = = = = = = = " ) ;  
 	 	  
 	 	 H e l a b a s a . I n i t ( ) ;  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 / / H e l a b a s a . S e t D e b u g L o g ( n e w   H B N u t r a l P r i n t W r i t e r ( ) ) ;  
 	 	 H e l a b a s a . S e t D e b u g L o g ( H e l a b a s a . G e t L o g ( ) ) ;  
 	 	  
 	 	 i f ( a r g s . l e n g t h > 0 )  
 	 	 {  
 	 	 	 H B N o u n T e s t e r   o T e s t e r   =   n e w   H B N o u n T e s t e r ( ) ;  
 	 	 	  
 	 	 	 / / o T e s t e r . T e s t ( "�������� " ) ;  
 	 	 	 o T e s t e r . T e s t ( a r g s [ 0 ] ) ;  
 	 	 } 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = =   E n d   T e s t   :   H B N o u n T e s t e r   = = = = = = = = = = = = = = = " ) ;  
 	 }  
  
 }  
