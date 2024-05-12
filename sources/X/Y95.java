package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y95 implements InterfaceC80728VmG {
    public final /* synthetic */ Y91 LIZ;

    @Override // X.InterfaceC80728VmG
    public final void LIZ() {
    }

    public Y95(Y91 y91) {
        this.LIZ = y91;
    }

    @Override // X.InterfaceC80728VmG
    public final void onDrawerClosed(View drawerView) {
        o.LJIIIZ(drawerView, "drawerView");
        this.LIZ.LJLJLLL.LJFF();
    }

    @Override // X.InterfaceC80728VmG
    public final void onDrawerOpened(View drawerView) {
        o.LJIIIZ(drawerView, "drawerView");
        this.LIZ.LJLJLLL.LJI();
    }

    @Override // X.InterfaceC80728VmG
    public final void onDrawerSlide(View drawerView, float f) {
        o.LJIIIZ(drawerView, "drawerView");
        this.LIZ.LJLJLLL.LJII(f);
    }
}
