package X;

import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;

/* renamed from: X.VxH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81411VxH implements LHW {
    public final /* synthetic */ C81449Vxt LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
    }

    public C81411VxH(C81449Vxt c81449Vxt) {
        this.LJLIL = c81449Vxt;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        if (c78856UxA != null) {
            ViewPager viewPager = this.LJLIL.LJLJJL;
            if (viewPager != null) {
                viewPager.setCurrentItem(c78856UxA.LJ);
            } else {
                o.LJIJI("mPager");
                throw null;
            }
        }
    }
}
