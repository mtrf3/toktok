package com.ss.android.ugc.aweme.live.notification.repository;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NudgeData {

    @InterfaceC65349Pkn("nudge_info")
    public NudgeInfo nudgeInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public NudgeData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NudgeData) && o.LJ(this.nudgeInfo, ((NudgeData) obj).nudgeInfo);
    }

    public final int hashCode() {
        NudgeInfo nudgeInfo = this.nudgeInfo;
        if (nudgeInfo == null) {
            return 0;
        }
        return nudgeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NudgeData(nudgeInfo=");
        LIZ.append(this.nudgeInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NudgeData(NudgeInfo nudgeInfo) {
        this.nudgeInfo = nudgeInfo;
    }

    public /* synthetic */ NudgeData(NudgeInfo nudgeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nudgeInfo);
    }
}
