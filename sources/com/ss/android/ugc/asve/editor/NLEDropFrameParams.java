package com.ss.android.ugc.asve.editor;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class NLEDropFrameParams extends F9E implements Serializable {

    @InterfaceC65349Pkn("delay_time")
    public final long delayTime;

    @InterfaceC65349Pkn("is_set_params")
    public final boolean isSetParams;

    @InterfaceC65349Pkn("max_drop_count")
    public final int maxDropCount;

    /* JADX WARN: Multi-variable type inference failed */
    public NLEDropFrameParams() {
        this(false, 0L, 0 == true ? 1 : 0, 7, null);
    }

    public static /* synthetic */ NLEDropFrameParams copy$default(NLEDropFrameParams nLEDropFrameParams, boolean z, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = nLEDropFrameParams.isSetParams;
        }
        if ((i2 & 2) != 0) {
            j = nLEDropFrameParams.delayTime;
        }
        if ((i2 & 4) != 0) {
            i = nLEDropFrameParams.maxDropCount;
        }
        return nLEDropFrameParams.copy(z, j, i);
    }

    public final NLEDropFrameParams copy(boolean z, long j, int i) {
        return new NLEDropFrameParams(z, j, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isSetParams), Long.valueOf(this.delayTime), Integer.valueOf(this.maxDropCount)};
    }

    public final long getDelayTime() {
        return this.delayTime;
    }

    public final int getMaxDropCount() {
        return this.maxDropCount;
    }

    public final boolean isSetParams() {
        return this.isSetParams;
    }

    public NLEDropFrameParams(boolean z, long j, int i) {
        this.isSetParams = z;
        this.delayTime = j;
        this.maxDropCount = i;
    }

    public /* synthetic */ NLEDropFrameParams(boolean z, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 33333L : j, (i2 & 4) != 0 ? 2 : i);
    }
}
