package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeelgoodSingleChoiceData implements Serializable {

    @InterfaceC65349Pkn("optionList")
    public final List<FeelgoodOptionData> optionList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeelgoodSingleChoiceData copy$default(FeelgoodSingleChoiceData feelgoodSingleChoiceData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feelgoodSingleChoiceData.optionList;
        }
        return feelgoodSingleChoiceData.copy(list);
    }

    public final FeelgoodSingleChoiceData copy(List<FeelgoodOptionData> list) {
        return new FeelgoodSingleChoiceData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeelgoodSingleChoiceData) && o.LJ(this.optionList, ((FeelgoodSingleChoiceData) obj).optionList);
    }

    public int hashCode() {
        List<FeelgoodOptionData> list = this.optionList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodSingleChoiceData(optionList=");
        return C1NE.LIZIZ(LIZ, this.optionList, ')', LIZ);
    }

    public final List<FeelgoodOptionData> getOptionList() {
        return this.optionList;
    }

    public FeelgoodSingleChoiceData(List<FeelgoodOptionData> list) {
        this.optionList = list;
    }
}
