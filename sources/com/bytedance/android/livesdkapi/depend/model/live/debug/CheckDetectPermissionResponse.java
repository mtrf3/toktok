package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CheckDetectPermissionResponse implements Serializable {

    @InterfaceC65349Pkn("detector_info")
    public DetectorInfo detectorInfo;

    @InterfaceC65349Pkn("status")
    public boolean status;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckDetectPermissionResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CheckDetectPermissionResponse copy$default(CheckDetectPermissionResponse checkDetectPermissionResponse, boolean z, DetectorInfo detectorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkDetectPermissionResponse.status;
        }
        if ((i & 2) != 0) {
            detectorInfo = checkDetectPermissionResponse.detectorInfo;
        }
        return checkDetectPermissionResponse.copy(z, detectorInfo);
    }

    public final CheckDetectPermissionResponse copy(boolean z, DetectorInfo detectorInfo) {
        return new CheckDetectPermissionResponse(z, detectorInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDetectPermissionResponse)) {
            return false;
        }
        CheckDetectPermissionResponse checkDetectPermissionResponse = (CheckDetectPermissionResponse) obj;
        return this.status == checkDetectPermissionResponse.status && o.LJ(this.detectorInfo, checkDetectPermissionResponse.detectorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.status;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        DetectorInfo detectorInfo = this.detectorInfo;
        return i + (detectorInfo == null ? 0 : detectorInfo.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckDetectPermissionResponse(status=");
        LIZ.append(this.status);
        LIZ.append(", detectorInfo=");
        LIZ.append(this.detectorInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final DetectorInfo getDetectorInfo() {
        return this.detectorInfo;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final void setDetectorInfo(DetectorInfo detectorInfo) {
        this.detectorInfo = detectorInfo;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    public CheckDetectPermissionResponse(boolean z, DetectorInfo detectorInfo) {
        this.status = z;
        this.detectorInfo = detectorInfo;
    }

    public /* synthetic */ CheckDetectPermissionResponse(boolean z, DetectorInfo detectorInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : detectorInfo);
    }
}
