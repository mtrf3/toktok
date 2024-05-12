package com.ss.android.ugc.aweme.live.notification.repository;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NudgeInfoResponse {

    @InterfaceC65349Pkn("data")
    public NudgeData data;

    /* JADX WARN: Multi-variable type inference failed */
    public NudgeInfoResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NudgeInfoResponse) && o.LJ(this.data, ((NudgeInfoResponse) obj).data);
    }

    public final int hashCode() {
        NudgeData nudgeData = this.data;
        if (nudgeData == null) {
            return 0;
        }
        return nudgeData.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NudgeInfoResponse(data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NudgeInfoResponse(NudgeData nudgeData) {
        this.data = nudgeData;
    }

    public /* synthetic */ NudgeInfoResponse(NudgeData nudgeData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nudgeData);
    }
}
