package Y;

import X.C76612U4y;
import X.C78137UlZ;
import X.InterfaceC88472Yns;
import X.KL2;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.android.livesdk.survey.fullscreenstyle.SurveyViewModel;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDAListenerS237S0100000_13 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
    }

    public static final void onAnimationStart$3(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
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
                onAnimationStart$3(this, animation);
                return;
            case 4:
                o.LJIIIZ(animation, "animation");
                return;
            default:
                return;
        }
    }

    public IDAListenerS237S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
        KL2.LJIILLIIL(4, ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView1());
        ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2().setAlpha(1.0f);
        ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2().setScaleX(1.0f);
        ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2().setScaleY(1.0f);
    }

    public static final void onAnimationEnd$1(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
        KL2.LJIILLIIL(4, ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2());
        ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2().setAlpha(1.0f);
        ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2().setScaleX(1.0f);
        ((C76612U4y) iDAListenerS237S0100000_13.l0).getMAnimView2().setScaleY(1.0f);
    }

    public static final void onAnimationEnd$2(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
        ((VideoUserCardAssem) iDAListenerS237S0100000_13.l0).q4(true, false);
    }

    public static final void onAnimationEnd$3(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
        SurveyQuestion surveyQuestion;
        String str;
        C78137UlZ c78137UlZ = (C78137UlZ) iDAListenerS237S0100000_13.l0;
        SurveyViewModel surveyViewModel = c78137UlZ.LJLLL;
        if (surveyViewModel != null && (surveyQuestion = surveyViewModel.LJLILLLLZI) != null && (str = surveyQuestion.title) != null) {
            c78137UlZ.getTitleTv().setText(str);
        }
        ((C78137UlZ) iDAListenerS237S0100000_13.l0).getSubmitBtn().setVisibility(8);
        ((C78137UlZ) iDAListenerS237S0100000_13.l0).getGoBack().setVisibility(8);
        ((C78137UlZ) iDAListenerS237S0100000_13.l0).getSecondItemsContainer().setVisibility(8);
        ((C78137UlZ) iDAListenerS237S0100000_13.l0).getItemsContainer().setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setFillAfter(true);
        ((C78137UlZ) iDAListenerS237S0100000_13.l0).startAnimation(alphaAnimation);
    }

    public static final void onAnimationEnd$4(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDAListenerS237S0100000_13.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(animation);
        }
    }

    public static final void onAnimationStart$2(IDAListenerS237S0100000_13 iDAListenerS237S0100000_13, Animation animation) {
        ((VideoUserCardAssem) iDAListenerS237S0100000_13.l0).q4(true, true);
    }
}
