package com.ss.android.experiment;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TTImageHeaderModel {

    @InterfaceC65349Pkn("batteryCheckTimeGap")
    public final Long batteryCheckTimeGap;

    @InterfaceC65349Pkn("enable")
    public final Boolean enable;

    @InterfaceC65349Pkn("h5_anim_format")
    public final String h5_anim_format;

    @InterfaceC65349Pkn("h5_static_format")
    public final String h5_static_format;

    @InterfaceC65349Pkn("lynx_anim_format")
    public final String lynx_anim_format;

    @InterfaceC65349Pkn("lynx_static_format")
    public final String lynx_static_format;

    @InterfaceC65349Pkn("memoryCheckTimeGap")
    public final Long memoryCheckTimeGap;

    @InterfaceC65349Pkn("native_anim_format")
    public final String native_anim_format;

    @InterfaceC65349Pkn("native_static_format")
    public final String native_static_format;

    @InterfaceC65349Pkn("networkQualityCheckTimeGap")
    public final Long networkQualityCheckTimeGap;

    @InterfaceC65349Pkn("pathList")
    public final List<String> pathList;

    /* JADX WARN: Multi-variable type inference failed */
    public TTImageHeaderModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTImageHeaderModel)) {
            return false;
        }
        TTImageHeaderModel tTImageHeaderModel = (TTImageHeaderModel) obj;
        return o.LJ(this.enable, tTImageHeaderModel.enable) && o.LJ(this.batteryCheckTimeGap, tTImageHeaderModel.batteryCheckTimeGap) && o.LJ(this.networkQualityCheckTimeGap, tTImageHeaderModel.networkQualityCheckTimeGap) && o.LJ(this.memoryCheckTimeGap, tTImageHeaderModel.memoryCheckTimeGap) && o.LJ(this.lynx_static_format, tTImageHeaderModel.lynx_static_format) && o.LJ(this.lynx_anim_format, tTImageHeaderModel.lynx_anim_format) && o.LJ(this.native_static_format, tTImageHeaderModel.native_static_format) && o.LJ(this.native_anim_format, tTImageHeaderModel.native_anim_format) && o.LJ(this.h5_static_format, tTImageHeaderModel.h5_static_format) && o.LJ(this.h5_anim_format, tTImageHeaderModel.h5_anim_format) && o.LJ(this.pathList, tTImageHeaderModel.pathList);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.batteryCheckTimeGap;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.networkQualityCheckTimeGap;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.memoryCheckTimeGap;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.lynx_static_format;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lynx_anim_format;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.native_static_format;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.native_anim_format;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h5_static_format;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h5_anim_format;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.pathList;
        return hashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TTImageHeaderModel(enable=" + this.enable + ", batteryCheckTimeGap=" + this.batteryCheckTimeGap + ", networkQualityCheckTimeGap=" + this.networkQualityCheckTimeGap + ", memoryCheckTimeGap=" + this.memoryCheckTimeGap + ", lynx_static_format=" + this.lynx_static_format + ", lynx_anim_format=" + this.lynx_anim_format + ", native_static_format=" + this.native_static_format + ", native_anim_format=" + this.native_anim_format + ", h5_static_format=" + this.h5_static_format + ", h5_anim_format=" + this.h5_anim_format + ", pathList=" + this.pathList + ')';
    }

    public TTImageHeaderModel(Boolean bool, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this.enable = bool;
        this.batteryCheckTimeGap = l;
        this.networkQualityCheckTimeGap = l2;
        this.memoryCheckTimeGap = l3;
        this.lynx_static_format = str;
        this.lynx_anim_format = str2;
        this.native_static_format = str3;
        this.native_anim_format = str4;
        this.h5_static_format = str5;
        this.h5_anim_format = str6;
        this.pathList = list;
    }

    public /* synthetic */ TTImageHeaderModel(Boolean bool, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) == 0 ? list : null);
    }
}
