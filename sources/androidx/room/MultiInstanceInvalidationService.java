package androidx.room;

import X.BinderC40191hv;
import X.C0BD;
import X.C0BK;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int LJLIL;
    public final HashMap<Integer, String> LJLILLLLZI = new HashMap<>();
    public final C0BD LJLJI = new RemoteCallbackList<C0BK>() { // from class: X.0BD
        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(C0BK c0bk, Object obj) {
            MultiInstanceInvalidationService.this.LJLILLLLZI.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    };
    public final BinderC40191hv LJLJJI = new BinderC40191hv(this);

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
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
        return this.LJLJJI;
    }
}
