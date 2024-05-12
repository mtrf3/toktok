package X;

import Y.IDComparatorS29S0000000_1;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E92 {
    public final String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final E94 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final long LJI;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r6 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E92(java.lang.String r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.LIZ = r8
            java.lang.String r5 = ""
            r7.LIZIZ = r5
            r7.LIZJ = r5
            X.E94 r2 = X.C63081OpJ.LLL(r8)
            r7.LIZLLL = r2
            android.net.Uri r0 = r2.LJ()
            r0.getScheme()
            android.net.Uri r0 = r2.LJ()
            java.lang.String r3 = r0.getAuthority()
            if (r3 != 0) goto L23
            r3 = r5
        L23:
            kotlin.jvm.internal.AqS156S0100000_6 r1 = new kotlin.jvm.internal.AqS156S0100000_6
            r0 = 89
            r1.<init>(r7, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r7.LJ = r0
            X.E93 r0 = X.E93.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r7.LJFF = r0
            long r0 = java.lang.System.currentTimeMillis()
            r7.LJI = r0
            java.lang.String r0 = "channel"
            r6 = 0
            java.lang.String r0 = r2.LIZLLL(r0, r6, r6)
            if (r0 != 0) goto Lb8
            java.lang.String r0 = "webview"
            r4 = 0
            boolean r0 = ujb.s.LJJJLZIJ(r3, r0, r4)
            if (r0 != 0) goto L60
            java.lang.String r0 = "lynxview"
            boolean r0 = ujb.s.LJJJLZIJ(r3, r0, r4)
            if (r0 != 0) goto L60
            java.lang.String r0 = "echybrid"
            boolean r0 = ujb.s.LJJJLZIJ(r3, r0, r4)
            if (r0 == 0) goto L9b
        L60:
            android.net.Uri r0 = r2.LIZIZ
            if (r0 == 0) goto L93
            java.lang.String r2 = r0.getPath()
            if (r2 == 0) goto L93
            java.lang.String r0 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r0 = ujb.s.LJLJJL(r2, r1, r4, r0)
            java.util.Iterator r3 = r0.iterator()
        L79:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r2 = r3.next()
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "_"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r4)
            if (r0 == 0) goto L79
            r6 = r2
        L8f:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L98
        L93:
            r7.LIZJ = r5
            r7.LIZIZ = r5
            return
        L98:
            r5 = r6
            if (r6 != 0) goto L93
        L9b:
            X.E94 r0 = r7.LIZLLL
            android.net.Uri r2 = r0.LJ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r2.getAuthority()
            r1.append(r0)
            java.lang.String r0 = r2.getPath()
            r1.append(r0)
            java.lang.String r5 = X.X1D.LIZIZ(r1)
            goto L93
        Lb8:
            r5 = r0
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E92.<init>(java.lang.String):void");
    }

    public final boolean LIZ(String key, String str, String str2) {
        String str3;
        HashMap<String, Object> LJII;
        String str4;
        HashMap<String, Object> LJII2;
        o.LJIIIZ(key, "key");
        E94 e94 = this.LIZLLL;
        e94.getClass();
        boolean z = false;
        try {
            if (str2 != null) {
                if (str != null) {
                    java.util.Map<String, String> map = e94.LIZJ().get(str2);
                    if (map != null && (str4 = map.get(str)) != null && (LJII2 = C27739Aud.LJII(str4)) != null) {
                        z = LJII2.containsKey(key);
                    }
                } else {
                    java.util.Map<String, String> map2 = e94.LIZJ().get(str2);
                    if (map2 != null) {
                        z = map2.containsKey(key);
                    }
                }
            } else {
                Iterator it = ORZ.LLILII(new IDComparatorS29S0000000_1(22), e94.LIZJ().keySet()).iterator();
                if (it.hasNext()) {
                    String str5 = (String) it.next();
                    if (str != null) {
                        java.util.Map<String, String> map3 = e94.LIZJ().get(str5);
                        if (map3 != null && (str3 = map3.get(str)) != null && (LJII = C27739Aud.LJII(str3)) != null) {
                            z = LJII.containsKey(key);
                        }
                    } else {
                        java.util.Map<String, String> map4 = e94.LIZJ().get(str5);
                        if (map4 != null) {
                            z = map4.containsKey(key);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
