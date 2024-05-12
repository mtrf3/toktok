package androidx.browser.customtabs;

import X.BinderC39931hV;
import X.C0MA;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public final C0MA<IBinder, IBinder.DeathRecipient> LJLIL = new C0MA<>();
    public final BinderC39931hV LJLILLLLZI = new BinderC39931hV(this);

    public abstract Bundle LIZ();

    public abstract boolean LIZIZ();

    public abstract boolean LIZJ();

    public abstract int LIZLLL();

    public abstract boolean LJ();

    public abstract boolean LJFF();

    public abstract boolean LJI();

    public abstract boolean LJII();

    public abstract boolean LJIIIIZZ();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.LJLILLLLZI;
    }
}
