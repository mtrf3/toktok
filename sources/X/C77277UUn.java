package X;

import Y.ARunnableS32S0200000_13;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import kotlin.jvm.internal.o;

/* renamed from: X.UUn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77277UUn implements InterfaceC32361Cmz {
    public final C73893SzJ LIZ = new C73893SzJ();

    @Override // X.InterfaceC32361Cmz
    public final C73454SsE LIZ() {
        return this.LIZ.LJJJ(C73969T1h.LIZIZ());
    }

    @Override // X.InterfaceC32361Cmz
    public final void LIZIZ(Context context, C32362Cn0 c32362Cn0) {
        o.LJIIIZ(context, "context");
        if (C15380j0.LJIILLIIL()) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, c32362Cn0.LIZ());
            return;
        }
        C73943T0h.LIZ().LIZIZ(new B3N(1));
        this.LIZ.onNext("");
        C46529INx.LIZ.postDelayed(new ARunnableS32S0200000_13(context, c32362Cn0, 64), 500L);
    }
}
