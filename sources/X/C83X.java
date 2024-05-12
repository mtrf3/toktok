package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import kotlin.jvm.internal.o;

/* renamed from: X.83X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83X implements C33Q {
    public final C43I<SpannableStringBuilder> LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<Boolean> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final C43I<Integer> LJLJJLL;
    public final C43I<OSZ<Aweme, PostModeEntranceMechanism>> LJLJL;
    public final C43I<Boolean> LJLJLJ;

    public C83X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83X)) {
            return false;
        }
        C83X c83x = (C83X) obj;
        return o.LJ(this.LJLIL, c83x.LJLIL) && this.LJLILLLLZI == c83x.LJLILLLLZI && o.LJ(null, null) && o.LJ(this.LJLJI, c83x.LJLJI) && o.LJ(this.LJLJJI, c83x.LJLJJI) && o.LJ(this.LJLJJL, c83x.LJLJJL) && o.LJ(this.LJLJJLL, c83x.LJLJJLL) && o.LJ(this.LJLJL, c83x.LJLJL) && o.LJ(this.LJLJLJ, c83x.LJLJLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C43I<SpannableStringBuilder> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31 * 31;
        C43I<Boolean> c43i2 = this.LJLJI;
        int hashCode2 = (i2 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<Boolean> c43i3 = this.LJLJJI;
        int hashCode3 = (hashCode2 + (c43i3 == null ? 0 : c43i3.hashCode())) * 31;
        C43I<Boolean> c43i4 = this.LJLJJL;
        int hashCode4 = (hashCode3 + (c43i4 == null ? 0 : c43i4.hashCode())) * 31;
        C43I<Integer> c43i5 = this.LJLJJLL;
        int hashCode5 = (hashCode4 + (c43i5 == null ? 0 : c43i5.hashCode())) * 31;
        C43I<OSZ<Aweme, PostModeEntranceMechanism>> c43i6 = this.LJLJL;
        int hashCode6 = (hashCode5 + (c43i6 == null ? 0 : c43i6.hashCode())) * 31;
        C43I<Boolean> c43i7 = this.LJLJLJ;
        return hashCode6 + (c43i7 != null ? c43i7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoDescState(sync2StateEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isShowSplitVideoPartDescForFeed=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", toggleAnimationState=");
        LIZ.append((Object) null);
        LIZ.append(", needOperateDesc=");
        LIZ.append(this.LJLJI);
        LIZ.append(", showNoNetWorkToast=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", foldTagClicked=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", forwardPageSelectedEvent=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", requestNavigationToPhotoModeDetailPageEvent=");
        LIZ.append(this.LJLJL);
        LIZ.append(", descExpandSwitch=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public /* synthetic */ C83X(int i) {
        this(null, false, null, null, null, null, null, null);
    }

    public C83X(C43I c43i, boolean z, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = z;
        this.LJLJI = c43i2;
        this.LJLJJI = c43i3;
        this.LJLJJL = c43i4;
        this.LJLJJLL = c43i5;
        this.LJLJL = c43i6;
        this.LJLJLJ = c43i7;
    }

    public static C83X LIZ(C83X c83x, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, C43I c43i5, C43I c43i6, C43I c43i7, int i) {
        boolean z;
        C43I c43i8 = c43i7;
        C43I c43i9 = c43i2;
        C43I c43i10 = c43i;
        C43I c43i11 = c43i3;
        C43I c43i12 = c43i4;
        C43I c43i13 = c43i5;
        C43I c43i14 = c43i6;
        if ((i & 1) != 0) {
            c43i10 = c83x.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c83x.LJLILLLLZI;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c83x.getClass();
        }
        if ((i & 8) != 0) {
            c43i9 = c83x.LJLJI;
        }
        if ((i & 16) != 0) {
            c43i11 = c83x.LJLJJI;
        }
        if ((i & 32) != 0) {
            c43i12 = c83x.LJLJJL;
        }
        if ((i & 64) != 0) {
            c43i13 = c83x.LJLJJLL;
        }
        if ((i & 128) != 0) {
            c43i14 = c83x.LJLJL;
        }
        if ((i & 256) != 0) {
            c43i8 = c83x.LJLJLJ;
        }
        c83x.getClass();
        return new C83X(c43i10, z, c43i9, c43i11, c43i12, c43i13, c43i14, c43i8);
    }
}
