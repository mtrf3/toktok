package X;

import android.text.TextUtils;
import java.io.File;

/* loaded from: classes15.dex */
public final class W5U {
    public static final InterfaceC81711W5b LIZ;
    public static volatile C81814W9a LIZIZ;
    public static volatile V21 LIZJ;
    public static volatile boolean LIZLLL;
    public static String LJ;
    public static final int LJFF;

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(5:5|6|(1:10)|11|12)|14|15|(5:17|6|(2:8|10)|11|12)|18|19|(5:21|6|(0)|11|12)|22|6|(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
    static {
        /*
            r2 = 0
            java.lang.String r0 = "com.bytedance.lighten.loader.FrescoImageLoaderDelegate"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.Class<X.W5b> r0 = X.InterfaceC81711W5b.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L1e
            X.W5b r0 = (X.InterfaceC81711W5b) r0     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L22
            goto L69
        L1e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L22:
            java.lang.String r0 = "com.bytedance.lighten.loader.GlideImageLoaderDelegate"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.Class<X.W5b> r0 = X.InterfaceC81711W5b.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L3f
            X.W5b r0 = (X.InterfaceC81711W5b) r0     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L43
            goto L69
        L3f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L43:
            java.lang.String r0 = "com.bytedance.lighten.loader.PicassoImageLoaderDelegate"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L60
            java.lang.Class<X.W5b> r0 = X.InterfaceC81711W5b.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch: java.lang.Exception -> L60
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> L60
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L60
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L60
            X.W5b r0 = (X.InterfaceC81711W5b) r0     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L64
            goto L69
        L60:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L64:
            X.W5h r0 = new X.W5h
            r0.<init>()
        L69:
            X.W5U.LIZ = r0
            X.WCW r0 = X.WCW.LJJJIL
            r0.getClass()
            X.Ol8 r0 = X.WCW.LJJII
            java.lang.Object r0 = r0.getValue()
            X.W9a r0 = (X.C81814W9a) r0
            X.W5U.LIZIZ = r0
            X.Ol8 r1 = X.WCW.LJJIIJ
            java.lang.Object r0 = r1.getValue()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8f
            r2 = 1
        L8f:
            X.W5U.LIZLLL = r2
            X.Ol8 r0 = X.WCW.LJJIII
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.W5U.LJ = r0
            r0 = -1
            X.W5U.LJFF = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5U.<clinit>():void");
    }

    public static InterfaceC70869Rrd LIZJ() {
        if (!LIZLLL) {
            return new C81719W5j();
        }
        return LIZ.getCache();
    }

    public static C81814W9a LIZLLL() {
        if (LIZIZ == null) {
            if (LIZJ != null) {
                LIZIZ = ((C81815W9b) LIZJ).LIZ();
            } else {
                throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
            }
        }
        return LIZIZ;
    }

    public static void LIZ(W5E w5e) {
        if (!LIZLLL) {
            C79083V1z.LIZJ("display, lighten is not initialized, call Lighten.init");
            return;
        }
        if (w5e == null) {
            C79083V1z.LIZJ("display failed, LightenImageRequest is null");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("request =>");
        LIZ2.append(w5e);
        C79083V1z.LIZ(w5e.hashCode(), "Lighten", "display", X1D.LIZIZ(LIZ2));
        LIZ.display(w5e);
    }

    public static void LIZIZ(W5E w5e) {
        if (!LIZLLL) {
            return;
        }
        if (w5e == null) {
            C79083V1z.LIZIZ(0, "Lighten", "download", "request is null");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("request =>");
        LIZ2.append(w5e);
        C79083V1z.LIZ(w5e.hashCode(), "Lighten", "download", X1D.LIZIZ(LIZ2));
        LIZ.download(w5e);
    }

    public static W5F LJ(int i) {
        W5F load = LIZ.load(i);
        load.LJIIL = LJFF;
        return load;
    }

    public static W5F LJFF(android.net.Uri uri) {
        W5F load = LIZ.load(uri);
        load.LJIIL = LJFF;
        return load;
    }

    public static W5F LJI(File file) {
        if (!file.exists()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("load, illegal file, not exist, ");
            LIZ2.append(file);
            C79083V1z.LIZJ(X1D.LIZIZ(LIZ2));
            return W5F.LJJJJ;
        }
        W5F load = LIZ.load(file);
        load.LJIIL = LJFF;
        return load;
    }

    public static W5F LJII(Object obj) {
        W5F load = LIZ.load(obj);
        load.LJIIL = LJFF;
        return load;
    }

    public static W5F LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            C79083V1z.LIZJ("load, empty url");
            return W5F.LJJJJ;
        }
        W5F load = LIZ.load(str);
        load.LJIIL = LJFF;
        return load;
    }

    public static W5F LJIIIZ(C62562cu c62562cu) {
        W5F load = LIZ.load(c62562cu);
        load.LJIIL = LJFF;
        return load;
    }

    public static void LJIIJ(W5E w5e) {
        if (!LIZLLL) {
            return;
        }
        if (w5e == null) {
            C79083V1z.LIZIZ(0, "Lighten", "loadBitmap", "request is null");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("request =>");
        LIZ2.append(w5e);
        C79083V1z.LIZ(w5e.hashCode(), "Lighten", "loadBitmap", X1D.LIZIZ(LIZ2));
        LIZ.loadBitmap(w5e);
    }
}
