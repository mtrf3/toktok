package com.bytedance.netecho.result;

import X.C78966Uyw;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class TcpDetectResult extends Result {
    public final int errorCode;
    public final int errorStage;
    public final boolean success;

    public static /* synthetic */ TcpDetectResult copy$default(TcpDetectResult tcpDetectResult, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = tcpDetectResult.success;
        }
        if ((i3 & 2) != 0) {
            i = tcpDetectResult.errorStage;
        }
        if ((i3 & 4) != 0) {
            i2 = tcpDetectResult.errorCode;
        }
        return tcpDetectResult.copy(z, i, i2);
    }

    private Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.success), Integer.valueOf(this.errorStage), Integer.valueOf(this.errorCode)};
    }

    public final TcpDetectResult copy(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TcpDetectResult) {
            return C78966Uyw.LJIIIZ(((TcpDetectResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("TcpDetectResult:%s,%s,%s", getObjects());
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorStage() {
        return this.errorStage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public TcpDetectResult(boolean z, int i, int i2) {
        this.success = z;
        this.errorStage = i;
        this.errorCode = i2;
    }
}
