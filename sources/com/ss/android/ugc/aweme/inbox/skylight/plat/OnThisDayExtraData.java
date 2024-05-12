package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class OnThisDayExtraData implements Serializable {

    @InterfaceC65349Pkn("pastMemoryKey")
    public final String pastKeyMemory;

    /* JADX WARN: Multi-variable type inference failed */
    public OnThisDayExtraData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OnThisDayExtraData copy$default(OnThisDayExtraData onThisDayExtraData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onThisDayExtraData.pastKeyMemory;
        }
        return onThisDayExtraData.copy(str);
    }

    public final OnThisDayExtraData copy(String str) {
        return new OnThisDayExtraData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnThisDayExtraData) && o.LJ(this.pastKeyMemory, ((OnThisDayExtraData) obj).pastKeyMemory);
    }

    public int hashCode() {
        String str = this.pastKeyMemory;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnThisDayExtraData(pastKeyMemory=");
        return q.LIZIZ(LIZ, this.pastKeyMemory, ')', LIZ);
    }

    public final String getPastKeyMemory() {
        return this.pastKeyMemory;
    }

    public OnThisDayExtraData(String str) {
        this.pastKeyMemory = str;
    }

    public /* synthetic */ OnThisDayExtraData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
