package Y;

import X.B83;
import X.C05170If;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C29306Beo;
import X.C67981Qm9;
import X.C76800UCe;
import X.C76939UHn;
import X.C78137UlZ;
import X.C86881Y7x;
import X.InterfaceC05190Ih;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.UDY;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.model.message.GuidePageResource;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDAListenerS145S0200000_13 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationRepeat$0(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    public static final void onAnimationStart$2(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            case 4:
                onAnimationEnd$4(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            case 3:
                onAnimationRepeat$3(this, animation);
                return;
            case 4:
                o.LJIIIZ(animation, "animation");
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            case 3:
                C0NB.LIZIZ("LiveEducationHelper", " bubble anim start");
                return;
            case 4:
                o.LJIIIZ(animation, "animation");
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
        SurveyOption surveyOption;
        C78137UlZ c78137UlZ = (C78137UlZ) iDAListenerS145S0200000_13.l0;
        SurveyViewModel surveyViewModel = c78137UlZ.LJLLL;
        if (surveyViewModel != null && (surveyOption = surveyViewModel.LJLJI) != null) {
            if (!TextUtils.isEmpty(surveyOption.mainTitle)) {
                c78137UlZ.getTitleTv().setText(surveyOption.mainTitle);
            }
            if (!TextUtils.isEmpty(surveyOption.subTitle)) {
                c78137UlZ.getSubTitleTv().setText(surveyOption.subTitle);
            }
        }
        ((C78137UlZ) iDAListenerS145S0200000_13.l0).LIZJ((SurveyOption) iDAListenerS145S0200000_13.l1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        ((C78137UlZ) iDAListenerS145S0200000_13.l0).startAnimation(alphaAnimation);
    }

    public static final void onAnimationEnd$1(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
        ((View) iDAListenerS145S0200000_13.l0).setVisibility(8);
        ((InterfaceC65784Pro) iDAListenerS145S0200000_13.l1).invoke();
    }

    public static final void onAnimationEnd$2(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
        ((View) iDAListenerS145S0200000_13.l0).setVisibility(8);
        ((InterfaceC65784Pro) iDAListenerS145S0200000_13.l1).invoke();
    }

    public static final void onAnimationEnd$3(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        C0NB.LIZIZ("LiveEducationHelper", " bubble anim end");
        FrameLayout frameLayout = ((UDY) iDAListenerS145S0200000_13.l0).LIZLLL;
        if (frameLayout != null && (animate = frameLayout.animate()) != null && (scaleX = animate.scaleX(1.0f)) != null) {
            scaleX.scaleY(1.0f);
        }
        TextView textView = ((UDY) iDAListenerS145S0200000_13.l0).LIZ;
        if (textView != null) {
            C29306Beo.LJJLJLI(textView);
        }
        try {
            String str = ((Text) ORZ.LJLLJ(((GuidePageResource) ORZ.LJLLJ(((GiftGuideMessage) iDAListenerS145S0200000_13.l1).guidePageResources)).texts)).key;
            if (str == null || str.length() == 0) {
                TextView textView2 = ((UDY) iDAListenerS145S0200000_13.l0).LIZ;
                if (textView2 != null) {
                    String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lkk);
                    o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_giftEdu_entry_hi)");
                    InterfaceC05190Ih currentUser = B83.LIZ().LIZIZ().getCurrentUser();
                    o.LJII(currentUser, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
                    String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{C05170If.LIZLLL((User) currentUser)}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    textView2.setText(LLLZ);
                }
            } else {
                TextView textView3 = ((UDY) iDAListenerS145S0200000_13.l0).LIZ;
                if (textView3 != null) {
                    String LIZ = C86881Y7x.LIZIZ().LIZ(((Text) ORZ.LJLLJ(((GuidePageResource) ORZ.LJLLJ(((GiftGuideMessage) iDAListenerS145S0200000_13.l1).guidePageResources)).texts)).key);
                    o.LJIIIIZZ(LIZ, "inst()\n                 …irst().texts.first().key)");
                    InterfaceC05190Ih currentUser2 = B83.LIZ().LIZIZ().getCurrentUser();
                    o.LJII(currentUser2, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
                    String LLLZ2 = C16880lQ.LLLZ(LIZ, Arrays.copyOf(new Object[]{C05170If.LIZLLL((User) currentUser2)}, 1));
                    o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                    textView3.setText(LLLZ2);
                }
            }
        } catch (Exception unused) {
            TextView textView4 = ((UDY) iDAListenerS145S0200000_13.l0).LIZ;
            if (textView4 == null) {
                return;
            }
            String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lkk);
            o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_giftEdu_entry_hi)");
            InterfaceC05190Ih currentUser3 = B83.LIZ().LIZIZ().getCurrentUser();
            o.LJII(currentUser3, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
            C67981Qm9.LIZIZ(new Object[]{C05170If.LIZLLL((User) currentUser3)}, 1, LJIILJJIL2, "format(format, *args)", textView4);
        }
    }

    public static final void onAnimationEnd$4(IDAListenerS145S0200000_13 iDAListenerS145S0200000_13, Animation animation) {
        o.LJIIIZ(animation, "animation");
        C76939UHn c76939UHn = (C76939UHn) iDAListenerS145S0200000_13.l0;
        c76939UHn.post(new ARunnableS32S0200000_13(c76939UHn, (TuxIconView) iDAListenerS145S0200000_13.l1, 117));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDAListenerS145S0200000_13(Object obj, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = view;
    }

    public IDAListenerS145S0200000_13(C78137UlZ c78137UlZ, SurveyOption surveyOption, SurveyOption surveyOption2, int i) {
        this.$t = i;
        this.l0 = c78137UlZ;
        this.l1 = surveyOption2;
    }
}
