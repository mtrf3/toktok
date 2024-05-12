package X;

import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class IZP implements IZT {
    public final List<IZT> LJLIL = new CopyOnWriteArrayList();

    @Override // X.IZT
    public final /* synthetic */ int getOrder() {
        return 0;
    }

    @Override // X.IZT
    public final void LJIIIIZZ() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIIIIZZ();
        }
    }

    @Override // X.IZT
    public final void LJIIIZ() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIIIZ();
        }
    }

    @Override // X.IZT
    public final void LJIIJ() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIIJ();
        }
    }

    @Override // X.IZT
    public final void LJIIL() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIIL();
        }
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILIIL() {
        HashMap hashMap = new HashMap();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            java.util.Map<String, String> LJIILIIL = ((InterfaceC46820IZc) it.next()).LJIILIIL();
            if (LJIILIIL != null) {
                hashMap.putAll(LJIILIIL);
            }
        }
        return hashMap;
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILJJIL() {
        HashMap hashMap = new HashMap();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            java.util.Map<String, String> LJIILJJIL = ((InterfaceC46820IZc) it.next()).LJIILJJIL();
            if (LJIILJJIL != null) {
                hashMap.putAll(LJIILJJIL);
            }
        }
        return hashMap;
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILL() {
        HashMap hashMap = new HashMap();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            java.util.Map<String, String> LJIILL = ((InterfaceC46820IZc) it.next()).LJIILL();
            if (LJIILL != null) {
                hashMap.putAll(LJIILL);
            }
        }
        return hashMap;
    }

    @Override // X.IZT
    public final void LJIILLIIL() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIILLIIL();
        }
    }

    @Override // X.IZT
    public final void LJIJ() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIJ();
        }
    }

    @Override // X.IZT
    public final void LJIJI() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIJI();
        }
    }

    @Override // X.IZT
    public final void LJIJJ() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIJJ();
        }
    }

    @Override // X.IZT
    public final void LJIJJLI() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIJJLI();
        }
    }

    @Override // X.IZT
    public final void LJJI() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJI();
        }
    }

    @Override // X.IZT
    public final void LJJIFFI() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJIFFI();
        }
    }

    @Override // X.IZT
    public final void LJJII() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJII();
        }
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJJIIJ() {
        HashMap hashMap = new HashMap();
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            java.util.Map<String, String> LJJIIJ = ((InterfaceC46820IZc) it.next()).LJJIIJ();
            if (LJJIIJ != null) {
                hashMap.putAll(LJJIIJ);
            }
        }
        return hashMap;
    }

    @Override // X.IZT
    public final void LJJIIZI() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJIIZI();
        }
    }

    @Override // X.IZT
    public final void LJJIJ() {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJIJ();
        }
    }

    public final void LIZ(C46742IWc c46742IWc) {
        if (c46742IWc == null || ((CopyOnWriteArrayList) this.LJLIL).contains(c46742IWc)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LJLIL).add(c46742IWc);
    }

    @Override // X.IZT
    public final void LJII(Surface surface) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJII(surface);
        }
    }

    @Override // X.IZT
    public final void LJIIJJI(Surface surface) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIIJJI(surface);
        }
    }

    @Override // X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIIZILJ(map);
        }
    }

    @Override // X.IZT
    public final void LJIL(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJIL(z);
        }
    }

    @Override // X.IZT
    public final void LJJIII(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJIII(z);
        }
    }

    @Override // X.IZT
    public final void LJJIIZ(java.util.Map<String, Object> map) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((IZT) it.next()).LJJIIZ(map);
        }
    }
}
