package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.G2s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40882G2s implements JJ4 {
    public final /* synthetic */ SwipeUpVideoComponent LIZ;

    public C40882G2s(SwipeUpVideoComponent swipeUpVideoComponent) {
        this.LIZ = swipeUpVideoComponent;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        this.LIZ.Dl("click");
        TuxTextView tuxTextView = this.LIZ.LJLLILLLL;
        if (tuxTextView != null) {
            C12460eI.LJIILJJIL(tuxTextView, "c3690", "d9848", null, null);
            SwipeUpVideoComponent swipeUpVideoComponent = this.LIZ;
            swipeUpVideoComponent.getClass();
            C63078OpG.LIZ();
            swipeUpVideoComponent.vl(null);
            return;
        }
        o.LJIJI("startWatchingView");
        throw null;
    }
}
