package com.example.mobilecoursework;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	// glasgow 
	static final LatLng Glasgow = new LatLng(55.8580, -4.2590);
	// SECC
	static final LatLng SECC = new LatLng(55.8507, -4.2871);
	// SECC Boxing 
	static final LatLng SECCBoxing = new LatLng(55.8509, -4.2874);
	// SECC Wrestling 
	static final LatLng SECCWrestling = new LatLng(55.8508, -4.2872);
	// SECC Weightlifting
    static final LatLng SECCWeightlifting = new LatLng(55.8503, -4.2867);
 // SECC Netball
    static final LatLng SECCNetball = new LatLng(55.8511, -4.2864);
 // SECC gymnastics
    static final LatLng SECCGymnastics = new LatLng(55.8513, -4.2863);
	// Barry Buddon Shooting 
	static final LatLng BarryBuddon = new LatLng(56.499, -2.7543);
	// Scotstown Sports Campus
	static final LatLng Scotstown = new LatLng(55.8813, -4.3405);
	// Glasgow National Hockey Centre
	static final LatLng HockeyCentre = new LatLng(55.8447, -4.236);
	// Ibrox Stadium
	static final LatLng Ibrox = new LatLng(55.853, -4.309);
	// Kelvingrove Lawn Bowls Centre
	static final LatLng Kelvingrove = new LatLng(55.867,-4.236);
	//Hampden Park Stadium
	static final LatLng Hampden = new LatLng(55.853,-4.2520);
	//Strathclyde Country Park
	static final LatLng Strathclyde = new LatLng(55.7971971,-4.0342997);
	//Cathkin Braes
	static final LatLng Cathkin = new LatLng(55.79434,-4.2193);
	//Velodrome
	static final LatLng Velodrome = new LatLng(55.847,-4.2076);
	//Velodrome
	static final LatLng Emmirates = new LatLng(55.840,-4.2070);
	//Tollcross
	static final LatLng Tollcross = new LatLng(55.845, -4.177);
	//Edinburgh
	static final LatLng Edinburgh = new LatLng(55.939, -3.172);
	
	// CommonWealth history 
	// Edmonton (History 1)
	static final LatLng Edmonton = new LatLng(53.5333, -113.5000);
	// Brisbane (History 2)
	static final LatLng Brisbane = new LatLng(-27.4679, 153.0278);
	// Edinburgh (History 3)
	static final LatLng historyEdinburgh = new LatLng(55.9531, -3.1889);
	// Auckland (History 4) 
	static final LatLng Auckland = new LatLng(-36.8404, 174.7399);
	// Victoria (History 5)
	static final LatLng Victoria = new LatLng(48.4222 , -123.3657);
	// Kuala Lumpur (History 6)
	static final LatLng KualaLumpur = new LatLng(3.1357 , 101.6880);
	// Manchester (History 7)
	static final LatLng Manchester = new LatLng(53.4667, -2.2333);
	// Melbourne (History 8)
	static final LatLng Melbourne = new LatLng(-37.8136, 144.9631);
	//Delhi (History 9)
	static final LatLng Delhi = new LatLng(28.6100, 77.2300);
	
	
	
	
	// Misc 
	// Current history item 
	public int historyEntry = 0;
	// user long 
	public static float userLong;
	// user lat
	public static float userLat;
	// user location 
	static final LatLng UserLocation = new LatLng(userLong, userLat);
	// map
	private GoogleMap map;
	
	// Buttons 
	// Hybrid
	private Button Hybrid;
	// Terrain
	private Button Terrain;
	// Normal
	private Button Normal;
	// history 
	private Button History;
	// Enter Long/Lat Button
	private Button Enter;
	
	
	
	// textviews 
	// Long textview
	private TextView userLongValue; 
	// Lat textview
	private TextView userLatValue;

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	        .getMap();

	    if (map!=null){
	      
	    	
	   ////////////////////////////////// GLASGOW MARKERS ////////////////////////
	    // Marker for SECC	
	      Marker secc = map.addMarker(new MarkerOptions()
	      .position(SECC)
          .title("Judo - SECC")
          .snippet("Exhibition Way, Glasgow G3 8YW")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.judopng)));
	      
	   // Marker for SECC Boxing	
	      Marker boxing = map.addMarker(new MarkerOptions()
	      .position(SECCBoxing)
          .title("Boxing - SECC")
          .snippet("Exhibition Way, Glasgow G3 8YW")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowboxingpng)));
	      
	   // Marker for SECC Wrestler	
	      Marker wrestling = map.addMarker(new MarkerOptions()
	      .position(SECCWrestling)
          .title("Wrestling - SECC ")
          .snippet("Exhibition Way, Glasgow G3 8YW")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowboxingpng)));
	      
	   // Marker for SECC WeightLifting	
	      Marker weightlifting = map.addMarker(new MarkerOptions()
	      .position(SECCWeightlifting)
          .title("WeightLifting - SECC")
          .snippet("Exhibition Way, Glasgow G3 8YW")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.weightliftingpng)));
	      
	   // Marker for SECC Netball	
	      Marker netball = map.addMarker(new MarkerOptions()
	      .position(SECCNetball)
          .title("Netball - SECC")
          .snippet("Exhibition Way, Glasgow G3 8YW")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.netballpng)));
	      
	   // Marker for SECC Gymnastics
	      Marker gymnastics = map.addMarker(new MarkerOptions()
	      .position(SECCGymnastics)
          .title("Gymnastics - SECC")
          .snippet("Exhibition Way, Glasgow G3 8YW")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowgymnastics)));
	      
	      // Marker for Barry Buddon Shooting 
	      Marker barryBuddon = map.addMarker(new MarkerOptions()
	      .position(BarryBuddon)
          .title("Shooting - Barry Buddon Shooting Centre")
          .snippet("Barry Buddon Shooting Centre, DD7 7RY")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.shootingpng)));
	      
	      //// Marker for Scotstown Sports Campus 
	      Marker scotsTown = map.addMarker(new MarkerOptions()
	      .position(Scotstown)
          .title("Table tennis - Scotstown Sports Campus")
          .snippet("72 Danes Dr, Glasgow G14 9HD")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.tabletennispng)));
	      
	 //// Marker for Glasgow National Hockey Centre 
	      Marker hockeyCentre = map.addMarker(new MarkerOptions()
	      .position(HockeyCentre)
          .title("Hockey - Glasgow National Hockey Centre")
          .snippet("Glasgow, Glasgow City G40 1HB")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.hockeypng)));
	      
	 //// Marker for Ibrox  
	      Marker ibrox = map.addMarker(new MarkerOptions()
	      .position(Ibrox)
          .title("Rugby - Ibrox Stadium")
          .snippet("150 Edmiston Dr, Glasgow, Lanarkshire G51 2XD")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.rugbypng)));
	      
	 //// Marker for Kelvingrove Lawn Bowls Centre  
	      Marker kelvingrove = map.addMarker(new MarkerOptions()
	      .position(Kelvingrove)
          .title("Lawn Bowls - Kelvingrove Lawn Bowls Centre")
          .snippet("Kelvin Way, Glasgow, Glasgow City G3 7TA")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.lawnbowlspng)));
	      
	 //// Marker for Hampden Stadium  
	      Marker hampden = map.addMarker(new MarkerOptions()
	      .position(Hampden)
          .title("Athletics - Hampden Stadium")
          .snippet("Letherby Dr, Glasgow G42 9BA")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowathletics)));
	      
	      //// Marker for Strathclyde 
	      Marker strathclyde = map.addMarker(new MarkerOptions()
	      .position(Strathclyde)
          .title("Triathlon - Strathclyde Country Park")
          .snippet("366 Hamilton Rd, Motherwell")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.triathlonpng)));
	      
	 //// Marker for cathkin 
	      Marker  cathkin = map.addMarker(new MarkerOptions()
	      .position( Cathkin)
          .title("Cycling - Cathkin Braes Mountain Bike Trails")
          .snippet("Glasgow, Glasgow City G76 9EY")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowcyclingpng)));
	      
	      //// Marker for Velodrome 
	      Marker  velodrome = map.addMarker(new MarkerOptions()
	      .position(Velodrome)
          .title("Cycling - Sir Chris Hoy Velodrome")
          .snippet("1000 London Rd, Glasgow, Glasgow City G40 3HG")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowcyclingpng)));
	      
	 //// Marker for Emmirates 
	      Marker  emmirates = map.addMarker(new MarkerOptions()
	      .position(Emmirates)
          .title("Badminton - Emirates Arena")
          .snippet("1000 London Rd, Glasgow, Glasgow City G40 3HG")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.glasgowbadmintonpng)));
	      
	 //// Marker for Tollcross
	      Marker  tollcross = map.addMarker(new MarkerOptions()
	      .position(Tollcross)
          .title("Swimming - Tollcross International Swimming Centre")
          .snippet("367 Wellshot Rd, Glasgow G32 7QP")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.swimmingpng)));
	      
	 //// Marker for Royal Commonwealth Pool
	      Marker  edinburgh = map.addMarker(new MarkerOptions()
	      .position(Edinburgh)
          .title("Diving - Royal Commonwealth Pool")
          .snippet("21 Dalkeith Rd, Edinburgh, Midlothian EH16 5BB")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.divingpng)));
	      
	      /////////////////////////////// History Markers ///////////////////////////
	      
	 //// Marker for Edmonton
	      Marker  edmonton = map.addMarker(new MarkerOptions()
	      .position(Edmonton)
          .title("Edmonton (Canada) - 1978")
          .snippet("Scottish Medals:14")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.canadapng)));
	      
	      //// Marker for Brisbane
	      Marker  brisbane= map.addMarker(new MarkerOptions()
	      .position(Brisbane)
          .title("Brisbane (Austraila) -1982")
          .snippet("Scottish Medals: 26")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.austrailapng)));
	      
	 //// Marker for Edinburgh
	      Marker  historyedinburgh= map.addMarker(new MarkerOptions()
	      .position(historyEdinburgh)
          .title("Edinburgh (Scotland) - 1986")
          .snippet("Scottish Medals:33")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.scotlandpng)));
	      
	 //// Marker for Auckland
	      Marker  auckland= map.addMarker(new MarkerOptions()
	      .position(Auckland)
          .title("Auckland (New Zealand) - 1990")
          .snippet("Scottish Medals:22")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.newzealandpng)));
	 //// Marker for Victoria
	      Marker  victoria= map.addMarker(new MarkerOptions()
	      .position(Victoria)
          .title("Victoria (Canada) - 1994")
          .snippet("Scottish Medals:20")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.canadapng)));
	      
	 	 //// Marker for KualaLumpur
	      Marker  kualaLumpur= map.addMarker(new MarkerOptions()
	      .position(KualaLumpur)
          .title("Kuala Lumpur (Malaysia) - 1998")
          .snippet("Scottish Medals:12")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.malaysiapng)));
	      
	 //// Marker for manchester
	      Marker  manchester= map.addMarker(new MarkerOptions()
	      .position(Manchester)
          .title("Manchester (England) - 2002")
          .snippet("Scottish Medals:30")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.englandpng)));
	      
	      //// Marker for Melbourne
	      Marker  melbourne= map.addMarker(new MarkerOptions()
	      .position(Melbourne)
          .title("Melbourne (Austraila) - 2006")
          .snippet("Scottish Medals: 29")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.austrailapng)));
	      
	 //// Marker for Delhi
	      Marker  delhi= map.addMarker(new MarkerOptions()
	      .position(Delhi)
          .title("Delhi (India) - 2010")
          .snippet("Scottish Medals:26")
          .icon(BitmapDescriptorFactory
              .fromResource(R.drawable.indiapng)));
	      
	    //Move the camera instantly to glasgow with a zoom of 15.
	      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Glasgow, 40));

	      // Zoom in, animating the camera.
	      map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	      
	      // Set Buttons 
	      Hybrid = (Button) findViewById(R.id.HybridButton);
		  Hybrid.setOnClickListener(this);
		  Terrain = (Button) findViewById(R.id.TerrainButton);
		  Terrain.setOnClickListener(this);
		  Normal = (Button) findViewById(R.id.NormalButton);
		  Normal.setOnClickListener(this);
		  History = (Button) findViewById(R.id.HistoryButton);
		  History.setOnClickListener(this);
		  Enter = (Button) findViewById(R.id.LongLatButton);
		  Enter.setOnClickListener(this);
		  
		  // Set textviews 
		  userLongValue = (TextView) findViewById(R.id.editLong);
		  userLatValue = (TextView) findViewById(R.id.editLat);
		  
		  
			
	      
	    }
	  }

	  @Override
	  public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.main, menu);
	    return true;
	  }
	  
	  public void onClick(View arg0)
	  {
		  
		  
		  if (arg0 == Hybrid)
		  {
			  map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		  }
		  
		  if (arg0 == Terrain)
		  {
			  map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		  }
		  
		  if (arg0 == Normal)
		  {
			  map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		  }
		  
		  if(historyEntry ==0)
		  {
			  if (arg0 == History)
			  {
			//Move the camera instantly to Edmonton with a zoom of 5.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Edmonton, 5));
		      historyEntry = 1;
		      }
		  }
		  
		  else if(historyEntry == 1)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Brisbane, 5));
		      historyEntry = 2;
		  }
		  }
		  
		  else if(historyEntry == 2)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(historyEdinburgh, 5));
		      historyEntry = 3;
		  }
		  }
		  else if(historyEntry == 3)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Auckland, 5));
		      historyEntry = 4;
		  }
		  }
		  else if(historyEntry == 4)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Victoria, 5));
		      historyEntry = 5;
		  }
		  }
		  else if(historyEntry == 5)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(KualaLumpur, 5));
		      historyEntry = 6;
		  }
		  }
		  else if(historyEntry == 6)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Manchester, 5));
		      historyEntry = 7;
		  }
		  }
		  else if(historyEntry == 7)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Melbourne, 7));
		      historyEntry = 8;
		  }
		  }
		  else if(historyEntry == 8)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Delhi, 10));
		      historyEntry = 9;
		  }
		  }
		  else if(historyEntry == 9)
		  {
		  if (arg0 == History)
		  {
			//Move the camera instantly to glasgow with a zoom of 15.
		      map.moveCamera(CameraUpdateFactory.newLatLngZoom(Glasgow, 10));
		      historyEntry = 0;
		  }
		  }
		  
		  if(arg0 == Enter)
		  {
			  userLong = 0;
			  userLat = 0;
			  try{
				   userLong = Float.valueOf(userLongValue.getText().toString());
				   userLat = Float.valueOf(userLatValue.getText().toString());
				} catch (NumberFormatException e) {
				   e.printStackTrace();
				   
				}
			  // user location 
			  if(userLong != 0 && userLat != 0)
			  {
				  // user location 
			      Marker  userLocation= map.addMarker(new MarkerOptions()
			      .position(UserLocation)
		          .title("You")
		          .snippet("")
		          .icon(BitmapDescriptorFactory
		              .fromResource(R.drawable.unnamed)));
			      
			      map.moveCamera(CameraUpdateFactory.newLatLngZoom(UserLocation, 10));
			      
			      userLong = 0;
			      userLat = 0;
			  }
		  }
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  
	  

	}

