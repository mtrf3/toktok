package com.ss.android.ugc.aweme.feed.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class NearbyInfo implements Serializable {

    @InterfaceC65349Pkn("can_not_cached")
    public Boolean cannotCached;

    @InterfaceC65349Pkn("event_track")
    public String eventTrack;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NearbyInfo copy$default(NearbyInfo nearbyInfo, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearbyInfo.eventTrack;
        }
        if ((i & 2) != 0) {
            bool = nearbyInfo.cannotCached;
        }
        return nearbyInfo.copy(str, bool);
    }

    public final NearbyInfo copy(String str, Boolean bool) {
        return new NearbyInfo(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyInfo)) {
            return false;
        }
        NearbyInfo nearbyInfo = (NearbyInfo) obj;
        return o.LJ(this.eventTrack, nearbyInfo.eventTrack) && o.LJ(this.cannotCached, nearbyInfo.cannotCached);
    }

    public int hashCode() {
        String str = this.eventTrack;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.cannotCached;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyInfo(eventTrack=");
        LIZ.append(this.eventTrack);
        LIZ.append(", cannotCached=");
        return C78920UyC.LIZIZ(LIZ, this.cannotCached, ')', LIZ);
    }

    public final Boolean getCannotCached() {
        return this.cannotCached;
    }

    public final String getEventTrack() {
        return this.eventTrack;
    }

    public NearbyInfo(String str, Boolean bool) {
        this.eventTrack = str;
        this.cannotCached = bool;
    }

    public /* synthetic */ NearbyInfo(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
