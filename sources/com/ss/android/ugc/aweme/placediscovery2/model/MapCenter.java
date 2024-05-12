package com.ss.android.ugc.aweme.placediscovery2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MapCenter extends F9E implements Serializable {

    @InterfaceC65349Pkn("recommend_center_lat")
    public final String centerLat;

    @InterfaceC65349Pkn("recommend_center_lng")
    public final String centerLng;

    /* JADX WARN: Multi-variable type inference failed */
    public MapCenter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MapCenter copy$default(MapCenter mapCenter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapCenter.centerLng;
        }
        if ((i & 2) != 0) {
            str2 = mapCenter.centerLat;
        }
        return mapCenter.copy(str, str2);
    }

    public final MapCenter copy(String centerLng, String centerLat) {
        o.LJIIIZ(centerLng, "centerLng");
        o.LJIIIZ(centerLat, "centerLat");
        return new MapCenter(centerLng, centerLat);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.centerLng, this.centerLat};
    }

    public final String getCenterLat() {
        return this.centerLat;
    }

    public final String getCenterLng() {
        return this.centerLng;
    }

    public MapCenter(String centerLng, String centerLat) {
        o.LJIIIZ(centerLng, "centerLng");
        o.LJIIIZ(centerLat, "centerLat");
        this.centerLng = centerLng;
        this.centerLat = centerLat;
    }

    public /* synthetic */ MapCenter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
