package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221298mL implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final UrlModel LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final C43I<Boolean> LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final boolean LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final C43I<Boolean> LJLLILLLL;

    public C221298mL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C221298mL)) {
            return false;
        }
        C221298mL c221298mL = (C221298mL) obj;
        return o.LJ(this.LJLIL, c221298mL.LJLIL) && o.LJ(this.LJLILLLLZI, c221298mL.LJLILLLLZI) && o.LJ(this.LJLJI, c221298mL.LJLJI) && o.LJ(this.LJLJJI, c221298mL.LJLJJI) && o.LJ(this.LJLJJL, c221298mL.LJLJJL) && o.LJ(this.LJLJJLL, c221298mL.LJLJJLL) && this.LJLJL == c221298mL.LJLJL && this.LJLJLJ == c221298mL.LJLJLJ && this.LJLJLLL == c221298mL.LJLJLLL && this.LJLL == c221298mL.LJLL && this.LJLLI == c221298mL.LJLLI && o.LJ(this.LJLLILLLL, c221298mL.LJLLILLLL);
    }

    public final String toString() {
        return "VideoExposeSharerState(nickName=" + this.LJLIL + ", callerId=" + this.LJLILLLLZI + ", avatar=" + this.LJLJI + ", followAnimation=" + this.LJLJJI + ", unfollow=" + this.LJLJJL + ", followText=" + this.LJLJJLL + ", followBtnColor=" + this.LJLJL + ", followTextColor=" + this.LJLJLJ + ", hasAnimationPlayed=" + this.LJLJLLL + ", isShowQuickReplyBox=" + this.LJLL + ", isInQuickReplayBoxAnimation=" + this.LJLLI + ", retryContention=" + this.LJLLILLLL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, hashCode * 31, 31);
        UrlModel urlModel = this.LJLJI;
        if (urlModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        C43I<Boolean> c43i = this.LJLJJI;
        if (c43i == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c43i.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        C43I<Boolean> c43i2 = this.LJLJJL;
        if (c43i2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c43i2.hashCode();
        }
        int LJ2 = (((C79062V1e.LJ(this.LJLJJLL, (i3 + hashCode4) * 31, 31) + this.LJLJL) * 31) + this.LJLJLJ) * 31;
        boolean z = this.LJLJLLL;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (LJ2 + i5) * 31;
        boolean z2 = this.LJLL;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        if (!this.LJLLI) {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        C43I<Boolean> c43i3 = this.LJLLILLLL;
        if (c43i3 != null) {
            i = c43i3.hashCode();
        }
        return i9 + i;
    }

    public /* synthetic */ C221298mL(int i) {
        this("", "", null, null, null, "", 0, R.attr.cl, false, false, false, null);
    }

    public C221298mL(String str, String callerId, UrlModel urlModel, C43I<Boolean> c43i, C43I<Boolean> c43i2, String followText, int i, int i2, boolean z, boolean z2, boolean z3, C43I<Boolean> c43i3) {
        o.LJIIIZ(callerId, "callerId");
        o.LJIIIZ(followText, "followText");
        this.LJLIL = str;
        this.LJLILLLLZI = callerId;
        this.LJLJI = urlModel;
        this.LJLJJI = c43i;
        this.LJLJJL = c43i2;
        this.LJLJJLL = followText;
        this.LJLJL = i;
        this.LJLJLJ = i2;
        this.LJLJLLL = z;
        this.LJLL = z2;
        this.LJLLI = z3;
        this.LJLLILLLL = c43i3;
    }

    public static C221298mL LIZ(C221298mL c221298mL, String str, String str2, UrlModel urlModel, C43I c43i, C43I c43i2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, C43I c43i3, int i3) {
        C43I c43i4 = c43i3;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        int i4 = i2;
        int i5 = i;
        String callerId = str2;
        String str4 = str;
        UrlModel urlModel2 = urlModel;
        C43I c43i5 = c43i;
        C43I c43i6 = c43i2;
        String followText = str3;
        if ((i3 & 1) != 0) {
            str4 = c221298mL.LJLIL;
        }
        if ((i3 & 2) != 0) {
            callerId = c221298mL.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            urlModel2 = c221298mL.LJLJI;
        }
        if ((i3 & 8) != 0) {
            c43i5 = c221298mL.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            c43i6 = c221298mL.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            followText = c221298mL.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            i5 = c221298mL.LJLJL;
        }
        if ((i3 & 128) != 0) {
            i4 = c221298mL.LJLJLJ;
        }
        if ((i3 & 256) != 0) {
            z6 = c221298mL.LJLJLLL;
        }
        if ((i3 & 512) != 0) {
            z5 = c221298mL.LJLL;
        }
        if ((i3 & 1024) != 0) {
            z4 = c221298mL.LJLLI;
        }
        if ((i3 & 2048) != 0) {
            c43i4 = c221298mL.LJLLILLLL;
        }
        c221298mL.getClass();
        o.LJIIIZ(callerId, "callerId");
        o.LJIIIZ(followText, "followText");
        return new C221298mL(str4, callerId, urlModel2, c43i5, c43i6, followText, i5, i4, z6, z5, z4, c43i4);
    }
}
