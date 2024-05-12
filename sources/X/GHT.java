package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;

/* loaded from: classes8.dex */
public final class GHT extends AbstractC65781Prl implements InterfaceC65784Pro<DistributeAuthorSurveyInfoModel> {
    public static final GHT LJLIL = new GHT();

    public GHT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final DistributeAuthorSurveyInfoModel invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("distribute_author_survey_info", DistributeAuthorSurveyInfoModel.class, null);
    }
}
