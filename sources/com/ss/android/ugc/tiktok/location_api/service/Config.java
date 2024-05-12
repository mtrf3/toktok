package com.ss.android.ugc.tiktok.location_api.service;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class Config {

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("location_accuracy")
    public final int locationAccuracy;

    @InterfaceC65349Pkn("popup_scene_v2")
    public List<PopupSceneV2> popupSceneV2;

    @InterfaceC65349Pkn("region_source")
    public final String regionSource;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return o.LJ(this.business, config.business) && o.LJ(this.regionSource, config.regionSource) && this.locationAccuracy == config.locationAccuracy && o.LJ(this.popupSceneV2, config.popupSceneV2);
    }

    public final int hashCode() {
        String str = this.business;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regionSource;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.locationAccuracy) * 31;
        List<PopupSceneV2> list = this.popupSceneV2;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(business=");
        LIZ.append(this.business);
        LIZ.append(", regionSource=");
        LIZ.append(this.regionSource);
        LIZ.append(", locationAccuracy=");
        LIZ.append(this.locationAccuracy);
        LIZ.append(", popupSceneV2=");
        return C1NE.LIZIZ(LIZ, this.popupSceneV2, ')', LIZ);
    }

    public Config(String str, String str2, int i, List<PopupSceneV2> list) {
        this.business = str;
        this.regionSource = str2;
        this.locationAccuracy = i;
        this.popupSceneV2 = list;
    }

    public /* synthetic */ Config(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, list);
    }
}
