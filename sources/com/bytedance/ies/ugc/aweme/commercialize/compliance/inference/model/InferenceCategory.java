package com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InferenceCategory extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("active_interest_tags")
    public final List<LabelData> activeInterestTags;

    @InterfaceC65349Pkn("description_learn_more_link")
    public final String descriptionLearnMoreLink;

    @InterfaceC65349Pkn("gender_tag")
    public final Gender genderTag;

    @InterfaceC65349Pkn("inactive_interest_tags")
    public final List<LabelData> inactiveInterestTags;

    @InterfaceC65349Pkn("interest_learn_more_link")
    public final String interestLearnMoreLink;

    @InterfaceC65349Pkn("interest_tags")
    public final List<LabelData> interestTags;

    /* JADX WARN: Multi-variable type inference failed */
    public InferenceCategory() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InferenceCategory copy$default(InferenceCategory inferenceCategory, List list, List list2, List list3, Gender gender, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = inferenceCategory.interestTags;
        }
        if ((i & 2) != 0) {
            list2 = inferenceCategory.activeInterestTags;
        }
        if ((i & 4) != 0) {
            list3 = inferenceCategory.inactiveInterestTags;
        }
        if ((i & 8) != 0) {
            gender = inferenceCategory.genderTag;
        }
        if ((i & 16) != 0) {
            str = inferenceCategory.descriptionLearnMoreLink;
        }
        if ((i & 32) != 0) {
            str2 = inferenceCategory.interestLearnMoreLink;
        }
        return inferenceCategory.copy(list, list2, list3, gender, str, str2);
    }

    public final InferenceCategory copy(List<LabelData> list, List<LabelData> list2, List<LabelData> list3, Gender gender, String str, String str2) {
        return new InferenceCategory(list, list2, list3, gender, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InferenceCategory)) {
            return false;
        }
        InferenceCategory inferenceCategory = (InferenceCategory) obj;
        return o.LJ(this.interestTags, inferenceCategory.interestTags) && o.LJ(this.activeInterestTags, inferenceCategory.activeInterestTags) && o.LJ(this.inactiveInterestTags, inferenceCategory.inactiveInterestTags) && o.LJ(this.genderTag, inferenceCategory.genderTag) && o.LJ(this.descriptionLearnMoreLink, inferenceCategory.descriptionLearnMoreLink) && o.LJ(this.interestLearnMoreLink, inferenceCategory.interestLearnMoreLink);
    }

    public int hashCode() {
        List<LabelData> list = this.interestTags;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LabelData> list2 = this.activeInterestTags;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LabelData> list3 = this.inactiveInterestTags;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Gender gender = this.genderTag;
        int hashCode4 = (hashCode3 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str = this.descriptionLearnMoreLink;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interestLearnMoreLink;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InferenceCategory(interestTags=");
        LIZ.append(this.interestTags);
        LIZ.append(", activeInterestTags=");
        LIZ.append(this.activeInterestTags);
        LIZ.append(", inactiveInterestTags=");
        LIZ.append(this.inactiveInterestTags);
        LIZ.append(", genderTag=");
        LIZ.append(this.genderTag);
        LIZ.append(", descriptionLearnMoreLink=");
        LIZ.append(this.descriptionLearnMoreLink);
        LIZ.append(", interestLearnMoreLink=");
        return q.LIZIZ(LIZ, this.interestLearnMoreLink, ')', LIZ);
    }

    public final List<LabelData> getActiveInterestTags() {
        return this.activeInterestTags;
    }

    public final String getDescriptionLearnMoreLink() {
        return this.descriptionLearnMoreLink;
    }

    public final Gender getGenderTag() {
        return this.genderTag;
    }

    public final List<LabelData> getInactiveInterestTags() {
        return this.inactiveInterestTags;
    }

    public final String getInterestLearnMoreLink() {
        return this.interestLearnMoreLink;
    }

    public final List<LabelData> getInterestTags() {
        return this.interestTags;
    }

    public InferenceCategory(List<LabelData> list, List<LabelData> list2, List<LabelData> list3, Gender gender, String str, String str2) {
        this.interestTags = list;
        this.activeInterestTags = list2;
        this.inactiveInterestTags = list3;
        this.genderTag = gender;
        this.descriptionLearnMoreLink = str;
        this.interestLearnMoreLink = str2;
    }

    public /* synthetic */ InferenceCategory(List list, List list2, List list3, Gender gender, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : gender, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null);
    }
}
