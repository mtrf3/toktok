package com.bytedance.netecho.result;

import X.C08380Uo;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class IcmpDetectResult extends Result {
    public final int errorCode;
    public final int errorStage;
    public final IcmpPacketResult[] packetResults;
    public final boolean success;

    public static /* synthetic */ IcmpDetectResult copy$default(IcmpDetectResult icmpDetectResult, boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = icmpDetectResult.success;
        }
        if ((i3 & 2) != 0) {
            icmpPacketResultArr = icmpDetectResult.packetResults;
        }
        if ((i3 & 4) != 0) {
            i = icmpDetectResult.errorStage;
        }
        if ((i3 & 8) != 0) {
            i2 = icmpDetectResult.errorCode;
        }
        return icmpDetectResult.copy(z, icmpPacketResultArr, i, i2);
    }

    public final IcmpDetectResult copy(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IcmpDetectResult) {
                IcmpDetectResult icmpDetectResult = (IcmpDetectResult) obj;
                if (this.success != icmpDetectResult.success || !o.LJ(this.packetResults, icmpDetectResult.packetResults) || this.errorStage != icmpDetectResult.errorStage || this.errorCode != icmpDetectResult.errorCode) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        IcmpPacketResult[] icmpPacketResultArr = this.packetResults;
        return ((((i + (icmpPacketResultArr != null ? Arrays.hashCode(icmpPacketResultArr) : 0)) * 31) + this.errorStage) * 31) + this.errorCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IcmpDetectResult(success=");
        LIZ.append(this.success);
        LIZ.append(", packetResults=");
        LIZ.append(Arrays.toString(this.packetResults));
        LIZ.append(", errorStage=");
        LIZ.append(this.errorStage);
        LIZ.append(", errorCode=");
        return C08380Uo.LIZ(LIZ, this.errorCode, ")", LIZ);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorStage() {
        return this.errorStage;
    }

    public final IcmpPacketResult[] getPacketResults() {
        return this.packetResults;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public IcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        this.success = z;
        this.packetResults = icmpPacketResultArr;
        this.errorStage = i;
        this.errorCode = i2;
    }
}
