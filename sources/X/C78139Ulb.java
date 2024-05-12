package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ulb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78139Ulb<T> implements Observer {
    public final /* synthetic */ C78140Ulc LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C78139Ulb(C78140Ulc c78140Ulc, LivePlayFragment livePlayFragment, boolean z) {
        this.LJLIL = c78140Ulc;
        this.LJLILLLLZI = livePlayFragment;
        this.LJLJI = z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<SurveyQuestion> list;
        SurveyData surveyData = (SurveyData) obj;
        if (surveyData != null && (list = surveyData.questionList) != null && list.size() > 0) {
            C78140Ulc c78140Ulc = this.LJLIL;
            Fragment fragment = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            Context context = c78140Ulc.getContext();
            o.LJIIIIZZ(context, "context");
            C78137UlZ c78137UlZ = new C78137UlZ(context);
            c78137UlZ.setFragment(fragment);
            c78137UlZ.LIZ(surveyData, ((c78140Ulc.getRealScreenHeight() * 0.86f) / 2) + Math.abs(c78140Ulc.LL), z);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 1;
            c78137UlZ.setLayoutParams(layoutParams);
            c78140Ulc.getSurveyContentContainer().addView(c78137UlZ, layoutParams);
            c78140Ulc.setSurveyEnable(true);
        }
    }
}
