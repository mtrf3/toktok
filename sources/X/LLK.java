package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LLK implements InterfaceC53896LDg {
    public final /* synthetic */ ViewOnClickListenerC54142LMs LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public LLK(ViewOnClickListenerC54142LMs viewOnClickListenerC54142LMs) {
        this.LJLIL = viewOnClickListenerC54142LMs;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("topHoxVisibleObserver onNodeHide fromTabName = ");
        b0.LJFF(LIZ, this.LJLIL.LJLLI, LIZ, "BottomNotificationObserver");
        TabChangeManager LIZ2 = C116694i1.LIZ(C45804HyK.LJJIFFI(this.LJLIL.LJLIL));
        LIZ2.nv0();
        LIZ2.LJLJI = false;
        LIZ2.LJLJJL = null;
        C54072LKa.LIZJ = "click_button_icon";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        ViewOnClickListenerC54142LMs viewOnClickListenerC54142LMs = this.LJLIL;
        viewOnClickListenerC54142LMs.LJLLI = ((BaseScrollSwitchStateManager) viewOnClickListenerC54142LMs.LJLJL.getValue()).LJLZ;
        if (!C53765L8f.LJIILIIL("NOTIFICATION")) {
            C54072LKa.LIZJ = "click_button_icon";
        } else if (!o.LJ(C54072LKa.LIZJ, "click_top_icon")) {
            C54072LKa.LIZJ = "slide";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("topHoxVisibleObserver onNodeShow fromTabName = ");
        LIZ.append(this.LJLIL.LJLLI);
        LIZ.append(", enterMethod = ");
        b0.LJFF(LIZ, C54072LKa.LIZJ, LIZ, "BottomNotificationObserver");
        ViewOnClickListenerC54142LMs viewOnClickListenerC54142LMs2 = this.LJLIL;
        viewOnClickListenerC54142LMs2.LIZ(viewOnClickListenerC54142LMs2.LJLLI);
        ViewOnClickListenerC54142LMs viewOnClickListenerC54142LMs3 = this.LJLIL;
        viewOnClickListenerC54142LMs3.LIZIZ(viewOnClickListenerC54142LMs3.LJLLI);
        C54072LKa.LIZLLL = false;
        TabChangeManager LIZ2 = C116694i1.LIZ(C45804HyK.LJJIFFI(this.LJLIL.LJLIL));
        LIZ2.LJLJJL = (String) this.LJLIL.LJLL.getValue();
        LIZ2.LJLJI = true;
    }
}
