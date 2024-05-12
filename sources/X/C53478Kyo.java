package X;

import android.graphics.Shader;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Kyo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53478Kyo implements L50 {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final InterfaceC88472Yns<C53447KyJ, Shader> LIZJ;
    public final InterfaceC88472Yns<C53447KyJ, Float> LIZLLL;
    public final InterfaceC88472Yns<C53447KyJ, Float> LJ;
    public final InterfaceC88472Yns<C53489Kyz, C76800UCe> LJFF;
    public final C26308AUe LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C53455KyR LJIIJ;
    public final C53479Kyp LJIIJJI;

    public C53478Kyo() {
        this(null, null, null, null, null, null, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53478Kyo)) {
            return false;
        }
        C53478Kyo c53478Kyo = (C53478Kyo) obj;
        return o.LJ(this.LIZ, c53478Kyo.LIZ) && o.LJ(this.LIZIZ, c53478Kyo.LIZIZ) && o.LJ(this.LIZJ, c53478Kyo.LIZJ) && o.LJ(this.LIZLLL, c53478Kyo.LIZLLL) && o.LJ(this.LJ, c53478Kyo.LJ) && o.LJ(this.LJFF, c53478Kyo.LJFF) && o.LJ(this.LJI, c53478Kyo.LJI) && this.LJII == c53478Kyo.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.LIZIZ;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        InterfaceC88472Yns<C53447KyJ, Shader> interfaceC88472Yns = this.LIZJ;
        if (interfaceC88472Yns == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC88472Yns.hashCode();
        }
        int LIZIZ = QZY.LIZIZ(this.LJ, QZY.LIZIZ(this.LIZLLL, (i3 + hashCode3) * 31, 31), 31);
        InterfaceC88472Yns<C53489Kyz, C76800UCe> interfaceC88472Yns2 = this.LJFF;
        if (interfaceC88472Yns2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC88472Yns2.hashCode();
        }
        int i4 = (LIZIZ + hashCode4) * 31;
        C26308AUe c26308AUe = this.LJI;
        if (c26308AUe != null) {
            i = c26308AUe.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z = this.LJII;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        return i5 + i6;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarRingUIData(color=");
        LIZ.append(this.LIZ);
        LIZ.append(", attrColorRes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shader=");
        LIZ.append(this.LIZJ);
        LIZ.append(", diameter=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", strokeWidth=");
        LIZ.append(this.LJ);
        LIZ.append(", onStateChange=");
        LIZ.append(this.LJFF);
        LIZ.append(", lottieSource=");
        LIZ.append(this.LJI);
        LIZ.append(", shouldDelayDrawRing=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    @Override // X.L50
    public final boolean LIZ() {
        return this.LJIIIZ;
    }

    @Override // X.L50
    public final boolean LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.L50
    public final InterfaceC53515KzP getPosition() {
        return this.LJIIJJI;
    }

    @Override // X.L50
    public final C53455KyR getSize() {
        return this.LJIIJ;
    }

    public C53478Kyo(Integer num, Integer num2, InterfaceC88472Yns interfaceC88472Yns, C53450KyM c53450KyM, AqS175S0100000_9 aqS175S0100000_9, C26308AUe c26308AUe, boolean z, int i) {
        C53444KyG diameter;
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        interfaceC88472Yns = (i & 4) != 0 ? null : interfaceC88472Yns;
        if ((i & 8) != 0) {
            diameter = C53444KyG.LJLIL;
        } else {
            diameter = null;
        }
        InterfaceC88472Yns strokeWidth = c53450KyM;
        strokeWidth = (i & 16) != 0 ? C2W8.LJLIL : strokeWidth;
        aqS175S0100000_9 = (i & 32) != 0 ? null : aqS175S0100000_9;
        c26308AUe = (i & 64) != 0 ? null : c26308AUe;
        z = (i & 128) != 0 ? false : z;
        o.LJIIIZ(diameter, "diameter");
        o.LJIIIZ(strokeWidth, "strokeWidth");
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = diameter;
        this.LJ = strokeWidth;
        this.LJFF = aqS175S0100000_9;
        this.LJI = c26308AUe;
        this.LJII = z;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
        this.LJIIJ = new C53455KyR(diameter, diameter);
        this.LJIIJJI = C53479Kyp.LIZ;
    }
}
