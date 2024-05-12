package com.ss.android.ugc.aweme.panel.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InviteRecommendMixQuestionStickerPanelResponseModel {

    @InterfaceC65349Pkn("mix_question_collection")
    public MixedQuestionCollection mixedQuestionCollection;

    @InterfaceC65349Pkn("msg")
    public final String msg;

    @InterfaceC65349Pkn("question_collection")
    public final List<QuestionCollection> questionCollectionList;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteRecommendMixQuestionStickerPanelResponseModel)) {
            return false;
        }
        InviteRecommendMixQuestionStickerPanelResponseModel inviteRecommendMixQuestionStickerPanelResponseModel = (InviteRecommendMixQuestionStickerPanelResponseModel) obj;
        return this.statusCode == inviteRecommendMixQuestionStickerPanelResponseModel.statusCode && o.LJ(this.msg, inviteRecommendMixQuestionStickerPanelResponseModel.msg) && o.LJ(this.questionCollectionList, inviteRecommendMixQuestionStickerPanelResponseModel.questionCollectionList) && o.LJ(this.mixedQuestionCollection, inviteRecommendMixQuestionStickerPanelResponseModel.mixedQuestionCollection);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteRecommendMixQuestionStickerPanelResponseModel(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", questionCollectionList=");
        LIZ.append(this.questionCollectionList);
        LIZ.append(", mixedQuestionCollection=");
        LIZ.append(this.mixedQuestionCollection);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.questionCollectionList, C79062V1e.LJ(this.msg, this.statusCode * 31, 31), 31);
        MixedQuestionCollection mixedQuestionCollection = this.mixedQuestionCollection;
        if (mixedQuestionCollection == null) {
            hashCode = 0;
        } else {
            hashCode = mixedQuestionCollection.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public InviteRecommendMixQuestionStickerPanelResponseModel(int i, String msg, List<QuestionCollection> questionCollectionList, MixedQuestionCollection mixedQuestionCollection) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(questionCollectionList, "questionCollectionList");
        this.statusCode = i;
        this.msg = msg;
        this.questionCollectionList = questionCollectionList;
        this.mixedQuestionCollection = mixedQuestionCollection;
    }

    public InviteRecommendMixQuestionStickerPanelResponseModel(int i, String str, List list, MixedQuestionCollection mixedQuestionCollection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? C61878OQg.INSTANCE : list, mixedQuestionCollection);
    }
}
