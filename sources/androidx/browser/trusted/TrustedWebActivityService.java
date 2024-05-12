package androidx.browser.trusted;

import X.BinderC282619a;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import X.InterfaceC03670Cl;
import X.X1D;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {
    public NotificationManager LJLIL;
    public int LJLILLLLZI = -1;
    public final BinderC282619a LJLJI = new BinderC282619a(this);

    public abstract InterfaceC03670Cl LIZJ();

    public final int LIZLLL() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public final void LIZIZ() {
        if (this.LJLIL != null) {
        } else {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.LJLIL = (NotificationManager) getSystemService("notification");
    }

    public static String LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str.toLowerCase(Locale.ROOT).replace(' ', '_'));
        LIZ.append("_channel_id");
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.LJLJI;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.LJLILLLLZI = -1;
        return super.onUnbind(intent);
    }
}
