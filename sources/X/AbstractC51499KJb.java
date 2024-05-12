package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.KJb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51499KJb extends AbstractC51502KJe<Fragment> {
    public final FragmentManager LJLJJI;
    public C1B3 LJLJJL;
    public final boolean LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup container) {
        o.LJIIIZ(container, "container");
    }

    public AbstractC51499KJb(FragmentManager fragmentManager) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        this.LJLJJI = fragmentManager;
        this.LJLJJLL = true;
    }

    public static final void LJJIJ(String str) {
        C36922EeM.LIZLLL(4, "TikTokSearch", str);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup container) {
        o.LJIIIZ(container, "container");
        C1B3 c1b3 = this.LJLJJL;
        if (c1b3 != null) {
            c1b3.LJI();
            this.LJLJJL = null;
            this.LJLJJI.LJJIL();
        }
    }

    @Override // X.AbstractC51502KJe
    public final boolean LJJIIJ(int i) {
        if (this.LJLJJLL && super.LJJIIJ(i)) {
            return true;
        }
        return false;
    }

    public static final String LJJIIZI(int i, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewPager:Fragment:");
        LIZ.append(i);
        LIZ.append(':');
        LIZ.append(j);
        return X1D.LIZIZ(LIZ);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJIILLIIL(int i, ViewGroup container) {
        Boolean bool;
        o.LJIIIZ(container, "container");
        if (this.LJLJJL == null) {
            FragmentManager fragmentManager = this.LJLJJI;
            this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        String LJJIIZI = LJJIIZI(container.getId(), i);
        Fragment LJJJIL = this.LJLJJI.LJJJIL(LJJIIZI);
        String LJFF = C50605JtZ.LJFF(i);
        StringBuilder LIZ = C06830Op.LIZ("PagerAdapter instantiate check, pos: ", i, " (", LJFF, "), added: ");
        Boolean bool2 = null;
        if (LJJJIL != null) {
            bool = Boolean.valueOf(LJJJIL.isAdded());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LJJIJ(X1D.LIZIZ(LIZ));
        if (LJJJIL != null) {
            if (LJJIIZ(LJJJIL, LJJIIZI)) {
                LJJIJ("PagerAdapter attaching");
                C1B3 c1b3 = this.LJLJJL;
                o.LJI(c1b3);
                c1b3.LJFF(LJJJIL);
            } else {
                LJJIJ("PagerAdapter attached, ignoring");
            }
        } else {
            LJJJIL = (Fragment) LJJIII(i, container);
            StringBuilder LIZ2 = C06830Op.LIZ("PagerAdapter create, pos: ", i, " (", LJFF, "), added: ");
            if (LJJJIL != null) {
                bool2 = Boolean.valueOf(LJJJIL.isAdded());
            }
            LIZ2.append(bool2);
            LJJIJ(X1D.LIZIZ(LIZ2));
            if (this.LJLJJLL && (LJJJIL instanceof InterfaceC51505KJh)) {
                LJJIJ("PagerAdapter storing");
                this.LJLILLLLZI.put(i, LJJJIL);
            } else {
                LJJIJ("PagerAdapter adding");
                if (LJJIIZ(LJJJIL, LJJIIZI)) {
                    C1B3 c1b32 = this.LJLJJL;
                    o.LJI(c1b32);
                    c1b32.LJIIIIZZ(container.getId(), 1, LJJJIL, LJJIIZI);
                } else {
                    LJJIJ("PagerAdapter added, ignoring");
                }
            }
        }
        if (LJJJIL != this.LJLJI) {
            o.LJI(LJJJIL);
            LJJJIL.setMenuVisibility(false);
            LJJJIL.setUserVisibleHint(false);
        }
        o.LJI(LJJJIL);
        return LJJJIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object fragment) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        if (view == ((Fragment) fragment).getView()) {
            return true;
        }
        return false;
    }

    public final Fragment LJJIIJZLJL(int i, ViewGroup container) {
        Fragment fragment;
        o.LJIIIZ(container, "container");
        if (!this.LJLJJLL || (fragment = (Fragment) this.LJLILLLLZI.get(i)) == null) {
            return null;
        }
        String LJJIIZI = LJJIIZI(container.getId(), i);
        if (this.LJLJJI.LJJJIL(LJJIIZI) == null) {
            if (this.LJLJJL == null) {
                FragmentManager fragmentManager = this.LJLJJI;
                this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
            }
            C1B3 c1b3 = this.LJLJJL;
            o.LJI(c1b3);
            c1b3.LJIIIIZZ(container.getId(), 1, fragment, LJJIIZI);
            this.LJLILLLLZI.remove(i);
        }
        return fragment;
    }

    public final boolean LJJIIZ(Fragment fragment, String str) {
        if (fragment.isAdded()) {
            LJJIJ("PagerAdapter added, ignoring");
            return false;
        }
        if (this.LJLJJI.LJJJIL(str) != null) {
            LJJIJ("PagerAdapter manager already found the fragment ");
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        if (this.LJLJJL == null) {
            FragmentManager fragmentManager = this.LJLJJI;
            this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        String LJJIIZI = LJJIIZI(container.getId(), i);
        StringBuilder LJ = C7MY.LJ("PagerAdapter destroyItem, pos: ", i, " (");
        LJ.append(C50605JtZ.LJFF(i));
        LJ.append(')');
        LJJIJ(X1D.LIZIZ(LJ));
        if (!this.LJLJJLL || this.LJLJJI.LJJJIL(LJJIIZI) == null) {
            C1B3 c1b3 = this.LJLJJL;
            o.LJI(c1b3);
            c1b3.LJIIZILJ((Fragment) object);
            return;
        }
        this.LJLILLLLZI.remove(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIL(int i, ViewGroup container, Object fragment) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(fragment, "fragment");
        if (LJJIIJ(i)) {
            LJJIIJZLJL(i, container);
            LJIIJJI(container);
        }
        Fragment fragment2 = (Fragment) fragment;
        Fragment fragment3 = this.LJLJI;
        if (fragment2 != fragment3) {
            if (fragment3 != null) {
                fragment3.setMenuVisibility(false);
                this.LJLJI.setUserVisibleHint(false);
            }
            fragment2.setMenuVisibility(true);
            fragment2.setUserVisibleHint(true);
            this.LJLJI = fragment2;
        }
    }
}
