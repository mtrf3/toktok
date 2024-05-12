package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.Ikv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47521Ikv {
    public final ArrayList<String> LIZ = new ArrayList<>();
    public InterfaceC47522Ikw LIZIZ = null;
    public final Context LIZJ;
    public final WeakReference<C47529Il3> LIZLLL;
    public final /* synthetic */ C47529Il3 LJ;

    public final boolean LIZ() {
        if (this.LIZIZ == null) {
            C47523Ikx c47523Ikx = this.LJ.LJIJJ;
            if (c47523Ikx != null) {
                C0FS.LIZIZ(c47523Ikx.LIZ);
                this.LIZIZ = new C1FP();
                TTVideoEngineLog.d("VCStrategy", "use kv storage provider");
            } else {
                this.LIZIZ = new C47902Ir4(this.LIZJ, "TTVideoEngine_vod_strategy_database_v01");
                TTVideoEngineLog.d("VCStrategy", "use KVDBManager");
                return ((C47902Ir4) this.LIZIZ).LJLJJI;
            }
        }
        if (this.LIZIZ != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<X.Il3> r0 = r7.LIZLLL
            java.lang.Object r4 = r0.get()
            X.Il3 r4 = (X.C47529Il3) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            X.Ikw r1 = r7.LIZIZ
            java.lang.String r0 = "data_index"
            java.lang.String r2 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L1b
        L1a:
            return
        L1b:
            java.lang.String r0 = ","
            java.lang.String[] r6 = r2.split(r0)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L1a
            int r0 = r6.length     // Catch: java.lang.Throwable -> L3f
            if (r0 <= 0) goto L1a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            r5.<init>()     // Catch: java.lang.Throwable -> L3f
            int r3 = r6.length     // Catch: java.lang.Throwable -> L41
            r2 = 0
        L2d:
            if (r2 >= r3) goto L3d
            r1 = r6[r2]     // Catch: java.lang.Throwable -> L41
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L3a
            r5.add(r1)     // Catch: java.lang.Throwable -> L41
        L3a:
            int r2 = r2 + 1
            goto L2d
        L3d:
            r1 = r5
            goto L48
        L3f:
            r0 = move-exception
            goto L43
        L41:
            r0 = move-exception
            r1 = r5
        L43:
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0)
            if (r1 == 0) goto L1a
        L48:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L4f
            goto L1a
        L4f:
            java.util.ArrayList<java.lang.String> r0 = r7.LIZ
            r0.addAll(r1)
            java.util.Iterator r3 = r1.iterator()
        L58:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            X.Ikw r0 = r7.LIZIZ
            java.lang.String r2 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L71
            goto L58
        L71:
            com.bytedance.vcloud.strategy.StrategyCenter r1 = r4.LJ()
            r0 = 31210(0x79ea, float:4.3735E-41)
            r1.businessEvent(r0, r2)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47521Ikv.LIZIZ():void");
    }

    public final void LIZJ() {
        String str;
        ArrayList<String> arrayList = this.LIZ;
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append((String) ListProtector.get(arrayList, i));
                if (i < arrayList.size() - 1) {
                    sb.append(",");
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        this.LIZIZ.putString("data_index", str);
    }

    public C47521Ikv(C47529Il3 c47529Il3, Context context, C47529Il3 c47529Il32) {
        this.LJ = c47529Il3;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LIZJ = context;
        this.LIZLLL = new WeakReference<>(c47529Il32);
    }
}
