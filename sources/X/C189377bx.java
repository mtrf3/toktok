package X;

import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.7bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189377bx implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    public static /* synthetic */ C189377bx copy$default(C189377bx c189377bx, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c189377bx.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str2 = c189377bx.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str3 = c189377bx.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str4 = c189377bx.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            i = c189377bx.LJLJJL;
        }
        return c189377bx.copy(str, str2, str3, str4, i);
    }

    public final C189377bx copy(String feedEnterFrom, String enterMethod, String enterPosition, String feedFrom, int i) {
        o.LJIIIZ(feedEnterFrom, "feedEnterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterPosition, "enterPosition");
        o.LJIIIZ(feedFrom, "feedFrom");
        return new C189377bx(feedEnterFrom, enterMethod, enterPosition, feedFrom, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C189377bx)) {
            return false;
        }
        C189377bx c189377bx = (C189377bx) obj;
        return o.LJ(this.LJLIL, c189377bx.LJLIL) && o.LJ(this.LJLILLLLZI, c189377bx.LJLILLLLZI) && o.LJ(this.LJLJI, c189377bx.LJLJI) && o.LJ(this.LJLJJI, c189377bx.LJLJJI) && this.LJLJJL == c189377bx.LJLJJL;
    }

    public int hashCode() {
        return C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31) + this.LJLJJL;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventLogParams(feedEnterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", enterPosition=");
        LIZ.append(this.LJLJI);
        LIZ.append(", feedFrom=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", feedPageType=");
        return b0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final String getEnterPosition() {
        return this.LJLJI;
    }

    public final String getFeedEnterFrom() {
        return this.LJLIL;
    }

    public final String getFeedFrom() {
        return this.LJLJJI;
    }

    public final int getFeedPageType() {
        return this.LJLJJL;
    }

    public C189377bx(String str, String str2, String str3, String str4, int i) {
        C43588H8u.LIZLLL(str, "feedEnterFrom", str2, "enterMethod", str3, "enterPosition", str4, "feedFrom");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = i;
    }
}
