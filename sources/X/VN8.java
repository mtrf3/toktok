package X;

import com.lynx.tasm.LynxPerfMetric;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS81S1100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VN8 extends AbstractC79603VLz {
    public final AbstractC79603VLz LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.AbstractC79603VLz
    public final void LIZ() {
        LJIILJJIL(new AqS164S0100000_14(this, 431));
    }

    @Override // X.AbstractC79603VLz
    public final void LIZJ() {
        LJIILJJIL(new AqS164S0100000_14(this, 432));
    }

    @Override // X.AbstractC79603VLz
    public final void LJ() {
        LJIILJJIL(new AqS164S0100000_14(this, 433));
    }

    @Override // X.AbstractC79603VLz
    public final void LJI() {
        LJIILJJIL(new AqS164S0100000_14(this, 434));
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIJ() {
        LJIILJJIL(new AqS164S0100000_14(this, 435));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VN8(AbstractC79603VLz invoker) {
        super(invoker.LJLIL.get());
        o.LJIIJ(invoker, "invoker");
        this.LJLILLLLZI = invoker;
        this.LJLJI = false;
    }

    @Override // X.AbstractC79603VLz
    public final void LIZIZ(java.util.Map<String, ? extends Object> map) {
        LJIILJJIL(new AqS161S0200000_14(this, map, 63));
    }

    @Override // X.AbstractC79603VLz
    public final void LIZLLL(C79601VLx lynxPerf) {
        o.LJIIJ(lynxPerf, "lynxPerf");
        LJIILJJIL(new AqS161S0200000_14(this, lynxPerf, 65));
    }

    @Override // X.AbstractC79603VLz
    public final void LJFF(java.util.Map<String, ? extends Object> map) {
        LJIILJJIL(new AqS161S0200000_14(this, map, 66));
    }

    @Override // X.AbstractC79603VLz
    public final void LJII(String str) {
        LJIILJJIL(new AqS81S1100000_14(this, str, 3));
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIIIZZ(VM0 data) {
        o.LJIIJ(data, "data");
        LJIILJJIL(new AqS161S0200000_14(this, data, 67));
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIIZ(VMD vmd) {
        LJIILJJIL(new AqS161S0200000_14(this, vmd, 68));
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIJJI(java.util.Map<String, Object> map) {
        LJIILJJIL(new AqS161S0200000_14(this, map, 69));
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIL(java.util.Map<String, Object> map) {
        LJIILJJIL(new AqS161S0200000_14(this, map, 70));
    }

    @Override // X.AbstractC79603VLz
    public final void LJIILIIL(LynxPerfMetric metric) {
        o.LJIIJ(metric, "metric");
        LJIILJJIL(new AqS161S0200000_14(this, metric, 71));
    }

    public final void LJIILJJIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z;
        if (VMS.monitor.isEnabled() && VMS.lynxMonitor.isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLIL.get() != null) {
            if (!VMB.LJLLLL.LIZ(this.LJLIL.get()).LJLJI.LIZIZ || !z) {
                return;
            }
        } else if (!z) {
            return;
        }
        if (this.LJLJI) {
            C38045EwT.LIZ(new AqS164S0100000_14(interfaceC65784Pro, 436));
            return;
        }
        try {
            interfaceC65784Pro.invoke();
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    @Override // X.AbstractC79603VLz
    public void onEventPost(VMM event) {
        o.LJIIJ(event, "event");
        LJIILJJIL(new AqS161S0200000_14(this, event, 64));
    }
}
