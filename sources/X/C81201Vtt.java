package X;

import android.view.View;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Vtt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81201Vtt implements InterfaceC80728VmG {
    public final /* synthetic */ C81202Vtu LIZ;

    @Override // X.InterfaceC80728VmG
    public final void LIZ() {
    }

    public C81201Vtt(C81202Vtu c81202Vtu) {
        this.LIZ = c81202Vtu;
    }

    @Override // X.InterfaceC80728VmG
    public final void onDrawerClosed(View drawerView) {
        o.LJIIIZ(drawerView, "drawerView");
        C81202Vtu c81202Vtu = this.LIZ;
        if (!c81202Vtu.LJZ) {
            c81202Vtu.LJZ = !c81202Vtu.LJZI;
        }
        c81202Vtu.LJLLJ = 0.0f;
        c81202Vtu.LJIJI();
        C81202Vtu c81202Vtu2 = this.LIZ;
        C81203Vtv c81203Vtv = c81202Vtu2.LJLJL.get(c81202Vtu2.LJLJJL);
        if (c81203Vtv != null) {
            c81203Vtv.LIZ.Og();
        }
        Iterator<InterfaceC81205Vtx> it = this.LIZ.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().o();
        }
        if (this.LIZ.LJLJJLL.length() > 0) {
            C81202Vtu c81202Vtu3 = this.LIZ;
            c81202Vtu3.LJIIZILJ(c81202Vtu3.LJLJJLL);
        }
    }

    @Override // X.InterfaceC80728VmG
    public final void onDrawerOpened(View drawerView) {
        o.LJIIIZ(drawerView, "drawerView");
        C81202Vtu c81202Vtu = this.LIZ;
        c81202Vtu.LJZ = false;
        c81202Vtu.LJZI = false;
        c81202Vtu.LJLLJ = 1.0f;
        DrawerLayout drawerLayout = c81202Vtu.LJLL;
        if (drawerLayout != null) {
            drawerLayout.setSplitDragType(2);
        }
        C81202Vtu c81202Vtu2 = this.LIZ;
        C81203Vtv c81203Vtv = c81202Vtu2.LJLJL.get(c81202Vtu2.LJLJJL);
        if (c81203Vtv != null) {
            c81203Vtv.LIZ.Of();
        }
        C81202Vtu c81202Vtu3 = this.LIZ;
        Iterator<InterfaceC81205Vtx> it = c81202Vtu3.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().za(c81202Vtu3.LJIILLIIL());
        }
    }

    @Override // X.InterfaceC80728VmG
    public final void onDrawerSlide(View drawerView, float f) {
        o.LJIIIZ(drawerView, "drawerView");
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        C81202Vtu c81202Vtu = this.LIZ;
        if (c81202Vtu.LJLLJ == 0.0f) {
            Iterator<InterfaceC81205Vtx> it = c81202Vtu.LJLJLJ.iterator();
            while (it.hasNext()) {
                InterfaceC81205Vtx next = it.next();
                c81202Vtu.LJIILLIIL();
                next.G6();
            }
        }
        C81202Vtu c81202Vtu2 = this.LIZ;
        c81202Vtu2.LJLLJ = f;
        c81202Vtu2.LJIILL(f);
        C81202Vtu c81202Vtu3 = this.LIZ;
        Iterator<InterfaceC81205Vtx> it2 = c81202Vtu3.LJLJLJ.iterator();
        while (it2.hasNext()) {
            it2.next().jk(f, c81202Vtu3.LJIILLIIL());
        }
    }
}
