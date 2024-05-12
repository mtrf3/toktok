package com.ss.android.ugc.aweme.poi;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PoiAnchorInfo implements Serializable {

    @InterfaceC65349Pkn("has_sub_arrow")
    public boolean hasSubArrow;

    @InterfaceC65349Pkn("sub_tag_exp_time")
    public Integer subTagExpTime;

    @InterfaceC65349Pkn("sub_tag_exp_type")
    public Integer subTagExpType;

    @InterfaceC65349Pkn("sub_tags")
    public List<PoiSubTag> subTags;

    @InterfaceC65349Pkn("suffix")
    public String suffix;

    @InterfaceC65349Pkn("hide_list")
    public List<Integer> tooLongHideList;

    @InterfaceC65349Pkn("track_info")
    public String trackInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiAnchorInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PoiAnchorInfo copy$default(PoiAnchorInfo poiAnchorInfo, String str, List list, Integer num, Integer num2, boolean z, String str2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiAnchorInfo.suffix;
        }
        if ((i & 2) != 0) {
            list = poiAnchorInfo.subTags;
        }
        if ((i & 4) != 0) {
            num = poiAnchorInfo.subTagExpType;
        }
        if ((i & 8) != 0) {
            num2 = poiAnchorInfo.subTagExpTime;
        }
        if ((i & 16) != 0) {
            z = poiAnchorInfo.hasSubArrow;
        }
        if ((i & 32) != 0) {
            str2 = poiAnchorInfo.trackInfo;
        }
        if ((i & 64) != 0) {
            list2 = poiAnchorInfo.tooLongHideList;
        }
        return poiAnchorInfo.copy(str, list, num, num2, z, str2, list2);
    }

    public final PoiAnchorInfo copy(String str, List<PoiSubTag> list, Integer num, Integer num2, boolean z, String str2, List<Integer> list2) {
        return new PoiAnchorInfo(str, list, num, num2, z, str2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiAnchorInfo)) {
            return false;
        }
        PoiAnchorInfo poiAnchorInfo = (PoiAnchorInfo) obj;
        return o.LJ(this.suffix, poiAnchorInfo.suffix) && o.LJ(this.subTags, poiAnchorInfo.subTags) && o.LJ(this.subTagExpType, poiAnchorInfo.subTagExpType) && o.LJ(this.subTagExpTime, poiAnchorInfo.subTagExpTime) && this.hasSubArrow == poiAnchorInfo.hasSubArrow && o.LJ(this.trackInfo, poiAnchorInfo.trackInfo) && o.LJ(this.tooLongHideList, poiAnchorInfo.tooLongHideList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.suffix;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PoiSubTag> list = this.subTags;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.subTagExpType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subTagExpTime;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.hasSubArrow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str2 = this.trackInfo;
        int hashCode5 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list2 = this.tooLongHideList;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiAnchorInfo(suffix=");
        LIZ.append(this.suffix);
        LIZ.append(", subTags=");
        LIZ.append(this.subTags);
        LIZ.append(", subTagExpType=");
        LIZ.append(this.subTagExpType);
        LIZ.append(", subTagExpTime=");
        LIZ.append(this.subTagExpTime);
        LIZ.append(", hasSubArrow=");
        LIZ.append(this.hasSubArrow);
        LIZ.append(", trackInfo=");
        LIZ.append(this.trackInfo);
        LIZ.append(", tooLongHideList=");
        return C1NE.LIZIZ(LIZ, this.tooLongHideList, ')', LIZ);
    }

    public final boolean getHasSubArrow() {
        return this.hasSubArrow;
    }

    public final Integer getSubTagExpTime() {
        return this.subTagExpTime;
    }

    public final Integer getSubTagExpType() {
        return this.subTagExpType;
    }

    public final List<PoiSubTag> getSubTags() {
        return this.subTags;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final List<Integer> getTooLongHideList() {
        return this.tooLongHideList;
    }

    public final String getTrackInfo() {
        return this.trackInfo;
    }

    public PoiAnchorInfo(String str, List<PoiSubTag> list, Integer num, Integer num2, boolean z, String str2, List<Integer> list2) {
        this.suffix = str;
        this.subTags = list;
        this.subTagExpType = num;
        this.subTagExpTime = num2;
        this.hasSubArrow = z;
        this.trackInfo = str2;
        this.tooLongHideList = list2;
    }

    public /* synthetic */ PoiAnchorInfo(String str, List list, Integer num, Integer num2, boolean z, String str2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? list2 : null);
    }
}
