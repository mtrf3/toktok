package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreviewSwapState implements InterfaceC61312at {
    public final Integer from;
    public final Integer to;
    public final long value;

    public static /* synthetic */ PreviewSwapState copy$default(PreviewSwapState previewSwapState, Integer num, Integer num2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            num = previewSwapState.from;
        }
        if ((i & 2) != 0) {
            num2 = previewSwapState.to;
        }
        if ((i & 4) != 0) {
            j = previewSwapState.value;
        }
        return previewSwapState.copy(num, num2, j);
    }

    public final PreviewSwapState copy(Integer num, Integer num2, long j) {
        return new PreviewSwapState(num, num2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSwapState)) {
            return false;
        }
        PreviewSwapState previewSwapState = (PreviewSwapState) obj;
        return o.LJ(this.from, previewSwapState.from) && o.LJ(this.to, previewSwapState.to) && this.value == previewSwapState.value;
    }

    public int hashCode() {
        Integer num = this.from;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.to;
        return C16880lQ.LLJIJIL(this.value) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewSwapState(from=");
        LIZ.append(this.from);
        LIZ.append(", to=");
        LIZ.append(this.to);
        LIZ.append(", value=");
        return C47135Ieh.LIZIZ(LIZ, this.value, ')', LIZ);
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final Integer getTo() {
        return this.to;
    }

    public final long getValue() {
        return this.value;
    }

    public PreviewSwapState(Integer num, Integer num2, long j) {
        this.from = num;
        this.to = num2;
        this.value = j;
    }

    public /* synthetic */ PreviewSwapState(Integer num, Integer num2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, j);
    }
}
