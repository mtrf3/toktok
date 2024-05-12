package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Xls, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85800Xls extends AEC {
    public final String LJLJJL;
    public final int LJLJJLL;
    public final View.OnClickListener LJLJL;
    public final View.OnClickListener LJLJLJ;
    public final String LJLJLLL;
    public final int LJLL;
    public final String LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final Object LJLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.LJLJJL.hashCode() * 31) + this.LJLJJLL) * 31;
        View.OnClickListener onClickListener = this.LJLJL;
        int i = 0;
        if (onClickListener == null) {
            hashCode = 0;
        } else {
            hashCode = onClickListener.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        View.OnClickListener onClickListener2 = this.LJLJLJ;
        if (onClickListener2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = onClickListener2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLLI, (C79062V1e.LJ(this.LJLJLLL, (i2 + hashCode2) * 31, 31) + this.LJLL) * 31, 31);
        boolean z = this.LJLLILLLL;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (LJ + i4) * 31;
        if (!this.LJLLJ) {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        Object obj = this.LJLLL;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingFooterItem(id=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", onClickListenerOfUserInfo=");
        LIZ.append(this.LJLJL);
        LIZ.append(", onClickListenerOfVersion=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", versionText=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", userInfoVisibility=");
        LIZ.append(this.LJLL);
        LIZ.append(", userInfoText=");
        LIZ.append(this.LJLLI);
        LIZ.append(", divider=");
        LIZ.append(this.LJLLILLLL);
        LIZ.append(", visibility=");
        LIZ.append(this.LJLLJ);
        LIZ.append(", tag=");
        return U26.LIZJ(LIZ, this.LJLLL, ')', LIZ);
    }

    @Override // X.AEC
    public final Object LIZ() {
        return this.LJLLL;
    }

    @Override // X.AEC
    public final boolean LIZIZ() {
        return this.LJLLJ;
    }

    public final boolean equals(Object obj) {
        C85800Xls c85800Xls;
        String str = this.LJLJJL;
        String str2 = null;
        if ((obj instanceof C85800Xls) && (c85800Xls = (C85800Xls) obj) != null) {
            str2 = c85800Xls.LJLJJL;
        }
        return o.LJ(str, str2);
    }

    public static C85800Xls LIZJ(C85800Xls c85800Xls, int i, String str, int i2, String str2, boolean z, int i3) {
        String id;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        boolean z2;
        String userInfoText = str2;
        int i4 = i2;
        boolean z3 = z;
        int i5 = i;
        String versionText = str;
        Object obj = null;
        if ((i3 & 1) != 0) {
            id = c85800Xls.LJLJJL;
        } else {
            id = null;
        }
        if ((i3 & 2) != 0) {
            i5 = c85800Xls.LJLJJLL;
        }
        if ((i3 & 4) != 0) {
            onClickListener = c85800Xls.LJLJL;
        } else {
            onClickListener = null;
        }
        if ((i3 & 8) != 0) {
            onClickListener2 = c85800Xls.LJLJLJ;
        } else {
            onClickListener2 = null;
        }
        if ((i3 & 16) != 0) {
            versionText = c85800Xls.LJLJLLL;
        }
        if ((i3 & 32) != 0) {
            i4 = c85800Xls.LJLL;
        }
        if ((i3 & 64) != 0) {
            userInfoText = c85800Xls.LJLLI;
        }
        if ((i3 & 128) != 0) {
            z2 = c85800Xls.LJLLILLLL;
        } else {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            z3 = c85800Xls.LJLLJ;
        }
        if ((i3 & 512) != 0) {
            obj = c85800Xls.LJLLL;
        }
        o.LJIIIZ(id, "id");
        o.LJIIIZ(versionText, "versionText");
        o.LJIIIZ(userInfoText, "userInfoText");
        return new C85800Xls(id, i5, onClickListener, onClickListener2, versionText, i4, userInfoText, z2, z3, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85800Xls(String str, int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String versionText, int i2, String userInfoText, boolean z, boolean z2, Object obj) {
        super(z2, obj, 8);
        o.LJIIIZ(versionText, "versionText");
        o.LJIIIZ(userInfoText, "userInfoText");
        this.LJLJJL = str;
        this.LJLJJLL = i;
        this.LJLJL = onClickListener;
        this.LJLJLJ = onClickListener2;
        this.LJLJLLL = versionText;
        this.LJLL = i2;
        this.LJLLI = userInfoText;
        this.LJLLILLLL = z;
        this.LJLLJ = z2;
        this.LJLLL = obj;
    }
}
