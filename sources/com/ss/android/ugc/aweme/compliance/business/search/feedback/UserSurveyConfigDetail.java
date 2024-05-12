package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UserSurveyConfigDetail extends F9E implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("scene_type")
    public final int sceneType;

    @InterfaceC65349Pkn("survey_config")
    public final List<SurveyConfig> surveyConfig;

    public UserSurveyConfigDetail() {
        this(0, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSurveyConfigDetail copy$default(UserSurveyConfigDetail userSurveyConfigDetail, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSurveyConfigDetail.sceneType;
        }
        if ((i2 & 2) != 0) {
            list = userSurveyConfigDetail.surveyConfig;
        }
        return userSurveyConfigDetail.copy(i, list);
    }

    public final UserSurveyConfigDetail copy(int i, List<SurveyConfig> surveyConfig) {
        o.LJIIIZ(surveyConfig, "surveyConfig");
        return new UserSurveyConfigDetail(i, surveyConfig);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.sceneType), this.surveyConfig};
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    public final List<SurveyConfig> getSurveyConfig() {
        return this.surveyConfig;
    }

    public UserSurveyConfigDetail(int i, List<SurveyConfig> surveyConfig) {
        o.LJIIIZ(surveyConfig, "surveyConfig");
        this.sceneType = i;
        this.surveyConfig = surveyConfig;
    }

    public UserSurveyConfigDetail(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
