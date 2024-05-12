package com.ss.android.ugc.aweme.qna.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionCollectionRequest {

    @InterfaceC65349Pkn("collection_category")
    public final int collectionCategory;

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("forum_recommend_scene")
    public final int forumRecommendScene;

    @InterfaceC65349Pkn("top_question_ids")
    public final List<Long> topQuestionIds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionCollectionRequest)) {
            return false;
        }
        QuestionCollectionRequest questionCollectionRequest = (QuestionCollectionRequest) obj;
        return this.cursor == questionCollectionRequest.cursor && this.count == questionCollectionRequest.count && this.collectionCategory == questionCollectionRequest.collectionCategory && this.forumRecommendScene == questionCollectionRequest.forumRecommendScene && o.LJ(this.topQuestionIds, questionCollectionRequest.topQuestionIds);
    }

    public final int hashCode() {
        int i = ((((((this.cursor * 31) + this.count) * 31) + this.collectionCategory) * 31) + this.forumRecommendScene) * 31;
        List<Long> list = this.topQuestionIds;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionCollectionRequest(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", collectionCategory=");
        LIZ.append(this.collectionCategory);
        LIZ.append(", forumRecommendScene=");
        LIZ.append(this.forumRecommendScene);
        LIZ.append(", topQuestionIds=");
        return C1NE.LIZIZ(LIZ, this.topQuestionIds, ')', LIZ);
    }

    public QuestionCollectionRequest(int i, int i2, int i3, int i4, List<Long> list) {
        this.cursor = i;
        this.count = i2;
        this.collectionCategory = i3;
        this.forumRecommendScene = i4;
        this.topQuestionIds = list;
    }

    public /* synthetic */ QuestionCollectionRequest(int i, int i2, int i3, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : list);
    }
}
