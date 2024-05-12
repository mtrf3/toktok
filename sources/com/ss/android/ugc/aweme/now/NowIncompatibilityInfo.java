package com.ss.android.ugc.aweme.now;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowIncompatibilityInfo implements Serializable {

    @InterfaceC65349Pkn("explain")
    public String explain;

    @InterfaceC65349Pkn("reason")
    public int reason;

    @InterfaceC65349Pkn("resolution_button")
    public NowButtonInfo resolutionButtonInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public NowIncompatibilityInfo() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NowIncompatibilityInfo copy$default(NowIncompatibilityInfo nowIncompatibilityInfo, int i, String str, NowButtonInfo nowButtonInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nowIncompatibilityInfo.reason;
        }
        if ((i2 & 2) != 0) {
            str = nowIncompatibilityInfo.explain;
        }
        if ((i2 & 4) != 0) {
            nowButtonInfo = nowIncompatibilityInfo.resolutionButtonInfo;
        }
        return nowIncompatibilityInfo.copy(i, str, nowButtonInfo);
    }

    public final NowIncompatibilityInfo copy(int i, String str, NowButtonInfo nowButtonInfo) {
        return new NowIncompatibilityInfo(i, str, nowButtonInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowIncompatibilityInfo)) {
            return false;
        }
        NowIncompatibilityInfo nowIncompatibilityInfo = (NowIncompatibilityInfo) obj;
        return this.reason == nowIncompatibilityInfo.reason && o.LJ(this.explain, nowIncompatibilityInfo.explain) && o.LJ(this.resolutionButtonInfo, nowIncompatibilityInfo.resolutionButtonInfo);
    }

    public int hashCode() {
        int i = this.reason * 31;
        String str = this.explain;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        NowButtonInfo nowButtonInfo = this.resolutionButtonInfo;
        return hashCode + (nowButtonInfo != null ? nowButtonInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowIncompatibilityInfo(reason=");
        LIZ.append(this.reason);
        LIZ.append(", explain=");
        LIZ.append(this.explain);
        LIZ.append(", resolutionButtonInfo=");
        LIZ.append(this.resolutionButtonInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getExplain() {
        return this.explain;
    }

    public final int getReason() {
        return this.reason;
    }

    public final NowButtonInfo getResolutionButtonInfo() {
        return this.resolutionButtonInfo;
    }

    public NowIncompatibilityInfo(int i, String str, NowButtonInfo nowButtonInfo) {
        this.reason = i;
        this.explain = str;
        this.resolutionButtonInfo = nowButtonInfo;
    }

    public /* synthetic */ NowIncompatibilityInfo(int i, String str, NowButtonInfo nowButtonInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : nowButtonInfo);
    }
}
