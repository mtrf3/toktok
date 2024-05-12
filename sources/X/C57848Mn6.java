package X;

import com.zhiliaoapp.musically.R;
import defpackage.b0;

/* renamed from: X.Mn6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57848Mn6 extends AbstractC57844Mn2 {
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;

    public C57848Mn6() {
        this(0);
    }

    public final int hashCode() {
        return (((((((this.LJLILLLLZI * 31) + this.LJLJI) * 31) + this.LJLJJI) * 31) + this.LJLJJL) * 31) + this.LJLJJLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewSuggestionTitle(newSuggestCount=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", textRes=");
        LIZ.append(this.LJLJI);
        LIZ.append(", colorLight=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", tuxFont=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", colorDark=");
        return b0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZ() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZIZ() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZJ() {
        return this.LJLJI;
    }

    @Override // X.AbstractC57844Mn2
    public final int LIZLLL() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC57927MoN
    public final String getElementId() {
        return this.LJLJL;
    }

    public /* synthetic */ C57848Mn6(int i) {
        this(-1, R.string.gh4, R.attr.gv, 62, R.attr.dm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57848Mn6)) {
            return false;
        }
        C57848Mn6 c57848Mn6 = (C57848Mn6) obj;
        if (this.LJLILLLLZI == c57848Mn6.LJLILLLLZI && this.LJLJI == c57848Mn6.LJLJI && this.LJLJJI == c57848Mn6.LJLJJI && this.LJLJJL == c57848Mn6.LJLJJL && this.LJLJJLL == c57848Mn6.LJLJJLL) {
            return true;
        }
        return false;
    }

    public C57848Mn6(int i, int i2, int i3, int i4, int i5) {
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = i5;
        this.LJLJL = "NewSuggestion_Title";
    }
}
