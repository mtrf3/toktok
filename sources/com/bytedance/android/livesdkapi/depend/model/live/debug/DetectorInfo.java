package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DetectorInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("detector_email")
    public String detectorEmail;

    @InterfaceC65349Pkn("detector_id")
    public long detectorId;

    /* JADX WARN: Multi-variable type inference failed */
    public DetectorInfo() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DetectorInfo copy$default(DetectorInfo detectorInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = detectorInfo.detectorId;
        }
        if ((i & 2) != 0) {
            str = detectorInfo.detectorEmail;
        }
        return detectorInfo.copy(j, str);
    }

    public final DetectorInfo copy(long j, String detectorEmail) {
        o.LJIIIZ(detectorEmail, "detectorEmail");
        return new DetectorInfo(j, detectorEmail);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.detectorId), this.detectorEmail};
    }

    public final String getDetectorEmail() {
        return this.detectorEmail;
    }

    public final long getDetectorId() {
        return this.detectorId;
    }

    public final void setDetectorEmail(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.detectorEmail = str;
    }

    public final void setDetectorId(long j) {
        this.detectorId = j;
    }

    public DetectorInfo(long j, String detectorEmail) {
        o.LJIIIZ(detectorEmail, "detectorEmail");
        this.detectorId = j;
        this.detectorEmail = detectorEmail;
    }

    public /* synthetic */ DetectorInfo(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? "" : str);
    }
}
