package com.ss.android.ugc.aweme.placediscovery.param;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MapBounds extends F9E implements Serializable {

    @InterfaceC65349Pkn("recommend_max_lat")
    public final String maxLat;

    @InterfaceC65349Pkn("recommend_max_lng")
    public final String maxLng;

    @InterfaceC65349Pkn("recommend_min_lat")
    public final String minLat;

    @InterfaceC65349Pkn("recommend_min_lng")
    public final String minLng;

    /* JADX WARN: Multi-variable type inference failed */
    public MapBounds() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MapBounds copy$default(MapBounds mapBounds, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mapBounds.maxLng;
        }
        if ((i & 2) != 0) {
            str2 = mapBounds.maxLat;
        }
        if ((i & 4) != 0) {
            str3 = mapBounds.minLng;
        }
        if ((i & 8) != 0) {
            str4 = mapBounds.minLat;
        }
        return mapBounds.copy(str, str2, str3, str4);
    }

    public final MapBounds copy(String maxLng, String maxLat, String minLng, String minLat) {
        o.LJIIIZ(maxLng, "maxLng");
        o.LJIIIZ(maxLat, "maxLat");
        o.LJIIIZ(minLng, "minLng");
        o.LJIIIZ(minLat, "minLat");
        return new MapBounds(maxLng, maxLat, minLng, minLat);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.maxLng, this.maxLat, this.minLng, this.minLat};
    }

    public final String getMaxLat() {
        return this.maxLat;
    }

    public final String getMaxLng() {
        return this.maxLng;
    }

    public final String getMinLat() {
        return this.minLat;
    }

    public final String getMinLng() {
        return this.minLng;
    }

    public MapBounds(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "maxLng", str2, "maxLat", str3, "minLng", str4, "minLat");
        this.maxLng = str;
        this.maxLat = str2;
        this.minLng = str3;
        this.minLat = str4;
    }

    public /* synthetic */ MapBounds(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
