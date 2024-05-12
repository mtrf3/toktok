package X;

import Y.ARunnableS15S0300000_4;
import Y.ARunnableS23S0200000_4;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.ARunnableS8S0400000_4;
import Y.IDAListenerS36S0200000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS3S0410000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UHe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76930UHe extends FrameLayout {
    public static final /* synthetic */ int LJLL = 0;
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final List<ViewPropertyAnimator> LJLJJLL;
    public InterfaceC76931UHf LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public final ARunnableS49S0100000_13 LJLJLLL;

    private final int getMargin() {
        return ((Number) this.LJLILLLLZI.getValue()).intValue();
    }

    public final void LIZJ() {
        Iterator<ViewPropertyAnimator> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        ((ArrayList) this.LJLJJLL).clear();
    }

    public final C76929UHd getBoxView() {
        return (C76929UHd) this.LJLJJL.getValue();
    }

    public final View getDivider() {
        return (View) this.LJLJJI.getValue();
    }

    public final int getDividerLeftLoc() {
        return ((Number) this.LJLIL.getValue()).intValue();
    }

    public final C41081jM getMasker() {
        return (C41081jM) this.LJLJI.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.LJLJLLL);
        LIZJ();
    }

    public final void setBoxShowListener$livegift_impl_release(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C76929UHd boxView = getBoxView();
        if (boxView != null) {
            boxView.setBoxShowListener$livegift_impl_release(listener);
        }
    }

    public final void setOnBoxClickListener$livegift_impl_release(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        C76929UHd boxView = getBoxView();
        if (boxView != null) {
            boxView.setOnClickListener$livegift_impl_release(listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76930UHe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = C78996UzQ.LJJIJIIJI(new AqS160S0200000_13(this, context, 17));
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 223));
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 224));
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 222));
        this.LJLJJL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 221));
        this.LJLJJLL = new ArrayList();
        this.LJLJLLL = new ARunnableS49S0100000_13(this, 69);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(InterfaceC76931UHf interfaceC76931UHf, InterfaceC76931UHf interfaceC76931UHf2) {
        View view;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("adaptConstraintSet ");
        LIZ.append(interfaceC76931UHf);
        LIZ.append(", ");
        LIZ.append(interfaceC76931UHf2);
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
        if ((interfaceC76931UHf instanceof View) && (view = (View) interfaceC76931UHf) != null) {
            C78609UtB.LJJIJIL(0, view);
        }
        o.LJII(interfaceC76931UHf2, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) interfaceC76931UHf2;
        C78609UtB.LJJIJIL(getMargin(), view2);
        view2.requestLayout();
    }

    public static void LIZIZ(C76930UHe c76930UHe, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        c76930UHe.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("animateShowBox# endAction : ");
        LIZ.append((Object) null);
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        C76929UHd boxView = c76930UHe.getBoxView();
        if (boxView != null) {
            ViewPropertyAnimator animate = boxView.animate();
            if (animate != null) {
                animate.cancel();
            }
            boxView.setVisibility(0);
            if (z) {
                boxView.setAlpha(0.0f);
            }
            ViewPropertyAnimator animate2 = boxView.animate();
            if (animate2 != null) {
                animate2.alpha(1.0f).setDuration(300L).setInterpolator(new C30901Je()).withStartAction(new ARunnableS23S0200000_4(c76930UHe, animate2, 44)).withEndAction(new ARunnableS15S0300000_4(c76930UHe, animate2, c68322mC, 18)).start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(C32496CpA c32496CpA, InterfaceC76931UHf interfaceC76931UHf, InterfaceC76931UHf interfaceC76931UHf2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z;
        boolean z2;
        C76929UHd boxView;
        if (c32496CpA != null && c32496CpA.LIZ && interfaceC76931UHf != 0 && interfaceC76931UHf.LJJLIL()) {
            z = true;
        } else {
            z = false;
        }
        C76929UHd boxView2 = getBoxView();
        if (boxView2 != null && boxView2.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isBoxHasShown = ");
        LIZ.append(z2);
        LIZ.append(",  shouldShowDisplayBox = ");
        LIZ.append(z);
        C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ));
        if (z) {
            this.LJLJL = interfaceC76931UHf;
            this.LJLJLJ = interfaceC65784Pro;
            if (z2) {
                if (c32496CpA != null && (boxView = getBoxView()) != null) {
                    boxView.LJJLJLI(c32496CpA, null);
                }
                LIZIZ(this, false, 3);
                if (interfaceC76931UHf != 0) {
                    LIZ(null, interfaceC76931UHf);
                    postDelayed(new ARunnableS32S0200000_13(this, interfaceC76931UHf, 128), 30L);
                }
            } else {
                Boolean LIZJ = InterfaceC30442Bx8.L0.LIZJ();
                o.LJIIIIZZ(LIZJ, "HAS_SHOW_GIFT_BOX_GUIDE.value");
                boolean booleanValue = LIZJ.booleanValue();
                AqS3S0410000_13 aqS3S0410000_13 = new AqS3S0410000_13(this, c32496CpA, booleanValue, interfaceC76931UHf, interfaceC76931UHf2, 0);
                if (!booleanValue) {
                    C76929UHd boxView3 = getBoxView();
                    if (boxView3 == null) {
                        return;
                    }
                    boxView3.postDelayed(new ARunnableS32S0200000_13(this, aqS3S0410000_13, 32), 50L);
                    return;
                }
                C76929UHd boxView4 = getBoxView();
                if (boxView4 != null) {
                    ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(boxView4, new ARunnableS32S0200000_13(boxView4, aqS3S0410000_13, 30));
                }
            }
        } else {
            this.LJLJL = null;
            this.LJLJLJ = null;
            if (interfaceC76931UHf != 0) {
                C0NB.LIZIZ("BannerParentLayout", "adaptConstraintSetWhenDismiss");
                View view = (View) interfaceC76931UHf;
                C78609UtB.LJJIJIL(0, view);
                view.requestLayout();
            }
            if (z2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("animateHideBox# endAction : ");
                LIZ2.append((Object) null);
                C0NB.LIZIZ("BannerParentLayout", X1D.LIZIZ(LIZ2));
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = null;
                Iterator it = ((ArrayList) ORZ.LJLL(C47261Igj.LJII(getBoxView(), getMasker(), getDivider()))).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    ViewPropertyAnimator animate = view2.animate();
                    if (animate != null) {
                        animate.cancel();
                    }
                    ViewPropertyAnimator animate2 = view2.animate();
                    if (animate2 != null) {
                        animate2.alpha(0.0f).setDuration(300L).setInterpolator(new C30901Je()).withStartAction(new ARunnableS23S0200000_4(this, animate2, 43)).withEndAction(new ARunnableS8S0400000_4(this, animate2, view2, c68322mC, 6)).setListener(new IDAListenerS36S0200000_1(view2, c68322mC, 5)).start();
                    }
                }
            } else {
                C0NB.LIZIZ("BannerParentLayout", "hideGiftBox#");
                LIZJ();
                View divider = getDivider();
                if (divider != null) {
                    divider.setVisibility(8);
                }
                C41081jM masker = getMasker();
                if (masker != null) {
                    masker.setVisibility(8);
                }
                C76929UHd boxView5 = getBoxView();
                if (boxView5 != null) {
                    boxView5.setVisibility(8);
                }
            }
            interfaceC65784Pro.invoke();
        }
        C76929UHd boxView6 = getBoxView();
        if (boxView6 != null && boxView6.LJJLL()) {
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
