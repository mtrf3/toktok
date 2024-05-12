package X;

import java.io.File;

/* loaded from: classes15.dex */
public final class W9L {
    public final int LIZ;
    public final String LIZIZ;
    public final W4P<File> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final AnonymousClass636 LJI;
    public final WBD LJII;
    public final WE4 LJIIIIZZ;
    public final String LJIIIZ;
    public final W4P<File> LJIIJ;

    public W9L(W9K w9k) {
        WBD wbd;
        w9k.getClass();
        this.LIZ = 1;
        String str = w9k.LIZ;
        str.getClass();
        this.LIZIZ = str;
        W4P<File> w4p = w9k.LIZIZ;
        w4p.getClass();
        this.LIZJ = w4p;
        this.LIZLLL = w9k.LIZJ;
        this.LJ = 10485760L;
        this.LJFF = 2097152L;
        AnonymousClass636 anonymousClass636 = w9k.LIZLLL;
        anonymousClass636.getClass();
        this.LJI = anonymousClass636;
        synchronized (WBD.class) {
            if (WBD.LIZ == null) {
                WBD.LIZ = new WBD();
            }
            wbd = WBD.LIZ;
        }
        this.LJII = wbd;
        WE4 we4 = w9k.LJ;
        this.LJIIIIZZ = we4 == null ? C81848WAi.LJII() : we4;
        if (w9k.LJFF == null) {
            C77876UhM.LJI();
        }
        this.LJIIIZ = "image_config";
        this.LJIIJ = w9k.LJI;
    }
}
