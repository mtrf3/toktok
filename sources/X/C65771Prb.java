package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Prb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65771Prb<T> {
    public final InterfaceC65784Pro<T> LIZ;
    public final Class<? extends T> LIZIZ;
    public final String LIZJ;
    public final ArrayList<T> LIZLLL;
    public boolean LJ;
    public T LJFF;

    public final void LIZ() {
        Iterator<T> it = this.LIZLLL.iterator();
        if (it.hasNext()) {
            T next = it.next();
            SharedPreferences.Editor editor = UserStore.LJ;
            if (next == null) {
                editor.remove(this.LIZJ);
            } else {
                editor.putString(this.LIZJ, GsonProtectorUtils.toJson(UserStore.LJ(), next));
            }
            editor.apply();
        }
        this.LIZLLL.clear();
    }

    public final void LIZIZ() {
        SharedPreferences.Editor editor = UserStore.LJ;
        editor.putString(this.LIZJ, GsonProtectorUtils.toJson(UserStore.LJ(), LIZJ()));
        editor.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T LIZJ() {
        /*
            r7 = this;
            boolean r0 = r7.LJ
            if (r0 == 0) goto L7
            T r0 = r7.LJFF
        L6:
            return r0
        L7:
            java.lang.String r6 = "method_user_load_gson_duration"
            android.content.SharedPreferences r2 = com.ss.android.ugc.aweme.user.UserStore.LIZLLL
            java.lang.String r1 = r7.LIZJ
            java.lang.String r0 = ""
            java.lang.String r3 = r2.getString(r1, r0)
            r5 = 0
            r4 = 1
            if (r3 == 0) goto L1d
            int r0 = r3.length()
            if (r0 != 0) goto L22
        L1d:
            r0 = 1
        L1e:
            r2 = 0
            if (r0 != 0) goto L99
            goto L24
        L22:
            r0 = 0
            goto L1e
        L24:
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Exception -> L77
            r0.LIZJ(r6, r5)     // Catch: java.lang.Exception -> L77
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Exception -> L77
            java.lang.String r1 = "gson_opt_for_user_deserialize_optimize_enable"
            r0.getClass()     // Catch: java.lang.Exception -> L77
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = X.FFL.LJ(r0, r1, r4, r4)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L57
            int r0 = r3.length()     // Catch: java.lang.Exception -> L77
            if (r0 != 0) goto L45
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            if (r0 == 0) goto L4a
            r1 = r2
            goto L6f
        L4a:
            com.google.gson.Gson r1 = com.ss.android.ugc.aweme.user.UserStore.LJ()     // Catch: com.google.gson.s -> L55 java.lang.Throwable -> L65 java.lang.Exception -> L77
            java.lang.Class<? extends T> r0 = r7.LIZIZ     // Catch: com.google.gson.s -> L55 java.lang.Throwable -> L65 java.lang.Exception -> L77
            java.lang.Object r1 = X.C65426Pm2.LIZ(r1, r3, r0)     // Catch: com.google.gson.s -> L55 java.lang.Throwable -> L65 java.lang.Exception -> L77
            goto L6f
        L55:
            r0 = move-exception
            goto L62
        L57:
            com.google.gson.Gson r1 = com.ss.android.ugc.aweme.user.UserStore.LJ()     // Catch: java.lang.Exception -> L77
            java.lang.Class<? extends T> r0 = r7.LIZIZ     // Catch: java.lang.Exception -> L77
            java.lang.Object r1 = r1.LJII(r3, r0)     // Catch: java.lang.Exception -> L77
            goto L6f
        L62:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Exception -> L77
        L65:
            com.google.gson.Gson r1 = com.ss.android.ugc.aweme.user.UserStore.LJ()     // Catch: java.lang.Exception -> L77
            java.lang.Class<? extends T> r0 = r7.LIZIZ     // Catch: java.lang.Exception -> L77
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r3, r0)     // Catch: java.lang.Exception -> L77
        L6f:
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Exception -> L77
            r0.LJFF(r6, r5)     // Catch: java.lang.Exception -> L77
            goto L98
        L77:
            r1 = move-exception
            X.C16880lQ.LLLLIIL(r1)
            boolean r0 = r1 instanceof com.google.gson.s
            if (r0 != 0) goto L99
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 != 0) goto L99
            boolean r0 = r1 instanceof java.lang.NullPointerException
            if (r0 == 0) goto Ldb
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8d
            r1.<init>(r3)     // Catch: org.json.JSONException -> L8d
            goto L92
        L8d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L92:
            java.lang.String r0 = "user_store_load_npe"
            X.FUA.LIZJ(r0, r1)
            goto L99
        L98:
            r2 = r1
        L99:
            r7.LJFF = r2
            if (r2 != 0) goto Lc7
            X.Pro<T> r0 = r7.LIZ
            java.lang.Object r0 = r0.invoke()
            r7.LIZLLL(r0)
            java.util.ArrayList<T> r0 = r7.LIZLLL
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r3 = r1.next()
            android.content.SharedPreferences$Editor r2 = com.ss.android.ugc.aweme.user.UserStore.LJ
            if (r3 != 0) goto Lcd
            java.lang.String r0 = r7.LIZJ
            r2.remove(r0)
        Lbf:
            r2.commit()
        Lc2:
            java.util.ArrayList<T> r0 = r7.LIZLLL
            r0.clear()
        Lc7:
            r7.LJ = r4
            T r0 = r7.LJFF
            goto L6
        Lcd:
            java.lang.String r1 = r7.LIZJ
            com.google.gson.Gson r0 = com.ss.android.ugc.aweme.user.UserStore.LJ()
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r3)
            r2.putString(r1, r0)
            goto Lbf
        Ldb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65771Prb.LIZJ():java.lang.Object");
    }

    public final void LIZLLL(T t) {
        if (this.LJFF != t) {
            this.LJFF = t;
            this.LIZLLL.clear();
            this.LIZLLL.add(t);
            this.LJ = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65771Prb(String uid, String str, T t, InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = (Class<? extends T>) t.getClass();
        this.LIZJ = C00F.LIZIZ(uid, '_', str);
        this.LIZLLL = new ArrayList<>(1);
    }
}
