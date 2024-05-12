package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import java.util.List;

/* loaded from: classes7.dex */
public final class G0R implements InterfaceC247699np {
    public final /* synthetic */ IComplianceService LIZ;
    public final /* synthetic */ PickYourAdPlanPage LIZIZ;
    public final /* synthetic */ List<NewUserJourneyStep> LIZJ;
    public final /* synthetic */ G13 LIZLLL;

    @Override // X.InterfaceC247699np
    public final void onFail() {
        this.LIZLLL.LJJJJI().invoke();
    }

    @Override // X.InterfaceC247699np
    public final void onSuccess() {
        NewUserJourneyStep newUserJourneyStep;
        String str;
        Fragment LJIIZILJ = this.LIZ.LJIIZILJ(new G1K(this.LIZLLL), this.LIZIZ);
        List<NewUserJourneyStep> list = this.LIZJ;
        if (list != null && (newUserJourneyStep = (NewUserJourneyStep) ListProtector.get(list, 0)) != null && (str = newUserJourneyStep.abExposeVid) != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str);
        }
        this.LIZLLL.j8().invoke(LJIIZILJ);
    }

    public G0R(IComplianceService iComplianceService, PickYourAdPlanPage pickYourAdPlanPage, List list, ComponentDependencies componentDependencies) {
        this.LIZ = iComplianceService;
        this.LIZIZ = pickYourAdPlanPage;
        this.LIZJ = list;
        this.LIZLLL = componentDependencies;
    }
}
