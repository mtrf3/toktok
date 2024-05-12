package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes6.dex */
public abstract class BKM extends PagerAdapter {
    public final FragmentManager LJLILLLLZI;
    public C1B3 LJLJI;
    public Fragment LJLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        return null;
    }

    public BKM(FragmentManager fragmentManager) {
        this.LJLILLLLZI = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        C1B3 c1b3 = this.LJLJI;
        if (c1b3 != null) {
            try {
                try {
                    c1b3.LJII();
                    this.LJLILLLLZI.LJJIL();
                } catch (IllegalStateException e) {
                    C16880lQ.LLLLIIL(e);
                } catch (NullPointerException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            } finally {
                this.LJLJI = null;
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewPager with adapter ");
        LIZ.append(this);
        LIZ.append(" requires a view id");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LJLJJI;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.LJLJJI.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.LJLJJI = fragment;
        }
    }
}
