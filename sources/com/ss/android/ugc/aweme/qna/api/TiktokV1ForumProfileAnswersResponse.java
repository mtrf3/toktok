package com.ss.android.ugc.aweme.qna.api;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TiktokV1ForumProfileAnswersResponse {

    @InterfaceC65349Pkn("answers")
    public final List<AnswerStruct> answers;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("boolean")
    public final boolean hasMore;

    @InterfaceC65349Pkn("msg")
    public final String msg;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokV1ForumProfileAnswersResponse)) {
            return false;
        }
        TiktokV1ForumProfileAnswersResponse tiktokV1ForumProfileAnswersResponse = (TiktokV1ForumProfileAnswersResponse) obj;
        return this.statusCode == tiktokV1ForumProfileAnswersResponse.statusCode && o.LJ(this.msg, tiktokV1ForumProfileAnswersResponse.msg) && o.LJ(this.answers, tiktokV1ForumProfileAnswersResponse.answers) && this.cursor == tiktokV1ForumProfileAnswersResponse.cursor && this.hasMore == tiktokV1ForumProfileAnswersResponse.hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.msg, this.statusCode * 31, 31);
        List<AnswerStruct> list = this.answers;
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
        LIZ.append("TiktokV1ForumProfileAnswersResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", answers=");
        LIZ.append(this.answers);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        return C48339Iy7.LIZJ(LIZ, this.hasMore, ')', LIZ);
    }

    public TiktokV1ForumProfileAnswersResponse(int i, String msg, List<AnswerStruct> list, int i2, boolean z) {
        o.LJIIIZ(msg, "msg");
        this.statusCode = i;
        this.msg = msg;
        this.answers = list;
        this.cursor = i2;
        this.hasMore = z;
    }
}
