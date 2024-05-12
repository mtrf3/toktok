package com.ss.android.ugc.aweme.qna.api;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.question.ForumStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TiktokV1ForumProfileQuestionsResponse {

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("boolean")
    public final boolean hasMore;

    @InterfaceC65349Pkn("msg")
    public final String msg;

    @InterfaceC65349Pkn("questions")
    public final List<ForumStruct> questions;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ForumProfileQuestionsResponse)) {
            return false;
        }
        TiktokV1ForumProfileQuestionsResponse tiktokV1ForumProfileQuestionsResponse = (TiktokV1ForumProfileQuestionsResponse) obj;
        return this.statusCode == tiktokV1ForumProfileQuestionsResponse.statusCode && o.LJ(this.msg, tiktokV1ForumProfileQuestionsResponse.msg) && o.LJ(this.questions, tiktokV1ForumProfileQuestionsResponse.questions) && this.cursor == tiktokV1ForumProfileQuestionsResponse.cursor && this.hasMore == tiktokV1ForumProfileQuestionsResponse.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.msg, this.statusCode * 31, 31);
        List<ForumStruct> list = this.questions;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i = (((LJ + hashCode) * 31) + this.cursor) * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokV1ForumProfileQuestionsResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", questions=");
        LIZ.append(this.questions);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.hasMore, ')', LIZ);
    }

    public TiktokV1ForumProfileQuestionsResponse(int i, String msg, List<ForumStruct> list, int i2, boolean z) {
        o.LJIIIZ(msg, "msg");
        this.statusCode = i;
        this.msg = msg;
        this.questions = list;
        this.cursor = i2;
        this.hasMore = z;
    }
}
