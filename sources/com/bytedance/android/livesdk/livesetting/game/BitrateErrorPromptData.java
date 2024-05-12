package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BitrateErrorPromptData {

    @InterfaceC65349Pkn("enable")
    public final Boolean enable;

    @InterfaceC65349Pkn("retry_stream")
    public final Integer retryStream;

    @InterfaceC65349Pkn("show_tips")
    public final Integer showTips;

    /* JADX WARN: Multi-variable type inference failed */
    public BitrateErrorPromptData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitrateErrorPromptData)) {
            return false;
        }
        BitrateErrorPromptData bitrateErrorPromptData = (BitrateErrorPromptData) obj;
        return o.LJ(this.enable, bitrateErrorPromptData.enable) && o.LJ(this.showTips, bitrateErrorPromptData.showTips) && o.LJ(this.retryStream, bitrateErrorPromptData.retryStream);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.showTips;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.retryStream;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitrateErrorPromptData(enable=");
        LIZ.append(this.enable);
        LIZ.append(", showTips=");
        LIZ.append(this.showTips);
        LIZ.append(", retryStream=");
        return s0.LIZJ(LIZ, this.retryStream, ')', LIZ);
    }

    public BitrateErrorPromptData(Boolean bool, Integer num, Integer num2) {
        this.enable = bool;
        this.showTips = num;
        this.retryStream = num2;
    }

    public /* synthetic */ BitrateErrorPromptData(Boolean bool, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 3 : num, (i & 4) != 0 ? 20 : num2);
    }
}
