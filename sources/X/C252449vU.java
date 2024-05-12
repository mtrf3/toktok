package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9vU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252449vU implements C33Q {
    public final List<Aweme> LJLIL;
    public final boolean LJLILLLLZI;
    public final List<Aweme> LJLJI;
    public final String LJLJJI;
    public final float LJLJJL;
    public final KPB LJLJJLL;
    public final KPQ LJLJL;
    public final C43I<C51531KKh> LJLJLJ;
    public final C43I<C76800UCe> LJLJLLL;
    public final C43I<String> LJLL;
    public final C43I<String> LJLLI;
    public final C43I<C76800UCe> LJLLILLLL;
    public final C43I<C76800UCe> LJLLJ;

    public C252449vU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C252449vU)) {
            return false;
        }
        C252449vU c252449vU = (C252449vU) obj;
        return o.LJ(this.LJLIL, c252449vU.LJLIL) && this.LJLILLLLZI == c252449vU.LJLILLLLZI && o.LJ(this.LJLJI, c252449vU.LJLJI) && o.LJ(this.LJLJJI, c252449vU.LJLJJI) && Float.compare(this.LJLJJL, c252449vU.LJLJJL) == 0 && this.LJLJJLL == c252449vU.LJLJJLL && o.LJ(this.LJLJL, c252449vU.LJLJL) && o.LJ(this.LJLJLJ, c252449vU.LJLJLJ) && o.LJ(this.LJLJLLL, c252449vU.LJLJLLL) && o.LJ(this.LJLL, c252449vU.LJLL) && o.LJ(this.LJLLI, c252449vU.LJLLI) && o.LJ(this.LJLLILLLL, c252449vU.LJLLILLLL) && o.LJ(this.LJLLJ, c252449vU.LJLLJ);
    }

    public final String toString() {
        return "FilterState(originalAwemeList=" + this.LJLIL + ", isEnableFilter=" + this.LJLILLLLZI + ", filterAwemeList=" + this.LJLJI + ", currentAid=" + this.LJLJJI + ", filterOpenRatio=" + this.LJLJJL + ", drawerStatus=" + this.LJLJJLL + ", currentPlayerState=" + this.LJLJL + ", onFilterItemClick=" + this.LJLJLJ + ", onBlankContentClick=" + this.LJLJLLL + ", onDigg=" + this.LJLL + ", onUserProfileNaviRequest=" + this.LJLLI + ", onMaskCancelEvent=" + this.LJLLILLLL + ", notifyLoadMoreDataEvent=" + this.LJLLJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLJI, (hashCode8 + i) * 31, 31);
        String str = this.LJLJJI;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode9 = (this.LJLJJLL.hashCode() + C47959Irz.LIZIZ(this.LJLJJL, (LIZIZ + hashCode) * 31, 31)) * 31;
        KPQ kpq = this.LJLJL;
        if (kpq == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kpq.hashCode();
        }
        int i3 = (hashCode9 + hashCode2) * 31;
        C43I<C51531KKh> c43i = this.LJLJLJ;
        if (c43i == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C43I<C76800UCe> c43i2 = this.LJLJLLL;
        if (c43i2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C43I<String> c43i3 = this.LJLL;
        if (c43i3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c43i3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        C43I<String> c43i4 = this.LJLLI;
        if (c43i4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c43i4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        C43I<C76800UCe> c43i5 = this.LJLLILLLL;
        if (c43i5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c43i5.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        C43I<C76800UCe> c43i6 = this.LJLLJ;
        if (c43i6 != null) {
            i2 = c43i6.hashCode();
        }
        return i8 + i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C252449vU(int r15) {
        /*
            r14 = this;
            X.OQg r1 = X.C61878OQg.INSTANCE
            r2 = 0
            r4 = 0
            r5 = 0
            X.KPB r6 = X.KPB.CLOSED
            r0 = r14
            r3 = r1
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252449vU.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C252449vU(List<? extends Aweme> originalAwemeList, boolean z, List<? extends Aweme> filterAwemeList, String str, float f, KPB drawerStatus, KPQ kpq, C43I<C51531KKh> c43i, C43I<C76800UCe> c43i2, C43I<String> c43i3, C43I<String> c43i4, C43I<C76800UCe> c43i5, C43I<C76800UCe> c43i6) {
        o.LJIIIZ(originalAwemeList, "originalAwemeList");
        o.LJIIIZ(filterAwemeList, "filterAwemeList");
        o.LJIIIZ(drawerStatus, "drawerStatus");
        this.LJLIL = originalAwemeList;
        this.LJLILLLLZI = z;
        this.LJLJI = filterAwemeList;
        this.LJLJJI = str;
        this.LJLJJL = f;
        this.LJLJJLL = drawerStatus;
        this.LJLJL = kpq;
        this.LJLJLJ = c43i;
        this.LJLJLLL = c43i2;
        this.LJLL = c43i3;
        this.LJLLI = c43i4;
        this.LJLLILLLL = c43i5;
        this.LJLLJ = c43i6;
    }

    public static C252449vU LIZ(C252449vU c252449vU, List list, boolean z, List list2, String str, float f, KPB kpb, KPQ kpq, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, int i) {
        C43I c43i7 = c43i6;
        C43I c43i8 = c43i5;
        C43I c43i9 = c43i4;
        C43I c43i10 = c43i3;
        C43I c43i11 = c43i2;
        C43I c43i12 = c43i;
        KPQ kpq2 = kpq;
        boolean z2 = z;
        List originalAwemeList = list;
        List filterAwemeList = list2;
        String str2 = str;
        float f2 = f;
        KPB drawerStatus = kpb;
        if ((i & 1) != 0) {
            originalAwemeList = c252449vU.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c252449vU.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            filterAwemeList = c252449vU.LJLJI;
        }
        if ((i & 8) != 0) {
            str2 = c252449vU.LJLJJI;
        }
        if ((i & 16) != 0) {
            f2 = c252449vU.LJLJJL;
        }
        if ((i & 32) != 0) {
            drawerStatus = c252449vU.LJLJJLL;
        }
        if ((i & 64) != 0) {
            kpq2 = c252449vU.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i12 = c252449vU.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c43i11 = c252449vU.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c43i10 = c252449vU.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i9 = c252449vU.LJLLI;
        }
        if ((i & 2048) != 0) {
            c43i8 = c252449vU.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i7 = c252449vU.LJLLJ;
        }
        c252449vU.getClass();
        o.LJIIIZ(originalAwemeList, "originalAwemeList");
        o.LJIIIZ(filterAwemeList, "filterAwemeList");
        o.LJIIIZ(drawerStatus, "drawerStatus");
        return new C252449vU(originalAwemeList, z2, filterAwemeList, str2, f2, drawerStatus, kpq2, c43i12, c43i11, c43i10, c43i9, c43i8, c43i7);
    }
}
