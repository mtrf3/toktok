package androidx.core.content;

import X.BinderC28541Ac;
import X.C35532Dx2;
import X.C38413F5t;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public final BinderC28541Ac LJLIL = new BinderC28541Ac(this);

    public abstract void LIZ();

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.LJLIL;
    }
}
