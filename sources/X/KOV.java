package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KOV extends FrameLayout implements View.OnAttachStateChangeListener {
    public KOX LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public View LJLJJI;
    public final C0CM LJLJJL;
    public final RecyclerView LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public Fragment LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public boolean LJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KOV(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KOV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final ActivityC45651qj getCurrentActivity() {
        return (ActivityC45651qj) this.LJLLI.getValue();
    }

    private final Fragment getCurrentFragment() {
        Fragment fragment = this.LJLL;
        if (fragment == null) {
            ActivityC45651qj currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                fragment = C78688UuS.LJJIJ(currentActivity, this);
            } else {
                fragment = null;
            }
            this.LJLL = fragment;
        }
        return fragment;
    }

    public final int getCurrentItem() {
        return this.LJLJJL.getCurrentItem();
    }

    public final InterfaceC222788ok getCurrentOperator() {
        if (!this.LJLILLLLZI) {
            return null;
        }
        int i = KOY.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new C162476Zf();
            }
            return getViewItemOperator();
        }
        return getFragmentItemOperator();
    }

    public final C72272SYa getFragmentAdapter() {
        return (C72272SYa) this.LJLJL.getValue();
    }

    public final InterfaceC213398Zb getFragmentItemOperator() {
        return (InterfaceC213398Zb) this.LJLLILLLL.getValue();
    }

    public final int getItemDecorationCount() {
        return this.LJLJJL.getItemDecorationCount();
    }

    public final int getOffscreenPageLimit() {
        return this.LJLJJL.getOffscreenPageLimit();
    }

    public final int getScrollState() {
        return this.LJLJJL.getScrollState();
    }

    public final SYM getViewAdapter() {
        return (SYM) this.LJLJLJ.getValue();
    }

    public final InterfaceC222798ol getViewItemOperator() {
        return (InterfaceC222798ol) this.LJLLJ.getValue();
    }

    public final LifecycleOwner getFragmentItemLifecycleOwner() {
        LifecycleOwner currentFragment = getCurrentFragment();
        if (currentFragment != null || (currentFragment = getCurrentActivity()) != null) {
            return currentFragment;
        }
        throw new RuntimeException("Can not find fragment lifecycleOwner !");
    }

    public final FragmentManager getFragmentManager() {
        ActivityC45651qj currentActivity;
        FragmentManager supportFragmentManager;
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment != null && (supportFragmentManager = currentFragment.getChildFragmentManager()) != null) || ((currentActivity = getCurrentActivity()) != null && (supportFragmentManager = currentActivity.getSupportFragmentManager()) != null)) {
            return supportFragmentManager;
        }
        throw new RuntimeException("Can not find fragment manager !");
    }

    public final void LIZ(int i) {
        boolean z;
        boolean z2 = false;
        if (this.LJLJJL.getCurrentItem() == i) {
            z = true;
        } else {
            z = false;
        }
        C0CM c0cm = this.LJLJJL;
        if (z) {
            z2 = true;
        }
        c0cm.LIZLLL(i, z2);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.LJLJJL.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.LJLJJL.canScrollVertically(i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        int i = KOY.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    throw new RuntimeException("Item type is not set, please setup powerViewPager by fragment/view operator");
                }
            } else {
                getViewAdapter().LJLLLLLL();
                return;
            }
        }
        C72272SYa fragmentAdapter = getFragmentAdapter();
        fragmentAdapter.LLF.LIZ.observe(fragmentAdapter.LJLLI, fragmentAdapter);
        fragmentAdapter.LJLL.LJIIJJI((C0A6) fragmentAdapter.LLFF.getValue());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        int i = KOY.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    throw new RuntimeException("Item type is not set, please setup powerViewPager by fragment/view operator");
                }
            } else {
                getViewAdapter().LJLZ();
                return;
            }
        }
        C72272SYa fragmentAdapter = getFragmentAdapter();
        fragmentAdapter.LLF.LIZ.removeObserver(fragmentAdapter);
        fragmentAdapter.LJLL.LJJLL((C0A6) fragmentAdapter.LLFF.getValue());
    }

    public final void setCurrentItem(int i) {
        boolean z;
        boolean z2 = true;
        if (this.LJLJJL.getCurrentItem() == i) {
            z = true;
        } else {
            z = false;
        }
        C0CM c0cm = this.LJLJJL;
        if (!z && !this.LJLJLLL) {
            z2 = false;
        }
        c0cm.LIZLLL(i, z2);
    }

    public final void setOrientation(int i) {
        this.LJLJJL.setOrientation(i);
    }

    public final void setPageTransformer(C0CK transformer) {
        o.LJIIIZ(transformer, "transformer");
        this.LJLJJL.setPageTransformer(transformer);
    }

    public final void setSmoothScrollEnabled(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setUserInputEnabled(boolean z) {
        this.LJLLL = z;
        this.LJLJJL.setUserInputEnabled(z);
    }

    public final void setViewPagerItemType(KOX kox) {
        KOX kox2 = this.LJLIL;
        if (kox2 == kox) {
            return;
        }
        if (kox2 == KOX.UNSET) {
            this.LJLIL = kox;
            return;
        }
        throw new RuntimeException("PowerViewPager operator and Item Type (fragment/view) cannot be modified after initialization");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.LJLJJL.setVisibility(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KOV(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r8 & 2
            if (r0 == 0) goto L5
            r7 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r4 = 0
            r5.<init>(r6, r7, r4)
            X.KOX r0 = X.KOX.UNSET
            r5.LJLIL = r0
            X.0CM r2 = new X.0CM
            r2.<init>(r6, r7, r4)
            r5.LJLJJL = r2
            kotlin.jvm.internal.AqS158S0100000_8 r1 = new kotlin.jvm.internal.AqS158S0100000_8
            r0 = 28
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLJL = r0
            kotlin.jvm.internal.AqS158S0100000_8 r1 = new kotlin.jvm.internal.AqS158S0100000_8
            r0 = 30
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLJLJ = r0
            r3 = 1
            r5.LJLJLLL = r3
            kotlin.jvm.internal.AqS158S0100000_8 r1 = new kotlin.jvm.internal.AqS158S0100000_8
            r0 = 27
            r1.<init>(r6, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLLI = r0
            kotlin.jvm.internal.AqS158S0100000_8 r1 = new kotlin.jvm.internal.AqS158S0100000_8
            r0 = 29
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLLILLLL = r0
            kotlin.jvm.internal.AqS158S0100000_8 r1 = new kotlin.jvm.internal.AqS158S0100000_8
            r0 = 31
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLLJ = r0
            r0 = -1
            r5.addView(r2, r0, r0)
            android.view.View r2 = r2.getChildAt(r4)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            kotlin.jvm.internal.o.LJII(r2, r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r5.LJLJJLL = r2
            Y.IDCListenerS245S0100000_8 r1 = new Y.IDCListenerS245S0100000_8
            r0 = 0
            r1.<init>(r5, r0)
            r2.addOnAttachStateChangeListener(r1)
            r5.LJLLL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KOV.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
