package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RatingData implements Serializable {

    @InterfaceC65349Pkn("isRequired")
    public final Boolean isRequired;

    @InterfaceC65349Pkn("optionList")
    public final List<FeelgoodOptionData> optionList;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("titleText")
    public final String titleText;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingData copy$default(RatingData ratingData, Boolean bool, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = ratingData.isRequired;
        }
        if ((i & 2) != 0) {
            num = ratingData.style;
        }
        if ((i & 4) != 0) {
            str = ratingData.titleText;
        }
        if ((i & 8) != 0) {
            list = ratingData.optionList;
        }
        return ratingData.copy(bool, num, str, list);
    }

    public final RatingData copy(Boolean bool, Integer num, String str, List<FeelgoodOptionData> list) {
        return new RatingData(bool, num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingData)) {
            return false;
        }
        RatingData ratingData = (RatingData) obj;
        return o.LJ(this.isRequired, ratingData.isRequired) && o.LJ(this.style, ratingData.style) && o.LJ(this.titleText, ratingData.titleText) && o.LJ(this.optionList, ratingData.optionList);
    }

    public int hashCode() {
        Boolean bool = this.isRequired;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.style;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.titleText;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<FeelgoodOptionData> list = this.optionList;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RatingData(isRequired=");
        LIZ.append(this.isRequired);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", titleText=");
        LIZ.append(this.titleText);
        LIZ.append(", optionList=");
        return C1NE.LIZIZ(LIZ, this.optionList, ')', LIZ);
    }

    public final List<FeelgoodOptionData> getOptionList() {
        return this.optionList;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public RatingData(Boolean bool, Integer num, String str, List<FeelgoodOptionData> list) {
        this.isRequired = bool;
        this.style = num;
        this.titleText = str;
        this.optionList = list;
    }
}
