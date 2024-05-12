package X;

import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y92 extends Y94 {
    public Configuration LJI;

    @Override // X.Y94
    public final void LJIIIIZZ() {
        if (C53946LFe.LIZJ(null, null).LJFF) {
            this.LIZIZ.LJIILLIIL(8388613, false);
        } else {
            this.LIZIZ.LJIILLIIL(8388613, true);
        }
        this.LIZIZ.LJIJ(2, 8388613);
    }

    @Override // X.Y94
    public final void LIZ() {
        Y91 y91;
        Fragment fragment;
        List<Fragment> LJJJJLI;
        if (C53946LFe.LIZJ(this.LIZIZ.getContext(), this.LJI).LJFF) {
            FragmentManager fragmentManager = (FragmentManager) this.LIZ.LJLJLJ.getValue();
            if ((fragmentManager == null || (LJJJJLI = fragmentManager.LJJJJLI()) == null || LJJJJLI.isEmpty() || !this.LIZ.LJIIIIZZ()) && (fragment = (y91 = this.LIZ).LJLJI) != null) {
                y91.LJFF(fragment, "sub_page_default_guide");
            }
            Y91 y912 = this.LIZ;
            y912.LJLJJI.LJIILLIIL(8388613, false);
            y912.LJLJJI.LJIJ(2, 8388613);
            return;
        }
        if (!this.LIZ.LJIIIIZZ()) {
            return;
        }
        this.LIZ.LIZIZ();
    }

    @Override // X.Y94
    public final void LIZIZ() {
        if (C53946LFe.LIZJ(this.LIZIZ.getContext(), this.LJI).LJFF) {
            int width = this.LIZIZ.getWidth();
            int i = (int) (width * this.LJ);
            if (this.LIZIZ.LJIIL(8388613)) {
                LIZJ(width - i, i);
                return;
            } else {
                LIZJ(width, i);
                return;
            }
        }
        int width2 = this.LIZIZ.getWidth();
        if (this.LIZIZ.LJIIL(8388613)) {
            LIZJ(width2, width2);
        } else {
            LIZJ(width2, width2);
        }
    }

    @Override // X.Y94
    public final void LJFF() {
        if (C53946LFe.LIZJ(this.LIZIZ.getContext(), this.LJI).LJFF) {
            this.LJFF.LJIIIZ(true);
        } else {
            this.LJFF.LJ(false);
            this.LJFF.LJIIIZ(true);
        }
    }

    @Override // X.Y94
    public final void LJI() {
        if (C53946LFe.LIZJ(this.LIZIZ.getContext(), this.LJI).LJFF) {
            this.LJFF.LJIIIZ(false);
        } else {
            this.LJFF.LJ(true);
            this.LJFF.LJIIIZ(false);
        }
    }

    @Override // X.Y94
    public final void LJII(float f) {
        if (C53946LFe.LIZJ(this.LIZIZ.getContext(), this.LJI).LJFF) {
            LIZLLL(f);
        }
    }

    @Override // X.Y94
    public final void LJ(boolean z, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        this.LJI = newConfig;
        if (z) {
            this.LJFF.LJ(!C53946LFe.LIZJ(this.LIZIZ.getContext(), this.LJI).LJFF);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y92(Y91 bookModeContainer, DrawerLayout drawerLayout, ViewGroup viewGroup, ViewGroup viewGroup2, float f, Y9A hiddenChangedAction) {
        super(bookModeContainer, drawerLayout, viewGroup, viewGroup2, f, hiddenChangedAction);
        o.LJIIIZ(bookModeContainer, "bookModeContainer");
        o.LJIIIZ(hiddenChangedAction, "hiddenChangedAction");
    }
}
