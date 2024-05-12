package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WOq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82220WOq extends C83122Wjm {
    public final /* synthetic */ AqS164S0100000_14 LIZIZ;

    @Override // X.InterfaceC83144Wk8
    public final void onDismiss() {
        Lifecycle lifecycle = ((C82226WOw) this.LIZIZ.l0).getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            NavigationScene LJIL = C78897Uxp.LJIL((C82226WOw) this.LIZIZ.l0);
            o.LJI(LJIL);
            LJIL.onBackPressed();
            C82221WOr c82221WOr = ((C82226WOw) this.LIZIZ.l0).LJLJJI;
            if (c82221WOr != null) {
                c82221WOr.invoke(Boolean.FALSE);
            }
            C82226WOw c82226WOw = (C82226WOw) this.LIZIZ.l0;
            InterfaceC82353WTt interfaceC82353WTt = (InterfaceC82353WTt) c82226WOw.LJLJI.LIZ(c82226WOw, C82226WOw.LJLLJ[2]);
            if (interfaceC82353WTt != null) {
                WTL.LIZ(interfaceC82353WTt, false);
            }
        }
    }

    @Override // X.InterfaceC83144Wk8
    public final void onShow() {
        C82226WOw c82226WOw = (C82226WOw) this.LIZIZ.l0;
        C78928UyK.LIZIZ(false, false, false, (InterfaceC82086WJm) c82226WOw.LJLILLLLZI.LIZ(c82226WOw, C82226WOw.LJLLJ[1]));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82220WOq(AqS164S0100000_14 aqS164S0100000_14, I37 i37) {
        super(i37);
        this.LIZIZ = aqS164S0100000_14;
    }
}
