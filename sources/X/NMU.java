package X;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class NMU implements GHC {
    public final /* synthetic */ FrameLayout LJLIL;
    public final /* synthetic */ C68322mC<Fragment> LJLILLLLZI;

    public NMU(FrameLayout frameLayout, C68322mC<Fragment> c68322mC) {
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NMS nms;
        if (i != 4 || this.LJLIL.getVisibility() != 0) {
            return false;
        }
        InterfaceC36571c5 interfaceC36571c5 = this.LJLILLLLZI.element;
        if ((interfaceC36571c5 instanceof NMS) && (nms = (NMS) interfaceC36571c5) != null) {
            nms.LJIIJ();
            return true;
        }
        return true;
    }
}
