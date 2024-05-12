package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.72x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1795572x {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF;

    public C1795572x() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1795572x)) {
            return false;
        }
        C1795572x c1795572x = (C1795572x) obj;
        return this.LIZ == c1795572x.LIZ && this.LIZIZ == c1795572x.LIZIZ && this.LIZJ == c1795572x.LIZJ && this.LIZLLL == c1795572x.LIZLLL && this.LJ == c1795572x.LJ && o.LJ(this.LJFF, c1795572x.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31), 31);
        String str = this.LJFF;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentPanelFirstLoadData(clickTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", showCommentListTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startRequestTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onPageShowTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", finishRequestTime=");
        LIZ.append(this.LJ);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C1795572x(int i) {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = null;
    }
}
