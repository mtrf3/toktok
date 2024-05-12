package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOE implements InterfaceC54179LOd {
    public final /* synthetic */ MainTabStrip LJLIL;

    @Override // X.InterfaceC54179LOd
    public final void LIZ() {
    }

    public LOE(MainTabStrip mainTabStrip) {
        this.LJLIL = mainTabStrip;
    }

    @Override // X.InterfaceC54179LOd
    public final void LIZIZ(LOP tab) {
        o.LJIIIZ(tab, "tab");
        MainTabStrip mainTabStrip = this.LJLIL;
        if (mainTabStrip.LJLLJ == null) {
            mainTabStrip.LJLLJ = tab;
        }
    }

    @Override // X.InterfaceC54179LOd
    public final void LIZJ(LOP lop) {
        this.LJLIL.LJLLJ = lop;
    }
}
