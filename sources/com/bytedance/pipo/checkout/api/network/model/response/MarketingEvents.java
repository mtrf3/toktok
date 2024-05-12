package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class MarketingEvents {

    @InterfaceC65349Pkn("event_code")
    public String eventCode;

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketingEvents() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarketingEvents copy$default(MarketingEvents marketingEvents, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketingEvents.eventCode;
        }
        if ((i & 2) != 0) {
            str2 = marketingEvents.starlingKey;
        }
        return marketingEvents.copy(str, str2);
    }

    public final MarketingEvents copy(String str, String str2) {
        return new MarketingEvents(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingEvents)) {
            return false;
        }
        MarketingEvents marketingEvents = (MarketingEvents) obj;
        return o.LJ(this.eventCode, marketingEvents.eventCode) && o.LJ(this.starlingKey, marketingEvents.starlingKey);
    }

    public int hashCode() {
        String str = this.eventCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.starlingKey;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MarketingEvents(eventCode=");
        LIZ.append((Object) this.eventCode);
        LIZ.append(", starlingKey=");
        LIZ.append((Object) this.starlingKey);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getEventCode() {
        return this.eventCode;
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final void setEventCode(String str) {
        this.eventCode = str;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public MarketingEvents(String str, String str2) {
        this.eventCode = str;
        this.starlingKey = str2;
    }

    public /* synthetic */ MarketingEvents(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
