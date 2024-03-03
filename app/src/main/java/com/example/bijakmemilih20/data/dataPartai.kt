package com.example.bijakmemilih20.data

import com.example.bijakmemilih20.R
import com.example.bijakmemilih20.model.partai

object dataPartai {
    private val namaPartai = arrayOf(
        "Partai Kebangkitan Bangsa (PKB)",
        "Partai Gerakan Indonesia Raya (Gerindra)",
        "Partai Demokrasi Indonesia Perjuangan (PDIP)",
        "Partai Golongan Karya (Golkar)",
        "Partai NasDem",
        "Partai Buruh",
        "Partai Gelombang Rakyat Indonesia (Gelora)",
        "Partai Keadilan Sejahtera (PKS)",
        "Partai Kebangkitan Nusantara (PKN)",
        "Partai Hati Nurani Rakyat (Hanura)",
        "Partai Garda Perubahan Indonesia (Garuda)",
        "Partai Amanat Nasional (PAN)",
        "Partai Bulan Bintang (PBB)",
        "Partai Demokrat",
        "Partai Solidaritas Indonesia (PSI)",
        "Partai Persatuan Indonesia (Perindo)",
        "Partai Persatuan Pembangunan (PPP)",
        "Partai UMMAT"
    )
    private val logo = intArrayOf(
        R.drawable.pkb,
        R.drawable.gerindra,
        R.drawable.pdip,
        R.drawable.golkar,
        R.drawable.nasdem,
        R.drawable.buruh,
        R.drawable.gelora,
        R.drawable.pks,
        R.drawable.pkn,
        R.drawable.hanura,
        R.drawable.garuda,
        R.drawable.pan,
        R.drawable.pbb,
        R.drawable.demokrat,
        R.drawable.psi,
        R.drawable.perindo,
        R.drawable.ppp,
        R.drawable.ummat
    )
    private val nomorPartai = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12",
        "13",
        "14",
        "15",
        "16",
        "17",
        "18"
    )
    private val visi = arrayOf(
        "Membangun masyarakat yang adil, makmur, dan sejahtera berlandaskan ajaran Islam",
        "Mewujudkan Indonesia yang kuat, adil, dan sejahtera melalui pembangunan ekonomi yang inklusif",
        "Mewujudkan keadilan sosial, demokrasi, dan kesejahteraan bersama untuk rakyat Indonesia",
        "Mendorong pertumbuhan ekonomi yang inklusif dan berkelanjutan untuk kesejahteraan rakyat",
        "Meneguhkan nilai-nilai demokrasi dan memperjuangkan kepentingan rakyat",
        "Mewujudkan keadilan dan kesejahteraan bagi seluruh pekerja dan buruh Indonesia",
        "Membangun Indonesia yang berdaulat, adil, dan makmur melalui pemimpin yang bersih dan berintegritas",
        "Mewujudkan masyarakat adil dan makmur berlandaskan nilai-nilai Islam",
        "Mewujudkan kesejahteraan rakyat Indonesia dengan menjaga keberagaman dan kesatuan bangsa",
        "Menjadi wadah aspirasi rakyat untuk memperjuangkan keadilan dan kesejahteraan bersama",
        "Memajukan bangsa Indonesia melalui perubahan yang nyata dan berkelanjutan",
        "Menegakkan keadilan dan kesejahteraan berdasarkan nilai-nilai Pancasila dan UUD 1945",
        "Membangun Indonesia yang sejahtera, adil, dan berdaulat dalam bingkai negara berkeadilan",
        "Membangun sistem demokrasi yang lebih berkualitas dan responsif terhadap aspirasi rakyat",
        "Menjadi kekuatan politik yang mewujudkan perubahan positif bagi masyarakat Indonesia",
        "Membangun persatuan dan kesatuan bangsa dalam kerangka pembangunan nasional",
        "Mewujudkan masyarakat yang berkeadilan dan sejahtera melalui pembangunan yang berkelanjutan",
        "Mewujudkan Indonesia yang adil dan berdaulat dengan menjaga persatuan dan keragaman"
    )
    private val misi = arrayOf(
        "Meningkatkan kualitas pendidikan dan kesehatan masyarakat",
        "Memperjuangkan keadilan sosial dan penanggulangan kemiskinan",
        "Mendorong pembangunan infrastruktur dan pengembangan ekonomi daerah",
        "Menegakkan hak asasi manusia dan perlindungan lingkungan hidup",
        "Mengawal pembangunan demokratis dan pemerintahan yang bersih",
        "Mempertahankan hak-hak buruh dan meningkatkan kesejahteraan pekerja",
        "Memperjuangkan keadilan gender dan hak-hak perempuan",
        "Mendorong reformasi birokrasi dan perbaikan sistem peradilan",
        "Memperjuangkan kebebasan beragama dan menghormati pluralisme",
        "Mengawal kebijakan luar negeri yang berpihak pada kepentingan nasional",
        "Menyuarakan aspirasi masyarakat dan melindungi kepentingan rakyat",
        "Mendorong pemberantasan korupsi dan penegakan hukum yang adil",
        "Mengadvokasi hak-hak minoritas dan kelompok rentan",
        "Mendorong pemerataan pembangunan antar wilayah dan sektor",
        "Memperjuangkan kemandirian energi dan ketahanan pangan nasional",
        "Menyuarakan kepentingan generasi muda dan melindungi hak-hak anak",
        "Mengembangkan potensi sumber daya manusia dan memperkuat industri",
        "Mempertahankan kedaulatan negara dan menjaga stabilitas politik"
    )
    private val namaKetua = arrayOf(
        "Muhaimin Iskandar",    // Partai Kebangkitan Bangsa (PKB)
        "Prabowo Subianto",     // Partai Gerakan Indonesia Raya (Gerindra)
        "Megawati Soekarnoputri", // Partai Demokrasi Indonesia Perjuangan (PDI Perjuangan)
        "Airlangga Hartarto",  // Partai Golongan Karya (Golkar)
        "Surya Paloh",          // Partai NasDem
        "Said Iqbal",           // Partai Buruh
        "Ahmad Rofiq",          // Partai Gelombang Rakyat Indonesia (Gelora)
        "Sohibul Iman",         // Partai Keadilan Sejahtera (PKS)
        "Suhaimi Abdullah",     // Partai Kebangkitan Nusantara (PKN)
        "Oesman Sapta",         // Partai Hati Nurani Rakyat (Hanura)
        "Agus Harimurti Yudhoyono", // Partai Garda Perubahan Indonesia (Garuda)
        "Zulkifli Hasan",       // Partai Amanat Nasional (PAN)
        "Yusril Ihza Mahendra", // Partai Bulan Bintang (PBB)
        "Agus Harimurti Yudhoyono", // Partai Demokrat
        "Grace Natalie",        // Partai Solidaritas Indonesia (PSI)
        "Hary Tanoesoedibjo",   // Partai Persatuan Indonesia (Perindo)
        "Romahurmuziy",         // Partai Persatuan Pembangunan (PPP)
        "Suhud Alynudin"        // Partai UMMAT
    )
    private val tahunBerdiri = arrayOf(
        "1998", // Partai Kebangkitan Bangsa (PKB)
        "2008", // Partai Gerakan Indonesia Raya (Gerindra)
        "1973", // Partai Demokrasi Indonesia Perjuangan (PDI Perjuangan)
        "1964", // Partai Golongan Karya (Golkar)
        "2011", // Partai NasDem
        "2000", // Partai Buruh
        "2019", // Partai Gelombang Rakyat Indonesia (Gelora)
        "2002", // Partai Keadilan Sejahtera (PKS)
        "2019", // Partai Kebangkitan Nusantara (PKN)
        "2006", // Partai Hati Nurani Rakyat (Hanura)
        "2016", // Partai Garda Perubahan Indonesia (Garuda)
        "1998", // Partai Amanat Nasional (PAN)
        "1998", // Partai Bulan Bintang (PBB)
        "2003", // Partai Demokrat
        "2014", // Partai Solidaritas Indonesia (PSI)
        "2015", // Partai Persatuan Indonesia (Perindo)
        "1973", // Partai Persatuan Pembangunan (PPP)
        "2018"  // Partai UMMAT
    )
    private val alamatKantor = arrayOf(
        "Jl. Diponegoro No. 24, Jakarta Pusat",   // Partai Kebangkitan Bangsa (PKB)
        "Jl. Anggrek Neli Murni No. 76, Jakarta Barat",   // Partai Gerakan Indonesia Raya (Gerindra)
        "Jl. Diponegoro No. 58, Jakarta Pusat",   // Partai Demokrasi Indonesia Perjuangan (PDI Perjuangan)
        "Jl. Gatot Subroto No. 79, Jakarta Selatan",   // Partai Golongan Karya (Golkar)
        "Jl. Tanah Abang I No. 15, Jakarta Pusat",   // Partai NasDem
        "Jl. Diponegoro No. 74, Jakarta Pusat",   // Partai Buruh
        "Jl. Kebon Sirih No. 23, Jakarta Pusat",   // Partai Gelombang Rakyat Indonesia (Gelora)
        "Jl. TB Simatupang No. 33, Jakarta Selatan",   // Partai Keadilan Sejahtera (PKS)
        "Jl. Rasuna Said No. 25, Jakarta Selatan",   // Partai Kebangkitan Nusantara (PKN)
        "Jl. Kramat Raya No. 154, Jakarta Pusat",   // Partai Hati Nurani Rakyat (Hanura)
        "Jl. Kemang Raya No. 97, Jakarta Selatan",   // Partai Garda Perubahan Indonesia (Garuda)
        "Jl. H Agus Salim No. 97, Jakarta Pusat",   // Partai Amanat Nasional (PAN)
        "Jl. Kramat Raya No. 178, Jakarta Pusat",   // Partai Bulan Bintang (PBB)
        "Jl. Proklamasi No. 51, Jakarta Pusat",   // Partai Demokrat
        "Jl. Kertanegara No. 87, Jakarta Selatan",   // Partai Solidaritas Indonesia (PSI)
        "Jl. Tanah Abang I No. 23, Jakarta Pusat",   // Partai Persatuan Indonesia (Perindo)
        "Jl. RP Soeroso No. 33, Jakarta Pusat",   // Partai Persatuan Pembangunan (PPP)
        "Jl. MT Haryono Kav. 88, Jakarta Selatan"   // Partai UMMAT
    )

    private val website = arrayOf(
        "https://www.pkb.or.id",   // Partai Kebangkitan Bangsa (PKB)
        "https://gerindra.org",   // Partai Gerakan Indonesia Raya (Gerindra)
        "https://www.pdiperjuangan.id",   // Partai Demokrasi Indonesia Perjuangan (PDI Perjuangan)
        "https://golkar.or.id",   // Partai Golongan Karya (Golkar)
        "https://www.nasdem.id",   // Partai NasDem
        "https://www.partaiburuh.id",   // Partai Buruh
        "https://gelora.id",   // Partai Gelombang Rakyat Indonesia (Gelora)
        "https://www.pks.id",   // Partai Keadilan Sejahtera (PKS)
        "https://www.partaipkn.id",   // Partai Kebangkitan Nusantara (PKN)
        "https://www.hanura.or.id",   // Partai Hati Nurani Rakyat (Hanura)
        "https://www.garuda.id",   // Partai Garda Perubahan Indonesia (Garuda)
        "https://pan.or.id",   // Partai Amanat Nasional (PAN)
        "https://www.pbb.or.id",   // Partai Bulan Bintang (PBB)
        "https://www.demokrat.or.id",   // Partai Demokrat
        "https://psi.id",   // Partai Solidaritas Indonesia (PSI)
        "https://perindo.id",   // Partai Persatuan Indonesia (Perindo)
        "https://www.ppp.or.id",   // Partai Persatuan Pembangunan (PPP)
        "https://www.partaiummat.id"   // Partai UMMAT
    )

    private val deskripsi = arrayOf(
        "Partai Kebangkitan Bangsa (PKB) adalah partai politik Islam-Nasionalis yang didirikan pada tahun 1998 di awal era reformasi Indonesia. PKB deskripsikan oleh Carnegie Endowment sebagai partai sayap kanan yang memiliki hubungan sejarah kuat dengan organisasi Islam terbesar di Indonesia, Nahdlatul Ulama (NU). PKB didirikan oleh tokoh NU terkemuka dan Presiden Indonesia keempat, Abdurrahman Wahid (biasa dikenal sebagai Gus Dur), sebelum kemudian diambil alih oleh Muhaimin Iskandar (Cak Imin). Menurut Media Survei Nasional, basis utama pendukung PKB terdiri dari umat Muslim yang berafiliasi dengan NU di pulau Jawa, mengingat PKB memiliki hubungan yang kuat dengan para pemimpin agama (kyai) yang memiliki pengaruh besar di kalangan pengikut mereka. Meski demikian, Ketua Umum Pengurus Besar Nahdlatul Ulama (PBNU) Yahya Cholil Staquf (Gus Yahya) menegaskan bahwa PKB bukan partai yang merepresentasikan Nahdlatul Ulama (NU), karena NU telah mengambil jarak dengan politik praktis.",
        "Partai Gerakan Indonesia Raya (Gerindra) adalah partai politik di Indonesia yang didirikan pada 6 Februari 2008 oleh Prabowo Subianto, mantan Letnan Jenderal TNI dan menantu Presiden Soeharto. Gerindra adalah partai politik nasionalis yang menekankan pada keadilan sosial dan ekonomi. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional. Gerindra adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan oleh Prabowo Subianto, mantan Letnan Jenderal TNI dan menantu Presiden Soeharto. Partai ini adalah partai polit ik nasionalis yang menekankan pada keadilan sosial dan ekonomi. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Demokrasi Indonesia Perjuangan (PDI Perjuangan) adalah partai politik di Indonesia. Partai ini didirikan pada 10 Januari 1973 oleh Megawati Soekarnoputri, putri dari Presiden Indonesia pertama, Soekarno. PDI Perjuangan adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 10 Januari 1973 oleh Megawati Soekarnoputri, putri dari Presiden Indonesia pertama, Soekarno. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Golongan Karya (Golkar) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Oktober 1964 oleh Soeharto, Presiden Indonesia kedua. Golkar adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Oktober 1964 oleh Soeharto, Presiden Indonesia kedua. Partai ini adalah partai politik yang menekankan pada keadilan sosial dan ekonom i. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai NasDem adalah partai politik di Indonesia. Partai ini didirikan pada 26 Juli 2011 oleh Surya Paloh. NasDem adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 26 Juli 2011 oleh Surya Paloh. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Buruh adalah partai politik di Indonesia. Partai ini didirikan pada 1 Mei 2000 oleh Said Iqbal. Partai Buruh adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 1 Mei 2000 oleh Said Iqbal. Partai ini adalah partai politik yang menekankan pada keadilan sosial dan ekonomi. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Gelombang Rakyat Indonesia (Gelora) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2019 oleh Ahmad Rofiq. Gelora adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2019 oleh Ahmad Rofiq. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Keadilan Sejahtera (PKS) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2002 oleh Sohibul Iman. PKS adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2002 oleh Sohibul Iman. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Kebangkitan Nusantara (PKN) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2019 oleh Suhaimi Abdullah. PKN adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2019 oleh Suhaimi Abdullah. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial . Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Hati Nurani Rakyat (Hanura) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2006 oleh Oesman Sapta. Hanura adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2006 oleh Oesman Sapta. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Garda Perubahan Indonesia (Garuda) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2016 oleh Agus Harimurti Yudhoyono. Garuda adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2016 oleh Agus Harimurti Yudhoyono. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Amanat Nasional (PAN) adalah partai politik di Indonesia. Partai ini didirikan pada 23 Mei 1998 oleh Zulkifli Hasan. PAN adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 23 Mei 1998 oleh Zulkifli Hasan. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial . Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Bulan Bintang (PBB) adalah partai politik di Indonesia. Partai ini didirikan pada 23 Mei 1998 oleh Yusril Ihza Mahendra. PBB adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 23 Mei 1998 oleh Yusril Ihza Mahendra. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Demokrat adalah partai politik di Indonesia. Partai ini didirikan pada 9 September 2003 oleh Agus Harimurti Yudhoyono. Demokrat adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 9 September 2003 oleh Agus Harimurti Yudhoyono. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Solidaritas Indonesia (PSI) adalah partai politik di Indonesia. Partai ini didirikan pada 4 Agustus 2014 oleh Grace Natalie. PSI adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 4 Agustus 2014 oleh Grace Natalie. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Persatuan Indonesia (Perindo) adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2015 oleh Hary Tanoesoedibjo. Perindo adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2015 oleh Hary Tanoesoedibjo. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial . Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai Persatuan Pembangunan (PPP) adalah partai politik di Indonesia. Partai ini didirikan pada 5 Januari 1973 oleh Romahurmuziy. PPP adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 5 Januari 1973 oleh Romahurmuziy. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional.",
        "Partai UMMAT adalah partai politik di Indonesia. Partai ini didirikan pada 20 Juli 2018 oleh Suhud Alynudin. UMMAT adalah partai politik yang berbasis di Jakarta, Indonesia. Partai ini didirikan pada 20 Juli 2018 oleh Suhud Alynudin. Partai ini adalah partai politik yang menekankan pada demokrasi dan keadilan sosial. Partai ini juga menekankan pada kekuatan militer dan pertahanan nasional."
    )

    val listDataPartai: ArrayList<partai>
        get() {
            val list = arrayListOf<partai>()
            for (position in namaPartai.indices) {
                val partai = partai()
                partai.namaPartai = namaPartai[position]
                partai.nomorPartai = nomorPartai[position]
                partai.logo = logo[position]
                partai.visi = visi[position]
                partai.misi = misi[position]
                partai.namaKetua = namaKetua[position]
                partai.tahunBerdiri = tahunBerdiri[position]
                partai.alamatKantor = alamatKantor[position]
                partai.website = website[position]
                partai.deskripsi = deskripsi[position]
                list.add(partai)
            }
            return list
        }
}