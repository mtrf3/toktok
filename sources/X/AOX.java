package X;

import Y.ALAdapterS3S0100000_4;
import Y.AUListenerS93S0100000_4;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.ss.android.ugc.aweme.survey.SurveyData;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public abstract class AOX implements View.OnClickListener {
    public final ViewStub LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public View LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public TextView LJLJLLL;
    public TextView LJLL;
    public AOU LJLLI;
    public SurveyData LJLLILLLL;
    public Animator LJLLJ;
    public ValueAnimator LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;

    public final void LIZ() {
        Animator animator = this.LJLLJ;
        if (animator == null || this.LJLLL == null) {
            return;
        }
        if (animator.isStarted() || this.LJLLJ.isRunning()) {
            this.LJLLJ.cancel();
        }
        if (!this.LJLLL.isStarted() && !this.LJLLL.isRunning()) {
            return;
        }
        this.LJLLL.cancel();
    }

    public final void LIZIZ() {
        if (this.LJLLL == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 0.0f, 1.0f);
            this.LJLLL = ofFloat;
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 14));
            this.LJLLL.addListener(new ALAdapterS3S0100000_4(this, 6));
            this.LJLLL.setDuration(600L);
        }
        if (!this.LJLLL.isStarted() && !this.LJLLL.isRunning()) {
            this.LJLLL.start();
        }
    }

    public final void LIZJ() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setTranslationY(view.getHeight());
        }
        ViewGroup.LayoutParams layoutParams = this.LJLJJLL.getLayoutParams();
        layoutParams.height = this.LJLILLLLZI.getHeight();
        this.LJLJJLL.setLayoutParams(layoutParams);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLILLLLZI, (Property<View, Float>) View.TRANSLATION_Y, r4.getMeasuredHeight(), 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new ALAdapterS3S0100000_4(this, 5));
        ofFloat.start();
    }

    public AOX(ViewStub viewStub) {
        this.LJLIL = viewStub;
        if (viewStub.getLayoutResource() <= 0) {
            viewStub.setLayoutResource(R.layout.c62);
        }
    }

    public static boolean LIZLLL(SurveyData surveyData) {
        if (surveyData != null && !TextUtils.isEmpty(surveyData.question) && !TextUtils.isEmpty(surveyData.answer1) && !TextUtils.isEmpty(surveyData.answer2) && !TextUtils.isEmpty(surveyData.resultTitle) && !TextUtils.isEmpty(surveyData.resultDesc)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        int id = view.getId();
        if (id == R.id.kv9) {
            AOU aou = this.LJLLI;
            if (aou != null) {
                aou.LIZ(3, this.LJLLILLLL, "");
                return;
            }
            return;
        }
        if (id == R.id.kvg) {
            AOU aou2 = this.LJLLI;
            if (aou2 == null) {
                return;
            }
            if (this.LJLZ) {
                SurveyData surveyData = this.LJLLILLLL;
                if (!TextUtils.isEmpty(surveyData.originAnswer2)) {
                    str4 = this.LJLLILLLL.originAnswer2;
                } else {
                    str4 = this.LJLLILLLL.answer2;
                }
                aou2.LIZ(2, surveyData, str4);
                return;
            }
            SurveyData surveyData2 = this.LJLLILLLL;
            if (!TextUtils.isEmpty(surveyData2.originAnswer1)) {
                str3 = this.LJLLILLLL.originAnswer1;
            } else {
                str3 = this.LJLLILLLL.answer1;
            }
            aou2.LIZ(1, surveyData2, str3);
            return;
        }
        if (id == R.id.kvn) {
            AOU aou3 = this.LJLLI;
            if (aou3 == null) {
                return;
            }
            if (this.LJLZ) {
                SurveyData surveyData3 = this.LJLLILLLL;
                if (!TextUtils.isEmpty(surveyData3.originAnswer1)) {
                    str2 = this.LJLLILLLL.originAnswer1;
                } else {
                    str2 = this.LJLLILLLL.answer1;
                }
                aou3.LIZ(1, surveyData3, str2);
                return;
            }
            SurveyData surveyData4 = this.LJLLILLLL;
            if (!TextUtils.isEmpty(surveyData4.originAnswer2)) {
                str = this.LJLLILLLL.originAnswer2;
            } else {
                str = this.LJLLILLLL.answer2;
            }
            aou3.LIZ(2, surveyData4, str);
            return;
        }
        if (id != R.id.kvm) {
            return;
        }
        this.LJLLLLLL = true;
        LIZ();
        AOU aou4 = this.LJLLI;
        if (aou4 == null) {
            return;
        }
        AOX aox = aou4.LIZ;
        View view2 = aox.LJLILLLLZI;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        aox.LIZ();
        aox.LJLLLL = false;
    }
}
