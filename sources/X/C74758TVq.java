package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.TVq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C74758TVq extends C74978Tbi {
    public final /* synthetic */ C75492Tk0 LJLIL;

    public C74758TVq(C75492Tk0 c75492Tk0) {
        this.LJLIL = c75492Tk0;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        try {
            MultiGuestDataHolder LIZ = TRK.LIZ();
            C29556Biq.LIZ().getClass();
            o.LJIIIZ(layout, "layout");
            LIZ.LJIILLIIL(C74983Tbn.LIZ(C74983Tbn.LJI(layout)));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLayoutSwitch, new layoutBusinessType = ");
            LIZ2.append(layout.getLayoutBusinessType());
            C74987Tbr.LIZ("LinkControlPresenter", X1D.LIZIZ(LIZ2));
        } catch (Throwable th) {
            this.LJLIL.logThrowable(th);
        }
    }
}
