package com.bytedance.netecho.result;

import X.F9E;

/* loaded from: classes2.dex */
public final class IcmpPacketResult extends F9E {
    public final int errorCode;
    public final boolean success;
    public final float tripTimeMs;
    public final int ttl;

    public static /* synthetic */ IcmpPacketResult copy$default(IcmpPacketResult icmpPacketResult, boolean z, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = icmpPacketResult.success;
        }
        if ((i3 & 2) != 0) {
            i = icmpPacketResult.ttl;
        }
        if ((i3 & 4) != 0) {
            f = icmpPacketResult.tripTimeMs;
        }
        if ((i3 & 8) != 0) {
            i2 = icmpPacketResult.errorCode;
        }
        return icmpPacketResult.copy(z, i, f, i2);
    }

    public final IcmpPacketResult copy(boolean z, int i, float f, int i2) {
        return new IcmpPacketResult(z, i, f, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.success), Integer.valueOf(this.ttl), Float.valueOf(this.tripTimeMs), Integer.valueOf(this.errorCode)};
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final float getTripTimeMs() {
        return this.tripTimeMs;
    }

    public final int getTtl() {
        return this.ttl;
    }

    public IcmpPacketResult(boolean z, int i, float f, int i2) {
        this.success = z;
        this.ttl = i;
        this.tripTimeMs = f;
        this.errorCode = i2;
    }
}
