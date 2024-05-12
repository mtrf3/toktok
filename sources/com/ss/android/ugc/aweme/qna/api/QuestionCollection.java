package com.ss.android.ugc.aweme.qna.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.question.ForumStruct;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuestionCollection {

    @InterfaceC65349Pkn("collection_category")
    public final int collectionCategory;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("has_more")
    public final int hasMore;

    @InterfaceC65349Pkn("question_list")
    public final List<ForumStruct> questionList;

    @InterfaceC65349Pkn("remaining_question_count")
    public final Integer remainingQuestionCount;

    @InterfaceC65349Pkn("violated_question_count")
    public final Integer violatedQuestionCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionCollection)) {
            return false;
        }
        QuestionCollection questionCollection = (QuestionCollection) obj;
        return this.collectionCategory == questionCollection.collectionCategory && o.LJ(this.questionList, questionCollection.questionList) && this.cursor == questionCollection.cursor && this.hasMore == questionCollection.hasMore && o.LJ(this.remainingQuestionCount, questionCollection.remainingQuestionCount) && o.LJ(this.violatedQuestionCount, questionCollection.violatedQuestionCount);
    }

    public final int hashCode() {
        int i = this.collectionCategory * 31;
        List<ForumStruct> list = this.questionList;
        int hashCode = (((((i + (list == null ? 0 : list.hashCode())) * 31) + this.cursor) * 31) + this.hasMore) * 31;
        Integer num = this.remainingQuestionCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.violatedQuestionCount;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionCollection(collectionCategory=");
        LIZ.append(this.collectionCategory);
        LIZ.append(", questionList=");
        LIZ.append(this.questionList);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", remainingQuestionCount=");
        LIZ.append(this.remainingQuestionCount);
        LIZ.append(", violatedQuestionCount=");
        return s0.LIZJ(LIZ, this.violatedQuestionCount, ')', LIZ);
    }

    public QuestionCollection(int i, List<ForumStruct> list, int i2, int i3, Integer num, Integer num2) {
        this.collectionCategory = i;
        this.questionList = list;
        this.cursor = i2;
        this.hasMore = i3;
        this.remainingQuestionCount = num;
        this.violatedQuestionCount = num2;
    }
}
