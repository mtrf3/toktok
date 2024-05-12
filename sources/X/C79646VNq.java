package X;

import Y.ARunnableS50S0100000_14;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.JSProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.VNq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79646VNq extends VOO implements VNO {
    public final ArrayList<VOC> LJIILL;
    public final WeakReference<VNU> LJIILLIIL;
    public final WeakReference<JSProxy> LJIIZILJ;
    public boolean LJIJ;

    @Override // X.VOO
    public final void LJII() {
        if (!this.LJ) {
            LLog.LIZLLL(4, "Lynx.IntersectionObserver", "Lynx intersectionObserverHandler failed since rootView not draw");
        } else if (LJ() == null) {
            LLog.LIZLLL(4, "Lynx.IntersectionObserver", "Lynx intersectionObserverHandler failed since rootView is null");
        } else {
            C79411VEp.LJ(new ARunnableS50S0100000_14(this, 196));
        }
    }

    public final VNU LJIIIZ() {
        return this.LJIILLIIL.get();
    }

    public final VOC LJIIJ(int i) {
        Iterator<VOC> it = this.LJIILL.iterator();
        while (it.hasNext()) {
            VOC next = it.next();
            if (next.LIZ == i) {
                return next;
            }
        }
        return null;
    }

    public C79646VNq(VNU vnu, JSProxy jSProxy) {
        super("Lynx.IntersectionObserver");
        this.LJIILLIIL = new WeakReference<>(vnu);
        this.LIZ = new WeakReference<>(vnu.LJLJLLL);
        this.LJIIZILJ = new WeakReference<>(jSProxy);
        this.LJIILL = new ArrayList<>();
        this.LJIJ = false;
    }

    @Override // X.VNO
    public final void LIZ(VJ4 vj4, VNP vnp) {
        if (this.LJIILL.size() == 0) {
            return;
        }
        if (vj4 != VJ4.kLynxEventTypeLayoutEvent) {
            if (vj4 == VJ4.kLynxEventTypeCustomEvent) {
                String str = vnp.LIZIZ;
                if (!"scroll".equals(str) && !"scrolltoupper".equals(str) && !"scrolltolower".equals(str)) {
                    return;
                }
            } else {
                return;
            }
        }
        C79411VEp.LJ(new ARunnableS50S0100000_14(this, 196));
    }
}
