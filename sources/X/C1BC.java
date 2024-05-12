package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;

/* renamed from: X.1BC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1BC extends PagerAdapter {
    public final FragmentManager LJLILLLLZI;
    public final int LJLJI;
    public C1B3 LJLJJI;
    public Fragment LJLJJL;

    public C1BC() {
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable LJIJJ() {
        return null;
    }

    public abstract Fragment LJJIII(int i);

    public long LJJIIJ(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIJJI(ViewGroup viewGroup) {
        C1B3 c1b3 = this.LJLJJI;
        if (c1b3 != null) {
            try {
                c1b3.LJII();
            } catch (IllegalStateException unused) {
                this.LJLJJI.LJI();
            }
            this.LJLJJI = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIFFI(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewPager with adapter ");
        LIZ.append(this);
        LIZ.append(" requires a view id");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public C1BC(FragmentManager fragmentManager, int i) {
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJIILLIIL(int i, ViewGroup viewGroup) {
        if (this.LJLJJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        long LJJIIJ = LJJIIJ(i);
        Fragment LJJJIL = this.LJLILLLLZI.LJJJIL(C00F.LIZJ("android:switcher:", viewGroup.getId(), ":", LJJIIJ));
        if (LJJJIL != null) {
            this.LJLJJI.LJFF(LJJJIL);
        } else {
            LJJJIL = LJJIII(i);
            this.LJLJJI.LJIIIIZZ(viewGroup.getId(), 1, LJJJIL, C00F.LIZJ("android:switcher:", viewGroup.getId(), ":", LJJIIJ));
        }
        if (LJJJIL != this.LJLJJL) {
            LJJJIL.setMenuVisibility(false);
            if (this.LJLJI == 1) {
                this.LJLJJI.LJJIFFI(LJJJIL, Lifecycle.State.STARTED);
            } else {
                LJJJIL.setUserVisibleHint(false);
            }
        }
        return LJJJIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean LJIIZILJ(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.LJLJJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        this.LJLJJI.LJIIZILJ(fragment);
        if (fragment.equals(this.LJLJJL)) {
            this.LJLJJL = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIL(int i, ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LJLJJL;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.LJLJI == 1) {
                    if (this.LJLJJI == null) {
                        FragmentManager fragmentManager = this.LJLILLLLZI;
                        this.LJLJJI = C1B6.LIZ(fragmentManager, fragmentManager);
                    }
                    this.LJLJJI.LJJIFFI(this.LJLJJL, Lifecycle.State.STARTED);
                } else {
                    this.LJLJJL.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.LJLJI == 1) {
                if (this.LJLJJI == null) {
                    FragmentManager fragmentManager2 = this.LJLILLLLZI;
                    this.LJLJJI = C1B6.LIZ(fragmentManager2, fragmentManager2);
                }
                this.LJLJJI.LJJIFFI(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.LJLJJL = fragment;
        }
    }
}
