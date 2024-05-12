package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.NYk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59542NYk implements C33Q {
    public final C43I<NL9> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<C76800UCe> LJLJI;
    public final C43I<C76800UCe> LJLJJI;
    public final C43I<C76800UCe> LJLJJL;
    public final C43I<C76800UCe> LJLJJLL;
    public final C43I<Integer> LJLJL;
    public final C43I<Integer> LJLJLJ;
    public final C43I<C76800UCe> LJLJLLL;
    public final C43I<C76800UCe> LJLL;
    public final C43I<C40304Fro> LJLLI;
    public final C43I<Boolean> LJLLILLLL;
    public final C43I<Boolean> LJLLJ;
    public final C43I<Boolean> LJLLL;
    public final C43I<Boolean> LJLLLL;

    public C59542NYk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59542NYk)) {
            return false;
        }
        C59542NYk c59542NYk = (C59542NYk) obj;
        return o.LJ(this.LJLIL, c59542NYk.LJLIL) && o.LJ(this.LJLILLLLZI, c59542NYk.LJLILLLLZI) && o.LJ(this.LJLJI, c59542NYk.LJLJI) && o.LJ(this.LJLJJI, c59542NYk.LJLJJI) && o.LJ(this.LJLJJL, c59542NYk.LJLJJL) && o.LJ(this.LJLJJLL, c59542NYk.LJLJJLL) && o.LJ(this.LJLJL, c59542NYk.LJLJL) && o.LJ(this.LJLJLJ, c59542NYk.LJLJLJ) && o.LJ(this.LJLJLLL, c59542NYk.LJLJLLL) && o.LJ(this.LJLL, c59542NYk.LJLL) && o.LJ(this.LJLLI, c59542NYk.LJLLI) && o.LJ(this.LJLLILLLL, c59542NYk.LJLLILLLL) && o.LJ(this.LJLLJ, c59542NYk.LJLLJ) && o.LJ(this.LJLLL, c59542NYk.LJLLL) && o.LJ(this.LJLLLL, c59542NYk.LJLLLL);
    }

    public final int hashCode() {
        C43I<NL9> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<C76800UCe> c43i3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<C76800UCe> c43i4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<C76800UCe> c43i5 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<C76800UCe> c43i6 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (c43i6 == null ? 0 : c43i6.hashCode())) * 31;
        C43I<Integer> c43i7 = this.LJLJL;
        int hashCode7 = (hashCode6 + (c43i7 == null ? 0 : c43i7.hashCode())) * 31;
        C43I<Integer> c43i8 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (c43i8 == null ? 0 : c43i8.hashCode())) * 31;
        C43I<C76800UCe> c43i9 = this.LJLJLLL;
        int hashCode9 = (hashCode8 + (c43i9 == null ? 0 : c43i9.hashCode())) * 31;
        C43I<C76800UCe> c43i10 = this.LJLL;
        int hashCode10 = (hashCode9 + (c43i10 == null ? 0 : c43i10.hashCode())) * 31;
        C43I<C40304Fro> c43i11 = this.LJLLI;
        int hashCode11 = (hashCode10 + (c43i11 == null ? 0 : c43i11.hashCode())) * 31;
        C43I<Boolean> c43i12 = this.LJLLILLLL;
        int hashCode12 = (hashCode11 + (c43i12 == null ? 0 : c43i12.hashCode())) * 31;
        C43I<Boolean> c43i13 = this.LJLLJ;
        int hashCode13 = (hashCode12 + (c43i13 == null ? 0 : c43i13.hashCode())) * 31;
        C43I<Boolean> c43i14 = this.LJLLL;
        int hashCode14 = (hashCode13 + (c43i14 == null ? 0 : c43i14.hashCode())) * 31;
        C43I<Boolean> c43i15 = this.LJLLLL;
        return hashCode14 + (c43i15 != null ? c43i15.hashCode() : 0);
    }

    public final String toString() {
        return "FeedAdState(onBindTextureSizeEvent=" + this.LJLIL + ", onPopUpWebPageShowEvent=" + this.LJLILLLLZI + ", onDelegateResumeEvent=" + this.LJLJI + ", onDelegatePauseEvent=" + this.LJLJJI + ", onPagerResumeEvent=" + this.LJLJJL + ", onPagerPauseEvent=" + this.LJLJJLL + ", onDelegateHolderPauseEvent=" + this.LJLJL + ", onDelegateHolderResumeEvent=" + this.LJLJLJ + ", onAdVideoResumeEvent=" + this.LJLJLLL + ", onAdVideoPauseEvent=" + this.LJLL + ", onReceiveJsBridgeEvent=" + this.LJLLI + ", onLightWebPageShowEvent=" + this.LJLLILLLL + ", onCommentPageShowEvent=" + this.LJLLJ + ", onSharePageShowEvent=" + this.LJLLL + ", onTabChangeEvent=" + this.LJLLLL + ')';
    }

    public /* synthetic */ C59542NYk(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C59542NYk(C43I<NL9> c43i, C43I<Boolean> c43i2, C43I<C76800UCe> c43i3, C43I<C76800UCe> c43i4, C43I<C76800UCe> c43i5, C43I<C76800UCe> c43i6, C43I<Integer> c43i7, C43I<Integer> c43i8, C43I<C76800UCe> c43i9, C43I<C76800UCe> c43i10, C43I<C40304Fro> c43i11, C43I<Boolean> c43i12, C43I<Boolean> c43i13, C43I<Boolean> c43i14, C43I<Boolean> c43i15) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c43i3;
        this.LJLJJI = c43i4;
        this.LJLJJL = c43i5;
        this.LJLJJLL = c43i6;
        this.LJLJL = c43i7;
        this.LJLJLJ = c43i8;
        this.LJLJLLL = c43i9;
        this.LJLL = c43i10;
        this.LJLLI = c43i11;
        this.LJLLILLLL = c43i12;
        this.LJLLJ = c43i13;
        this.LJLLL = c43i14;
        this.LJLLLL = c43i15;
    }

    public static C59542NYk LIZ(C59542NYk c59542NYk, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, C43I c43i8, C43I c43i9, C43I c43i10, C43I c43i11, C43I c43i12, C43I c43i13, C43I c43i14, C43I c43i15, int i) {
        C43I c43i16 = c43i6;
        C43I c43i17 = c43i5;
        C43I c43i18 = c43i4;
        C43I c43i19 = c43i3;
        C43I c43i20 = c43i;
        C43I c43i21 = c43i2;
        C43I c43i22 = c43i7;
        C43I c43i23 = c43i8;
        C43I c43i24 = c43i9;
        C43I c43i25 = c43i10;
        C43I c43i26 = c43i11;
        C43I c43i27 = c43i12;
        C43I c43i28 = c43i13;
        C43I c43i29 = c43i14;
        C43I c43i30 = c43i15;
        if ((i & 1) != 0) {
            c43i20 = c59542NYk.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i21 = c59542NYk.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i19 = c59542NYk.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i18 = c59542NYk.LJLJJI;
        }
        if ((i & 16) != 0) {
            c43i17 = c59542NYk.LJLJJL;
        }
        if ((i & 32) != 0) {
            c43i16 = c59542NYk.LJLJJLL;
        }
        if ((i & 64) != 0) {
            c43i22 = c59542NYk.LJLJL;
        }
        if ((i & 128) != 0) {
            c43i23 = c59542NYk.LJLJLJ;
        }
        if ((i & 256) != 0) {
            c43i24 = c59542NYk.LJLJLLL;
        }
        if ((i & 512) != 0) {
            c43i25 = c59542NYk.LJLL;
        }
        if ((i & 1024) != 0) {
            c43i26 = c59542NYk.LJLLI;
        }
        if ((i & 2048) != 0) {
            c43i27 = c59542NYk.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            c43i28 = c59542NYk.LJLLJ;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c43i29 = c59542NYk.LJLLL;
        }
        if ((i & 16384) != 0) {
            c43i30 = c59542NYk.LJLLLL;
        }
        c59542NYk.getClass();
        C43I c43i31 = c43i21;
        return new C59542NYk(c43i20, c43i31, c43i19, c43i18, c43i17, c43i16, c43i22, c43i23, c43i24, c43i25, c43i26, c43i27, c43i28, c43i29, c43i30);
    }
}
