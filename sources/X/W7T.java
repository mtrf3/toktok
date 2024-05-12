package X;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public class W7T extends W90<W8X, W8X> {
    public final C81808W8u LIZJ;
    public final W6U LIZLLL;
    public final W84 LJ;
    public final WB4 LJFF;
    public final W8X LJI;

    public final void LJIILIIL(AbstractC81374Vwg abstractC81374Vwg) {
        W8X w8x;
        C81392Vwy LJIIL = C81392Vwy.LJIIL(((C81373Vwf) abstractC81374Vwg).LIZ());
        try {
            w8x = new W8X(LJIIL);
        } catch (Throwable th) {
            th = th;
            w8x = null;
        }
        try {
            w8x.LJIIL();
            this.LIZIZ.LIZIZ(1, w8x);
            W8X.LIZIZ(w8x);
            C81392Vwy.LJ(LJIIL);
        } catch (Throwable th2) {
            th = th2;
            W8X.LIZIZ(w8x);
            C81392Vwy.LJ(LJIIL);
            throw th;
        }
    }

    @Override // X.AbstractC81756W6u
    public final void LJII(int i, Object obj) {
        W8X w8x = (W8X) obj;
        if (AbstractC81756W6u.LJ(i)) {
            return;
        }
        W8X w8x2 = this.LJI;
        if (w8x2 != null) {
            try {
                if (w8x.LJLL != null) {
                    try {
                        LJIILIIL(LJIIL(w8x2, w8x));
                    } catch (IOException e) {
                        W58.LJII("PartialDiskCacheProducer", "Error while merging image data", e);
                        this.LIZIZ.onFailure(e);
                    }
                    w8x.close();
                    this.LJI.close();
                    this.LIZJ.LJ(this.LIZLLL);
                    return;
                }
            } catch (Throwable th) {
                w8x.close();
                this.LJI.close();
                throw th;
            }
        }
        if (AbstractC81756W6u.LJIIJ(i, 8) && AbstractC81756W6u.LIZLLL(i)) {
            w8x.LJIILIIL();
            if (w8x.LJLJI != C81828W9o.LIZIZ) {
                this.LIZJ.LIZLLL(this.LIZLLL, w8x);
                this.LIZIZ.LIZIZ(i, w8x);
                return;
            }
        }
        this.LIZIZ.LIZIZ(i, w8x);
    }

    public final AbstractC81374Vwg LJIIL(W8X w8x, W8X w8x2) {
        C81373Vwf LJ = this.LJ.LJ(w8x2.LJI() + w8x2.LJLL.LIZ);
        LJIIJJI(w8x.LJFF(), LJ, w8x2.LJLL.LIZ);
        LJIIJJI(w8x2.LJFF(), LJ, w8x2.LJI());
        return LJ;
    }

    public final void LJIIJJI(InputStream inputStream, AbstractC81374Vwg abstractC81374Vwg, int i) {
        byte[] bArr = this.LJFF.get(16384);
        int i2 = i;
        while (i2 > 0) {
            try {
                int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                if (read < 0) {
                    break;
                } else if (read > 0) {
                    abstractC81374Vwg.write(bArr, 0, read);
                    i2 -= read;
                }
            } finally {
                this.LJFF.LIZ(bArr);
            }
        }
        if (i2 <= 0) {
        } else {
            throw new IOException(C16880lQ.LLLZI(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    public W7T(W7F w7f, C81808W8u c81808W8u, W6U w6u, W84 w84, WB4 wb4, W8X w8x) {
        super(w7f);
        this.LIZJ = c81808W8u;
        this.LIZLLL = w6u;
        this.LJ = w84;
        this.LJFF = wb4;
        this.LJI = w8x;
    }
}
