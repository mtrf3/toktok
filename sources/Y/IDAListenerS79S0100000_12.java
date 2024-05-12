package Y;

import X.C2UK;
import X.C45804HyK;
import X.C48658J7u;
import X.C71395S0h;
import X.C71469S3d;
import X.C71470S3e;
import X.C71510S4s;
import X.C71791SFn;
import X.C73099SmV;
import X.InterfaceC71474S3i;
import X.InterfaceC71509S4r;
import X.OUP;
import X.S08;
import X.S09;
import X.S21;
import X.TCQ;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuHeaderWidget;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.view.onboarding.ProfileNaviOnboardingFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS67S0110000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class IDAListenerS79S0100000_12 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$2(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
    }

    public static final void onAnimationEnd$2(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                o.LJIIIZ(animator, "animation");
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            case 9:
                o.LJIIIZ(animator, "animator");
                return;
            case 10:
                o.LJIIIZ(animator, "p0");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIJ(animator, "animator");
                return;
            case 12:
                onAnimationCancel$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                o.LJIIIZ(animator, "animation");
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animation");
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                onAnimationRepeat$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "animation");
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                o.LJIIIZ(animator, "animation");
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            case 8:
                o.LJIIIZ(animator, "animation");
                return;
            case 9:
                o.LJIIIZ(animator, "animator");
                return;
            case 10:
                o.LJIIIZ(animator, "p0");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIJ(animator, "animator");
                return;
            case 12:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                o.LJIIIZ(animator, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                o.LJIIIZ(animator, "animation");
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                onAnimationStart$3(this, animator);
                return;
            case 4:
                o.LJIIIZ(animator, "animation");
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                onAnimationStart$6(this, animator);
                return;
            case 7:
                onAnimationStart$7(this, animator);
                return;
            case 8:
                onAnimationStart$8(this, animator);
                return;
            case 9:
                o.LJIIIZ(animator, "animator");
                return;
            case 10:
                o.LJIIIZ(animator, "p0");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIJ(animator, "animator");
                return;
            case 12:
                onAnimationStart$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationStart$13(this, animator);
                return;
            default:
                return;
        }
    }

    public IDAListenerS79S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        iDAListenerS79S0100000_12.onAnimationEnd(animation);
    }

    public static final void onAnimationCancel$12(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C71470S3e c71470S3e = (C71470S3e) iDAListenerS79S0100000_12.l0;
        c71470S3e.LJLJJLL = 1;
        c71470S3e.LIZJ();
        ((C71470S3e) iDAListenerS79S0100000_12.l0).LJLJJL = null;
    }

    public static final void onAnimationEnd$0(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C71510S4s c71510S4s = (C71510S4s) iDAListenerS79S0100000_12.l0;
        Iterator<InterfaceC71509S4r> it = c71510S4s.LJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c71510S4s.LJLLI);
        }
        View LJFF = ((C71510S4s) iDAListenerS79S0100000_12.l0).LJFF();
        if (LJFF != null) {
            LJFF.setLayoutParams(((C71510S4s) iDAListenerS79S0100000_12.l0).LJLJL);
        }
        ((C71510S4s) iDAListenerS79S0100000_12.l0).LJLLI = -1;
    }

    public static final void onAnimationEnd$1(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C73099SmV) iDAListenerS79S0100000_12.l0).LJLJJI = false;
    }

    public static final void onAnimationEnd$10(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ObjectAnimator objectAnimator = ((C2UK) iDAListenerS79S0100000_12.l0).LJLILLLLZI;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public static final void onAnimationEnd$11(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
        o.LJIIJ(animator, "animator");
        TCQ popWindow = (TCQ) iDAListenerS79S0100000_12.l0;
        o.LJIIIZ(popWindow, "popWindow");
        try {
            new AqS162S0100000_12(popWindow, 1076).invoke();
        } catch (Throwable unused) {
        }
    }

    public static final void onAnimationEnd$12(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C71470S3e c71470S3e = (C71470S3e) iDAListenerS79S0100000_12.l0;
        c71470S3e.LJLJJLL = 1;
        InterfaceC71474S3i interfaceC71474S3i = c71470S3e.LJLJL;
        if (interfaceC71474S3i != null) {
            interfaceC71474S3i.onDismiss();
        }
        ((C71470S3e) iDAListenerS79S0100000_12.l0).LIZJ();
        ((C71470S3e) iDAListenerS79S0100000_12.l0).LJLJJL = null;
    }

    public static final void onAnimationEnd$13(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        Map<String, String> map;
        Set<Map.Entry<String, String>> entrySet;
        o.LJIIIZ(animation, "animation");
        C71470S3e c71470S3e = (C71470S3e) iDAListenerS79S0100000_12.l0;
        c71470S3e.LJLJJLL = 3;
        InterfaceC71474S3i interfaceC71474S3i = c71470S3e.LJLJL;
        if (interfaceC71474S3i != null) {
            interfaceC71474S3i.onShow();
        }
        C71470S3e c71470S3e2 = (C71470S3e) iDAListenerS79S0100000_12.l0;
        C71469S3d c71469S3d = c71470S3e2.LJLLI;
        if (c71469S3d != null) {
            S21 s21 = c71470S3e2.LJLJJI;
            if (s21 != null) {
                map = s21.getContentShowParams();
            } else {
                map = null;
            }
            JSONObject LIZ = c71469S3d.LIZ();
            if (map != null && (entrySet = map.entrySet()) != null) {
                for (Map.Entry<String, String> entry : entrySet) {
                    LIZ.put(entry.getKey(), entry.getValue());
                }
            }
            C48658J7u.LIZIZ("livesdk_tiktokec_card_show", LIZ);
        }
    }

    public static final void onAnimationEnd$4(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View _$_findCachedViewById = ((ProfileNaviOnboardingFragment) iDAListenerS79S0100000_12.l0)._$_findCachedViewById(R.id.i9c);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(8);
    }

    public static final void onAnimationEnd$5(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((UsSkuHeaderWidget) iDAListenerS79S0100000_12.l0).getMViewModel().LLI = null;
    }

    public static final void onAnimationEnd$8(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((S09) iDAListenerS79S0100000_12.l0).LIZ(R.id.a3f).setVisibility(8);
        ((S09) iDAListenerS79S0100000_12.l0).LIZ(R.id.a4o).setVisibility(8);
    }

    public static final void onAnimationEnd$9(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((SkuPanelHeaderWidget) iDAListenerS79S0100000_12.l0).getMViewModel().LLI = null;
    }

    public static final void onAnimationStart$0(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        View LJFF;
        o.LJIIIZ(animation, "animation");
        C71510S4s c71510S4s = (C71510S4s) iDAListenerS79S0100000_12.l0;
        Iterator<InterfaceC71509S4r> it = c71510S4s.LJLLL.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(c71510S4s.LJLLI);
        }
        C71510S4s c71510S4s2 = (C71510S4s) iDAListenerS79S0100000_12.l0;
        if (c71510S4s2.LJLLI == 0 && (LJFF = c71510S4s2.LJFF()) != null) {
            c71510S4s2.LJLJL = LJFF.getLayoutParams();
            LJFF.setLayoutParams(c71510S4s2.LJLJLJ);
        }
    }

    public static final void onAnimationStart$12(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C71470S3e) iDAListenerS79S0100000_12.l0).LJLJJLL = 4;
    }

    public static final void onAnimationStart$13(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C71470S3e) iDAListenerS79S0100000_12.l0).LJLJJLL = 2;
    }

    public static final void onAnimationStart$2(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animator) {
        ((View) iDAListenerS79S0100000_12.l0).setScaleX(0.0f);
        ((View) iDAListenerS79S0100000_12.l0).setScaleY(0.0f);
        ((View) iDAListenerS79S0100000_12.l0).setAlpha(0.0f);
        ((View) iDAListenerS79S0100000_12.l0).setRotation(0.0f);
        ((View) iDAListenerS79S0100000_12.l0).setVisibility(0);
    }

    public static final void onAnimationStart$3(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View _$_findCachedViewById = ((ProfileNaviOnboardingFragment) iDAListenerS79S0100000_12.l0)._$_findCachedViewById(R.id.i9c);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(0);
    }

    public static final void onAnimationStart$6(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View _$_findCachedViewById = ((ProfileNaviOnboardingFragment) iDAListenerS79S0100000_12.l0)._$_findCachedViewById(R.id.gy0);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(0);
    }

    public static final void onAnimationStart$7(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C45804HyK.LJJLL(((S08) iDAListenerS79S0100000_12.l0).LIZ(R.id.a3s));
    }

    public static final void onAnimationStart$8(IDAListenerS79S0100000_12 iDAListenerS79S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View anchor_promotion_flow = ((S09) iDAListenerS79S0100000_12.l0).LIZ(R.id.a3s);
        o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
        OUP.LJJLIIIJ(anchor_promotion_flow);
        S09 s09 = (S09) iDAListenerS79S0100000_12.l0;
        C71395S0h.LIZ.getClass();
        boolean LIZIZ = C71395S0h.LIZIZ();
        s09.getClass();
        AqS67S0110000_12 aqS67S0110000_12 = new AqS67S0110000_12(s09, LIZIZ, 6);
        ((TextView) s09.LIZ(R.id.a4n)).setMaxWidth(s09.LJLJJI);
        s09.post(new ARunnableS11S0210000_12((Object) s09, (C71791SFn) LIZIZ, (boolean) aqS67S0110000_12, (List<ActionLinkComponent>) 3));
    }
}
