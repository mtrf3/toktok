package X;

import android.util.SparseArray;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.AdapterStateViewModel;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40311i7<T extends Fragment> extends FragmentStateAdapter {
    public final int LJLL;
    public C0CM LJLLI;
    public C29101Cg LJLLILLLL;
    public final AdapterStateViewModel LJLLJ;
    public final SparseArray<T> LJLLL;
    public long LJLLLL;
    public final HashMap<Integer, Long> LJLLLLLL;
    public final HashMap<Integer, T> LJLZ;

    public abstract T LLF(int i);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLL;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LJLZ(long j) {
        return this.LJLLLLLL.values().contains(Long.valueOf(j));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        C0CM c0cm = this.LJLLI;
        if (c0cm != null && i == c0cm.getCurrentItem()) {
            T t = this.LJLLL.get(i);
            if (t != null) {
                this.LJLLL.remove(i);
            } else {
                t = LLF(i);
            }
            this.LJLZ.put(Integer.valueOf(i), t);
            return t;
        }
        return new Fragment();
    }

    public final void LLFF(int i) {
        boolean z;
        long itemId = getItemId(i);
        this.LJLLLLLL.put(Integer.valueOf(i), Long.valueOf(this.LJLLLL));
        this.LJLLLL++;
        long itemId2 = getItemId(i);
        C0M5<Fragment> c0m5 = this.LJLJI;
        if (c0m5.LJLIL) {
            c0m5.LIZLLL();
        }
        if (C60903NvH.LJ(itemId2, c0m5.LJLJJI, c0m5.LJLILLLLZI) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !o.LJ(this.LJLJI.LJ(itemId2, null), this.LJLZ.get(Integer.valueOf(i)))) {
            T t = this.LJLLL.get(i);
            if (t != null) {
                this.LJLLL.remove(i);
            } else {
                t = LLF(i);
            }
            this.LJLJI.LJI(itemId2, t);
            this.LJLZ.put(Integer.valueOf(i), t);
        }
        notifyItemChanged(i, "TabsNotChanged");
        Fragment LJ = this.LJLJI.LJ(itemId, null);
        if (LJ != null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(LJ);
            c1b3.LJII();
        }
        this.LJLJI.LJII(itemId);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC029409q
    public final long getItemId(int i) {
        Long l = this.LJLLLLLL.get(Integer.valueOf(i));
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Cg, X.0CJ] */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof C0CM) {
            final C0CM c0cm = (C0CM) parent;
            ?? r1 = new C0CJ(this) { // from class: X.1Cg
                public final /* synthetic */ AbstractC40311i7<T> LJLIL;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0CJ
                public final void LIZJ(int i) {
                    if (!this.LJLIL.LJLZ.containsKey(Integer.valueOf(i))) {
                        this.LJLIL.LLFF(i);
                    }
                    this.LJLIL.LJLLJ.gv0(c0cm.getCurrentItem());
                    AbstractC40311i7<T> abstractC40311i7 = this.LJLIL;
                    abstractC40311i7.getClass();
                    int i2 = i - 1;
                    int i3 = i + 1;
                    if (i2 > i3) {
                        return;
                    }
                    while (true) {
                        if (i2 >= 0 && i2 < abstractC40311i7.LJLL && !abstractC40311i7.LJLZ.containsKey(Integer.valueOf(i2)) && abstractC40311i7.LJLLL.get(i2) == null) {
                            abstractC40311i7.LJLLL.put(i2, abstractC40311i7.LLF(i2));
                        }
                        if (i2 != i3) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                }

                {
                    this.LJLIL = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0CJ
                public final void LIZIZ(int i, float f, int i2) {
                    if (c0cm.getCurrentItem() == i) {
                        int i3 = i + 1;
                        if (f >= 0.1f && !this.LJLIL.LJLZ.containsKey(Integer.valueOf(i3))) {
                            this.LJLIL.LLFF(i3);
                            return;
                        }
                        return;
                    }
                    if (c0cm.getCurrentItem() <= i || 1 - f < 0.1f || this.LJLIL.LJLZ.containsKey(Integer.valueOf(i))) {
                        return;
                    }
                    this.LJLIL.LLFF(i);
                }
            };
            c0cm.setOffscreenPageLimit(this.LJLL);
            c0cm.LIZIZ(r1);
            this.LJLLI = c0cm;
            this.LJLLILLLL = r1;
            super.onAttachedToRecyclerView(recyclerView);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Expected ViewPager2 instance. Got: ");
        LIZ.append(parent);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C0CM c0cm = this.LJLLI;
        if (c0cm != null) {
            c0cm.setOffscreenPageLimit(-1);
        }
        C0CM c0cm2 = this.LJLLI;
        if (c0cm2 != null) {
            C29101Cg c29101Cg = this.LJLLILLLL;
            if (c29101Cg != null) {
                ((ArrayList) c0cm2.LJLJI.LJLIL).remove(c29101Cg);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LJLLI = null;
        this.LJLLILLLL = null;
        this.LJLLJ.gv0(-1);
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40311i7(Fragment fragment, ActivityC45651qj activity, int i) {
        super(fragment);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(activity, "activity");
        this.LJLL = i;
        this.LJLLJ = (AdapterStateViewModel) ViewModelProviders.of(activity).get(AdapterStateViewModel.class);
        this.LJLLL = new SparseArray<>();
        HashMap<Integer, Long> hashMap = new HashMap<>();
        for (int i2 = 0; i2 < i; i2++) {
            hashMap.put(Integer.valueOf(i2), Long.valueOf(i2));
        }
        this.LJLLLL = this.LJLL + 1;
        this.LJLLLLLL = hashMap;
        this.LJLZ = new LinkedHashMap();
    }
}
