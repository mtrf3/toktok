package com.bytedance.lighten.loader;

import X.C16880lQ;
import X.C19N;
import X.C39633Fgz;
import X.C62562cu;
import X.C72546Sda;
import X.C73098SmU;
import X.C78866UxK;
import X.C79083V1z;
import X.C81713W5d;
import X.C81716W5g;
import X.C81721W5l;
import X.C81725W5p;
import X.C81814W9a;
import X.C81939WDv;
import X.EF7;
import X.InterfaceC70869Rrd;
import X.InterfaceC81711W5b;
import X.InterfaceC81727W5r;
import X.V21;
import X.W58;
import X.W5E;
import X.W5F;
import X.W5G;
import X.W5I;
import X.W5M;
import X.W5U;
import X.W6X;
import X.W7V;
import X.W8E;
import X.WCX;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;

/* loaded from: classes15.dex */
public class FrescoImageLoaderDelegate implements InterfaceC81711W5b {
    public static volatile boolean sInitialized;
    public InterfaceC70869Rrd mFrescoCache;
    public InterfaceC81727W5r mImpl;

    static {
        boolean z;
        WCX.LJJIJ.getClass();
        if (WCX.LJI.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        sInitialized = z;
    }

    private void tryInitFrescoCache() {
        if (this.mFrescoCache == null) {
            this.mFrescoCache = new W5M();
        }
        if (this.mImpl == null) {
            this.mImpl = new FrescoImageLoaderImpl(this.mFrescoCache);
        }
    }

    @Override // X.InterfaceC81711W5b
    public InterfaceC70869Rrd getCache() {
        tryInitFrescoCache();
        return this.mFrescoCache;
    }

    public static /* synthetic */ boolean lambda$init$0(Uri uri) {
        return !C72546Sda.LIZIZ(uri);
    }

    public static /* synthetic */ boolean lambda$init$1(Uri uri) {
        return !C72546Sda.LIZIZ(uri);
    }

    @Override // X.InterfaceC81727W5r
    public void display(W5E w5e) {
        if (!sInitialized) {
            C79083V1z.LIZIZ(0, "FrescoImageLoaderDelegate", "display", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.display(w5e);
        }
    }

    @Override // X.InterfaceC81727W5r
    public void download(W5E w5e) {
        if (!sInitialized) {
            C79083V1z.LIZIZ(0, "FrescoImageLoaderDelegate", "download", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.download(w5e);
        }
    }

    @Override // X.InterfaceC81711W5b
    public void init(V21 v21) {
        Boolean bool;
        if (sInitialized) {
            return;
        }
        v21.getClass();
        C81725W5p.LIZ = C16880lQ.LLLLL(EF7.LIZIZ());
        C81716W5g c81716W5g = new C81716W5g(v21);
        Context LIZIZ = EF7.LIZIZ();
        Boolean bool2 = Boolean.FALSE;
        C81939WDv.LIZIZ();
        if (W5I.LIZLLL) {
            W58.LJIILL(W5I.LIZ, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            W5I.LIZLLL = true;
        }
        try {
            C81939WDv.LIZIZ();
            if (C81713W5d.LIZIZ != null) {
                C81713W5d.LIZJ = true;
            } else {
                try {
                    C39633Fgz.LIZLLL(LIZIZ);
                    C81713W5d.LIZJ = true;
                } catch (Throwable th) {
                    W58.LJIJ(C81713W5d.LIZ, th, "Could not initialize SoLoader", new Object[0]);
                }
            }
            C81939WDv.LIZIZ();
        } catch (Exception e) {
            W58.LJIJ(W5I.LIZ, e, "Could not initialize SoLoader", new Object[0]);
            C81939WDv.LIZIZ();
        }
        Context LLLLL = C16880lQ.LLLLL(LIZIZ);
        synchronized (W8E.class) {
            if (W8E.LJIL != null) {
                W58.LJIILL(W8E.LJIJJLI, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            W8E.LJIL = new W8E(c81716W5g);
            bool = Boolean.TRUE;
        }
        C81939WDv.LIZIZ();
        C81721W5l c81721W5l = new C81721W5l(LLLLL);
        W5I.LIZJ = c81721W5l;
        W5G.initialize(c81721W5l);
        C81939WDv.LIZIZ();
        if (bool.equals(bool2)) {
            W5I.LIZLLL();
        }
        C81939WDv.LIZIZ();
        W58.LIZ.LJIIIZ(5);
        W58.LIZ = new C78866UxK();
        if (C81814W9a.LJIIJ().LIZ()) {
            W7V.LIZLLL = new C73098SmU();
        }
        if (C81814W9a.LJIIJ().LIZIZ()) {
            W6X.LJLJLJ = true;
        }
        tryInitFrescoCache();
        sInitialized = true;
    }

    @Override // X.InterfaceC81711W5b
    public W5F load(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res://");
        LIZ.append(W5U.LJ);
        LIZ.append("/");
        LIZ.append(i);
        Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("load resourceId: ");
        LIZ2.append(i);
        C79083V1z.LJFF(0, "FrescoImageLoaderDelegate", "load", X1D.LIZIZ(LIZ2));
        return new W5F(parse);
    }

    @Override // X.InterfaceC81727W5r
    public void loadBitmap(W5E w5e) {
        if (!sInitialized) {
            C79083V1z.LIZIZ(0, "FrescoImageLoaderDelegate", "loadBitmap", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.loadBitmap(w5e);
        }
    }

    @Override // X.InterfaceC81727W5r
    public void trimDisk(int i) {
        if (!sInitialized) {
            C79083V1z.LIZIZ(0, "FrescoImageLoaderDelegate", "trimDisk", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.trimDisk(i);
        }
    }

    @Override // X.InterfaceC81727W5r
    public void trimMemory(int i) {
        if (!sInitialized) {
            C79083V1z.LIZIZ(0, "FrescoImageLoaderDelegate", "trimMemory", " mImpl is not initialized, call FrescoImageLoaderDelegate.init");
        } else {
            tryInitFrescoCache();
            this.mImpl.trimMemory(i);
        }
    }

    @Override // X.InterfaceC81711W5b
    public void init(C81814W9a c81814W9a) {
        if (sInitialized) {
            return;
        }
        C81725W5p.LIZ = C16880lQ.LLLLL(c81814W9a.LJI());
        int i = 0;
        if (c81814W9a.LIZIZ.LJIIJ.LIZ() != null && ((Boolean) c81814W9a.LIZIZ.LJIIJ.LIZ()).booleanValue()) {
            W5I.LIZIZ(c81814W9a.LJI(), ImagePipelineConfigFactory.LJJIJIL(c81814W9a));
            if (c81814W9a.LIZIZ.LJIIIZ.LIZ() != null) {
                i = ((Integer) c81814W9a.LIZIZ.LJIIIZ.LIZ()).intValue();
            }
            W58.LIZ.LJIIIZ(i);
            W58.LIZ = new C78866UxK();
        }
        tryInitFrescoCache();
        sInitialized = true;
        if (C81814W9a.LJIIJ().LIZ()) {
            W7V.LIZLLL = new C19N();
        }
        if (C81814W9a.LJIIJ().LIZIZ()) {
            W6X.LJLJLJ = true;
        }
    }

    @Override // X.InterfaceC81711W5b
    public W5F load(File file) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load file: ");
        LIZ.append(file);
        C79083V1z.LJFF(0, "FrescoImageLoaderDelegate", "load", X1D.LIZIZ(LIZ));
        return new W5F(Uri.fromFile(file));
    }

    @Override // X.InterfaceC81711W5b
    public W5F load(C62562cu c62562cu) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load urlModel: ");
        LIZ.append(c62562cu);
        C79083V1z.LJFF(0, "FrescoImageLoaderDelegate", "load", X1D.LIZIZ(LIZ));
        return new W5F(c62562cu);
    }

    @Override // X.InterfaceC81711W5b
    public W5F load(Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load uri: ");
        LIZ.append(uri);
        C79083V1z.LJFF(0, "FrescoImageLoaderDelegate", "load", X1D.LIZIZ(LIZ));
        return new W5F(uri);
    }

    @Override // X.InterfaceC81711W5b
    public W5F load(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load anyObj: ");
        LIZ.append(obj);
        C79083V1z.LJFF(0, "FrescoImageLoaderDelegate", "load", X1D.LIZIZ(LIZ));
        return new W5F(obj);
    }

    @Override // X.InterfaceC81711W5b
    public W5F load(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load url: ");
        LIZ.append(str);
        C79083V1z.LJFF(0, "FrescoImageLoaderDelegate", "load", X1D.LIZIZ(LIZ));
        return new W5F(str);
    }
}
