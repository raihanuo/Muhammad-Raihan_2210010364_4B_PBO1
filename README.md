# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengelola data siswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, umur, nis (nomor induk siswa) dan kelas, dan memberikan output berupa menu untuk menambah data siswa dan menampilkan data siswa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Utama`, `Orang`, dan `Siswa` adalah contoh dari class.

```bash
public class Utama {
    ...
}


public class Orang {
    ...
}

public class Siswa extends Orang {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarSiswa[index] = new Siswa(nama, umur, nis, kelas);` adalah contoh pembuatan object.

```bash
daftarSiswa[index] = new Siswa(nama, umur, nis, kelas);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `umur` adalah contoh atribut.

```bash
private String nama;
private int umur;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Orang` dan `Siswa`.

```bash
public Orang(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
}

public Siswa(String nama, int umur, int nis, String kelas) {
    super(nama, umur);
    this.nis = nis;
    this.kelas = kelas;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNIS` dan `setKelas` adalah contoh method mutator.

```bash
public void setNIS(int nis) {
    this.nis = nis;
}

public void setKelas(String kelas) {
    this.kelas = kelas;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNIS` dan `getKelas` adalah contoh method accessor.

```bash
public int getNIS() {
    return nis;
}

public String getKelas() {
    return kelas;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nis` dan `kelas` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private int nis;
private String kelas;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Siswa` mewarisi `Orang` dengan sintaks `extends`.

```bash
public class Siswa extends Orang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Siswa` merupakan override dari method `tampilkanInfo()` di `Orang`.

```bash
public void tampilkanInfo() {
    System.out.print("Nama: " + nama + " | Umur: " + umur + " | ");
}

@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("NIS: " + nis + " | Kelas: " + kelas + " | ");
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `main` di kelas `Utama`.

```bash
if (pilihan == 1) {
    ...
} else if (pilihan == 2) {
    ...
} else if (pilihan == 3) {
    ...
} else {
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan data.

```bash
for (Siswa siswa : daftarSiswa) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
    ...
System.out.print("Masukkan nama \t: ");
String nama = scanner.nextLine();
    ...
System.out.println("Siswa berhasil ditambahkan!");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Siswa[] daftarSiswa = new Siswa[30];` adalah contoh penggunaan array.

```bash
Siswa[] daftarSiswa = new Siswa[30];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
} catch (Exception e) {
    System.out.println("Kesalahan : " + e);
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Raihan
NPM: 2210010364
