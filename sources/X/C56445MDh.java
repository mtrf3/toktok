package X;

import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.o;

/* renamed from: X.MDh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56445MDh implements InterfaceC74055T4p {
    public final ViewPager LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C56445MDh(ViewPager viewPager) {
        o.LJIIIZ(viewPager, "viewPager");
        this.LIZ = viewPager;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
        this.LIZ.setCurrentItem(tab.LIZLLL);
    }
}
