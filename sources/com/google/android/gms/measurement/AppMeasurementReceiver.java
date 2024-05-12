package com.google.android.gms.measurement;

import X.AbstractC07890Sr;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C67156QXg;
import X.C67280Qaq;
import X.C68033Qmz;
import X.C84763XOl;
import X.InterfaceC67157QXh;
import X.X1D;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class AppMeasurementReceiver extends AbstractC07890Sr implements InterfaceC67157QXh {
    public C67156QXg LJLJI;

    public final void LIZ(Context context, Intent intent) {
        if (this.LJLJI == null) {
            this.LJLJI = new C67156QXg(this);
        }
        C67156QXg c67156QXg = this.LJLJI;
        c67156QXg.getClass();
        C67280Qaq LIZJ = C68033Qmz.LJIIZILJ(context, null, null).LIZJ();
        if (intent == null) {
            LIZJ.LJIIIIZZ.LIZ("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        LIZJ.LJIILIIL.LIZIZ(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            LIZJ.LJIILIIL.LIZ("Starting wakeful intent.");
            c67156QXg.LIZ.getClass();
            SparseArray<PowerManager.WakeLock> sparseArray = AbstractC07890Sr.LJLIL;
            synchronized (sparseArray) {
                int i = AbstractC07890Sr.LJLILLLLZI;
                int i2 = i + 1;
                AbstractC07890Sr.LJLILLLLZI = i2;
                if (i2 <= 0) {
                    AbstractC07890Sr.LJLILLLLZI = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName LLLL = C16880lQ.LLLL(context, className);
                if (LLLL == null) {
                    return;
                }
                PowerManager powerManager = (PowerManager) C16880lQ.LLILL(context, "power");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("androidx.core:wake:");
                LIZ.append(LLLL.flattenToShortString());
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, X1D.LIZIZ(LIZ));
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i, newWakeLock);
                return;
            }
        }
        if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
            return;
        }
        LIZJ.LJIIIIZZ.LIZ("Install Referrer Broadcasts are deprecated");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
