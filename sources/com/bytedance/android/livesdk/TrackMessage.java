package com.bytedance.android.livesdk;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrackMessage implements Serializable {

    @InterfaceC65349Pkn("message_id")
    public final Long id;

    @InterfaceC65349Pkn("message_method")
    public final String method;

    @InterfaceC65349Pkn("message_strategy")
    public final Integer strategy;

    @InterfaceC65349Pkn("message_type")
    public final Integer type;

    public static /* synthetic */ TrackMessage copy$default(TrackMessage trackMessage, Long l, Integer num, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = trackMessage.id;
        }
        if ((i & 2) != 0) {
            num = trackMessage.type;
        }
        if ((i & 4) != 0) {
            str = trackMessage.method;
        }
        if ((i & 8) != 0) {
            num2 = trackMessage.strategy;
        }
        return trackMessage.copy(l, num, str, num2);
    }

    public final TrackMessage copy(Long l, Integer num, String str, Integer num2) {
        return new TrackMessage(l, num, str, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackMessage)) {
            return false;
        }
        TrackMessage trackMessage = (TrackMessage) obj;
        return o.LJ(this.id, trackMessage.id) && o.LJ(this.type, trackMessage.type) && o.LJ(this.method, trackMessage.method) && o.LJ(this.strategy, trackMessage.strategy);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.method;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.strategy;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrackMessage(id=");
        LIZ.append(this.id);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", method=");
        LIZ.append(this.method);
        LIZ.append(", strategy=");
        return s0.LIZJ(LIZ, this.strategy, ')', LIZ);
    }

    public final Long getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Integer getStrategy() {
        return this.strategy;
    }

    public final Integer getType() {
        return this.type;
    }

    public TrackMessage(Long l, Integer num, String str, Integer num2) {
        this.id = l;
        this.type = num;
        this.method = str;
        this.strategy = num2;
    }
}
