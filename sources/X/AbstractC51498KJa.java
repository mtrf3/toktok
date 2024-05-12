package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.KJa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51498KJa<T extends Fragment> extends AbstractC51500KJc {
    public final int LJLJL;
    public final HashMap<Integer, T> LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.LJLJLJ;
        if (hashMap != null) {
            hashMap.clear();
        }
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJL;
    }

    public AbstractC51498KJa(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.LJLJL = i;
        this.LJLJLJ = new LinkedHashMap();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        Boolean bool;
        o.LJIIIZ(container, "container");
        if (this.LJLJJL == null) {
            FragmentManager fragmentManager = this.LJLJJI;
            this.LJLJJL = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        String LJJIIZ = AbstractC51500KJc.LJJIIZ(container.getId(), i);
        Fragment LJJJIL = this.LJLJJI.LJJJIL(LJJIIZ);
        String LJ = C51214K8c.LJ(i);
        StringBuilder LIZ = C06830Op.LIZ("PagerAdapter instantiate check, pos: ", i, " (", LJ, "), added: ");
        if (LJJJIL != null) {
            bool = Boolean.valueOf(LJJJIL.isAdded());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        AbstractC51500KJc.LJJIIZI(X1D.LIZIZ(LIZ));
        if (LJJJIL != null) {
            if (LJJIIJZLJL(LJJJIL, LJJIIZ)) {
                AbstractC51500KJc.LJJIIZI("PagerAdapter attaching");
                C1B3 c1b3 = this.LJLJJL;
                if (c1b3 != null) {
                    c1b3.LJFF(LJJJIL);
                }
            } else {
                AbstractC51500KJc.LJJIIZI("PagerAdapter attached, ignoring");
            }
        } else {
            LJJJIL = (Fragment) LJJIII(i, container);
            StringBuilder LIZ2 = C06830Op.LIZ("PagerAdapter create, pos: ", i, " (", LJ, "), added: ");
            LIZ2.append(Boolean.valueOf(LJJJIL.isAdded()));
            AbstractC51500KJc.LJJIIZI(X1D.LIZIZ(LIZ2));
            if (this.LJLJJLL && (LJJJIL instanceof InterfaceC51505KJh)) {
                AbstractC51500KJc.LJJIIZI("PagerAdapter storing");
                this.LJLILLLLZI.put(i, LJJJIL);
            } else {
                AbstractC51500KJc.LJJIIZI("PagerAdapter adding");
                if (LJJIIJZLJL(LJJJIL, LJJIIZ)) {
                    C1B3 c1b32 = this.LJLJJL;
                    if (c1b32 != null) {
                        c1b32.LJIIIIZZ(container.getId(), 1, LJJJIL, LJJIIZ);
                    }
                } else {
                    AbstractC51500KJc.LJJIIZI("PagerAdapter added, ignoring");
                }
            }
        }
        if (LJJJIL != this.LJLJI) {
            LJJJIL.setMenuVisibility(false);
            LJJJIL.setUserVisibleHint(false);
        }
        this.LJLJLJ.put(Integer.valueOf(i), LJJJIL);
        return LJJJIL;
    }

    @Override // X.AbstractC51502KJe
    public final Object LJJIII(int i, ViewGroup viewGroup) {
        KJZ kjz = (KJZ) this;
        SearchVisibilityDetectFragmentNew LIZ = KEJ.LIZ(kjz.LJLLI, i, kjz.LJLL);
        LIZ.Dl(i);
        return LIZ;
    }
}
