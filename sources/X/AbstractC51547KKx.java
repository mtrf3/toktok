package X;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.KKx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51547KKx extends PagerAdapter {
    public final FragmentManager LJLILLLLZI;
    public C1B3 LJLJI;
    public Fragment LJLJJI;
    public final SparseArray<String> LJLJJL = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup container) {
        o.LJIIIZ(container, "container");
    }

    public abstract Fragment LJJIII(int i);

    public long LJJIIJ(int i) {
        return i;
    }

    public AbstractC51547KKx(FragmentManager fragmentManager) {
        this.LJLILLLLZI = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup container) {
        o.LJIIIZ(container, "container");
        C1B3 c1b3 = this.LJLJI;
        if (c1b3 != null) {
            try {
                c1b3.LJI();
                this.LJLJI = null;
                this.LJLILLLLZI.LJJIL();
            } catch (IllegalStateException e) {
                C36922EeM.LIZLLL(6, "FragmentPagerAdapter", "finishUpdate ->" + e);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        if (this.LJLJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        LJJIIJ(i);
        String LJJIIJZLJL = LJJIIJZLJL(container.getId(), i);
        Fragment LJJJIL = this.LJLILLLLZI.LJJJIL(LJJIIJZLJL);
        if (LJJJIL != null) {
            C1B3 c1b3 = this.LJLJI;
            o.LJI(c1b3);
            c1b3.LJFF(LJJJIL);
        } else {
            LJJJIL = LJJIII(i);
            if (LJJJIL == this.LJLJJI) {
                C1B3 c1b32 = this.LJLJI;
                o.LJI(c1b32);
                int id = container.getId();
                o.LJI(LJJJIL);
                c1b32.LJIIIIZZ(id, 1, LJJJIL, LJJIIJZLJL);
                this.LJLJJL.put(i, LJJIIJZLJL);
            }
        }
        if (LJJJIL != this.LJLJJI) {
            o.LJI(LJJJIL);
            LJJJIL.setMenuVisibility(false);
            LJJJIL.setUserVisibleHint(false);
        }
        o.LJI(LJJJIL);
        return LJJJIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        if (((Fragment) object).getView() == view) {
            return true;
        }
        return false;
    }

    public final String LJJIIJZLJL(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("android:switcher:");
        LIZ.append(i);
        LIZ.append(':');
        LIZ.append(String.valueOf(LJJIIJ(i2)));
        return X1D.LIZIZ(LIZ);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (this.LJLJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        C1B3 c1b3 = this.LJLJI;
        o.LJI(c1b3);
        c1b3.LJIIZILJ((Fragment) object);
        this.LJLJJL.remove(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIL(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        Fragment fragment = (Fragment) object;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPrimaryItem i=");
        LIZ.append(this.LJLJJI);
        LIZ.append(" f=");
        LIZ.append(fragment);
        C60392Yp.LIZIZ("LFeedPanel", X1D.LIZIZ(LIZ));
        if (fragment != this.LJLJJI) {
            boolean isEmpty = TextUtils.isEmpty(fragment.getTag());
            boolean z = !TextUtils.equals(fragment.getTag(), this.LJLJJL.get(i, ""));
            if (isEmpty || z) {
                String LJJIIJZLJL = LJJIIJZLJL(container.getId(), i);
                if (this.LJLJI == null) {
                    FragmentManager fragmentManager = this.LJLILLLLZI;
                    this.LJLJI = C1B6.LIZ(fragmentManager, fragmentManager);
                }
                Fragment LJJJIL = this.LJLILLLLZI.LJJJIL(LJJIIJZLJL);
                if (LJJJIL != null) {
                    C1B3 c1b3 = this.LJLJI;
                    o.LJI(c1b3);
                    o.LJI(LJJJIL);
                    c1b3.LJIIL(LJJJIL);
                } else {
                    C1B3 c1b32 = this.LJLJI;
                    o.LJI(c1b32);
                    c1b32.LJIIIIZZ(container.getId(), 1, fragment, LJJIIJZLJL);
                }
                this.LJLJJL.put(i, LJJIIJZLJL);
            }
            Fragment fragment2 = this.LJLJJI;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                Fragment fragment3 = this.LJLJJI;
                o.LJI(fragment3);
                fragment3.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.LJLJJI = fragment;
        }
    }
}
