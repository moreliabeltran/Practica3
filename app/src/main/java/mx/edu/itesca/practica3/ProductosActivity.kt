package mx.edu.itesca.practica3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)
        var imageView : ImageView = findViewById(R.id.imageView1)






        var menuOption : String ? = intent.getStringExtra("menuType")


        agregarProductos(imageView, menuOption)


        var listView : ListView = findViewById(R.id.ListView) as ListView


        var adaptador : AdaptadorProductos = AdaptadorProductos(this,menu)
        listView.adapter = adaptador


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun agregarProductos(imageView:ImageView, option:String?){
        when(option){
            "Antojitos"->{
                imageView.setImageResource(R.drawable.antojitos)
                menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad.", 5.69))
                menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.", 10.99))
                menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
                menu.add(Product("Sincronizada", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", 7.99))
                menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.", 3.79))
                menu.add(Product("Tostadas", R.drawable.tostadas, "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.", 4.59))
                menu.add(Product("Coctel de camarón", R.drawable.coctel, "Shrimp cocktail.", 16.49))
            }
            "Especialidades"->{
                imageView.setImageResource(R.drawable.especialidades)
                menu.add(Product("Mojarra Frita - Fried Fish", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Ceviche", R.drawable.ceviche, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99 ))
                menu.add(Product("Botana de Camarones a la Diabla", R.drawable.botanacamarones, "", 19.99))
                menu.add(Product("Torre de Camarón Negro", R.drawable.caldocamaron, "", 19.99))
                menu.add(Product("Botana de Pulpo a la Diabla", R.drawable.mojarra, "", 16.99))
                menu.add(Product("Botana de Pulpo al Mojo de Ajo", R.drawable.ceviche, "", 24.99))
                menu.add(Product("Pulpo al Mojo de Ajo", R.drawable.caldocamaron, "", 35.00))
                menu.add(Product("Pulpo Zarandeado", R.drawable.mojarra, "", 35.00))
                menu.add(Product("Platillos de Camarón al Mojo de Ajo", R.drawable.mojarra, "", 18.99))
                menu.add(Product("Platillos de Camarón a la Diabla", R.drawable.ceviche, "", 18.99))


            }
            "Combinations"->{
                imageView.setImageResource(R.drawable.combinations)
                menu.add(Product("Mexican Burrito", R.drawable.burritos, "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz -Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.", 12.99))
                menu.add(Product("Los Portales Burrito", R.drawable.burritosportales, "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.", 13.59 ))
                menu.add(Product("Cinco", R.drawable.cinco, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.", 9.99))
                menu.add(Product("Dos Amigos", R.drawable.dosamigos, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans", 9.99))
                menu.add(Product("Burrito Pepe", R.drawable.burritopepe, "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.", 9.99))
                menu.add(Product("Fajita Burrito", R.drawable.burritos, "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole - Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.", 13.59 ))
                menu.add(Product("Fajita Quesadilla", R.drawable.fajitaquesadilla, "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - 10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.", 13.99))


            }
            "Tortas"->{
                imageView.setImageResource(R.drawable.tortas)
                menu.add(Product("Torta Regular", R.drawable.torta, "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.", 12.99))
                menu.add(Product("Torta Milanesa", R.drawable.tortamilanesa, "Breaded Steak or Chicken", 13.99))
                menu.add(Product("Torta Cubana", R.drawable.tortacubana, "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese", 13.99))
                menu.add(Product("Torta Mixta", R.drawable.tortamixta, "Chorizo, asada y pastor./ Mexican sausage, steak and marinated pork.", 13.99))
                menu.add(Product("Small Mexican Torta", R.drawable.smallmexican, "Bolillo bread sandwich with your of meat, shredded lettuce, avocado, tomato, onion and sour cream.", 3.79))
            }
            "Sopas"->{
                imageView.setImageResource(R.drawable.sopas)
                menu.add(Product("Pozole", R.drawable.pozole, "Weekends only", 5.99 ))
                menu.add(Product("Menudo", R.drawable.menudo, "Wednesday to Sunday", 5.99 ))
                menu.add(Product("Caldo de Res", R.drawable.caldores, "All days", 5.99))
                menu.add(Product("Caldo de Camaron", R.drawable.caldocamaron, "Shrimp soup", 13.99))
                menu.add(Product("Sopa de Mariscos", R.drawable.sopamariscos, "Seafood soup", 19.99))


            }
            "Drinks"->{
                imageView.setImageResource(R.drawable.drinks)
                menu.add(Product("Soft Drinks - Sodas 20 oz", R.drawable.sodas, "", 2.99 ))
                menu.add(Product("Jarritos", R.drawable.jarritos, "", 2.75 ))
                menu.add(Product("Aguas Frescas", R.drawable.caguamamichelada, "Caguama michelada", 5.99))
            }
        }


    }


    }

    private class AdaptadorProductos: BaseAdapter{
        var productos=ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, producto: ArrayList<Product>){
            this.productos=producto
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod=productos[p0]
            var inflador=LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view,null)

            var imagen = vista.findViewById(R.id.producto_img) as ImageView
            var nombre= vista.findViewById(R.id.producto_nombre) as TextView
            var desc = vista.findViewById(R.id.producto_desc) as TextView
            var precio = vista.findViewById(R.id.producto_precio) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText("${prod.description}")
            precio.setText("$${prod.price}")
            return vista

        }
    }
