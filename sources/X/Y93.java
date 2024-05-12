package X;

import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y93 extends Y94 {
    @Override // X.Y94
    public final void LJ(boolean z, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.Y94
    public final void LJFF() {
    }

    @Override // X.Y94
    public final void LJI() {
    }

    @Override // X.Y94
    public final void LIZ() {
        Y91 y91;
        Fragment fragment;
        List<Fragment> LJJJJLI;
        FragmentManager fragmentManager = (FragmentManager) this.LIZ.LJLJLJ.getValue();
        if ((fragmentManager == null || (LJJJJLI = fragmentManager.LJJJJLI()) == null || LJJJJLI.isEmpty() || !this.LIZ.LJIIIIZZ()) && (fragment = (y91 = this.LIZ).LJLJI) != null) {
            y91.LJFF(fragment, "sub_page_default_guide");
        }
    }

    @Override // X.Y94
    public final void LIZIZ() {
        int width = this.LIZIZ.getWidth();
        int i = (int) (width * this.LJ);
        if (this.LIZIZ.LJIIL(8388613)) {
            LIZJ(width - i, i);
        } else {
            LIZJ(width, i);
        }
    }

    @Override // X.Y94
    public final void LJIIIIZZ() {
        this.LIZIZ.LJIILLIIL(8388613, true);
        this.LIZIZ.LJIJ(2, 8388613);
    }

    @Override // X.Y94
    public final void LJII(float f) {
        LIZLLL(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y93(Y91 bookModeContainer, DrawerLayout drawerLayout, ViewGroup viewGroup, ViewGroup viewGroup2, float f, Y9A hiddenChangedAction) {
        super(bookModeContainer, drawerLayout, viewGroup, viewGroup2, f, hiddenChangedAction);
        o.LJIIIZ(bookModeContainer, "bookModeContainer");
        o.LJIIIZ(hiddenChangedAction, "hiddenChangedAction");
    }
}
