package com.dzaki_aryavega.klinik_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.klinik_app.adapter.AdapterListDoctors
import com.dzaki_aryavega.klinik_app.adapter.AdapterMenuIcon
import com.dzaki_aryavega.klinik_app.model.modelicon
import com.dzaki_aryavega.klinik_app.model.modellistdoctor


class DoctorPageActivity : AppCompatActivity() {

    private lateinit var RecyclerViewMenu : RecyclerView
    private lateinit var AdapterMenu : AdapterMenuIcon

    private lateinit var RecyclerViewDoctor : RecyclerView
    private lateinit var AdapterDoctor : AdapterListDoctors

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctor_page)

        //data contoh untuk menu
        val menuIcons = listOf(
            modelicon(R.drawable.icon_heart,"cardiologist"),
            modelicon(R.drawable.icon_eye,"Ophthalmologyst"),
            modelicon(R.drawable.icon_tooth,"Dentist")
        )


        //inisialisasi recyclerview dan adapter
        RecyclerViewMenu = findViewById(R.id.recycleViewMenu)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        AdapterMenu = AdapterMenuIcon(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        //data untuk dokter
        val menudokter = listOf(
            modellistdoctor("Dr.Floyd Miles",R.drawable.dokter1,"Pediatrics","(123 reviews)","4.9"),
            modellistdoctor("Dr.Guy Hawkins",R.drawable.dokter6,"Dentist","(85 reviews)","4.9"),
            modellistdoctor("Dr.Jane Cooper",R.drawable.dokter3,"Cardiologist","(44 reviews)","4.7"),
            modellistdoctor("Dr.Jacob Jones",R.drawable.dokter4,"Nephrologyst","(101 reviews)","5.0"),
            modellistdoctor("Dr.Savannah Nguyen",R.drawable.dokter5,"Urologist","(168 reviews)","4.8")
        )

        //inisialisasi recycleview dan adapter
        RecyclerViewDoctor = findViewById(R.id.recycleViewDoctor)
        RecyclerViewDoctor.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        AdapterDoctor= AdapterListDoctors(menudokter)
        RecyclerViewDoctor.adapter = AdapterDoctor


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}