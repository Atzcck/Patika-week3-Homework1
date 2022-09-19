## HomeWork 2- SavingState -> https://github.com/FMSSBilisimAndroid/alp-tazecicek-odev-3-SavingState


# LoginToMain

## Uygulama Hakkında
  Welcome Fragment ve Login Fragment olarak 2 ayrı screen Login Graph içeriside navigate edildi.
  Login işlemi tamamlandığında login fragmentten Main Graph'a geçildi. 
  Main fragment içerisinde bulunan back butonu ile login grapha navigateUp tanımlandı. PopBackStack ile login grapha geçiş engellendi.
  
  
  

https://user-images.githubusercontent.com/82867179/189546835-2f228b86-a8b8-4aba-9802-a267bb34567d.mp4


# Parcelable & Serializable

  Serializable, standart bir Java arabirimidir. 
  Bu yaklaşımla ilgili sorun bunun yavaş bir süreç olmasıdır. 
  Bu yöntem çok sayıda geçici nesne oluşturur ve oldukça fazla çöp toplama işlemine neden olur. 
  Ancak, Serializable arabirimin uygulanması daha kolaydır.
  
  Parcelable işlemi Serializable'dan çok daha hızlıdır.
  Dataları küçük parçalara bölerek işler böylece Serializable'dan 10 kat daha hızlı olabilir.
  Implement edilişi Serializable'dan daha zordur.
  

  
