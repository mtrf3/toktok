package X;

import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.KzO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53514KzO implements L50 {
    public final String LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final InterfaceC88472Yns<C53447KyJ, Integer> LIZLLL;
    public final Integer LJ;
    public final InterfaceC88472Yns<C53447KyJ, Integer> LJFF;
    public final InterfaceC88472Yns<C53447KyJ, Integer> LJI;
    public final int LJII;
    public final Integer LJIIIIZZ;
    public final TextUtils.TruncateAt LJIIIZ;
    public final InterfaceC53515KzP LJIIJ;
    public final boolean LJIIJJI;
    public final C53455KyR LJIIL;
    public final boolean LJIILIIL;
    public final InterfaceC88472Yns<Integer, Float> LJIILJJIL;
    public final Integer LJIILL;
    public final String LJIILLIIL;

    public C53514KzO() {
        throw null;
    }

    @Override // X.L50
    public final boolean LIZ() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.LIZIZ;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int LIZIZ = QZY.LIZIZ(this.LIZLLL, (((i2 + hashCode2) * 31) + this.LIZJ) * 31, 31);
        Integer num2 = this.LJ;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int LIZIZ2 = (QZY.LIZIZ(this.LJI, QZY.LIZIZ(this.LJFF, (LIZIZ + hashCode3) * 31, 31), 31) + this.LJII) * 31;
        Integer num3 = this.LJIIIIZZ;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int hashCode7 = (this.LJIIJ.hashCode() + ((this.LJIIIZ.hashCode() + ((LIZIZ2 + hashCode4) * 31)) * 31)) * 31;
        boolean z = this.LJIIJJI;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int hashCode8 = (this.LJIIL.hashCode() + ((hashCode7 + i4) * 31)) * 31;
        if (!this.LJIILIIL) {
            i3 = 0;
        }
        int i5 = (hashCode8 + i3) * 31;
        InterfaceC88472Yns<Integer, Float> interfaceC88472Yns = this.LJIILJJIL;
        if (interfaceC88472Yns == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = interfaceC88472Yns.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num4 = this.LJIILL;
        if (num4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num4.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str2 = this.LJIILLIIL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarTextUIData(text=");
        sb.append(this.LIZ);
        sb.append(", textRes=");
        sb.append(this.LIZIZ);
        sb.append(", backgroundRes=");
        sb.append(this.LIZJ);
        sb.append(", textFont=");
        sb.append(this.LIZLLL);
        sb.append(", textColor=");
        sb.append(this.LJ);
        sb.append(", paddingStart=");
        sb.append(this.LJFF);
        sb.append(", paddingEnd=");
        sb.append(this.LJI);
        sb.append(", maxLine=");
        sb.append(this.LJII);
        sb.append(", maxWidth=");
        sb.append(this.LJIIIIZZ);
        sb.append(", ellipsize=");
        sb.append(this.LJIIIZ);
        sb.append(", position=");
        sb.append(this.LJIIJ);
        sb.append(", autoRTL=");
        sb.append(this.LJIIJJI);
        sb.append(", size=");
        sb.append(this.LJIIL);
        sb.append(", hasHollowOutline=");
        sb.append(this.LJIILIIL);
        sb.append(", outlineWidth=");
        sb.append(this.LJIILJJIL);
        sb.append(", outlineRes=");
        sb.append(this.LJIILL);
        sb.append(", identifier=");
        return C07670Rv.LIZIZ(sb, this.LJIILLIIL, ')');
    }

    @Override // X.L50
    public final boolean LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.L50
    public final InterfaceC53515KzP getPosition() {
        return this.LJIIJ;
    }

    @Override // X.L50
    public final C53455KyR getSize() {
        return this.LJIIL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53514KzO)) {
            return false;
        }
        C53514KzO c53514KzO = (C53514KzO) obj;
        if (o.LJ(this.LIZ, c53514KzO.LIZ) && o.LJ(this.LIZIZ, c53514KzO.LIZIZ) && this.LIZJ == c53514KzO.LIZJ && o.LJ(this.LIZLLL, c53514KzO.LIZLLL) && o.LJ(this.LJ, c53514KzO.LJ) && o.LJ(this.LJFF, c53514KzO.LJFF) && o.LJ(this.LJI, c53514KzO.LJI) && this.LJII == c53514KzO.LJII && o.LJ(this.LJIIIIZZ, c53514KzO.LJIIIIZZ) && this.LJIIIZ == c53514KzO.LJIIIZ && o.LJ(this.LJIIJ, c53514KzO.LJIIJ) && this.LJIIJJI == c53514KzO.LJIIJJI && o.LJ(this.LJIIL, c53514KzO.LJIIL) && this.LJIILIIL == c53514KzO.LJIILIIL && o.LJ(this.LJIILJJIL, c53514KzO.LJIILJJIL) && o.LJ(this.LJIILL, c53514KzO.LJIILL) && o.LJ(this.LJIILLIIL, c53514KzO.LJIILLIIL)) {
            return true;
        }
        return false;
    }

    public C53514KzO(Integer num, AqS175S0100000_9 aqS175S0100000_9, Integer num2, AqS175S0100000_9 aqS175S0100000_92, AqS175S0100000_9 aqS175S0100000_93, C53470Kyg c53470Kyg, C53455KyR c53455KyR) {
        TextUtils.TruncateAt ellipsize = TextUtils.TruncateAt.END;
        o.LJIIIZ(ellipsize, "ellipsize");
        this.LIZ = null;
        this.LIZIZ = num;
        this.LIZJ = R.drawable.d9b;
        this.LIZLLL = aqS175S0100000_9;
        this.LJ = num2;
        this.LJFF = aqS175S0100000_92;
        this.LJI = aqS175S0100000_93;
        this.LJII = 1;
        this.LJIIIIZZ = null;
        this.LJIIIZ = ellipsize;
        this.LJIIJ = c53470Kyg;
        this.LJIIJJI = false;
        this.LJIIL = c53455KyR;
        this.LJIILIIL = true;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
    }
}
