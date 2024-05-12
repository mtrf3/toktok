package X;

import androidx.fragment.app.Fragment;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8Yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213218Yj {
    public final Fragment LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C213218Yj)) {
            return false;
        }
        C213218Yj c213218Yj = (C213218Yj) obj;
        return o.LJ(this.LIZ, c213218Yj.LIZ) && o.LJ(this.LIZIZ, c213218Yj.LIZIZ) && o.LJ(this.LIZJ, c213218Yj.LIZJ) && o.LJ(this.LIZLLL, c213218Yj.LIZLLL) && o.LJ(this.LJ, c213218Yj.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        String str = this.LJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavoriteTabItem(fragment=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageTitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mobKey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", tabCountKey=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", standalonePageTitle=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C213218Yj(Fragment fragment, String str, String str2, String str3) {
        this(fragment, str, str2, str3, null);
    }

    public C213218Yj(Fragment fragment, String pageTitle, String mobKey, String tabCountKey, String str) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(pageTitle, "pageTitle");
        o.LJIIIZ(mobKey, "mobKey");
        o.LJIIIZ(tabCountKey, "tabCountKey");
        this.LIZ = fragment;
        this.LIZIZ = pageTitle;
        this.LIZJ = mobKey;
        this.LIZLLL = tabCountKey;
        this.LJ = str;
    }
}
