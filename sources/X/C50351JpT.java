package X;

import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.CustomText;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeelgoodSurveyModel;
import kotlin.jvm.internal.o;

/* renamed from: X.JpT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50351JpT {
    public final FeelgoodSurveyModel LIZ;
    public final String LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public final CustomText LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50351JpT)) {
            return false;
        }
        C50351JpT c50351JpT = (C50351JpT) obj;
        return o.LJ(this.LIZ, c50351JpT.LIZ) && o.LJ(this.LIZIZ, c50351JpT.LIZIZ) && o.LJ(this.LIZJ, c50351JpT.LIZJ) && o.LJ(this.LIZLLL, c50351JpT.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodSurveyQuestionModel(surveyContent=");
        LIZ.append(this.LIZ);
        LIZ.append(", authorization=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", signParamsMap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", customText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        FeelgoodSurveyModel feelgoodSurveyModel = this.LIZ;
        int i = 0;
        if (feelgoodSurveyModel == null) {
            hashCode = 0;
        } else {
            hashCode = feelgoodSurveyModel.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LIZ = C12400eC.LIZ(this.LIZJ, (i2 + hashCode2) * 31, 31);
        CustomText customText = this.LIZLLL;
        if (customText != null) {
            i = customText.hashCode();
        }
        return LIZ + i;
    }

    public C50351JpT(FeelgoodSurveyModel feelgoodSurveyModel, String str, java.util.Map<String, String> signParamsMap, CustomText customText) {
        o.LJIIIZ(signParamsMap, "signParamsMap");
        this.LIZ = feelgoodSurveyModel;
        this.LIZIZ = str;
        this.LIZJ = signParamsMap;
        this.LIZLLL = customText;
    }
}
