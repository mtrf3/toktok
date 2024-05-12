package com.bytedance.android.livesdk.survey.ui.widget;

import X.C03510Bv;
import X.C16880lQ;
import X.C47121t6;
import X.C78136UlY;
import X.InterfaceC78133UlV;
import Y.ACListenerS33S0100000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.BottomRightBannerShowChannel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SurveyCardWidget extends LiveRecyclableWidget implements InterfaceC78133UlV {
    public ImageView LJLIL;
    public ViewGroup LJLILLLLZI;
    public C47121t6 LJLJI;
    public LinearLayoutCompat LJLJJI;
    public ViewGroup LJLJJL;
    public C47121t6 LJLJJLL;
    public final AqS195S0100000_13 LJLJL = new AqS195S0100000_13(this, 20);
    public final AqS163S0100000_13 LJLJLJ = new AqS163S0100000_13(this, 233);
    public boolean LJLJLLL = true;
    public SurveyData LJLL;
    public boolean LJLLI;
    public float LJLLILLLL;

    @Override // X.InterfaceC78133UlV
    public final void LJJJZ() {
        this.LJLJLLL = false;
        show();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLIL() {
        this.LJLJLLL = true;
        hide();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dqn;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLI() {
        View view = this.contentView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C03510Bv.LIZ((ViewGroup) view, null);
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
            ViewGroup viewGroup2 = this.LJLJJL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                return;
            } else {
                o.LJIJI("mFeedbackContainer");
                throw null;
            }
        }
        o.LJIJI("mQuestionContainer");
        throw null;
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJZZI() {
        View view = this.contentView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C03510Bv.LIZ((ViewGroup) view, null);
        ViewGroup viewGroup = this.LJLILLLLZI;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.LJLJJL;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
                return;
            } else {
                o.LJIJI("mFeedbackContainer");
                throw null;
            }
        }
        o.LJIJI("mQuestionContainer");
        throw null;
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJJ(SurveyData surveyData) {
        this.LJLL = surveyData;
        SurveyQuestion surveyQuestion = (SurveyQuestion) ListProtector.get(surveyData.questionList, 0);
        C47121t6 c47121t6 = this.LJLJI;
        if (c47121t6 != null) {
            c47121t6.setText(surveyQuestion.title);
            LinearLayoutCompat linearLayoutCompat = this.LJLJJI;
            if (linearLayoutCompat != null) {
                Object obj = ListProtector.get(surveyData.questionList, 0);
                o.LJIIIIZZ(obj, "it.questionList[0]");
                C78136UlY.LIZ(linearLayoutCompat, (SurveyQuestion) obj, R.layout.dj2, 24, 8.0f, this.LJLJL);
                C47121t6 c47121t62 = this.LJLJJLL;
                if (c47121t62 != null) {
                    c47121t62.setText(surveyData.feedBack);
                    return;
                } else {
                    o.LJIJI("mFeedbackTip");
                    throw null;
                }
            }
            o.LJIJI("mChooseContainer");
            throw null;
        }
        o.LJIJI("mTitle");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById = findViewById(R.id.kuu);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.survey_a_close)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.kuz);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.survey_a_question_container)");
        this.LJLILLLLZI = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.kv1);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.survey_a_title)");
        this.LJLJI = (C47121t6) findViewById3;
        View findViewById4 = findViewById(R.id.kut);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.survey_a_chooses)");
        this.LJLJJI = (LinearLayoutCompat) findViewById4;
        View findViewById5 = findViewById(R.id.kuw);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.survey_a_feedback_container)");
        this.LJLJJL = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(R.id.kuy);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.survey_a_feedback_tip)");
        this.LJLJJLL = (C47121t6) findViewById6;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, BottomRightBannerShowChannel.class, new AqS171S0100000_5(this, 489));
        }
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS33S0100000_13(this, 92));
            if (this.LJLJLLL) {
                hide();
            } else {
                show();
            }
            SurveyData surveyData = this.LJLL;
            if (surveyData != null) {
                LJJJ(surveyData);
                return;
            }
            return;
        }
        o.LJIJI("mCloseButton");
        throw null;
    }
}
