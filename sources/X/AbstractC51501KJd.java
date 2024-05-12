package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: X.KJd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51501KJd extends AbstractC51502KJe<Fragment> {
    public final FragmentManager LJLJJI;
    public C1B3 LJLJJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup viewGroup) {
    }

    public AbstractC51501KJd(FragmentManager fragmentManager) {
        this.LJLJJI = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        C1B3 c1b3 = this.LJLJJL;
        if (c1b3 == null) {
            return;
        }
        c1b3.LJI();
        this.LJLJJL = null;
        this.LJLJJI.LJJIL();
    }

    public static String LJJIIZ(int i, long j) {
        return "android:switcher:" + i + ':' + j;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJIILLIIL(int i, ViewGroup viewGroup) {
        if (this.LJLJJL == null) {
            FragmentManager fragmentManager = this.LJLJJI;
            this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        String LJJIIZ = LJJIIZ(viewGroup.getId(), i);
        Fragment LJJJIL = this.LJLJJI.LJJJIL(LJJIIZ);
        if (LJJJIL == null) {
            LJJJIL = (Fragment) LJJIII(i, viewGroup);
            if (LJJJIL instanceof InterfaceC51505KJh) {
                this.LJLILLLLZI.put(i, LJJJIL);
            } else {
                this.LJLJJL.LJIIIIZZ(viewGroup.getId(), 1, LJJJIL, LJJIIZ);
            }
        } else {
            this.LJLJJL.LJFF(LJJJIL);
        }
        if (this.LJLJI != LJJJIL) {
            LJJJIL.setUserVisibleHint(false);
            LJJJIL.setMenuVisibility(false);
        }
        return LJJJIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    public final Fragment LJJIIJZLJL(int i, ViewGroup viewGroup) {
        Fragment fragment = (Fragment) this.LJLILLLLZI.get(i);
        if (fragment != null) {
            String LJJIIZ = LJJIIZ(viewGroup.getId(), i);
            if (this.LJLJJI.LJJJIL(LJJIIZ) == null) {
                if (this.LJLJJL == null) {
                    FragmentManager fragmentManager = this.LJLJJI;
                    this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
                }
                this.LJLJJL.LJIIIIZZ(viewGroup.getId(), 1, fragment, LJJIIZ);
                this.LJLILLLLZI.remove(i);
            }
            return fragment;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        if (this.LJLJJL == null) {
            FragmentManager fragmentManager = this.LJLJJI;
            this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        if (this.LJLJJI.LJJJIL(LJJIIZ(viewGroup.getId(), i)) != null) {
            this.LJLILLLLZI.remove(i);
        } else {
            this.LJLJJL.LJIIZILJ((Fragment) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        if (LJJIIJ(i)) {
            LJJIIJZLJL(i, viewGroup);
            LJIIJJI(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LJLJI;
        if (fragment == fragment2) {
            return;
        }
        if (fragment2 != null) {
            fragment2.setUserVisibleHint(false);
            this.LJLJI.setMenuVisibility(false);
        }
        if (fragment != null) {
            fragment.setUserVisibleHint(true);
            fragment.setMenuVisibility(true);
        }
        this.LJLJI = fragment;
    }
}
