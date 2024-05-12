package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.1b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35911b1 extends AbstractC24810yD {
    public final int LIZ;
    public final boolean LIZIZ;
    public java.util.Set<java.util.Set<Object>> LIZJ;
    public final java.util.Set<C35931b3> LIZLLL = new LinkedHashSet();
    public final ParcelableSnapshotMutableState LJ = C78966Uyw.LJJJIL(C78880UxY.LJJLJLI());
    public final /* synthetic */ C35931b3 LJFF;

    @Override // X.AbstractC24810yD
    public final void LIZLLL() {
        C35931b3 c35931b3 = this.LJFF;
        c35931b3.LJJII--;
    }

    @Override // X.AbstractC24810yD
    public final InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> LJFF() {
        return (InterfaceC37431dT) this.LJ.getValue();
    }

    @Override // X.AbstractC24810yD
    public final MBA LJII() {
        return this.LJFF.LIZJ.LJII();
    }

    @Override // X.AbstractC24810yD
    public final void LJIILIIL() {
        this.LJFF.LJJII++;
    }

    public final void LJIILLIIL() {
        if (!this.LIZLLL.isEmpty()) {
            java.util.Set<java.util.Set<Object>> set = this.LIZJ;
            if (set != null) {
                for (C35931b3 c35931b3 : this.LIZLLL) {
                    Iterator it = ((HashSet) set).iterator();
                    while (it.hasNext()) {
                        ((java.util.Set) it.next()).remove(c35931b3.LIZLLL);
                    }
                }
            }
            this.LIZLLL.clear();
        }
    }

    @Override // X.AbstractC24810yD
    public final boolean LJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC24810yD
    public final int LJI() {
        return this.LIZ;
    }

    @Override // X.AbstractC24810yD
    public final void LIZ(InterfaceC35841au composition) {
        o.LJIIIZ(composition, "composition");
        this.LJFF.LIZJ.LIZ(composition);
    }

    @Override // X.AbstractC24810yD
    public final void LIZJ(C24380xW c24380xW) {
        this.LJFF.LIZJ.LIZJ(c24380xW);
    }

    @Override // X.AbstractC24810yD
    public final void LJIIIIZZ(InterfaceC35841au composition) {
        o.LJIIIZ(composition, "composition");
        C35931b3 c35931b3 = this.LJFF;
        c35931b3.LIZJ.LJIIIIZZ(c35931b3.LJII);
        this.LJFF.LIZJ.LJIIIIZZ(composition);
    }

    @Override // X.AbstractC24810yD
    public final C24340xS LJIIJ(C24380xW reference) {
        o.LJIIIZ(reference, "reference");
        return this.LJFF.LIZJ.LJIIJ(reference);
    }

    @Override // X.AbstractC24810yD
    public final void LJIIJJI(java.util.Set<Object> set) {
        java.util.Set set2 = this.LIZJ;
        if (set2 == null) {
            set2 = new HashSet();
            this.LIZJ = set2;
        }
        set2.add(set);
    }

    @Override // X.AbstractC24810yD
    public final void LJIIL(C35931b3 c35931b3) {
        this.LIZLLL.add(c35931b3);
    }

    @Override // X.AbstractC24810yD
    public final void LJIILJJIL(InterfaceC24520xk composer) {
        o.LJIIIZ(composer, "composer");
        java.util.Set<java.util.Set<Object>> set = this.LIZJ;
        if (set != null) {
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ((java.util.Set) it.next()).remove(((C35931b3) composer).LIZLLL);
            }
        }
        C65777Prh.LIZ(this.LIZLLL).remove(composer);
    }

    @Override // X.AbstractC24810yD
    public final void LJIILL(InterfaceC35841au composition) {
        o.LJIIIZ(composition, "composition");
        this.LJFF.LIZJ.LJIILL(composition);
    }

    @Override // X.AbstractC24810yD
    public final void LIZIZ(InterfaceC35841au composition, C40431iJ c40431iJ) {
        o.LJIIIZ(composition, "composition");
        this.LJFF.LIZJ.LIZIZ(composition, c40431iJ);
    }

    @Override // X.AbstractC24810yD
    public final void LJIIIZ(C24380xW reference, C24340xS c24340xS) {
        o.LJIIIZ(reference, "reference");
        this.LJFF.LIZJ.LJIIIZ(reference, c24340xS);
    }

    public C35911b1(C35931b3 c35931b3, int i, boolean z) {
        this.LJFF = c35931b3;
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
