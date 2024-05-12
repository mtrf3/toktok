package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.KzN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53513KzN implements L50 {
    public final InterfaceC53515KzP LIZ;
    public final C53455KyR LIZIZ;
    public final C53455KyR LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC88472Yns<Context, View> LJ;
    public final InterfaceC88472Yns<C53489Kyz, C76800UCe> LJFF;
    public final InterfaceC88472Yns<C53489Kyz, C76800UCe> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC88472Yns<Integer, Float> LJIIIZ;
    public final Integer LJIIJ;
    public final String LJIIJJI;

    public C53513KzN() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        C53455KyR c53455KyR = this.LIZJ;
        int i = 0;
        if (c53455KyR == null) {
            hashCode = 0;
        } else {
            hashCode = c53455KyR.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        boolean z = this.LIZLLL;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LIZIZ = QZY.LIZIZ(this.LJFF, QZY.LIZIZ(this.LJ, (i2 + i4) * 31, 31), 31);
        InterfaceC88472Yns<C53489Kyz, C76800UCe> interfaceC88472Yns = this.LJI;
        if (interfaceC88472Yns == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC88472Yns.hashCode();
        }
        int i5 = (LIZIZ + hashCode2) * 31;
        boolean z2 = this.LJII;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        if (!this.LJIIIIZZ) {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        InterfaceC88472Yns<Integer, Float> interfaceC88472Yns2 = this.LJIIIZ;
        if (interfaceC88472Yns2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = interfaceC88472Yns2.hashCode();
        }
        int i9 = (i8 + hashCode3) * 31;
        Integer num = this.LJIIJ;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i10 = (i9 + hashCode4) * 31;
        String str = this.LJIIJJI;
        if (str != null) {
            i = str.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvatarViewUIData(position=");
        sb.append(this.LIZ);
        sb.append(", size=");
        sb.append(this.LIZIZ);
        sb.append(", clickSize=");
        sb.append(this.LIZJ);
        sb.append(", autoRTL=");
        sb.append(this.LIZLLL);
        sb.append(", view=");
        sb.append(this.LJ);
        sb.append(", onViewAdded=");
        sb.append(this.LJFF);
        sb.append(", onStateChange=");
        sb.append(this.LJI);
        sb.append(", isCircle=");
        sb.append(this.LJII);
        sb.append(", hasHollowOutline=");
        sb.append(this.LJIIIIZZ);
        sb.append(", outlineWidth=");
        sb.append(this.LJIIIZ);
        sb.append(", outlineRes=");
        sb.append(this.LJIIJ);
        sb.append(", identifier=");
        return C07670Rv.LIZIZ(sb, this.LJIIJJI, ')');
    }

    @Override // X.L50
    public final boolean LIZ() {
        return this.LJII;
    }

    @Override // X.L50
    public final boolean LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.L50
    public final InterfaceC53515KzP getPosition() {
        return this.LIZ;
    }

    @Override // X.L50
    public final C53455KyR getSize() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53513KzN)) {
            return false;
        }
        C53513KzN c53513KzN = (C53513KzN) obj;
        if (o.LJ(this.LIZ, c53513KzN.LIZ) && o.LJ(this.LIZIZ, c53513KzN.LIZIZ) && o.LJ(this.LIZJ, c53513KzN.LIZJ) && this.LIZLLL == c53513KzN.LIZLLL && o.LJ(this.LJ, c53513KzN.LJ) && o.LJ(this.LJFF, c53513KzN.LJFF) && o.LJ(this.LJI, c53513KzN.LJI) && this.LJII == c53513KzN.LJII && this.LJIIIIZZ == c53513KzN.LJIIIIZZ && o.LJ(this.LJIIIZ, c53513KzN.LJIIIZ) && o.LJ(this.LJIIJ, c53513KzN.LJIIJ) && o.LJ(this.LJIIJJI, c53513KzN.LJIIJJI)) {
            return true;
        }
        return false;
    }

    public C53513KzN(InterfaceC53515KzP interfaceC53515KzP, C53455KyR c53455KyR, C53455KyR c53455KyR2, boolean z, InterfaceC88472Yns view, InterfaceC88472Yns onViewAdded, InterfaceC88472Yns interfaceC88472Yns, boolean z2, boolean z3, InterfaceC88472Yns interfaceC88472Yns2, String str, int i) {
        c53455KyR2 = (i & 4) != 0 ? null : c53455KyR2;
        z = (i & 8) != 0 ? true : z;
        interfaceC88472Yns = (i & 64) != 0 ? null : interfaceC88472Yns;
        z2 = (i & 128) != 0 ? false : z2;
        z3 = (i & 256) != 0 ? false : z3;
        interfaceC88472Yns2 = (i & 512) != 0 ? null : interfaceC88472Yns2;
        str = (i & 2048) != 0 ? null : str;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(onViewAdded, "onViewAdded");
        this.LIZ = interfaceC53515KzP;
        this.LIZIZ = c53455KyR;
        this.LIZJ = c53455KyR2;
        this.LIZLLL = z;
        this.LJ = view;
        this.LJFF = onViewAdded;
        this.LJI = interfaceC88472Yns;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = interfaceC88472Yns2;
        this.LJIIJ = null;
        this.LJIIJJI = str;
    }
}
