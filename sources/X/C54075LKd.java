package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.MainFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LKd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54075LKd extends AbstractC51547KKx implements InterfaceC54156LNg, InterfaceC54078LKg {
    public final C54077LKf LJLJJLL;
    public final AbsFragment LJLJL;
    public final ActivityC45651qj LJLJLJ;
    public final List<InterfaceC54080LKi> LJLJLLL;
    public WeakReference<Fragment> LJLL;

    @Override // X.InterfaceC54156LNg
    public final void LJII() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJLLL.size();
    }

    @Override // X.InterfaceC54156LNg
    public final Fragment getCurrentFragment() {
        WeakReference<Fragment> weakReference = this.LJLL;
        if (weakReference == null) {
            return null;
        }
        o.LJI(weakReference);
        return weakReference.get();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // X.InterfaceC54078LKg
    public final void LIZLLL(String msg) {
        C2K0 c2k0;
        HomeTabAbility homeTabAbility;
        o.LJIIIZ(msg, "msg");
        StringBuilder sb = new StringBuilder("tab list: ");
        sb.append(this.LJLJLLL);
        sb.append(", ability: ");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLJLJ);
        List<String> list = null;
        if (LJJIFFI != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), HomeTabAbility.class, null);
        } else {
            c2k0 = null;
        }
        sb.append(c2k0);
        sb.append(" activity: ");
        sb.append(C45804HyK.LJJIFFI(this.LJLJLJ));
        sb.append(" logs: ");
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLJLJ);
        if (LJJIFFI2 != null && (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI2, null), HomeTabAbility.class, null)) != null) {
            list = homeTabAbility.P80();
        }
        sb.append(list);
        C78983UzD.LJIIZILJ(new IllegalArgumentException(msg + ", " + sb.toString()));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        o.LJIIIZ(obj, "obj");
        if (!(obj instanceof Fragment)) {
            return -1;
        }
        int i = -1;
        int i2 = 0;
        for (InterfaceC54080LKi interfaceC54080LKi : this.LJLJLLL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Class<?> pv0 = com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLJLJ).pv0(interfaceC54080LKi.tag());
                if (pv0 != null && pv0.isInstance(obj)) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (i == -1) {
            return -2;
        }
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return ((InterfaceC54080LKi) ListProtector.get(this.LJLJLLL, i)).LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    @Override // X.AbstractC51547KKx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LJJIII(int r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54075LKd.LJJIII(int):androidx.fragment.app.Fragment");
    }

    @Override // X.AbstractC51547KKx
    public final long LJJIIJ(int i) {
        return ((InterfaceC54080LKi) ListProtector.get(this.LJLJLLL, i)).tag().hashCode();
    }

    @Override // X.InterfaceC54156LNg
    public final int LLLZZ(int i) {
        if (this.LJLJLLL.size() > 0) {
            int size = this.LJLJLLL.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((InterfaceC54080LKi) ListProtector.get(this.LJLJLLL, i2)).type() == i) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC54156LNg
    public final int getPageType(int i) {
        if (i < 0 || i >= this.LJLJLLL.size()) {
            return -1;
        }
        return ((InterfaceC54080LKi) ListProtector.get(this.LJLJLLL, i)).type();
    }

    @Override // X.InterfaceC54156LNg
    public final Fragment z7(int i) {
        Class<?> pv0 = com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLJLJ).pv0(((InterfaceC54080LKi) ListProtector.get(this.LJLJLLL, i)).tag());
        if (pv0 == null) {
            return null;
        }
        List<Fragment> LJJJJLI = this.LJLILLLLZI.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "mFragmentManager.fragments");
        for (Fragment fragment : LJJJJLI) {
            if (pv0.isInstance(fragment)) {
                return fragment;
            }
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54075LKd(com.bytedance.ies.uikit.base.AbsFragment r5, X.C54077LKf r6) {
        /*
            r4 = this;
            java.lang.String r0 = "mainFragment"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            androidx.fragment.app.FragmentManager r1 = r5.getChildFragmentManager()
            java.lang.String r0 = "mainFragment.childFragmentManager"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r4.<init>(r1)
            r4.LJLJJLL = r6
            r4.LJLJL = r5
            android.content.Context r0 = r5.getContext()
            r3 = 0
            if (r0 == 0) goto L5f
            X.1qj r1 = X.C45804HyK.LJJIFFI(r0)
        L20:
            kotlin.jvm.internal.o.LJI(r1)
            r4.LJLJLJ = r1
            X.LH3 r0 = com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel.LJLJLLL
            com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel r0 = r0.LIZ(r1)
            java.util.List r2 = r0.pU()
            X.1qj r0 = X.C45804HyK.LJJIFFI(r1)
            if (r0 == 0) goto L46
            X.Lm3 r1 = X.C55230Lly.LIZLLL(r0, r3)
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            X.2K0 r0 = X.C55096Ljo.LIZ(r1, r0, r3)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0
            if (r0 == 0) goto L46
            r0.IH()
        L46:
            r4.LJLJLLL = r2
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.Ecj r0 = r0.getShowTimeLineTab()
            java.lang.Object r1 = r0.LIZ()
            java.lang.String r0 = "inst().showTimeLineTab.cache"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            return
        L5f:
            r1 = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54075LKd.<init>(com.bytedance.ies.uikit.base.AbsFragment, X.LKf):void");
    }

    @Override // X.AbstractC51547KKx, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        super.LJIIIZ(i, container, item);
        if (item instanceof Fragment) {
            try {
                C1B3 c1b3 = this.LJLJI;
                if (c1b3 != null) {
                    c1b3.LJJI((Fragment) item);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC51547KKx, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object item) {
        Fragment fragment;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        super.LJIL(i, container, item);
        WeakReference<Fragment> weakReference = this.LJLL;
        if (weakReference != null) {
            o.LJI(weakReference);
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != item) {
            Fragment fragment2 = (Fragment) item;
            this.LJLL = new WeakReference<>(fragment2);
            C54077LKf c54077LKf = this.LJLJJLL;
            if (c54077LKf != null) {
                MainFragment mainFragment = c54077LKf.LIZ;
                mainFragment.getClass();
                HomeViewPagerAbility LJIIZILJ = C78929UyL.LJIIZILJ(mainFragment);
                if (LJIIZILJ != null) {
                    LJIIZILJ.Kk0(i, fragment2);
                }
            }
            if (fragment != null) {
                C2U8.LIZ(new C2J8(fragment.hashCode()));
            }
        }
    }
}
