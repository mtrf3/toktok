package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.X4m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84244X4m {
    public final String LIZ;
    public final X5J LIZIZ;
    public final int LIZJ;
    public long LIZLLL;
    public long LJ;

    public final boolean LIZ() {
        int i = this.LIZJ;
        String LIZIZ = this.LIZIZ.LIZIZ("Accept-Ranges");
        if (i >= 400) {
            return false;
        }
        if (i != 206 && i != 1 && !"bytes".equals(LIZIZ)) {
            return false;
        }
        return true;
    }

    public final String LIZIZ() {
        return this.LIZIZ.LIZIZ("Content-Type");
    }

    public final String LIZJ() {
        String LJIILJJIL = X4Q.LJIILJJIL(this.LIZIZ, "last-modified");
        if (TextUtils.isEmpty(LJIILJJIL)) {
            return X4Q.LJIILJJIL(this.LIZIZ, "Last-Modified");
        }
        return LJIILJJIL;
    }

    public final long LIZLLL() {
        if (this.LJ <= 0) {
            if (!LJFF()) {
                String LJIILJJIL = X4Q.LJIILJJIL(this.LIZIZ, "Content-Range");
                if (!TextUtils.isEmpty(LJIILJJIL)) {
                    this.LJ = X4P.LJIJI(LJIILJJIL);
                }
            } else {
                this.LJ = -1L;
            }
        }
        return this.LJ;
    }

    public final long LJ() {
        String LJIILJJIL = X4Q.LJIILJJIL(this.LIZIZ, "X-Content-Length");
        if (!TextUtils.isEmpty(LJIILJJIL)) {
            try {
                return CastLongProtector.parseLong(LJIILJJIL);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public final boolean LJFF() {
        X5J x5j = this.LIZIZ;
        if (x5j == null) {
            return false;
        }
        if (!"chunked".equals(x5j.LIZIZ("Transfer-Encoding")) && X4Q.LJIIIZ(x5j) != -1) {
            return false;
        }
        return true;
    }

    public C84244X4m(X5J x5j, String str) {
        this.LIZ = str;
        this.LIZJ = x5j.LIZ();
        this.LIZIZ = x5j;
    }
}
