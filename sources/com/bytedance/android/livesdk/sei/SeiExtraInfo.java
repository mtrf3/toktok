package com.bytedance.android.livesdk.sei;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SeiExtraInfo {

    @InterfaceC65349Pkn("resume_cohost")
    public final SeiMultiCoHostStreamInfo anchorStreamStatusInfo;

    @InterfaceC65349Pkn("show_info")
    public final SeiLiveShowGuestInfo guestLiveShowInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiExtraInfo)) {
            return false;
        }
        SeiExtraInfo seiExtraInfo = (SeiExtraInfo) obj;
        return o.LJ(this.guestLiveShowInfo, seiExtraInfo.guestLiveShowInfo) && o.LJ(this.anchorStreamStatusInfo, seiExtraInfo.anchorStreamStatusInfo);
    }

    public final int hashCode() {
        SeiLiveShowGuestInfo seiLiveShowGuestInfo = this.guestLiveShowInfo;
        int hashCode = (seiLiveShowGuestInfo == null ? 0 : seiLiveShowGuestInfo.hashCode()) * 31;
        SeiMultiCoHostStreamInfo seiMultiCoHostStreamInfo = this.anchorStreamStatusInfo;
        return hashCode + (seiMultiCoHostStreamInfo != null ? seiMultiCoHostStreamInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeiExtraInfo(guestLiveShowInfo=");
        LIZ.append(this.guestLiveShowInfo);
        LIZ.append(", anchorStreamStatusInfo=");
        LIZ.append(this.anchorStreamStatusInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SeiExtraInfo(SeiLiveShowGuestInfo seiLiveShowGuestInfo, SeiMultiCoHostStreamInfo seiMultiCoHostStreamInfo) {
        this.guestLiveShowInfo = seiLiveShowGuestInfo;
        this.anchorStreamStatusInfo = seiMultiCoHostStreamInfo;
    }
}
