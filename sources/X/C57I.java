package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.57I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57I {
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C56A LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final View LJIIIZ;
    public final InterfaceC65784Pro<C76800UCe> LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;

    public C57I() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57I)) {
            return false;
        }
        C57I c57i = (C57I) obj;
        return o.LJ(this.LIZ, c57i.LIZ) && this.LIZIZ == c57i.LIZIZ && this.LIZJ == c57i.LIZJ && this.LIZLLL == c57i.LIZLLL && this.LJ == c57i.LJ && this.LJFF == c57i.LJFF && o.LJ(this.LJI, c57i.LJI) && this.LJII == c57i.LJII && this.LJIIIIZZ == c57i.LJIIIIZZ && o.LJ(this.LJIIIZ, c57i.LJIIIZ) && o.LJ(this.LJIIJ, c57i.LJIIJ) && this.LJIIJJI == c57i.LJIIJJI && this.LJIIL == c57i.LJIIL && this.LJIILIIL == c57i.LJIILIIL && this.LJIILJJIL == c57i.LJIILJJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.LJFF.hashCode() + ((((((((hashCode + i) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31)) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJI;
        int hashCode3 = (hashCode2 + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31;
        boolean z2 = this.LJII;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z3 = this.LJIIIIZZ;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        View view = this.LJIIIZ;
        int hashCode4 = (i5 + (view == null ? 0 : view.hashCode())) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJIIJ;
        int hashCode5 = (hashCode4 + (interfaceC65784Pro2 != null ? interfaceC65784Pro2.hashCode() : 0)) * 31;
        boolean z4 = this.LJIIJJI;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode5 + i6) * 31;
        boolean z5 = this.LJIIL;
        int i8 = z5;
        if (z5 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z6 = this.LJIILIIL;
        int i10 = z6;
        if (z6 != 0) {
            i10 = 1;
        }
        return ((i9 + i10) * 31) + (this.LJIILJJIL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTabConfig(panelKey=");
        sb.append(this.LIZ);
        sb.append(", enableNullButton=");
        sb.append(this.LIZIZ);
        sb.append(", tabIndicatorColor=");
        sb.append(this.LIZJ);
        sb.append(", tabTextColor=");
        sb.append(this.LIZLLL);
        sb.append(", tabSelectedColor=");
        sb.append(this.LJ);
        sb.append(", multiTabPosition=");
        sb.append(this.LJFF);
        sb.append(", onNullButtonClick=");
        sb.append(this.LJI);
        sb.append(", isFromCover=");
        sb.append(this.LJII);
        sb.append(", enableExtendFunction=");
        sb.append(this.LJIIIIZZ);
        sb.append(", extendFunctionView=");
        sb.append(this.LJIIIZ);
        sb.append(", onExtendViewClick=");
        sb.append(this.LJIIJ);
        sb.append(", disableTabIndicator=");
        sb.append(this.LJIIJJI);
        sb.append(", hideClearLayout=");
        sb.append(this.LJIIL);
        sb.append(", singlePageNoCategory=");
        sb.append(this.LJIILIIL);
        sb.append(", customLoadingAndErrorView=");
        return C08880Wm.LIZJ(sb, this.LJIILJJIL, ')');
    }

    public C57I(int i) {
        C56A multiTabPosition = C56A.UP;
        o.LJIIIZ(multiTabPosition, "multiTabPosition");
        this.LIZ = "editor_pro_transition";
        this.LIZIZ = true;
        this.LIZJ = R.color.fr;
        this.LIZLLL = R.color.fy;
        this.LJ = R.color.acm;
        this.LJFF = multiTabPosition;
        this.LJI = null;
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = true;
        this.LJIILJJIL = true;
    }
}
