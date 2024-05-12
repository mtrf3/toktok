package com.ss.android.ugc.aweme.poi;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDataStruct implements Serializable {

    @InterfaceC65349Pkn("address_info")
    public PoiAddressInfo addressInfo;

    @InterfaceC65349Pkn("collect_info")
    public String collectInfo;

    @InterfaceC65349Pkn("comment_anchor")
    public PoiAnchorInfo commentAnchor;

    @InterfaceC65349Pkn("info_source")
    public String infoSource;

    @InterfaceC65349Pkn("nearby_tag")
    public NearbyTag nearbyTag;

    @InterfaceC65349Pkn("poi_id")
    public String poiId;

    @InterfaceC65349Pkn("poi_mapkit_collect")
    public boolean poiMapkitCollect;

    @InterfaceC65349Pkn("poi_name")
    public String poiName;

    @InterfaceC65349Pkn("poi_type")
    public String poiType;

    @InterfaceC65349Pkn("video_anchor")
    public PoiAnchorInfo videoAnchor;

    @InterfaceC65349Pkn("video_count")
    public String videoCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiDataStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PoiDataStruct copy$default(PoiDataStruct poiDataStruct, String str, String str2, String str3, String str4, String str5, boolean z, String str6, PoiAddressInfo poiAddressInfo, PoiAnchorInfo poiAnchorInfo, PoiAnchorInfo poiAnchorInfo2, NearbyTag nearbyTag, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiDataStruct.poiName;
        }
        if ((i & 2) != 0) {
            str2 = poiDataStruct.poiId;
        }
        if ((i & 4) != 0) {
            str3 = poiDataStruct.poiType;
        }
        if ((i & 8) != 0) {
            str4 = poiDataStruct.infoSource;
        }
        if ((i & 16) != 0) {
            str5 = poiDataStruct.collectInfo;
        }
        if ((i & 32) != 0) {
            z = poiDataStruct.poiMapkitCollect;
        }
        if ((i & 64) != 0) {
            str6 = poiDataStruct.videoCount;
        }
        if ((i & 128) != 0) {
            poiAddressInfo = poiDataStruct.addressInfo;
        }
        if ((i & 256) != 0) {
            poiAnchorInfo = poiDataStruct.videoAnchor;
        }
        if ((i & 512) != 0) {
            poiAnchorInfo2 = poiDataStruct.commentAnchor;
        }
        if ((i & 1024) != 0) {
            nearbyTag = poiDataStruct.nearbyTag;
        }
        return poiDataStruct.copy(str, str2, str3, str4, str5, z, str6, poiAddressInfo, poiAnchorInfo, poiAnchorInfo2, nearbyTag);
    }

    public final PoiDataStruct copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, PoiAddressInfo poiAddressInfo, PoiAnchorInfo poiAnchorInfo, PoiAnchorInfo poiAnchorInfo2, NearbyTag nearbyTag) {
        return new PoiDataStruct(str, str2, str3, str4, str5, z, str6, poiAddressInfo, poiAnchorInfo, poiAnchorInfo2, nearbyTag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDataStruct)) {
            return false;
        }
        PoiDataStruct poiDataStruct = (PoiDataStruct) obj;
        return o.LJ(this.poiName, poiDataStruct.poiName) && o.LJ(this.poiId, poiDataStruct.poiId) && o.LJ(this.poiType, poiDataStruct.poiType) && o.LJ(this.infoSource, poiDataStruct.infoSource) && o.LJ(this.collectInfo, poiDataStruct.collectInfo) && this.poiMapkitCollect == poiDataStruct.poiMapkitCollect && o.LJ(this.videoCount, poiDataStruct.videoCount) && o.LJ(this.addressInfo, poiDataStruct.addressInfo) && o.LJ(this.videoAnchor, poiDataStruct.videoAnchor) && o.LJ(this.commentAnchor, poiDataStruct.commentAnchor) && o.LJ(this.nearbyTag, poiDataStruct.nearbyTag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.poiName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poiId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.infoSource;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.collectInfo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.poiMapkitCollect;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        String str6 = this.videoCount;
        int hashCode6 = (i2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PoiAddressInfo poiAddressInfo = this.addressInfo;
        int hashCode7 = (hashCode6 + (poiAddressInfo == null ? 0 : poiAddressInfo.hashCode())) * 31;
        PoiAnchorInfo poiAnchorInfo = this.videoAnchor;
        int hashCode8 = (hashCode7 + (poiAnchorInfo == null ? 0 : poiAnchorInfo.hashCode())) * 31;
        PoiAnchorInfo poiAnchorInfo2 = this.commentAnchor;
        int hashCode9 = (hashCode8 + (poiAnchorInfo2 == null ? 0 : poiAnchorInfo2.hashCode())) * 31;
        NearbyTag nearbyTag = this.nearbyTag;
        return hashCode9 + (nearbyTag != null ? nearbyTag.hashCode() : 0);
    }

    public String toString() {
        return "PoiDataStruct(poiName=" + this.poiName + ", poiId=" + this.poiId + ", poiType=" + this.poiType + ", infoSource=" + this.infoSource + ", collectInfo=" + this.collectInfo + ", poiMapkitCollect=" + this.poiMapkitCollect + ", videoCount=" + this.videoCount + ", addressInfo=" + this.addressInfo + ", videoAnchor=" + this.videoAnchor + ", commentAnchor=" + this.commentAnchor + ", nearbyTag=" + this.nearbyTag + ')';
    }

    public final PoiAddressInfo getAddressInfo() {
        return this.addressInfo;
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final PoiAnchorInfo getCommentAnchor() {
        return this.commentAnchor;
    }

    public final String getInfoSource() {
        return this.infoSource;
    }

    public final NearbyTag getNearbyTag() {
        return this.nearbyTag;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final boolean getPoiMapkitCollect() {
        return this.poiMapkitCollect;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final String getPoiType() {
        return this.poiType;
    }

    public final PoiAnchorInfo getVideoAnchor() {
        return this.videoAnchor;
    }

    public final String getVideoCount() {
        return this.videoCount;
    }

    public PoiDataStruct(String str, String str2, String str3, String str4, String str5, boolean z, String str6, PoiAddressInfo poiAddressInfo, PoiAnchorInfo poiAnchorInfo, PoiAnchorInfo poiAnchorInfo2, NearbyTag nearbyTag) {
        this.poiName = str;
        this.poiId = str2;
        this.poiType = str3;
        this.infoSource = str4;
        this.collectInfo = str5;
        this.poiMapkitCollect = z;
        this.videoCount = str6;
        this.addressInfo = poiAddressInfo;
        this.videoAnchor = poiAnchorInfo;
        this.commentAnchor = poiAnchorInfo2;
        this.nearbyTag = nearbyTag;
    }

    public /* synthetic */ PoiDataStruct(String str, String str2, String str3, String str4, String str5, boolean z, String str6, PoiAddressInfo poiAddressInfo, PoiAnchorInfo poiAnchorInfo, PoiAnchorInfo poiAnchorInfo2, NearbyTag nearbyTag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : poiAddressInfo, (i & 256) != 0 ? null : poiAnchorInfo, (i & 512) != 0 ? null : poiAnchorInfo2, (i & 1024) == 0 ? nearbyTag : null);
    }
}
