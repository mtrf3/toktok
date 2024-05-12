package X;

import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Nok, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60498Nok implements InterfaceC60503Nop {
    public final WeakReference<InterfaceC60493Nof> LIZ;
    public final Stack<C60318Nlq> LIZIZ = new Stack<>();
    public WeakReference<VNS> LIZJ;
    public HashMap<String, Object> LIZLLL;
    public final C60496Noi LJ;

    public final InterfaceC60493Nof LIZ() {
        WeakReference<InterfaceC60493Nof> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void LIZIZ(VNS vns) {
        VNS vns2;
        if (vns == null) {
            return;
        }
        OCV ocv = C60502Noo.LIZ;
        C60497Noj c60497Noj = new C60497Noj(this, vns);
        ocv.getClass();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (LynxUI lynxUI : ocv.LIZIZ.keySet()) {
            if (lynxUI.mContext.LJLJLLL.LJLIL == vns) {
                atomicInteger.incrementAndGet();
                lynxUI.execExitAnim(new C60500Nom(atomicInteger, c60497Noj));
            }
        }
        if (atomicInteger.get() == 0) {
            c60497Noj.LIZ();
        }
        if (!this.LIZIZ.isEmpty()) {
            VNS vns3 = this.LJ.get(this.LIZIZ.peek());
            if (vns3 != null) {
                if (vns3.getParent() == null) {
                    InterfaceC60493Nof LIZ = LIZ();
                    if (LIZ != null) {
                        LIZ.LIZ(vns3);
                        vns3.addLynxViewClient(new C60499Nol(vns3));
                        return;
                    }
                    return;
                }
                C60502Noo.LIZ.LIZIZ(vns3);
                vns3.onEnterForeground();
                return;
            }
            return;
        }
        WeakReference<VNS> weakReference = this.LIZJ;
        if (weakReference == null || (vns2 = weakReference.get()) == null) {
            return;
        }
        C60502Noo.LIZ.LIZIZ(vns2);
        vns2.onEnterForeground();
    }

    public C60498Nok(InterfaceC60493Nof interfaceC60493Nof, int i) {
        this.LIZ = new WeakReference<>(interfaceC60493Nof);
        this.LJ = new C60496Noi(i, this);
    }
}
