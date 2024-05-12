package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9I0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9I0 {
    public C9HL LIZ;
    public EnumC234329Ho LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;
    public InterfaceC88472Yns<? super View, C76800UCe> LJ;
    public final int LJFF;
    public boolean LJI;
    public C9I2 LJII;
    public final java.util.Map<Integer, Float> LJIIIIZZ;
    public List<C252659vp> LJIIIZ;

    public C9I0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9I0)) {
            return false;
        }
        C9I0 c9i0 = (C9I0) obj;
        return this.LIZ == c9i0.LIZ && this.LIZIZ == c9i0.LIZIZ && o.LJ(this.LIZJ, c9i0.LIZJ) && o.LJ(this.LIZLLL, c9i0.LIZLLL) && o.LJ(this.LJ, c9i0.LJ) && this.LJFF == c9i0.LJFF && this.LJI == c9i0.LJI && o.LJ(this.LJII, c9i0.LJII) && o.LJ(this.LJIIIIZZ, c9i0.LJIIIIZZ) && o.LJ(this.LJIIIZ, c9i0.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C9HL c9hl = this.LIZ;
        int hashCode = (c9hl == null ? 0 : c9hl.hashCode()) * 31;
        EnumC234329Ho enumC234329Ho = this.LIZIZ;
        int hashCode2 = (hashCode + (enumC234329Ho == null ? 0 : enumC234329Ho.hashCode())) * 31;
        Integer num = this.LIZJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns = this.LJ;
        int hashCode5 = (((hashCode4 + (interfaceC88472Yns == null ? 0 : interfaceC88472Yns.hashCode())) * 31) + this.LJFF) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        C9I2 c9i2 = this.LJII;
        int hashCode6 = (i2 + (c9i2 == null ? 0 : c9i2.hashCode())) * 31;
        java.util.Map<Integer, Float> map = this.LJIIIIZZ;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        List<C252659vp> list = this.LJIIIZ;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileCTASingleFeatureInfo(curStyle=");
        LIZ.append(this.LIZ);
        LIZ.append(", maxStyle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", text=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", clickFunc=");
        LIZ.append(this.LJ);
        LIZ.append(", textSize=");
        LIZ.append(this.LJFF);
        LIZ.append(", hasAlertBadge=");
        LIZ.append(this.LJI);
        LIZ.append(", view=");
        LIZ.append(this.LJII);
        LIZ.append(", viewWidth=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", actionList=");
        return C1NE.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C9I0(Object obj) {
        C9HL c9hl = C9HL.SHEET;
        EnumC234329Ho enumC234329Ho = EnumC234329Ho.SHEET;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = c9hl;
        this.LIZIZ = enumC234329Ho;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = 15;
        this.LJI = false;
        this.LJII = null;
        this.LJIIIIZZ = linkedHashMap;
        this.LJIIIZ = null;
    }
}
