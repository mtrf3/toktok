package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0RB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RB {
    public final JSONArray LIZ;
    public final JSONArray LIZIZ;
    public final JSONArray LIZJ;
    public final C0RE LJI;
    public final List<C23980ws> LIZLLL = new ArrayList();
    public final List<C24030wx> LJ = new ArrayList();
    public final java.util.Map<String, C24030wx> LJFF = new HashMap();
    public final java.util.Map<String, C24090x3> LJII = new HashMap();
    public final java.util.Map<String, C24090x3> LJIIIIZZ = new HashMap();
    public final java.util.Map<String, C23980ws> LJIIIZ = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r0 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r6) {
        /*
            r5 = this;
            X.0RE r4 = r5.LJI
            X.16o r1 = X.C276216o.LJIIL
            X.16m r0 = r1.LIZ
            java.lang.String r3 = r0.LJIIJ
            X.1Js r4 = (X.C31041Js) r4
            r4.getClass()
            java.lang.String r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L40
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L1e
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L40
            goto L42
        L1e:
            r2 = 0
            X.16m r0 = r1.LIZ     // Catch: java.lang.Throwable -> L31
            android.app.Application r0 = r0.LIZ     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = X.C77125UOr.LJIL(r0)     // Catch: java.lang.Throwable -> L31
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L31
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            java.util.Map r0 = defpackage.g0.LJJIJIIJIL(r0)     // Catch: java.lang.Throwable -> L31
            goto L32
        L31:
            r0 = r2
        L32:
            r4.LIZ(r3, r2, r2)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            java.lang.String r0 = ""
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RB.LIZ(java.lang.String):java.lang.String");
    }

    public C0RB(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, C0RE c0re) {
        this.LIZ = jSONArray;
        this.LIZIZ = jSONArray2;
        this.LIZJ = jSONArray3;
        this.LJI = c0re;
        if (jSONArray != null) {
            for (int i = 0; i < this.LIZ.length(); i++) {
                try {
                    C23980ws c23980ws = new C23980ws((JSONObject) this.LIZ.get(i));
                    this.LIZLLL.add(c23980ws);
                    this.LJIIIZ.put(c23980ws.LJI, c23980ws);
                } catch (Throwable unused) {
                }
            }
        }
        if (this.LIZIZ != null) {
            for (int i2 = 0; i2 < this.LIZIZ.length(); i2++) {
                try {
                    C24030wx c24030wx = new C24030wx((JSONObject) this.LIZIZ.get(i2));
                    this.LJ.add(c24030wx);
                    this.LJFF.put(c24030wx.LIZ, c24030wx);
                    Iterator it = ((ArrayList) c24030wx.LJIILJJIL).iterator();
                    while (it.hasNext()) {
                        C24030wx c24030wx2 = (C24030wx) it.next();
                        this.LJ.add(c24030wx2);
                        this.LJFF.put(c24030wx2.LIZ, c24030wx2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        if (this.LIZJ != null) {
            for (int i3 = 0; i3 < this.LIZJ.length(); i3++) {
                try {
                    C24090x3 c24090x3 = new C24090x3((JSONObject) this.LIZJ.get(i3));
                    this.LJII.put(c24090x3.LIZIZ, c24090x3);
                    this.LJIIIIZZ.put(c24090x3.LIZ, c24090x3);
                } catch (Throwable unused3) {
                }
            }
        }
    }
}
