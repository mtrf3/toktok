package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.akk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94670akk extends AbstractC94471ahX<InterfaceC94376ag0> {
    public final C94220adU LIZJ;
    public String LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;

    @Override // X.AbstractC94471ahX
    public final List<C94291aed> LJII() {
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC93710aVG> it = this.LIZJ.LJLJLJ.iterator();
        while (it.hasNext()) {
            arrayList.add(new C94291aed(it.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC93998aZu
    public final String getId() {
        return String.valueOf(this.LIZJ.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i;
        C94220adU c94220adU = this.LIZJ;
        int i2 = 0;
        if (c94220adU != null) {
            i = c94220adU.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.LIZLLL;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i4 = (((i3 + i2) * 31) + this.LJ) * 31;
        boolean z = this.LJFF;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.LJI;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z3 = this.LJII;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        if (!this.LJIIIIZZ) {
            i5 = 0;
        }
        return i11 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LayerItemSubData(layerFeature=");
        LIZ.append(this.LIZJ);
        LIZ.append(", pId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", itemType=");
        LIZ.append(this.LJ);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJFF);
        LIZ.append(", showMoreTips=");
        LIZ.append(this.LJI);
        LIZ.append(", isTemp=");
        LIZ.append(this.LJII);
        LIZ.append(", isCompatible=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC93998aZu
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC94009aa5
    public final int LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC94471ahX
    public final C94220adU LJFF() {
        return this.LIZJ;
    }

    @Override // X.AbstractC94471ahX
    public final String LJI() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC94471ahX
    public final boolean LJIIIIZZ() {
        return this.LJI;
    }

    @Override // X.AbstractC94471ahX
    public final boolean LJIIIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC94471ahX
    public final boolean LJIIJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC94471ahX
    public final boolean LJIIJJI() {
        return this.LJII;
    }

    @Override // X.AbstractC94471ahX
    public final void LJIIL(boolean z) {
        this.LJFF = z;
    }

    @Override // X.AbstractC94471ahX
    public final void LJIILIIL(boolean z) {
        this.LJI = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C94670akk) {
                C94670akk c94670akk = (C94670akk) obj;
                if (o.LJ(this.LIZJ, c94670akk.LIZJ) && o.LJ(this.LIZLLL, c94670akk.LIZLLL) && this.LJ == c94670akk.LJ && this.LJFF == c94670akk.LJFF && this.LJI == c94670akk.LJI && this.LJII == c94670akk.LJII && this.LJIIIIZZ == c94670akk.LJIIIIZZ) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public C94670akk(C94220adU c94220adU, String pId, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(pId, "pId");
        this.LIZJ = c94220adU;
        this.LIZLLL = pId;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
    }
}
