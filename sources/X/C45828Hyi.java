package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Hyi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45828Hyi {
    public static final C45828Hyi LJ = new C45828Hyi(0, 0, "Success.", "");
    public static final C45828Hyi LJFF = new C45828Hyi(-1, -1, "Unknown error.", "");
    public static final C45828Hyi LJI = new C45828Hyi(-3, 10011, "App certificate does not match configurations", "");
    public static final C45828Hyi LJII = new C45828Hyi(-4, 10004, "Illegal authorization scope.", "");
    public static final C45828Hyi LJIIIIZZ = new C45828Hyi(-3, 20002, "Params parsing error.", "");
    public static final C45828Hyi LJIIIZ = new C45828Hyi(-4, 20005, "TikTok has no album permissions.", "");
    public static final C45828Hyi LJIIJ = new C45828Hyi(-12, 20006, "TikTok Network error.", "");
    public static final C45828Hyi LJIIJJI = new C45828Hyi(-5, 20008, "Photo doesn't meet requirements.", "");
    public static final C45828Hyi LJIIL = new C45828Hyi(-5, 20010, "Processing photo resources failed.", "");
    public static final C45828Hyi LJIILIIL = new C45828Hyi(-5, 20012, "Video format is not supported.", "");
    public static final C45828Hyi LJIILJJIL = new C45828Hyi(-2, -2, "Sharing canceled.", "");
    public static final C45828Hyi LJIILL = new C45828Hyi(-4, 20016, "Users store shared content for draft or user accounts are not allowed to post videos.", "");
    public static final C45828Hyi LJIILLIIL = new C45828Hyi(-1, -1, "Share Denied.", "");
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45828Hyi)) {
            return false;
        }
        C45828Hyi c45828Hyi = (C45828Hyi) obj;
        return this.LIZ == c45828Hyi.LIZ && this.LIZIZ == c45828Hyi.LIZIZ && o.LJ(this.LIZJ, c45828Hyi.LIZJ) && o.LJ(this.LIZLLL, c45828Hyi.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C79062V1e.LJ(this.LIZJ, ((this.LIZ * 31) + this.LIZIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ErrorStatus(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", subErrorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", detailErrorMsg=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C45828Hyi(int i, int i2, String str, String detailErrorMsg) {
        o.LJIIIZ(detailErrorMsg, "detailErrorMsg");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = detailErrorMsg;
    }

    public static C45828Hyi LIZ(C45828Hyi c45828Hyi, int i, String errorMsg, String detailErrorMsg, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i = c45828Hyi.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c45828Hyi.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            errorMsg = c45828Hyi.LIZJ;
        }
        if ((i2 & 8) != 0) {
            detailErrorMsg = c45828Hyi.LIZLLL;
        }
        c45828Hyi.getClass();
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(detailErrorMsg, "detailErrorMsg");
        return new C45828Hyi(i, i3, errorMsg, detailErrorMsg);
    }
}
