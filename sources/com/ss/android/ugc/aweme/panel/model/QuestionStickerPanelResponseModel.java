package com.ss.android.ugc.aweme.panel.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionStickerPanelResponseModel {

    @InterfaceC65349Pkn("question_collection")
    public final List<QuestionCollection> questionCollectionList;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    public QuestionStickerPanelResponseModel() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionStickerPanelResponseModel)) {
            return false;
        }
        QuestionStickerPanelResponseModel questionStickerPanelResponseModel = (QuestionStickerPanelResponseModel) obj;
        return o.LJ(this.statusCode, questionStickerPanelResponseModel.statusCode) && o.LJ(this.questionCollectionList, questionStickerPanelResponseModel.questionCollectionList);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        return this.questionCollectionList.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionStickerPanelResponseModel(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", questionCollectionList=");
        return C1NE.LIZIZ(LIZ, this.questionCollectionList, ')', LIZ);
    }

    public QuestionStickerPanelResponseModel(Integer num, List<QuestionCollection> questionCollectionList) {
        o.LJIIIZ(questionCollectionList, "questionCollectionList");
        this.statusCode = num;
        this.questionCollectionList = questionCollectionList;
    }

    public QuestionStickerPanelResponseModel(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
