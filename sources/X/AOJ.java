package X;

import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.ss.android.ugc.aweme.survey.SurveyData;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AOJ {
    public final WeakReference<MyProfileGuideViewModel> LIZ;

    public final void LIZIZ() {
        MyProfileGuideViewModel myProfileGuideViewModel = this.LIZ.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.Hv0(AOK.LJLIL);
        }
    }

    public AOJ(MyProfileGuideViewModel profileGuideViewModel) {
        o.LJIIIZ(profileGuideViewModel, "profileGuideViewModel");
        this.LIZ = new WeakReference<>(profileGuideViewModel);
    }

    public final void LIZ(SurveyData surveyData) {
        MyProfileGuideViewModel myProfileGuideViewModel = this.LIZ.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.setState(new AqS170S0100000_4(surveyData, 971));
        }
    }
}
