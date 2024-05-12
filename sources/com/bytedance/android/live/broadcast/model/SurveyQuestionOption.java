package com.bytedance.android.live.broadcast.model;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SurveyQuestionOption {

    @InterfaceC65349Pkn("help_text")
    public final String helpText;

    @InterfaceC65349Pkn("option_index")
    public final int optionIndex;

    @InterfaceC65349Pkn("option_text")
    public final String optionText;

    @InterfaceC65349Pkn("sub_options")
    public final List<SurveyQuestionOption> subOptions;

    @InterfaceC65349Pkn("input_type")
    public final int type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyQuestionOption)) {
            return false;
        }
        SurveyQuestionOption surveyQuestionOption = (SurveyQuestionOption) obj;
        return this.optionIndex == surveyQuestionOption.optionIndex && o.LJ(this.optionText, surveyQuestionOption.optionText) && o.LJ(this.helpText, surveyQuestionOption.helpText) && this.type == surveyQuestionOption.type && o.LJ(this.subOptions, surveyQuestionOption.subOptions);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.optionText, this.optionIndex * 31, 31);
        String str = this.helpText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((LJ + hashCode) * 31) + this.type) * 31;
        List<SurveyQuestionOption> list = this.subOptions;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SurveyQuestionOption(optionIndex=");
        LIZ.append(this.optionIndex);
        LIZ.append(", optionText=");
        LIZ.append(this.optionText);
        LIZ.append(", helpText=");
        LIZ.append(this.helpText);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", subOptions=");
        return C1NE.LIZIZ(LIZ, this.subOptions, ')', LIZ);
    }

    public SurveyQuestionOption(int i, String optionText, String str, int i2, List<SurveyQuestionOption> list) {
        o.LJIIIZ(optionText, "optionText");
        this.optionIndex = i;
        this.optionText = optionText;
        this.helpText = str;
        this.type = i2;
        this.subOptions = list;
    }

    public /* synthetic */ SurveyQuestionOption(int i, String str, String str2, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i3 & 4) != 0 ? null : str2, i2, (i3 & 16) == 0 ? list : null);
    }
}
