package com.ss.android.ugc.aweme.feed.prompt.api;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import webcast.api.feed.ExtraStructV2;
import webcast.api.feed.LogPbStructV2;

/* loaded from: classes5.dex */
public final class InstructionResp {

    @InterfaceC65349Pkn("extra")
    public final ExtraStructV2 extra;

    @InterfaceC65349Pkn("instructions")
    public final List<Instruction> instructions;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbStructV2 logPb;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public InstructionResp() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionResp)) {
            return false;
        }
        InstructionResp instructionResp = (InstructionResp) obj;
        return this.statusCode == instructionResp.statusCode && o.LJ(this.statusMsg, instructionResp.statusMsg) && o.LJ(this.extra, instructionResp.extra) && o.LJ(this.logPb, instructionResp.logPb) && o.LJ(this.instructions, instructionResp.instructions);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.statusMsg, this.statusCode * 31, 31);
        ExtraStructV2 extraStructV2 = this.extra;
        int i = 0;
        if (extraStructV2 == null) {
            hashCode = 0;
        } else {
            hashCode = extraStructV2.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        LogPbStructV2 logPbStructV2 = this.logPb;
        if (logPbStructV2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = logPbStructV2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Instruction> list = this.instructions;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InstructionResp(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(", instructions=");
        return C1NE.LIZIZ(LIZ, this.instructions, ')', LIZ);
    }

    public InstructionResp(int i, String statusMsg, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, List<Instruction> list) {
        o.LJIIIZ(statusMsg, "statusMsg");
        this.statusCode = i;
        this.statusMsg = statusMsg;
        this.extra = extraStructV2;
        this.logPb = logPbStructV2;
        this.instructions = list;
    }

    public /* synthetic */ InstructionResp(int i, String str, ExtraStructV2 extraStructV2, LogPbStructV2 logPbStructV2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : extraStructV2, (i2 & 8) != 0 ? null : logPbStructV2, (i2 & 16) == 0 ? list : null);
    }
}
