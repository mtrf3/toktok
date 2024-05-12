package com.ss.android.ugc.aweme.roaming;

import X.C2U8;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NearbyLocationRegion extends F9E implements IEvent {

    @InterfaceC65349Pkn("is_current_region")
    public final boolean isCurrentRegionAutoSelected;

    @InterfaceC65349Pkn("region")
    public final LocationRegion region;

    public static /* synthetic */ NearbyLocationRegion copy$default(NearbyLocationRegion nearbyLocationRegion, LocationRegion locationRegion, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            locationRegion = nearbyLocationRegion.region;
        }
        if ((i & 2) != 0) {
            z = nearbyLocationRegion.isCurrentRegionAutoSelected;
        }
        return nearbyLocationRegion.copy(locationRegion, z);
    }

    public final NearbyLocationRegion copy(LocationRegion region, boolean z) {
        o.LJIIIZ(region, "region");
        return new NearbyLocationRegion(region, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.region, Boolean.valueOf(this.isCurrentRegionAutoSelected)};
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final LocationRegion getRegion() {
        return this.region;
    }

    public final boolean isCurrentRegionAutoSelected() {
        return this.isCurrentRegionAutoSelected;
    }

    public NearbyLocationRegion(LocationRegion region, boolean z) {
        o.LJIIIZ(region, "region");
        this.region = region;
        this.isCurrentRegionAutoSelected = z;
    }

    public /* synthetic */ NearbyLocationRegion(LocationRegion locationRegion, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(locationRegion, (i & 2) != 0 ? false : z);
    }
}
