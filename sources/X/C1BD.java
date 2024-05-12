package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;

/* renamed from: X.1BD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1BD extends PagerAdapter {
    public final FragmentManager LJLILLLLZI;
    public final int LJLJI;
    public C1B3 LJLJJI;
    public final ArrayList<Fragment.SavedState> LJLJJL = new ArrayList<>();
    public final ArrayList<Fragment> LJLJJLL = new ArrayList<>();
    public Fragment LJLJL = null;

    public abstract Fragment LJJIII(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJIJJ() {
        Bundle bundle;
        if (this.LJLJJL.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.LJLJJL.size()];
            this.LJLJJL.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.LJLJJLL.size(); i++) {
            Fragment fragment = (Fragment) ListProtector.get(this.LJLJJLL, i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.LJLILLLLZI.LJJLIIJ(bundle, KMP.LJ("f", i), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
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

    public C1BD(FragmentManager fragmentManager, int i) {
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        Fragment.SavedState savedState;
        Object obj;
        if (this.LJLJJLL.size() > i && (obj = ListProtector.get(this.LJLJJLL, i)) != null) {
            return obj;
        }
        if (this.LJLJJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        Fragment LJJIII = LJJIII(i);
        if (this.LJLJJL.size() > i && (savedState = (Fragment.SavedState) ListProtector.get(this.LJLJJL, i)) != null) {
            LJJIII.setInitialSavedState(savedState);
        }
        while (this.LJLJJLL.size() <= i) {
            this.LJLJJLL.add(null);
        }
        LJJIII.setMenuVisibility(false);
        if (this.LJLJI == 0) {
            LJJIII.setUserVisibleHint(false);
        }
        ListProtector.set(this.LJLJJLL, i, LJJIII);
        this.LJLJJI.LJIIIIZZ(viewGroup.getId(), 1, LJJIII, null);
        if (this.LJLJI == 1) {
            this.LJLJJI.LJJIFFI(LJJIII, Lifecycle.State.STARTED);
        }
        return LJJIII;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.LJLJJL.clear();
            this.LJLJJLL.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.LJLJJL.add(parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = CastIntegerProtector.parseInt(str.substring(1));
                    Fragment LJJJJJ = this.LJLILLLLZI.LJJJJJ(bundle, str);
                    if (LJJJJJ != null) {
                        while (this.LJLJJLL.size() <= parseInt) {
                            this.LJLJJLL.add(null);
                        }
                        LJJJJJ.setMenuVisibility(false);
                        ListProtector.set(this.LJLJJLL, parseInt, LJJJJJ);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.LJLJJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        while (this.LJLJJL.size() <= i) {
            this.LJLJJL.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.LJLJJL;
        if (fragment.isAdded()) {
            savedState = this.LJLILLLLZI.LJLI(fragment);
        } else {
            savedState = null;
        }
        ListProtector.set(arrayList, i, savedState);
        ListProtector.set(this.LJLJJLL, i, null);
        this.LJLJJI.LJJI(fragment);
        if (fragment.equals(this.LJLJL)) {
            this.LJLJL = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIL(int i, ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LJLJL;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.LJLJI == 1) {
                    if (this.LJLJJI == null) {
                        FragmentManager fragmentManager = this.LJLILLLLZI;
                        this.LJLJJI = C1B6.LIZ(fragmentManager, fragmentManager);
                    }
                    this.LJLJJI.LJJIFFI(this.LJLJL, Lifecycle.State.STARTED);
                } else {
                    this.LJLJL.setUserVisibleHint(false);
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
            this.LJLJL = fragment;
        }
    }
}
