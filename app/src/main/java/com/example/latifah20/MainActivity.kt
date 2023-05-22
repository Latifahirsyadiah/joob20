package com.example.latifah20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latifah20.Kelas


class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "HENI WIJIANTI",
        "IBNU RIFAN",
        "JIHAN SALWA FITRIANI",
        "IKHOTIMATUS SA'ADAH",
        "LADA'ARDHI S.L",
        "LATIFAH IRSYADIAH",
        "MAULIDA INTAN NUR AINI",
        "MIFTAKHUL JANNAH",
        "MUH ASA SUSILO F.S",
        "MUH HAIKAL ",
        "MUH RIFQIL KHANIF"
    )

    val listNis = arrayOf(
        "2995",
        "2997",
        "3000",
        "3002",
        "3003",
        "3005",
        "3008",
        "3010",
        "3011",
        "3013",
        "3015"
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}