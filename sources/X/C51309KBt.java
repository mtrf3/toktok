package X;

import Y.ALAdapterS6S0100000_8;
import Y.AUListenerS96S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.KBt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51309KBt extends FrameLayout implements InterfaceC51158K5y, InterfaceC51136K5c {
    public SearchIntermediateViewModelNew LJLIL;
    public SearchContainerHeaderVM LJLILLLLZI;
    public FragmentManager LJLJI;
    public K75 LJLJJI;
    public Fragment LJLJJL;
    public final C51313KBx LJLJJLL;
    public int LJLJL;
    public C51314KBy LJLJLJ;

    @Override // X.InterfaceC51136K5c
    public final void LIZ() {
    }

    @Override // X.InterfaceC51158K5y
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC51136K5c
    public final void LJ() {
        long j;
        C51313KBx c51313KBx = this.LJLJJLL;
        c51313KBx.LIZ();
        if (c51313KBx.LIZLLL == 1) {
            return;
        }
        if (c51313KBx.LIZ == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            c51313KBx.LIZ = valueAnimator;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            int i = c51313KBx.LIZJ;
            if (i == 0) {
                j = 200;
            } else {
                j = i;
            }
            c51313KBx.LIZ.setDuration(j);
            c51313KBx.LIZ.setInterpolator(new InterpolatorC216808f6(0.32f, 0.94f, 0.6f, 1.0f));
            c51313KBx.LIZ.addUpdateListener(new AUListenerS96S0100000_8(c51313KBx, 4));
            c51313KBx.LIZ.addListener(new ALAdapterS6S0100000_8(c51313KBx, 7));
        }
        c51313KBx.LIZ.start();
    }

    @Override // X.InterfaceC51158K5y
    public final void LJFF() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LJLIL;
        if (searchIntermediateViewModelNew != null) {
            if (searchIntermediateViewModelNew.LJLJJI) {
                new K5A().LJIILIIL();
                return;
            }
            return;
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    @Override // X.InterfaceC51158K5y
    public int getInnerState() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LJLIL;
        if (searchIntermediateViewModelNew != null) {
            Integer num = (Integer) ((LiveData) searchIntermediateViewModelNew.LJLIL.getValue()).getValue();
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    @Override // X.InterfaceC51136K5c
    public SearchResultParam getSearchParam() {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LJLIL;
        if (searchIntermediateViewModelNew != null) {
            return (SearchResultParam) ((LiveData) searchIntermediateViewModelNew.LJLILLLLZI.getValue()).getValue();
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    @Override // X.InterfaceC51136K5c
    public int getViewVisibility() {
        return getVisibility();
    }

    @Override // X.InterfaceC51136K5c
    public Fragment getCurrentFragment() {
        return this.LJLJJL;
    }

    public final Fragment getFragment() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC51136K5c
    public final void LIZJ(int i) {
        this.LJLJL = i;
    }

    @Override // X.InterfaceC51158K5y
    public final void LJI(int i) {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LJLIL;
        if (searchIntermediateViewModelNew != null) {
            ((LiveData) searchIntermediateViewModelNew.LJLIL.getValue()).setValue(Integer.valueOf(i));
        } else {
            o.LJIJI("intermediateViewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC51158K5y
    public final void LJII(int i) {
        SearchIntermediateViewModelNew searchIntermediateViewModelNew = this.LJLIL;
        if (searchIntermediateViewModelNew != null) {
            ((LiveData) searchIntermediateViewModelNew.LJLJI.getValue()).setValue(Integer.valueOf(i));
        } else {
            o.LJIJI("intermediateViewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC51158K5y
    public final void LJIIIIZZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        Z9N.LIZIZ.LJJLIIIIJ();
        LJIIJ(this.LJLJJI);
        this.LJLJJLL.LIZIZ();
        SearchContainerHeaderVM searchContainerHeaderVM = this.LJLILLLLZI;
        if (searchContainerHeaderVM != null) {
            searchContainerHeaderVM.gv0();
        }
    }

    @Override // X.InterfaceC51158K5y
    public final boolean LJIIIZ(boolean z) {
        K75 k75;
        InterfaceC50548Jse LIZ;
        if (!z && (k75 = this.LJLJJI) != null && (LIZ = k75.LIZ()) != null && LIZ.LIZ() == 1) {
            return false;
        }
        LJIIJ(this.LJLJJI);
        this.LJLJJLL.LIZIZ();
        SearchContainerHeaderVM searchContainerHeaderVM = this.LJLILLLLZI;
        if (searchContainerHeaderVM != null) {
            searchContainerHeaderVM.gv0();
        }
        return true;
    }

    public final void LJIIJ(K75 k75) {
        if (this.LJLJJL == null) {
            FragmentManager fragmentManager = this.LJLJI;
            if (fragmentManager != null) {
                this.LJLJJL = fragmentManager.LJJJIL("tag_intermediate");
            } else {
                o.LJIJI("fragmentManager");
                throw null;
            }
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = Z9N.LIZIZ.LJZ(k75);
            FragmentManager fragmentManager2 = this.LJLJI;
            if (fragmentManager2 != null) {
                C1B3 c1b3 = new C1B3(fragmentManager2);
                Fragment fragment = this.LJLJJL;
                if (fragment != null) {
                    c1b3.LJIIJ(fragment, "tag_intermediate", this.LJLJL);
                    c1b3.LJI();
                    return;
                }
                return;
            }
            o.LJIJI("fragmentManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        K75 k75;
        KCU LJII;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        C51314KBy c51314KBy = this.LJLJLJ;
        if (c51314KBy != null && motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            C51309KBt c51309KBt = c51314KBy.LIZ;
            ActivityC45651qj activityC45651qj = c51314KBy.LIZIZ;
            c51309KBt.getClass();
            if (KB1.LJII(KB1.LIZ(JTO.LIZIZ(activityC45651qj)))) {
                i = 0;
            } else {
                i = 2;
            }
            if (actionMasked == i) {
                SearchIntermediateViewModelNew searchIntermediateViewModelNew = c51314KBy.LIZ.LJLIL;
                if (searchIntermediateViewModelNew != null) {
                    Boolean bool = (Boolean) ((LiveData) searchIntermediateViewModelNew.LJLJJL.getValue()).getValue();
                    if ((bool == null || bool.booleanValue()) && (k75 = c51314KBy.LIZJ) != null && (LJII = k75.LJII()) != null) {
                        LJII.LIZ();
                    }
                } else {
                    o.LJIJI("intermediateViewModel");
                    throw null;
                }
            }
        }
        return dispatchTouchEvent;
    }

    public final void setFragment(Fragment fragment) {
        this.LJLJJL = fragment;
    }

    @Override // X.InterfaceC51136K5c
    public void setViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51309KBt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = R.id.jg5;
        setVisibility(8);
        this.LJLJJLL = new C51313KBx(this);
    }

    @Override // X.InterfaceC51136K5c
    public final void LIZLLL(Fragment fragment, K75 k75, InterfaceC88472Yns<? super InterfaceC51158K5y, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        interfaceC88472Yns.invoke(this);
        this.LJLJJI = k75;
        Z9N.LIZIZ.LJIL(fragment.mo49getActivity());
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
        this.LJLJI = childFragmentManager;
        this.LJLIL = (SearchIntermediateViewModelNew) ViewModelProviders.of(mo49getActivity).get(SearchIntermediateViewModelNew.class);
        if (C49804Jge.LJJIZ()) {
            this.LJLILLLLZI = (SearchContainerHeaderVM) ViewModelProviders.of(mo49getActivity).get(SearchContainerHeaderVM.class);
        }
        this.LJLJLJ = new C51314KBy(this, mo49getActivity, k75);
    }
}
