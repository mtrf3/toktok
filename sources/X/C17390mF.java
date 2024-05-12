package X;

import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import kotlin.jvm.internal.o;
import webcast.data.EventCard;

/* renamed from: X.0mF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17390mF {
    public final long LIZ;
    public final LiveEventMessage LIZIZ;
    public final boolean LIZJ;
    public final EnumC17400mG LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        LiveEventMessage liveEventMessage = this.LIZIZ;
        int hashCode = (LLJIJIL + (liveEventMessage == null ? 0 : liveEventMessage.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LIZLLL.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEventDescCardInfo(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", liveEventMessage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", pinAvailable=");
        LIZ.append(this.LIZJ);
        LIZ.append(", unPinReason=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C17390mF(long j) {
        this(j, null, false, EnumC17400mG.NULL);
    }

    public final boolean equals(Object obj) {
        LiveEventMessage liveEventMessage;
        Long l;
        Long l2;
        Long l3;
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        EventCard eventCard;
        LiveEventInfo liveEventInfo;
        LiveEventInfo liveEventInfo2;
        if (this != obj) {
            if ((obj instanceof C17390mF) && (liveEventMessage = this.LIZIZ) != null) {
                Long l4 = null;
                EventCard eventCard2 = liveEventMessage.card;
                if (eventCard2 != null && (liveEventInfo2 = eventCard2.event) != null) {
                    l = liveEventInfo2.eventId;
                } else {
                    l = null;
                }
                C17390mF c17390mF = (C17390mF) obj;
                LiveEventMessage liveEventMessage2 = c17390mF.LIZIZ;
                if (liveEventMessage2 != null && (eventCard = liveEventMessage2.card) != null && (liveEventInfo = eventCard.event) != null) {
                    l2 = liveEventInfo.eventId;
                } else {
                    l2 = null;
                }
                if (o.LJ(l, l2)) {
                    LiveEventMessage liveEventMessage3 = this.LIZIZ;
                    if (liveEventMessage3 != null && (commonMessageData2 = liveEventMessage3.baseMessage) != null) {
                        l3 = Long.valueOf(commonMessageData2.createTime);
                    } else {
                        l3 = null;
                    }
                    LiveEventMessage liveEventMessage4 = c17390mF.LIZIZ;
                    if (liveEventMessage4 != null && (commonMessageData = liveEventMessage4.baseMessage) != null) {
                        l4 = Long.valueOf(commonMessageData.createTime);
                    }
                    if (o.LJ(l3, l4)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C17390mF(long j, LiveEventMessage liveEventMessage, boolean z, EnumC17400mG unPinReason) {
        o.LJIIIZ(unPinReason, "unPinReason");
        this.LIZ = j;
        this.LIZIZ = liveEventMessage;
        this.LIZJ = z;
        this.LIZLLL = unPinReason;
    }

    public static C17390mF LIZ(C17390mF c17390mF, LiveEventMessage liveEventMessage, boolean z, EnumC17400mG enumC17400mG, int i) {
        long j;
        EnumC17400mG unPinReason = enumC17400mG;
        LiveEventMessage liveEventMessage2 = liveEventMessage;
        boolean z2 = z;
        if ((i & 1) != 0) {
            j = c17390mF.LIZ;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            liveEventMessage2 = c17390mF.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c17390mF.LIZJ;
        }
        if ((i & 8) != 0) {
            unPinReason = c17390mF.LIZLLL;
        }
        o.LJIIIZ(unPinReason, "unPinReason");
        return new C17390mF(j, liveEventMessage2, z2, unPinReason);
    }
}
