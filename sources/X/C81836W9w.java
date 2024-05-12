package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.W9w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81836W9w {
    public final WA7 LIZ;
    public final int LIZIZ;
    public C81392Vwy<Bitmap> LIZJ;
    public List<C81392Vwy<Bitmap>> LIZLLL;
    public String LJ;

    public final synchronized void LIZ() {
        C81392Vwy.LJ(this.LIZJ);
        this.LIZJ = null;
        C81392Vwy.LJFF(this.LIZLLL);
        this.LIZLLL = null;
    }

    public final synchronized C81392Vwy<Bitmap> LIZJ() {
        return C81392Vwy.LIZJ(this.LIZJ);
    }

    public C81836W9w(WA9 wa9) {
        WA7 wa7 = wa9.LIZ;
        wa7.getClass();
        this.LIZ = wa7;
        this.LIZIZ = wa9.LIZLLL;
        this.LIZJ = C81392Vwy.LIZJ(wa9.LIZIZ);
        this.LIZLLL = C81392Vwy.LIZLLL(wa9.LIZJ);
    }

    public final synchronized C81392Vwy<Bitmap> LIZIZ(int i) {
        List<C81392Vwy<Bitmap>> list = this.LIZLLL;
        if (list != null) {
            return C81392Vwy.LIZJ(list.get(i));
        }
        return null;
    }

    public final synchronized boolean LIZLLL(int i) {
        boolean z;
        List<C81392Vwy<Bitmap>> list = this.LIZLLL;
        if (list != null) {
            if (list.get(i) != null) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public C81836W9w(WA7 wa7) {
        wa7.getClass();
        this.LIZ = wa7;
        this.LIZIZ = 0;
    }
}
