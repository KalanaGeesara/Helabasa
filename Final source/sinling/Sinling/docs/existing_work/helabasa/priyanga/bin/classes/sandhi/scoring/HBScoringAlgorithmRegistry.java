 p a c k a g e   h e l a b a s a . s a n d h i . s c o r i n g ;  
  
 p u b l i c   c l a s s   H B S c o r i n g A l g o r i t h m R e g i s t r y   {  
 	  
 	 p r i v a t e   s t a t i c   H B J o i n S c o r i n g A l g o r i t h m   a r r _ A l g o [ ]   =   { n e w   H B F r e q u e n c y B a s e d S c o r i n g A l g o r i t h m ( 1 ) ,   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ,   n e w   H B B o u n d a r y B a s e d S c o r i n g A l g o r i t h m ( ) } ;  
 	  
 	 p u b l i c   H B S c o r i n g A l g o r i t h m R e g i s t r y ( )   {  
  
 	 }  
 	  
 	 p u b l i c   s t a t i c   i n t   G e t A l g o r i t m C o u n t ( )  
 	 {  
 	 	 r e t u r n   a r r _ A l g o . l e n g t h ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   S t r i n g   g e t S c o r i n g A l g o r i t h m N a m e ( i n t   i I n d e x )  
 	 {  
 	 	 i f ( i I n d e x   > =   0   & &   i I n d e x   <   a r r _ A l g o . l e n g t h )  
 	 	 {  
 	 	 	 r e t u r n   a r r _ A l g o [ i I n d e x ] . G e t N a m e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   " I N V A L I D " ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B J o i n S c o r i n g A l g o r i t h m   g e t S c o r i n g A l g o r i t h m ( i n t   i I n d e x )  
 	 {  
 	 	 i f ( i I n d e x   > =   0   & &   i I n d e x   <   a r r _ A l g o . l e n g t h )  
 	 	 {  
 	 	 	 r e t u r n   a r r _ A l g o [ i I n d e x ] ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B J o i n S c o r i n g A l g o r i t h m   g e t S c o r i n g A l g o r i t h m ( S t r i n g   s N a m e )  
 	 {  
 	 	 f o r ( i n t   i = 0 ;   i < a r r _ A l g o . l e n g t h ;   i + + )  
 	 	 {  
 	 	 	 i f ( a r r _ A l g o [ i ] . G e t N a m e ( ) . e q u a l s ( s N a m e ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   a r r _ A l g o [ i ] ;    
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   n u l l ;  
 	 }  
  
 }  
