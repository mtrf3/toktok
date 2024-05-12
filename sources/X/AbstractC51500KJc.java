package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.KJc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51500KJc extends AbstractC51502KJe<Fragment> {
    public final FragmentManager LJLJJI;
    public C1B3 LJLJJL;
    public final boolean LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIFFI(ViewGroup container) {
        o.LJIIIZ(container, "container");
    }

    public AbstractC51500KJc(FragmentManager fragmentManager) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        this.LJLJJI = fragmentManager;
        this.LJLJJLL = true;
    }

    public static final void LJJIIZI(String str) {
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

    public static final String LJJIIZ(int i, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewPager:Fragment:");
        LIZ.append(i);
        LIZ.append(':');
        LIZ.append(j);
        return X1D.LIZIZ(LIZ);
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

    public final boolean LJJIIJZLJL(Fragment fragment, String str) {
        if (fragment.isAdded()) {
            LJJIIZI("PagerAdapter added, ignoring");
            return false;
        }
        if (this.LJLJJI.LJJJIL(str) != null) {
            LJJIIZI("PagerAdapter manager already found the fragment ");
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
        String LJJIIZ = LJJIIZ(container.getId(), i);
        StringBuilder LJ = C7MY.LJ("PagerAdapter destroyItem, pos: ", i, " (");
        LJ.append(C51214K8c.LJ(i));
        LJ.append(')');
        LJJIIZI(X1D.LIZIZ(LJ));
        if (!this.LJLJJLL || this.LJLJJI.LJJJIL(LJJIIZ) == null) {
            C1B3 c1b3 = this.LJLJJL;
            if (c1b3 != null) {
                c1b3.LJIIZILJ((Fragment) object);
                return;
            }
            return;
        }
        this.LJLILLLLZI.remove(i);
    }
}
