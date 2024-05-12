package X;

import java.util.Locale;

/* loaded from: classes15.dex */
public final class W5T implements Runnable {
    public final /* synthetic */ int LJLIL;

    public final void LIZ() {
        Locale locale = Locale.ENGLISH;
        C79083V1z.LIZ(0, "FrescoImageLoaderImpl", "trimDisk", C16880lQ.LLLZI(locale, "before trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(W8E.LJII().LJIIIZ().getCount()), Long.valueOf(W8E.LJII().LJIIIZ().getSize() / 1024), Long.valueOf(W8E.LJII().LJIILIIL().getCount()), Long.valueOf(W8E.LJII().LJIILIIL().getSize() / 1024)}));
        int i = this.LJLIL;
        if (i != 1) {
            if (i == 2) {
                W8E.LJII().LJIIIZ().LIZ();
                W8E.LJII().LJIILIIL().LIZ();
            }
        } else {
            W8E.LJII().LJIIIZ().LIZIZ();
            W8E.LJII().LJIILIIL().LIZIZ();
        }
        C79083V1z.LIZ(0, "FrescoImageLoaderImpl", "trimDisk", C16880lQ.LLLZI(locale, "after trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(W8E.LJII().LJIIIZ().getCount()), Long.valueOf(W8E.LJII().LJIIIZ().getSize() / 1024), Long.valueOf(W8E.LJII().LJIILIIL().getCount()), Long.valueOf(W8E.LJII().LJIILIIL().getSize() / 1024)}));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public W5T(int i) {
        this.LJLIL = i;
    }
}
