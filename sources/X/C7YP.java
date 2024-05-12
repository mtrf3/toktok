package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.7YP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YP implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final UrlModel LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final String LJLJL;
    public final Integer LJLJLJ;
    public final Integer LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final Integer LJLLJ;
    public final Boolean LJLLL;
    public final String LJLLLL;
    public final C7YO LJLLLLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7YP)) {
            return false;
        }
        C7YP c7yp = (C7YP) obj;
        return o.LJ(this.LJLIL, c7yp.LJLIL) && o.LJ(this.LJLILLLLZI, c7yp.LJLILLLLZI) && o.LJ(this.LJLJI, c7yp.LJLJI) && o.LJ(this.LJLJJI, c7yp.LJLJJI) && o.LJ(this.LJLJJL, c7yp.LJLJJL) && this.LJLJJLL == c7yp.LJLJJLL && o.LJ(this.LJLJL, c7yp.LJLJL) && o.LJ(this.LJLJLJ, c7yp.LJLJLJ) && o.LJ(this.LJLJLLL, c7yp.LJLJLLL) && this.LJLL == c7yp.LJLL && this.LJLLI == c7yp.LJLLI && this.LJLLILLLL == c7yp.LJLLILLLL && o.LJ(this.LJLLJ, c7yp.LJLLJ) && o.LJ(this.LJLLL, c7yp.LJLLL) && o.LJ(this.LJLLLL, c7yp.LJLLLL) && o.LJ(this.LJLLLLLL, c7yp.LJLLLLLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final String toString() {
        return "ArtistProfileTuxSheetItem(awemeId=" + this.LJLIL + ", uid=" + this.LJLILLLLZI + ", secUid=" + this.LJLJI + ", avatar=" + this.LJLJJI + ", nickName=" + this.LJLJJL + ", verified=" + this.LJLJJLL + ", userName=" + this.LJLJL + ", followStatus=" + this.LJLJLJ + ", followerStatus=" + this.LJLJLLL + ", isPrivateAccount=" + this.LJLL + ", isBlock=" + this.LJLLI + ", isBlocked=" + this.LJLLILLLL + ", status=" + this.LJLLJ + ", showFollowBtn=" + this.LJLLL + ", type=" + this.LJLLLL + ", extra=" + this.LJLLLLLL + ')';
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
        int hashCode8;
        int hashCode9;
        int hashCode10;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LJLILLLLZI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJLJI;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        UrlModel urlModel = this.LJLJJI;
        if (urlModel == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = urlModel.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.LJLJJL;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        boolean z = this.LJLJJLL;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        String str5 = this.LJLJL;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        Integer num = this.LJLJLJ;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        Integer num2 = this.LJLJLLL;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        boolean z2 = this.LJLL;
        int i13 = z2;
        if (z2 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z3 = this.LJLLI;
        int i15 = z3;
        if (z3 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        if (!this.LJLLILLLL) {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        Integer num3 = this.LJLLJ;
        if (num3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num3.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Boolean bool = this.LJLLL;
        if (bool == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLLLL, (i18 + hashCode10) * 31, 31);
        C7YO c7yo = this.LJLLLLLL;
        if (c7yo != null) {
            i = c7yo.hashCode();
        }
        return LJ + i;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C7YP) {
            C7YP c7yp = (C7YP) interfaceC57784Mm4;
            if (o.LJ(c7yp.LJLJLJ, this.LJLJLJ) && o.LJ(c7yp.LJLJLLL, this.LJLJLLL) && c7yp.LJLL == this.LJLL && c7yp.LJLLI == this.LJLLI && c7yp.LJLLILLLL == this.LJLLILLLL && o.LJ(c7yp.LJLLJ, this.LJLLJ) && o.LJ(c7yp.LJLLL, this.LJLLL)) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C7YP) {
            C7YP c7yp = (C7YP) interfaceC57784Mm4;
            if (o.LJ(c7yp.LJLIL, this.LJLIL) && o.LJ(c7yp.LJLILLLLZI, this.LJLILLLLZI) && o.LJ(c7yp.LJLJI, this.LJLJI)) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    public static C7YP LIZ(C7YP c7yp, Integer num, Integer num2, boolean z, boolean z2, int i) {
        String str;
        String str2;
        String str3;
        UrlModel urlModel;
        String str4;
        boolean z3;
        String str5;
        boolean z4;
        Integer num3;
        Boolean bool;
        String type;
        boolean z5 = z2;
        boolean z6 = z;
        Integer num4 = num;
        Integer num5 = num2;
        C7YO c7yo = null;
        if ((i & 1) != 0) {
            str = c7yp.LJLIL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c7yp.LJLILLLLZI;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c7yp.LJLJI;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            urlModel = c7yp.LJLJJI;
        } else {
            urlModel = null;
        }
        if ((i & 16) != 0) {
            str4 = c7yp.LJLJJL;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            z3 = c7yp.LJLJJLL;
        } else {
            z3 = false;
        }
        if ((i & 64) != 0) {
            str5 = c7yp.LJLJL;
        } else {
            str5 = null;
        }
        if ((i & 128) != 0) {
            num4 = c7yp.LJLJLJ;
        }
        if ((i & 256) != 0) {
            num5 = c7yp.LJLJLLL;
        }
        if ((i & 512) != 0) {
            z4 = c7yp.LJLL;
        } else {
            z4 = false;
        }
        if ((i & 1024) != 0) {
            z6 = c7yp.LJLLI;
        }
        if ((i & 2048) != 0) {
            z5 = c7yp.LJLLILLLL;
        }
        if ((i & 4096) != 0) {
            num3 = c7yp.LJLLJ;
        } else {
            num3 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            bool = c7yp.LJLLL;
        } else {
            bool = null;
        }
        if ((i & 16384) != 0) {
            type = c7yp.LJLLLL;
        } else {
            type = null;
        }
        if ((i & 32768) != 0) {
            c7yo = c7yp.LJLLLLLL;
        }
        c7yp.getClass();
        o.LJIIIZ(type, "type");
        return new C7YP(str, str2, str3, urlModel, str4, z3, str5, num4, num5, z4, z6, z5, num3, bool, type, c7yo);
    }

    public C7YP(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, String str5, Integer num, Integer num2, boolean z2, boolean z3, boolean z4, Integer num3, Boolean bool, String str6, C7YO c7yo) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = urlModel;
        this.LJLJJL = str4;
        this.LJLJJLL = z;
        this.LJLJL = str5;
        this.LJLJLJ = num;
        this.LJLJLLL = num2;
        this.LJLL = z2;
        this.LJLLI = z3;
        this.LJLLILLLL = z4;
        this.LJLLJ = num3;
        this.LJLLL = bool;
        this.LJLLLL = str6;
        this.LJLLLLLL = c7yo;
    }
}
