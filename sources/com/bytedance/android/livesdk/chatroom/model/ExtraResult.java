package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ExtraResult {

    @InterfaceC65349Pkn("finished_perception_msg")
    public final String finishedPerceptionMsg;

    @InterfaceC65349Pkn("punish_info")
    public final PunishEventInfo punishInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtraResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraResult)) {
            return false;
        }
        ExtraResult extraResult = (ExtraResult) obj;
        return o.LJ(this.finishedPerceptionMsg, extraResult.finishedPerceptionMsg) && o.LJ(this.punishInfo, extraResult.punishInfo);
    }

    public final int hashCode() {
        String str = this.finishedPerceptionMsg;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PunishEventInfo punishEventInfo = this.punishInfo;
        return hashCode + (punishEventInfo != null ? punishEventInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraResult(finishedPerceptionMsg=");
        LIZ.append(this.finishedPerceptionMsg);
        LIZ.append(", punishInfo=");
        LIZ.append(this.punishInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ExtraResult(String str, PunishEventInfo punishEventInfo) {
        this.finishedPerceptionMsg = str;
        this.punishInfo = punishEventInfo;
    }

    public /* synthetic */ ExtraResult(String str, PunishEventInfo punishEventInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : punishEventInfo);
    }
}
