package X;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VMC {
    public final VMB LIZ(VNS vns) {
        VNS LJIILJJIL;
        if (vns == null) {
            return VMB.LJLLJ;
        }
        WeakHashMap<View, VMB> weakHashMap = VMB.LJLLL;
        VMB vmb = weakHashMap.get(vns);
        if (vmb == null) {
            synchronized (this) {
                vmb = new VMB(vns);
                VM9 vm9 = vmb.LJLJJL;
                if (vm9 != null) {
                    vm9.LIZJ();
                }
                VM9 vm92 = new VM9(vmb);
                vmb.LJLJJL = vm92;
                vmb.LJLJJLL = new VN8(vm92);
                vmb.LJLJL = true;
                VNS vns2 = vmb.LJLIL.get();
                if (vns2 != null) {
                    vns2.addOnAttachStateChangeListener(vmb);
                }
                VM9 vm93 = vmb.LJLJJL;
                if (vm93 != null && (LJIILJJIL = vm93.LJIILJJIL()) != null) {
                    OFI.LJIIJJI(LJIILJJIL, new C79615VMl(vm93));
                }
                weakHashMap.put(vns, vmb);
            }
        }
        return vmb;
    }

    public final void LIZIZ(VNS vns, VMM event) {
        VN8 vn8;
        o.LJIIJ(event, "event");
        if (vns == null) {
            vn8 = VMB.LJLLJ.LJLJJLL;
        } else {
            vn8 = LIZ(vns).LJLJJLL;
        }
        if (vn8 != null) {
            vn8.onEventPost(event);
        } else {
            new Throwable();
        }
    }
}
