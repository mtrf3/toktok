package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Rlj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70503Rlj implements InterfaceC70554RmY {
    public final PdpViewModel LIZ;
    public OSZ<Float, Float> LIZIZ;
    public OSZ<Float, Float> LIZJ;

    public C70503Rlj(PdpViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZ = viewModel;
        Float valueOf = Float.valueOf(-1.0f);
        this.LIZIZ = new OSZ<>(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(0.0f);
        this.LIZJ = new OSZ<>(valueOf2, valueOf2);
    }

    @Override // X.InterfaceC70554RmY
    public final void LIZ(MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null) {
            return;
        }
        if (valueOf.intValue() == 0) {
            this.LIZIZ = new OSZ<>(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            this.LIZJ = new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            this.LIZ.LLJJJJ = false;
            return;
        }
        if (valueOf.intValue() == 2) {
            LIZIZ(motionEvent);
            return;
        }
        if (valueOf.intValue() != 1) {
            return;
        }
        LIZIZ(motionEvent);
        float floatValue = this.LIZJ.getFirst().floatValue();
        int i = C27162AlK.LJIIJ;
        if (floatValue >= i || this.LIZJ.getSecond().floatValue() >= i) {
            return;
        }
        PdpViewModel pdpViewModel = this.LIZ;
        if (pdpViewModel.LLJJJJ) {
            return;
        }
        pdpViewModel.Sv0("click");
    }

    public final void LIZIZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        this.LIZJ = new OSZ<>(Float.valueOf(this.LIZJ.getFirst().floatValue() + Math.abs(event.getRawX() - this.LIZIZ.getFirst().floatValue())), Float.valueOf(this.LIZJ.getSecond().floatValue() + Math.abs(event.getRawY() - this.LIZIZ.getSecond().floatValue())));
    }
}
