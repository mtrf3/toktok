package com.ss.android.ugc.aweme.wiki;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CheckAnchorModerationResultResponse implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public final int code;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("review_result_type")
    public final Integer reviewResultType;

    @InterfaceC65349Pkn("review_text")
    public final String reviewText;

    public static /* synthetic */ CheckAnchorModerationResultResponse copy$default(CheckAnchorModerationResultResponse checkAnchorModerationResultResponse, int i, String str, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkAnchorModerationResultResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = checkAnchorModerationResultResponse.msg;
        }
        if ((i2 & 4) != 0) {
            num = checkAnchorModerationResultResponse.reviewResultType;
        }
        if ((i2 & 8) != 0) {
            str2 = checkAnchorModerationResultResponse.reviewText;
        }
        return checkAnchorModerationResultResponse.copy(i, str, num, str2);
    }

    public final CheckAnchorModerationResultResponse copy(int i, String str, Integer num, String str2) {
        return new CheckAnchorModerationResultResponse(i, str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAnchorModerationResultResponse)) {
            return false;
        }
        CheckAnchorModerationResultResponse checkAnchorModerationResultResponse = (CheckAnchorModerationResultResponse) obj;
        return this.code == checkAnchorModerationResultResponse.code && o.LJ(this.msg, checkAnchorModerationResultResponse.msg) && o.LJ(this.reviewResultType, checkAnchorModerationResultResponse.reviewResultType) && o.LJ(this.reviewText, checkAnchorModerationResultResponse.reviewText);
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.reviewResultType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.reviewText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckAnchorModerationResultResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", reviewResultType=");
        LIZ.append(this.reviewResultType);
        LIZ.append(", reviewText=");
        return q.LIZIZ(LIZ, this.reviewText, ')', LIZ);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getReviewResultType() {
        return this.reviewResultType;
    }

    public final String getReviewText() {
        return this.reviewText;
    }

    public CheckAnchorModerationResultResponse(int i, String str, Integer num, String str2) {
        this.code = i;
        this.msg = str;
        this.reviewResultType = num;
        this.reviewText = str2;
    }
}
