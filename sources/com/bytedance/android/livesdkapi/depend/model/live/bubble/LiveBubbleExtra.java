package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.Extra;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveBubbleExtra extends Extra implements Serializable {

    @InterfaceC65349Pkn("log_pb")
    public LogPb logPb;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveBubbleExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LiveBubbleExtra copy$default(LiveBubbleExtra liveBubbleExtra, LogPb logPb, int i, Object obj) {
        if ((i & 1) != 0) {
            logPb = liveBubbleExtra.logPb;
        }
        return liveBubbleExtra.copy(logPb);
    }

    public final LiveBubbleExtra copy(LogPb logPb) {
        return new LiveBubbleExtra(logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveBubbleExtra) && o.LJ(this.logPb, ((LiveBubbleExtra) obj).logPb);
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
        LIZ.append("LiveBubbleExtra(logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public LiveBubbleExtra(LogPb logPb) {
        this.logPb = logPb;
    }

    public final void setLogPb(LogPb logPb) {
        this.logPb = logPb;
    }

    public /* synthetic */ LiveBubbleExtra(LogPb logPb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : logPb);
    }
}
