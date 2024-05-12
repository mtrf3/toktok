package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.X4b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84233X4b {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final List<X4T> LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public final AtomicLong LJIIIZ;

    public final synchronized int LIZ() {
        return this.LJ.size();
    }

    public final synchronized void LIZJ() {
        this.LJI = false;
    }

    public final String LIZIZ() {
        if (this.LJIIIIZZ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append("_");
            String str = this.LIZIZ;
            if (str == null) {
                str = "";
            }
            LIZ.append(str);
            LIZ.append("_");
            LIZ.append(this.LIZLLL);
            this.LJIIIIZZ = X1D.LIZIZ(LIZ);
        }
        return this.LJIIIIZZ;
    }

    public final int hashCode() {
        if (this.LJII == 0) {
            this.LJII = LIZIZ().hashCode();
        }
        return this.LJII;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlRecord{url='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", ip='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", ipFamily='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", isMainUrl=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", failedTimes=");
        LIZ.append(this.LJFF);
        LIZ.append(", isCurrentFailed=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, '}', LIZ);
    }

    public final synchronized void LIZLLL(X4T x4t) {
        try {
            this.LJ.remove(x4t);
        } catch (Throwable unused) {
        }
    }

    public final synchronized void LJ(X4T x4t) {
        this.LJ.add(x4t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84233X4b)) {
            return false;
        }
        return LIZIZ().equals(((C84233X4b) obj).LIZIZ());
    }

    public C84233X4b(String str, String str2) {
        int lastIndexOf;
        String substring;
        this.LJ = new ArrayList();
        this.LJIIIZ = new AtomicLong();
        this.LIZ = str;
        this.LIZLLL = false;
        this.LIZIZ = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                lastIndexOf = str2.lastIndexOf(".");
            } catch (Throwable unused) {
            }
            if (lastIndexOf > 0 && lastIndexOf < str2.length()) {
                substring = str2.substring(0, lastIndexOf);
                this.LIZJ = substring;
            }
        }
        substring = null;
        this.LIZJ = substring;
    }

    public C84233X4b(String str, boolean z) {
        this.LJ = new ArrayList();
        this.LJIIIZ = new AtomicLong();
        this.LIZ = str;
        this.LIZLLL = z;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
