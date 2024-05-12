package com.ss.android.ugc.aweme.feed.prompt.api;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import webcast.api.feed.ExtraStructV2;
import webcast.api.feed.LogPbStructV2;

/* loaded from: classes5.dex */
public final class PromptTransformResp {

    @InterfaceC65349Pkn("highlight_words")
    public String highlightWords;

    @InterfaceC65349Pkn("instruction_id")
    public Long instructionId;

    @InterfaceC65349Pkn("is_reset")
    public Boolean isReset;

    @InterfaceC65349Pkn("log_pb")
    public LogPbStructV2 logPb;

    @InterfaceC65349Pkn("returned_query")
    public String returnQuery;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    @InterfaceC65349Pkn("extra_struct")
    public ExtraStructV2 status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public PromptTransformResp() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptTransformResp)) {
            return false;
        }
        PromptTransformResp promptTransformResp = (PromptTransformResp) obj;
        return this.statusCode == promptTransformResp.statusCode && o.LJ(this.statusMsg, promptTransformResp.statusMsg) && o.LJ(this.status_code, promptTransformResp.status_code) && o.LJ(this.logPb, promptTransformResp.logPb) && o.LJ(this.returnQuery, promptTransformResp.returnQuery) && o.LJ(this.highlightWords, promptTransformResp.highlightWords) && o.LJ(this.instructionId, promptTransformResp.instructionId) && o.LJ(this.isReset, promptTransformResp.isReset);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        ExtraStructV2 extraStructV2 = this.status_code;
        int hashCode2 = (hashCode + (extraStructV2 == null ? 0 : extraStructV2.hashCode())) * 31;
        LogPbStructV2 logPbStructV2 = this.logPb;
        int hashCode3 = (hashCode2 + (logPbStructV2 == null ? 0 : logPbStructV2.hashCode())) * 31;
        String str2 = this.returnQuery;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.highlightWords;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.instructionId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isReset;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromptTransformResp(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(", returnQuery=");
        LIZ.append(this.returnQuery);
        LIZ.append(", highlightWords=");
        LIZ.append(this.highlightWords);
        LIZ.append(", instructionId=");
        LIZ.append(this.instructionId);
        LIZ.append(", isReset=");
        return C78920UyC.LIZIZ(LIZ, this.isReset, ')', LIZ);
    }

    public PromptTransformResp(int i, String str, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, String str3, Long l, Boolean bool) {
        this.statusCode = i;
        this.statusMsg = str;
        this.status_code = extraStructV2;
        this.logPb = logPbStructV2;
        this.returnQuery = str2;
        this.highlightWords = str3;
        this.instructionId = l;
        this.isReset = bool;
    }

    public /* synthetic */ PromptTransformResp(int i, String str, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, String str2, String str3, Long l, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : extraStructV2, (i2 & 8) != 0 ? null : logPbStructV2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : l, (i2 & 128) == 0 ? bool : null);
    }
}
