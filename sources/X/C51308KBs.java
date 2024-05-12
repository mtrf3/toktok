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
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.KBs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51308KBs extends FrameLayout implements InterfaceC51158K5y, InterfaceC51136K5c {
    public EcSearchIntermediateViewModelNew LJLIL;
    public FragmentManager LJLILLLLZI;
    public K75 LJLJI;
    public Fragment LJLJJI;
    public final C51312KBw LJLJJL;
    public int LJLJJLL;
    public KC3 LJLJL;

    @Override // X.InterfaceC51136K5c
    public final void LIZ() {
        C26045AKb c26045AKb;
        WeakReference<C26045AKb> weakReference = C72837SiH.LJLJJL;
        if (weakReference != null && (c26045AKb = weakReference.get()) != null) {
            c26045AKb.LIZIZ();
            C72837SiH.LJLJJL = null;
        }
    }

    @Override // X.InterfaceC51158K5y
    public final void LIZIZ() {
        Fragment fragment = this.LJLJJI;
        if (fragment != null) {
            fragment.mo49getActivity();
        }
        C51307KBr.LIZ(2);
    }

    @Override // X.InterfaceC51136K5c
    public final void LJ() {
        long j;
        C51312KBw c51312KBw = this.LJLJJL;
        c51312KBw.LIZ();
        if (c51312KBw.LIZLLL == 1) {
            return;
        }
        if (c51312KBw.LIZ == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            c51312KBw.LIZ = valueAnimator;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            int i = c51312KBw.LIZJ;
            if (i == 0) {
                j = 200;
            } else {
                j = i;
            }
            c51312KBw.LIZ.setDuration(j);
            c51312KBw.LIZ.setInterpolator(new InterpolatorC216808f6(0.32f, 0.94f, 0.6f, 1.0f));
            c51312KBw.LIZ.addUpdateListener(new AUListenerS96S0100000_8(c51312KBw, 1));
            c51312KBw.LIZ.addListener(new ALAdapterS6S0100000_8(c51312KBw, 5));
        }
        c51312KBw.LIZ.start();
    }

    @Override // X.InterfaceC51158K5y
    public final void LJFF() {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLIL;
        if (ecSearchIntermediateViewModelNew != null) {
            if (ecSearchIntermediateViewModelNew.LJLJJI) {
                new C51239K9b().LJIILIIL();
                return;
            }
            return;
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    @Override // X.InterfaceC51158K5y
    public int getInnerState() {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLIL;
        if (ecSearchIntermediateViewModelNew != null) {
            Integer value = ecSearchIntermediateViewModelNew.gv0().getValue();
            if (value == null) {
                return 0;
            }
            return value.intValue();
        }
        o.LJIJI("intermediateViewModel");
        throw null;
    }

    @Override // X.InterfaceC51136K5c
    public SearchResultParam getSearchParam() {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLIL;
        if (ecSearchIntermediateViewModelNew != null) {
            return (SearchResultParam) ((LiveData) ecSearchIntermediateViewModelNew.LJLILLLLZI.getValue()).getValue();
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
        return this.LJLJJI;
    }

    public final Fragment getFragment() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC51136K5c
    public final void LIZJ(int i) {
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC51158K5y
    public final void LJI(int i) {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLIL;
        if (ecSearchIntermediateViewModelNew != null) {
            ecSearchIntermediateViewModelNew.gv0().setValue(Integer.valueOf(i));
        } else {
            o.LJIJI("intermediateViewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC51158K5y
    public final void LJII(int i) {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = this.LJLIL;
        if (ecSearchIntermediateViewModelNew != null) {
            ((LiveData) ecSearchIntermediateViewModelNew.LJLJI.getValue()).setValue(Integer.valueOf(i));
        } else {
            o.LJIJI("intermediateViewModel");
            throw null;
        }
    }

    @Override // X.InterfaceC51158K5y
    public final void LJIIIIZZ(String keyword) {
        o.LJIIIZ(keyword, "keyword");
        Z9N.LIZIZ.LJJLIIIIJ();
        LJIIJ(this.LJLJI);
        this.LJLJJL.LIZIZ();
    }

    @Override // X.InterfaceC51158K5y
    public final boolean LJIIIZ(boolean z) {
        K75 k75;
        InterfaceC50548Jse LIZ;
        if (!z && (k75 = this.LJLJI) != null && (LIZ = k75.LIZ()) != null && LIZ.LIZ() == 1) {
            return false;
        }
        LJIIJ(this.LJLJI);
        this.LJLJJL.LIZIZ();
        return true;
    }

    public final void LJIIJ(K75 k75) {
        AmeBaseFragment ameBaseFragment;
        if (this.LJLJJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            if (fragmentManager != null) {
                this.LJLJJI = fragmentManager.LJJJIL("tag_intermediate_ec");
            } else {
                o.LJIJI("fragmentManager");
                throw null;
            }
        }
        if (this.LJLJJI == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C51345KDd.LIZ <= 0) {
                C51345KDd.LIZ = currentTimeMillis;
            }
            if (((Boolean) C51427KGh.LIZ.getValue()).booleanValue()) {
                C51248K9k.LIZLLL();
                ameBaseFragment = new EcSearchMiddleAdapterFragment(k75);
            } else {
                Fragment fragment = this.LJLJJI;
                if (fragment != null) {
                    fragment.mo49getActivity();
                }
                C51248K9k.LIZLLL();
                EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew = new EcDynamicSingleIntermediateFragmentNew();
                ecDynamicSingleIntermediateFragmentNew.LJLZ = k75;
                ameBaseFragment = ecDynamicSingleIntermediateFragmentNew;
            }
            this.LJLJJI = ameBaseFragment;
            FragmentManager fragmentManager2 = this.LJLILLLLZI;
            if (fragmentManager2 != null) {
                C1B3 c1b3 = new C1B3(fragmentManager2);
                Fragment fragment2 = this.LJLJJI;
                if (fragment2 != null) {
                    c1b3.LJIIJ(fragment2, "tag_intermediate_ec", this.LJLJJLL);
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
        K75 k75;
        KCU LJII;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        KC3 kc3 = this.LJLJL;
        if (kc3 != null && motionEvent != null && motionEvent.getActionMasked() == 0) {
            EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew = kc3.LIZ.LJLIL;
            if (ecSearchIntermediateViewModelNew != null) {
                Boolean bool = (Boolean) ((LiveData) ecSearchIntermediateViewModelNew.LJLJJL.getValue()).getValue();
                if ((bool == null || bool.booleanValue()) && (k75 = kc3.LIZIZ) != null && (LJII = k75.LJII()) != null) {
                    LJII.LIZ();
                }
            } else {
                o.LJIJI("intermediateViewModel");
                throw null;
            }
        }
        return dispatchTouchEvent;
    }

    public final void setFragment(Fragment fragment) {
        this.LJLJJI = fragment;
    }

    @Override // X.InterfaceC51136K5c
    public void setViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51308KBs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = R.id.jg6;
        setVisibility(8);
        this.LJLJJL = new C51312KBw(this);
    }

    @Override // X.InterfaceC51136K5c
    public final void LIZLLL(Fragment fragment, K75 k75, InterfaceC88472Yns<? super InterfaceC51158K5y, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        interfaceC88472Yns.invoke(this);
        this.LJLJI = k75;
        Z9N.LIZIZ.LJIL(fragment.mo49getActivity());
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
        this.LJLILLLLZI = childFragmentManager;
        if (mo49getActivity != null) {
            this.LJLIL = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(mo49getActivity).get(EcSearchIntermediateViewModelNew.class);
        }
        this.LJLJL = new KC3(this, k75);
    }
}
