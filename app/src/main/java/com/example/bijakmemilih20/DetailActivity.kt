package com.example.bijakmemilih20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.example.bijakmemilih20.model.partai


class DetailActivity : AppCompatActivity() {

    companion object {
        const val namapartai = "nama_partai"
        const val nomorpartai = "nomor_partai"
        const val logopartai = "logo_partai"
        const val visipartai = "visi_partai"
        const val misipartai = "misi_partai"
        const val namaketua = "nama_ketua"
        const val tahunberdiri = "tahun_berdiri"
        const val alamatkantor = "alamat_kantor"
        const val website = "website"
        const val deskripsi = "deskripsi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        // Inisialisasi toolbar
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar_detail)
        setSupportActionBar(toolbar)

        // Tambahkan tombol kembali (back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val partai = partai()
        partai.namaPartai = intent.getStringExtra(namapartai).toString()
        partai.nomorPartai = intent.getStringExtra(nomorpartai).toString()
        partai.logo = intent.getIntExtra(logopartai, 0)
        partai.visi = intent.getStringExtra(visipartai).toString()
        partai.misi = intent.getStringExtra(misipartai).toString()
        partai.namaKetua = intent.getStringExtra(namaketua).toString()
        partai.tahunBerdiri = intent.getStringExtra(tahunberdiri).toString()
        partai.alamatKantor = intent.getStringExtra(alamatkantor).toString()
        partai.website = intent.getStringExtra(website).toString()
        partai.deskripsi = intent.getStringExtra(deskripsi).toString()

        //Menghubungkan TextView dan ImageView dengan elemen di layout
        val tvNamaPartai = findViewById<TextView>(R.id.tv_nama_partai_detail)
        val tvNomorPartai = findViewById<TextView>(R.id.tv_nomor_partai_detail)
        val tvVisiPartai = findViewById<TextView>(R.id.tv_visi_detail)
        val tvMisiPartai = findViewById<TextView>(R.id.tv_misi_detail)
        val tvNamaKetua = findViewById<TextView>(R.id.tv_nama_ketua_detail)
        val tvTahunBerdiri = findViewById<TextView>(R.id.tv_tahun_berdiri_detail)
        val tvAlamatKantor = findViewById<TextView>(R.id.tv_alamat_kantor_detail)
        val tvWebsite = findViewById<TextView>(R.id.tv_website_detail)
        val tvDeskripsi = findViewById<TextView>(R.id.tv_deskripsi_detail)
        //logo
        val imgLogo = findViewById<ImageView>(R.id.img_partai_detail)
// Menetapkan nilai-nilai yang diterima dari Intent ke TextView dan ImageView
        tvNamaPartai.text = partai.namaPartai
        tvNomorPartai.text = partai.nomorPartai
        tvVisiPartai.text = partai.visi
        tvMisiPartai.text = partai.misi
        tvNamaKetua.text = partai.namaKetua
        tvTahunBerdiri.text = partai.tahunBerdiri
        tvAlamatKantor.text = partai.alamatKantor
        tvWebsite.text = partai.website
        tvDeskripsi.text = partai.deskripsi
        //logo
        imgLogo.setImageResource(partai.logo)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Tangani klik tombol kembali (back)
        return if (item.itemId == android.R.id.home) {
            onBackPressed() // Panggil onBackPressed() untuk kembali ke activity sebelumnya
            true
        } else {
            super.onOptionsItemSelected(item)
        }}
}