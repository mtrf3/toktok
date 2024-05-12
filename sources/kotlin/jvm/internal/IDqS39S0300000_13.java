package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B83;
import X.BZI;
import X.C0NB;
import X.C14480hY;
import X.C245319jz;
import X.C252659vp;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2A4;
import X.C33611Tp;
import X.C72704Sg8;
import X.C76800UCe;
import X.C76846UDy;
import X.C76876UFc;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.TV3;
import X.UE1;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS32S0200000_13;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes14.dex */
public class IDqS39S0300000_13 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS39S0300000_13(C2A4 c2a4, C33611Tp c33611Tp, C76846UDy c76846UDy, int i) {
        super(3);
        this.$t = i;
        this.l0 = c76846UDy;
        this.l1 = c33611Tp;
        this.l2 = c2a4;
    }

    public static final Object invoke$0(IDqS39S0300000_13 iDqS39S0300000_13, Object obj, Object obj2, Object obj3) {
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) obj3;
        C76846UDy c76846UDy = (C76846UDy) iDqS39S0300000_13.l0;
        if (c76846UDy.LJIIL) {
            C33611Tp c33611Tp = (C33611Tp) iDqS39S0300000_13.l1;
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            C14480hY.LIZIZ(c33611Tp, 0, 1, 2, TV3.LJIIIIZZ(LJ));
            C0NB.LIZIZ("GiftExpressionHelper", "playBigFlyGiftOnMask return for screen is cleared");
            C76846UDy c76846UDy2 = (C76846UDy) iDqS39S0300000_13.l0;
            c76846UDy2.LIZIZ.LJJIJIL().post(new ARunnableS32S0200000_13(c76846UDy2, (C2A4) iDqS39S0300000_13.l2, 22));
        } else {
            C33611Tp c33611Tp2 = (C33611Tp) iDqS39S0300000_13.l1;
            C2A4 c2a4 = (C2A4) iDqS39S0300000_13.l2;
            c76846UDy.LJIIJJI = animatedDrawable2;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
                animatedDrawable2.LJI(new UE1(c76846UDy, animatedDrawable2, c2a4, c33611Tp2));
                animatedDrawable2.start();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS39S0300000_13 iDqS39S0300000_13, Object obj, Object obj2, Object obj3) {
        FragmentManager fragmentManager;
        C76876UFc c76876UFc = (C76876UFc) obj;
        int intValue = ((Number) obj2).intValue();
        List list = (List) obj3;
        o.LJIIIZ(list, "list");
        if (c76876UFc == null) {
            ((SubscriptionSpotlightFragment) iDqS39S0300000_13.l0).Dl(10 - list.size());
        } else {
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = (SubscriptionSpotlightFragment) iDqS39S0300000_13.l0;
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_more_click");
            subscriptionSpotlightFragment.Gl(LIZ);
            LIZ.LJIJJ(subscriptionSpotlightFragment.LJLIL, "show_entrance");
            LIZ.LJJIIJZLJL();
            C245319jz c245319jz = new C245319jz();
            C252659vp LIZ2 = C72704Sg8.LIZ(R.raw.icon_image);
            String string = ((SubscriptionSpotlightFragment) iDqS39S0300000_13.l0).getString(R.string.oa4);
            o.LJIIIIZZ(string, "getString(R.string.pm_su…Settings_actionMenuLink1)");
            LIZ2.LIZ = string;
            LIZ2.LJ = new ACListenerS21S0100000_1(new AqS117S0300000_13(c76876UFc, (C76876UFc) iDqS39S0300000_13.l0, (SubscriptionSpotlightFragment) list, (List<C76876UFc>) 15), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            C252659vp c252659vp = new C252659vp();
            c252659vp.LJI = new AqS179S0100000_13((Context) iDqS39S0300000_13.l1, 532);
            String string2 = ((SubscriptionSpotlightFragment) iDqS39S0300000_13.l0).getString(R.string.oa5);
            o.LJIIIIZZ(string2, "getString(R.string.pm_su…Settings_actionMenuLink2)");
            c252659vp.LIZ = string2;
            c252659vp.LJ = new ACListenerS21S0100000_1(new AqS12S0401000_13(c76876UFc, (C76876UFc) iDqS39S0300000_13.l2, (FragmentManager) iDqS39S0300000_13.l0, (SubscriptionSpotlightFragment) list, (List<C76876UFc>) intValue, 1), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            C252659vp LIZ3 = C72704Sg8.LIZ(R.raw.icon_trash_bin_fill);
            String string3 = ((SubscriptionSpotlightFragment) iDqS39S0300000_13.l0).getString(R.string.oa6);
            o.LJIIIIZZ(string3, "getString(R.string.pm_su…Settings_actionMenuLink3)");
            LIZ3.LIZ = string3;
            LIZ3.LJ = new ACListenerS21S0100000_1(new AqS100S0101000_13((SubscriptionSpotlightFragment) iDqS39S0300000_13.l0, intValue, 11), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            LIZ3.LIZJ = 1;
            c245319jz.LIZ(LIZ2, c252659vp, LIZ3);
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            ActivityC45651qj mo49getActivity = ((SubscriptionSpotlightFragment) iDqS39S0300000_13.l0).mo49getActivity();
            if (mo49getActivity != null) {
                fragmentManager = mo49getActivity.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            o.LJI(fragmentManager);
            LIZJ.show(fragmentManager, "SubscriptionHighlightFragment");
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS39S0300000_13(SubscriptionSpotlightFragment subscriptionSpotlightFragment, Context context, FragmentManager fragmentManager, int i) {
        super(3);
        this.$t = i;
        this.l0 = subscriptionSpotlightFragment;
        this.l1 = context;
        this.l2 = fragmentManager;
    }
}
