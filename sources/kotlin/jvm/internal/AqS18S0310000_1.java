package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C48841JEv;
import X.C55096Ljo;
import X.C68022li;
import X.C73098SmU;
import X.C76800UCe;
import X.C78897Uxp;
import X.C90193gN;
import X.C96223q6;
import X.C96243q8;
import X.C96263qA;
import X.C96283qC;
import X.C96293qD;
import X.InterfaceC24580xq;
import X.InterfaceC35811ar;
import X.InterfaceC88472Yns;
import X.MBB;
import X.XKQ;
import X.XKX;
import Y.ALAdapterS0S0100000_1;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class AqS18S0310000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS18S0310000_1 aqS18S0310000_1, Object it) {
        int i;
        int i2;
        o.LJIIIZ(it, "it");
        if (!aqS18S0310000_1.z3) {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((IMSearchAssem) aqS18S0310000_1.l0);
            if (LJIIIIZZ != null) {
                LJIIIIZZ.finish();
            }
        } else {
            FrameLayout frameLayout = (FrameLayout) ((View) aqS18S0310000_1.l1).findViewById(R.id.bsj);
            o.LJIIIIZZ(frameLayout, "view.container_layout");
            View realSearchBar = ((C96283qC) aqS18S0310000_1.l2).getSearchBar$im_base_release();
            View cancelBtn = ((C96283qC) aqS18S0310000_1.l2).getCancelBtn$im_base_release();
            View findViewById = ((View) aqS18S0310000_1.l1).findViewById(R.id.ajr);
            o.LJIIIIZZ(findViewById, "view.bg_view");
            View findViewById2 = ((View) aqS18S0310000_1.l1).findViewById(R.id.btg);
            o.LJIIIIZZ(findViewById2, "view.content_container");
            C96223q6 animationData = (C96223q6) ((IMSearchAssem) aqS18S0310000_1.l0).LJLJI.getValue();
            AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((C96283qC) aqS18S0310000_1.l2, 664);
            AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1((IMSearchAssem) aqS18S0310000_1.l0, 665);
            o.LJIIIZ(realSearchBar, "realSearchBar");
            o.LJIIIZ(cancelBtn, "cancelBtn");
            o.LJIIIZ(animationData, "animationData");
            Context context = frameLayout.getContext();
            if (context != null) {
                ViewGroup.LayoutParams layoutParams = null;
                C96243q8 c96243q8 = new C96243q8(context, null);
                float LJIJ = (C78897Uxp.LJIJ(R.dimen.v9, frameLayout) - r1) / 2.0f;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(realSearchBar.getWidth(), C78897Uxp.LJIJ(R.dimen.v8, frameLayout));
                Rect LIZJ = C73098SmU.LIZJ(realSearchBar);
                ViewGroup.LayoutParams layoutParams3 = realSearchBar.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    layoutParams = layoutParams3;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                layoutParams2.topMargin = i + ((int) LJIJ);
                layoutParams2.gravity = 8388611;
                if (C90193gN.LIZ()) {
                    i2 = frameLayout.getWidth() - LIZJ.right;
                } else {
                    i2 = LIZJ.left;
                }
                layoutParams2.setMarginStart(i2);
                frameLayout.addView(c96243q8, layoutParams2);
                realSearchBar.setVisibility(4);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(C96293qD.LJ(new AqS151S0100000_1(aqS151S0100000_1, 857), true), C96293qD.LIZIZ(cancelBtn, true), C96293qD.LIZ(findViewById, true), C96293qD.LIZLLL(findViewById2, true), C96293qD.LJFF(frameLayout, c96243q8, realSearchBar, animationData, true, C96263qA.LJLIL));
                animatorSet.addListener(new ALAdapterS0S0100000_1(aqS151S0100000_12, 8));
                animatorSet.start();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS18S0310000_1 aqS18S0310000_1, Object DisposableEffect) {
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        final XKQ LIZLLL = XKX.LIZLLL(C48841JEv.LIZ(MBB.INSTANCE), null, null, new C68022li(aqS18S0310000_1.z3, (InterfaceC35811ar) aqS18S0310000_1.l0, (InterfaceC35811ar) aqS18S0310000_1.l1, (InterfaceC35811ar) aqS18S0310000_1.l2, null), 3);
        return new InterfaceC24580xq() { // from class: X.34k
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                LIZLLL.LIZIZ(null);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS18S0310000_1(boolean z, boolean z2, InterfaceC35811ar<Long> interfaceC35811ar, InterfaceC35811ar<Boolean> interfaceC35811ar2, InterfaceC35811ar<Float> interfaceC35811ar3) {
        super(1);
        this.$t = interfaceC35811ar3;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = interfaceC35811ar;
        this.l2 = interfaceC35811ar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS18S0310000_1(boolean z, IMSearchAssem iMSearchAssem, View view, C96283qC c96283qC, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = iMSearchAssem;
        this.l1 = view;
        this.l2 = c96283qC;
    }
}
