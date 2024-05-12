package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InterruptionGuideImproveData {

    @InterfaceC65349Pkn("group")
    public final Integer group;

    @InterfaceC65349Pkn("guide_url")
    public final String guideUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterruptionGuideImproveData)) {
            return false;
        }
        InterruptionGuideImproveData interruptionGuideImproveData = (InterruptionGuideImproveData) obj;
        return o.LJ(this.group, interruptionGuideImproveData.group) && o.LJ(this.guideUrl, interruptionGuideImproveData.guideUrl);
    }

    public final int hashCode() {
        Integer num = this.group;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.guideUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterruptionGuideImproveData(group=");
        LIZ.append(this.group);
        LIZ.append(", guideUrl=");
        return q.LIZIZ(LIZ, this.guideUrl, ')', LIZ);
    }

    public InterruptionGuideImproveData(Integer num, String str) {
        this.group = num;
        this.guideUrl = str;
    }

    public /* synthetic */ InterruptionGuideImproveData(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, str);
    }
}
