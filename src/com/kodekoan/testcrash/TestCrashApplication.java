package com.kodekoan.testcrash;

import android.app.Application;
import org.acra.*;
import org.acra.annotation.*;

@ReportsCrashes(formKey = "",
formUri="http://http://acra.kodekoan.com/api/submit_acra_report",
formUriBasicAuthLogin = "josephine", 
formUriBasicAuthPassword = "yrunbys9"
)
public class TestCrashApplication extends Application {
	@Override
	public void onCreate() {
		// The following line triggers the initialization of ACRA
		ACRA.init(this);
		super.onCreate();
	}
}
