package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.akj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94669akj extends AbstractC94471ahX<InterfaceC94376ag0> {
    public final C94220adU LIZJ;
    public final String LIZLLL = "";
    public final int LJ = 0;
    public boolean LJFF = false;
    public boolean LJI = false;
    public final boolean LJII = false;
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

    public C94669akj(C94220adU c94220adU, boolean z) {
        this.LIZJ = c94220adU;
        this.LJIIIIZZ = z;
    }
}
