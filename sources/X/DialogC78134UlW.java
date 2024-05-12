package X;

import Y.ACListenerS33S0100000_13;
import Y.IDDListenerS152S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UlW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogC78134UlW extends DialogC29865Bnp implements InterfaceC78133UlV {
    public final DataChannel LJLJL;
    public final boolean LJLJLJ;
    public boolean LJLJLLL;
    public View LJLL;
    public ViewGroup LJLLI;
    public ImageView LJLLILLLL;
    public ViewGroup LJLLJ;
    public C47121t6 LJLLL;
    public LinearLayoutCompat LJLLLL;
    public ViewGroup LJLLLLLL;
    public C47121t6 LJLZ;
    public final AqS195S0100000_13 LJZ;
    public final AqS163S0100000_13 LJZI;

    @Override // X.InterfaceC78133UlV
    public final void LJJJZ() {
        if (o.LJ(this.LJLJL.kv0(PIPStatusData.class), Boolean.TRUE) || new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/survey/ui/widget/SurveyPopupDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "8022269118759583816")).LIZ) {
            return;
        }
        show();
    }

    public final void LJJIIJ() {
        if (this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = true;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.d1i, null, false);
        o.LJI(LLLLIILL);
        this.LJLL = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.kv4);
        o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.survey_b_content)");
        this.LJLLI = (ViewGroup) findViewById;
        View view = this.LJLL;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.kv3);
            o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.survey_b_close)");
            this.LJLLILLLL = (ImageView) findViewById2;
            View view2 = this.LJLL;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.kv7);
                o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R…vey_b_question_container)");
                this.LJLLJ = (ViewGroup) findViewById3;
                View view3 = this.LJLL;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.kv8);
                    o.LJIIIIZZ(findViewById4, "mRootView.findViewById(R.id.survey_b_title)");
                    this.LJLLL = (C47121t6) findViewById4;
                    View view4 = this.LJLL;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(R.id.kv2);
                        o.LJIIIIZZ(findViewById5, "mRootView.findViewById(R.id.survey_b_chooses)");
                        this.LJLLLL = (LinearLayoutCompat) findViewById5;
                        View view5 = this.LJLL;
                        if (view5 != null) {
                            View findViewById6 = view5.findViewById(R.id.kv5);
                            o.LJIIIIZZ(findViewById6, "mRootView.findViewById(R…vey_b_feedback_container)");
                            this.LJLLLLLL = (ViewGroup) findViewById6;
                            View view6 = this.LJLL;
                            if (view6 != null) {
                                View findViewById7 = view6.findViewById(R.id.kv6);
                                o.LJIIIIZZ(findViewById7, "mRootView.findViewById(R.id.survey_b_feedback_tip)");
                                this.LJLZ = (C47121t6) findViewById7;
                                return;
                            }
                            o.LJIJI("mRootView");
                            throw null;
                        }
                        o.LJIJI("mRootView");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLI() {
        ViewGroup viewGroup = this.LJLLI;
        if (viewGroup != null) {
            C03510Bv.LIZ(viewGroup, null);
            ViewGroup viewGroup2 = this.LJLLJ;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
                ViewGroup viewGroup3 = this.LJLLLLLL;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ImageView imageView = this.LJLLILLLL;
                    if (imageView != null) {
                        imageView.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("mCloseButton");
                        throw null;
                    }
                }
                o.LJIJI("mFeedbackContainer");
                throw null;
            }
            o.LJIJI("mQuestionContainer");
            throw null;
        }
        o.LJIJI("mContent");
        throw null;
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJZZI() {
        ViewGroup viewGroup = this.LJLLI;
        if (viewGroup != null) {
            C03510Bv.LIZ(viewGroup, null);
            ViewGroup viewGroup2 = this.LJLLJ;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                ViewGroup viewGroup3 = this.LJLLLLLL;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    ImageView imageView = this.LJLLILLLL;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("mCloseButton");
                        throw null;
                    }
                }
                o.LJIJI("mFeedbackContainer");
                throw null;
            }
            o.LJIJI("mQuestionContainer");
            throw null;
        }
        o.LJIJI("mContent");
        throw null;
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJLIL() {
        hide();
    }

    @Override // X.InterfaceC78133UlV
    public final void LJJJ(SurveyData surveyData) {
        float f;
        SurveyQuestion surveyQuestion = (SurveyQuestion) ListProtector.get(surveyData.questionList, 0);
        C47121t6 c47121t6 = this.LJLLL;
        if (c47121t6 != null) {
            c47121t6.setText(surveyQuestion.title);
            LinearLayoutCompat linearLayoutCompat = this.LJLLLL;
            if (linearLayoutCompat != null) {
                Object obj = ListProtector.get(surveyData.questionList, 0);
                o.LJIIIIZZ(obj, "it.questionList[0]");
                SurveyQuestion surveyQuestion2 = (SurveyQuestion) obj;
                if (this.LJLJLJ) {
                    f = 8.0f;
                } else {
                    f = 12.0f;
                }
                C78136UlY.LIZ(linearLayoutCompat, surveyQuestion2, R.layout.dj5, 0, f, this.LJZ);
                C47121t6 c47121t62 = this.LJLZ;
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

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LJJIIJ();
        View view = this.LJLL;
        if (view != null) {
            setContentView(view);
            hide();
            ImageView imageView = this.LJLLILLLL;
            if (imageView != null) {
                C16880lQ.LJIILLIIL(imageView, new ACListenerS33S0100000_13(this, 160));
                setOnDismissListener(new IDDListenerS152S0100000_13(this, 15));
                return;
            } else {
                o.LJIJI("mCloseButton");
                throw null;
            }
        }
        o.LJIJI("mRootView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC78134UlW(Context context, DataChannel dataChannel, boolean z) {
        super(context, z);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJL = dataChannel;
        this.LJLJLJ = z;
        this.LJZ = new AqS195S0100000_13(this, 60);
        this.LJZI = new AqS163S0100000_13(this, 394);
        LJJIIJ();
    }
}
