package X;

import Y.ARunnableS14S0201000_11;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.PjU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65268PjU {
    public final Context LIZ;
    public final InterfaceC65285Pjl LIZIZ;

    public final C021606q LIZ() {
        String string = ((C65270PjW) this.LIZIZ).LIZ.getString("advertising_id", "");
        C021606q c021606q = new C021606q(string, ((C65270PjW) this.LIZIZ).LIZ.getBoolean("limit_ad_tracking_enabled", false));
        if (!TextUtils.isEmpty(string)) {
            C65265PjR.LIZIZ().getClass();
            new PthreadThread(new ARunnableS14S0201000_11(3, this, c021606q, 11), "AdvertisingInfoProvider").start();
            return c021606q;
        }
        C021606q LIZIZ = LIZIZ();
        LIZJ(LIZIZ);
        return LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C021606q LIZIZ() {
        /*
            r10 = this;
            X.0F3 r7 = new X.0F3
            android.content.Context r0 = r10.LIZ
            r7.<init>(r0)
            java.lang.String r9 = "p83.a$a"
            java.lang.Object r8 = r7.LIZ
            r4 = 1
            r6 = 0
            r3 = 0
            java.lang.String r0 = "j93.f"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "isGooglePlayServicesAvailable"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L32
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r1[r6] = r0     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r1 = r5.getMethod(r2, r1)     // Catch: java.lang.Exception -> L32
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L32
            r0[r6] = r8     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L32
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L32
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            if (r0 == 0) goto L81
            X.06q r5 = new X.06q
            java.lang.Class r2 = java.lang.Class.forName(r9)     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = "getId"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L51
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L51
            java.lang.Object r1 = r7.LIZIZ()     // Catch: java.lang.Exception -> L51
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L51
            r3 = r0
            goto L58
        L51:
            X.HcC r0 = X.C65265PjR.LIZIZ()
            r0.getClass()
        L58:
            java.lang.Class r2 = java.lang.Class.forName(r9)     // Catch: java.lang.Exception -> L75
            java.lang.String r1 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L75
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L75
            java.lang.Object r1 = r7.LIZIZ()     // Catch: java.lang.Exception -> L75
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L75
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Exception -> L75
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L75
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L75
            goto L7d
        L75:
            X.HcC r0 = X.C65265PjR.LIZIZ()
            r0.getClass()
            r0 = 0
        L7d:
            r5.<init>(r3, r0)
            r3 = r5
        L81:
            if (r3 == 0) goto L9f
            java.lang.Comparable r0 = r3.LIZIZ
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L9f
        L8d:
            if (r4 != 0) goto L97
            X.HcC r0 = X.C65265PjR.LIZIZ()
            r0.getClass()
        L96:
            return r3
        L97:
            X.HcC r0 = X.C65265PjR.LIZIZ()
            r0.getClass()
            goto L96
        L9f:
            r4 = 0
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65268PjU.LIZIZ():X.06q");
    }

    public final void LIZJ(C021606q c021606q) {
        boolean z;
        if (c021606q != null && !TextUtils.isEmpty((String) c021606q.LIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C65270PjW c65270PjW = (C65270PjW) this.LIZIZ;
            SharedPreferences.Editor putBoolean = c65270PjW.LIZ.edit().putString("advertising_id", (String) c021606q.LIZIZ).putBoolean("limit_ad_tracking_enabled", c021606q.LIZ);
            c65270PjW.getClass();
            putBoolean.apply();
            return;
        }
        C65270PjW c65270PjW2 = (C65270PjW) this.LIZIZ;
        SharedPreferences.Editor remove = c65270PjW2.LIZ.edit().remove("advertising_id").remove("limit_ad_tracking_enabled");
        c65270PjW2.getClass();
        remove.apply();
    }

    public C65268PjU(Context context, C65270PjW c65270PjW) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = c65270PjW;
    }
}
