package X;

import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.DistributeAuthorSurveyInfoModel;

/* loaded from: classes8.dex */
public final class GHO extends AbstractC65781Prl implements InterfaceC65784Pro<DistributeAuthorSurveyInfoModel> {
    public static final GHO LJLIL = new GHO();

    public GHO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final DistributeAuthorSurveyInfoModel invoke() {
        DistributeAuthorSurveyInfoModel LIZ = GHS.LIZ();
        if (LIZ == null) {
            return new DistributeAuthorSurveyInfoModel(0, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, 65535, null);
        }
        return LIZ;
    }
}
