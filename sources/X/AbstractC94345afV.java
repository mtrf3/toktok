package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.afV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94345afV<T> implements InterfaceC93954aZC {
    public C94152acO LIZ;
    public final T LIZIZ = "";
    public final FragmentManager LIZJ;

    public abstract BottomDrawerFragment LJ(Bundle bundle);

    @Override // X.InterfaceC93954aZC
    public final boolean LIZIZ() {
        for (int LJJJJIZL = this.LIZJ.LJJJJIZL() - 1; LJJJJIZL >= 0; LJJJJIZL--) {
            C08Y LJJJJI = this.LIZJ.LJJJJI(LJJJJIZL);
            o.LJIIIIZZ(LJJJJI, "manager.getBackStackEntryAt(i)");
            if (o.LJ("effect_select", LJJJJI.getName())) {
                if (LJJJJIZL == 0) {
                    C94152acO c94152acO = this.LIZ;
                    if (c94152acO != null) {
                        c94152acO.dismiss();
                    }
                } else {
                    FragmentManager fragmentManager = this.LIZJ;
                    int id = LJJJJI.getId();
                    if (id >= 0) {
                        fragmentManager.LJJLIIIJLJLI(id, 1, null);
                    } else {
                        fragmentManager.getClass();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Bad id: ");
                        LIZ.append(id);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC93954aZC
    public final void LJI() {
        if (this.LIZJ.LJJJJIZL() > 0) {
            FragmentManager fragmentManager = this.LIZJ;
            C08Y LJJJJI = fragmentManager.LJJJJI(fragmentManager.LJJJJIZL() - 1);
            o.LJIIIIZZ(LJJJJI, "manager.getBackStackEntr….backStackEntryCount - 1)");
            InterfaceC36571c5 LJJJIL = this.LIZJ.LJJJIL(LJJJJI.getName());
            if ((LJJJIL instanceof InterfaceC93951aZ9) && ((InterfaceC93951aZ9) LJJJIL).LJI()) {
                return;
            }
        }
        if (this.LIZJ.LJJJJIZL() > 1) {
            this.LIZJ.LJJLIIIJJI();
            return;
        }
        C94152acO c94152acO = this.LIZ;
        if (c94152acO == null) {
            return;
        }
        c94152acO.dismiss();
    }

    @Override // X.InterfaceC93954aZC
    public final int getBackStackCount() {
        return this.LIZJ.LJJJJIZL();
    }

    public AbstractC94345afV(FragmentManager fragmentManager) {
        this.LIZJ = fragmentManager;
    }

    @Override // X.InterfaceC93954aZC
    public final void LIZLLL(C94152acO bottomDrawerViewPager) {
        o.LJIIIZ(bottomDrawerViewPager, "bottomDrawerViewPager");
        this.LIZ = bottomDrawerViewPager;
    }

    @Override // X.InterfaceC93954aZC
    public final void LIZ(Bundle bundle, ViewGroup container) {
        o.LJIIIZ(container, "container");
        String string = bundle.getString("page");
        if (this.LIZJ.LJJJIL(string) != null) {
            return;
        }
        FragmentManager fragmentManager = this.LIZJ;
        fragmentManager.getClass();
        C1B3 c1b3 = new C1B3(fragmentManager);
        BottomDrawerFragment LJ = LJ(bundle);
        if (LJ != null) {
            LJ.setArguments(bundle);
            c1b3.LJIIIIZZ(container.getId(), 1, LJ, string);
            c1b3.LJ(string);
        }
        c1b3.LJI();
    }

    @Override // X.InterfaceC93954aZC
    public final void LIZJ(Bundle bundle, ViewGroup container) {
        o.LJIIIZ(container, "container");
        String string = bundle.getString("page");
        if (this.LIZJ.LJJJIL(string) != null) {
            return;
        }
        FragmentManager fragmentManager = this.LIZJ;
        fragmentManager.getClass();
        C1B3 c1b3 = new C1B3(fragmentManager);
        BottomDrawerFragment LJ = LJ(bundle);
        if (LJ != null) {
            LJ.setArguments(bundle);
            c1b3.LJIIJJI(R.anim.i3, R.anim.i6, R.anim.i2, R.anim.i7);
            c1b3.LJIIJ(LJ, string, container.getId());
            c1b3.LJ(string);
        }
        c1b3.LJI();
    }
}
