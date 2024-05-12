package X;

import android.graphics.Bitmap;

/* renamed from: X.W9x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81837W9x implements WBH {
    public static final Class<?> LJ = C81837W9x.class;
    public final WAF LIZ;
    public WAL LIZIZ;
    public WAW LIZJ;
    public final WAJ LIZLLL;

    public C81837W9x(WAF waf, WAL wal) {
        WAJ waj = new WAJ(this);
        this.LIZLLL = waj;
        this.LIZ = waf;
        this.LIZIZ = wal;
        this.LIZJ = new WAW(wal, waj);
    }

    public final boolean LIZ(int i, Bitmap bitmap) {
        try {
            this.LIZJ.LIZLLL(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            Class<?> cls = LJ;
            Object[] objArr = {Integer.valueOf(i)};
            if (W58.LIZ.LJIIIIZZ(6)) {
                W58.LIZ.e(C16880lQ.LJLLJ(cls), C16880lQ.LLLZI(null, "Rendering of frame unsuccessful. Frame number: %d", objArr), e);
            }
            return false;
        }
    }
}
