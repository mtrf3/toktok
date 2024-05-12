package com.ss.android.ugc.aweme.qna.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokV1ForumCategorySuggestResponse {

    @InterfaceC65349Pkn("msg")
    public final String message;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("question_category")
    public final List<QuestionCategoryStruct> suggestedCategories;

    /* JADX WARN: Multi-variable type inference failed */
    public TiktokV1ForumCategorySuggestResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ForumCategorySuggestResponse)) {
            return false;
        }
        TiktokV1ForumCategorySuggestResponse tiktokV1ForumCategorySuggestResponse = (TiktokV1ForumCategorySuggestResponse) obj;
        return o.LJ(this.statusCode, tiktokV1ForumCategorySuggestResponse.statusCode) && o.LJ(this.message, tiktokV1ForumCategorySuggestResponse.message) && o.LJ(this.suggestedCategories, tiktokV1ForumCategorySuggestResponse.suggestedCategories);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<QuestionCategoryStruct> list = this.suggestedCategories;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokV1ForumCategorySuggestResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", suggestedCategories=");
        return C1NE.LIZIZ(LIZ, this.suggestedCategories, ')', LIZ);
    }

    public TiktokV1ForumCategorySuggestResponse(Integer num, String str, List<QuestionCategoryStruct> list) {
        this.statusCode = num;
        this.message = str;
        this.suggestedCategories = list;
    }

    public /* synthetic */ TiktokV1ForumCategorySuggestResponse(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
