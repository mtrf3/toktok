package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.Extra;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BubbleSettingExtra extends Extra implements Serializable {

    @InterfaceC65349Pkn("log_pb")
    public LogPb logPb;

    /* JADX WARN: Multi-variable type inference failed */
    public BubbleSettingExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BubbleSettingExtra copy$default(BubbleSettingExtra bubbleSettingExtra, LogPb logPb, int i, Object obj) {
        if ((i & 1) != 0) {
            logPb = bubbleSettingExtra.logPb;
        }
        return bubbleSettingExtra.copy(logPb);
    }

    public final BubbleSettingExtra copy(LogPb logPb) {
        return new BubbleSettingExtra(logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BubbleSettingExtra) && o.LJ(this.logPb, ((BubbleSettingExtra) obj).logPb);
    }

    public int hashCode() {
        LogPb logPb = this.logPb;
        if (logPb == null) {
            return 0;
        }
        return logPb.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BubbleSettingExtra(logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public BubbleSettingExtra(LogPb logPb) {
        this.logPb = logPb;
    }

    public final void setLogPb(LogPb logPb) {
        this.logPb = logPb;
    }

    public /* synthetic */ BubbleSettingExtra(LogPb logPb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : logPb);
    }
}
