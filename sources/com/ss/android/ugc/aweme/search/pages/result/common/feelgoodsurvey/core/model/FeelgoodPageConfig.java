package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeelgoodPageConfig implements Serializable {

    @InterfaceC65349Pkn("headerConfig")
    public final FeelgoodHeaderConfig headerConfig;

    @InterfaceC65349Pkn("questionList")
    public final List<FeelgoodSurveyQuestion> questionList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeelgoodPageConfig copy$default(FeelgoodPageConfig feelgoodPageConfig, FeelgoodHeaderConfig feelgoodHeaderConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            feelgoodHeaderConfig = feelgoodPageConfig.headerConfig;
        }
        if ((i & 2) != 0) {
            list = feelgoodPageConfig.questionList;
        }
        return feelgoodPageConfig.copy(feelgoodHeaderConfig, list);
    }

    public final FeelgoodPageConfig copy(FeelgoodHeaderConfig feelgoodHeaderConfig, List<FeelgoodSurveyQuestion> list) {
        return new FeelgoodPageConfig(feelgoodHeaderConfig, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeelgoodPageConfig)) {
            return false;
        }
        FeelgoodPageConfig feelgoodPageConfig = (FeelgoodPageConfig) obj;
        return o.LJ(this.headerConfig, feelgoodPageConfig.headerConfig) && o.LJ(this.questionList, feelgoodPageConfig.questionList);
    }

    public int hashCode() {
        FeelgoodHeaderConfig feelgoodHeaderConfig = this.headerConfig;
        int hashCode = (feelgoodHeaderConfig == null ? 0 : feelgoodHeaderConfig.hashCode()) * 31;
        List<FeelgoodSurveyQuestion> list = this.questionList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodPageConfig(headerConfig=");
        LIZ.append(this.headerConfig);
        LIZ.append(", questionList=");
        return C1NE.LIZIZ(LIZ, this.questionList, ')', LIZ);
    }

    public final FeelgoodHeaderConfig getHeaderConfig() {
        return this.headerConfig;
    }

    public final List<FeelgoodSurveyQuestion> getQuestionList() {
        return this.questionList;
    }

    public FeelgoodPageConfig(FeelgoodHeaderConfig feelgoodHeaderConfig, List<FeelgoodSurveyQuestion> list) {
        this.headerConfig = feelgoodHeaderConfig;
        this.questionList = list;
    }
}
