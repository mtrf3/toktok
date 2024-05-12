package X;

import Y.ARunnableS41S0100000_5;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Cei, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31848Cei extends C39579Fg7 {
    public final /* synthetic */ C30988CEe LJLILLLLZI;
    public final /* synthetic */ InterfaceC31860Ceu LJLJI;

    @Override // X.C39579Fg7
    public final void LJIILLIIL(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        rootView.post(new ARunnableS41S0100000_5(rootView, 312));
        C31847Ceh.LJIIJJI(false, this.LJLILLLLZI, this.LJLJI);
    }

    public C31848Cei(C30988CEe c30988CEe, InterfaceC31860Ceu interfaceC31860Ceu) {
        this.LJLILLLLZI = c30988CEe;
        this.LJLJI = interfaceC31860Ceu;
    }

    @Override // X.C39579Fg7
    public final void LJIIZILJ(View rootView, String url) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(url, "url");
        super.LJIIZILJ(rootView, url);
        C30988CEe c30988CEe = this.LJLILLLLZI;
        c30988CEe.getClass();
        c30988CEe.LIZ = url;
        C31847Ceh.LJIIJJI(true, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.C39579Fg7
    public final void LJIJ(ConstraintLayout constraintLayout, String url) {
        o.LJIIIZ(url, "url");
        super.LJIJ(constraintLayout, url);
        C30988CEe c30988CEe = this.LJLILLLLZI;
        c30988CEe.getClass();
        c30988CEe.LIZ = url;
        C31847Ceh.LJIIJJI(true, this.LJLILLLLZI, this.LJLJI);
    }
}
