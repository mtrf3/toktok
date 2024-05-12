package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KI0 implements C33Q {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final C51468KHw LJLJI;
    public final boolean LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final String LJLJJLL;

    public KI0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KI0)) {
            return false;
        }
        KI0 ki0 = (KI0) obj;
        return this.LJLIL == ki0.LJLIL && o.LJ(this.LJLILLLLZI, ki0.LJLILLLLZI) && o.LJ(this.LJLJI, ki0.LJLJI) && this.LJLJJI == ki0.LJLJJI && o.LJ(this.LJLJJL, ki0.LJLJJL) && o.LJ(this.LJLJJLL, ki0.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL * 31, 31);
        C51468KHw c51468KHw = this.LJLJI;
        if (c51468KHw == null) {
            hashCode = 0;
        } else {
            hashCode = c51468KHw.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.LJLJJI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.LJLJJLL.hashCode() + C40328FsC.LIZIZ(this.LJLJJL, (i + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChooseSearchMusicState(pageType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchKeyword=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", searchParam=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isSearchBarFocused=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enableFilter=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", searchId=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ KI0(int i) {
        this(-1, "", null, false, new C43I(Boolean.FALSE), "");
    }

    public KI0(int i, String searchKeyword, C51468KHw c51468KHw, boolean z, C43I<Boolean> enableFilter, String searchId) {
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(enableFilter, "enableFilter");
        o.LJIIIZ(searchId, "searchId");
        this.LJLIL = i;
        this.LJLILLLLZI = searchKeyword;
        this.LJLJI = c51468KHw;
        this.LJLJJI = z;
        this.LJLJJL = enableFilter;
        this.LJLJJLL = searchId;
    }

    public static KI0 LIZ(KI0 ki0, int i, String str, C51468KHw c51468KHw, boolean z, C43I c43i, String str2, int i2) {
        String searchId = str2;
        C43I enableFilter = c43i;
        boolean z2 = z;
        C51468KHw c51468KHw2 = c51468KHw;
        int i3 = i;
        String searchKeyword = str;
        if ((i2 & 1) != 0) {
            i3 = ki0.LJLIL;
        }
        if ((i2 & 2) != 0) {
            searchKeyword = ki0.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            c51468KHw2 = ki0.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z2 = ki0.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            enableFilter = ki0.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            searchId = ki0.LJLJJLL;
        }
        ki0.getClass();
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(enableFilter, "enableFilter");
        o.LJIIIZ(searchId, "searchId");
        return new KI0(i3, searchKeyword, c51468KHw2, z2, enableFilter, searchId);
    }
}
