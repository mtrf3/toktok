package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class District {

    @InterfaceC65349Pkn("asci_name")
    public String asciName;

    @InterfaceC65349Pkn("center")
    public ArrayList<Double> center;

    @InterfaceC65349Pkn("centroid")
    public ArrayList<Double> centroid;

    @InterfaceC65349Pkn("code")
    public String code;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("geoname_id")
    public Integer geonameId;

    @InterfaceC65349Pkn("level")
    public String level;

    @InterfaceC65349Pkn("multi_lan_desc")
    public String multiLanDesc;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("pinyin")
    public String pinyin;

    @InterfaceC65349Pkn("sub_region")
    public ArrayList<District> subRegion;

    /* JADX WARN: Multi-variable type inference failed */
    public District() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ District copy$default(District district, String str, String str2, String str3, Integer num, String str4, String str5, String str6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = district.code;
        }
        if ((i & 2) != 0) {
            str2 = district.name;
        }
        if ((i & 4) != 0) {
            str3 = district.pinyin;
        }
        if ((i & 8) != 0) {
            num = district.geonameId;
        }
        if ((i & 16) != 0) {
            str4 = district.asciName;
        }
        if ((i & 32) != 0) {
            str5 = district.level;
        }
        if ((i & 64) != 0) {
            str6 = district.description;
        }
        if ((i & 128) != 0) {
            arrayList = district.center;
        }
        if ((i & 256) != 0) {
            arrayList2 = district.subRegion;
        }
        if ((i & 512) != 0) {
            arrayList3 = district.centroid;
        }
        if ((i & 1024) != 0) {
            str7 = district.multiLanDesc;
        }
        return district.copy(str, str2, str3, num, str4, str5, str6, arrayList, arrayList2, arrayList3, str7);
    }

    public final District copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ArrayList<Double> center, ArrayList<District> subRegion, ArrayList<Double> centroid, String str7) {
        o.LJIIIZ(center, "center");
        o.LJIIIZ(subRegion, "subRegion");
        o.LJIIIZ(centroid, "centroid");
        return new District(str, str2, str3, num, str4, str5, str6, center, subRegion, centroid, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof District)) {
            return false;
        }
        District district = (District) obj;
        return o.LJ(this.code, district.code) && o.LJ(this.name, district.name) && o.LJ(this.pinyin, district.pinyin) && o.LJ(this.geonameId, district.geonameId) && o.LJ(this.asciName, district.asciName) && o.LJ(this.level, district.level) && o.LJ(this.description, district.description) && o.LJ(this.center, district.center) && o.LJ(this.subRegion, district.subRegion) && o.LJ(this.centroid, district.centroid) && o.LJ(this.multiLanDesc, district.multiLanDesc);
    }

    public int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pinyin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.geonameId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.asciName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.level;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode7 = (((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.center.hashCode()) * 31) + this.subRegion.hashCode()) * 31) + this.centroid.hashCode()) * 31;
        String str7 = this.multiLanDesc;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "District(code=" + ((Object) this.code) + ", name=" + ((Object) this.name) + ", pinyin=" + ((Object) this.pinyin) + ", geonameId=" + this.geonameId + ", asciName=" + ((Object) this.asciName) + ", level=" + ((Object) this.level) + ", description=" + ((Object) this.description) + ", center=" + this.center + ", subRegion=" + this.subRegion + ", centroid=" + this.centroid + ", multiLanDesc=" + ((Object) this.multiLanDesc) + ')';
    }

    public final String getAsciName() {
        return this.asciName;
    }

    public final ArrayList<Double> getCenter() {
        return this.center;
    }

    public final ArrayList<Double> getCentroid() {
        return this.centroid;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getGeonameId() {
        return this.geonameId;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getMultiLanDesc() {
        return this.multiLanDesc;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPinyin() {
        return this.pinyin;
    }

    public final ArrayList<District> getSubRegion() {
        return this.subRegion;
    }

    public final void setAsciName(String str) {
        this.asciName = str;
    }

    public final void setCenter(ArrayList<Double> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.center = arrayList;
    }

    public final void setCentroid(ArrayList<Double> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.centroid = arrayList;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setGeonameId(Integer num) {
        this.geonameId = num;
    }

    public final void setLevel(String str) {
        this.level = str;
    }

    public final void setMultiLanDesc(String str) {
        this.multiLanDesc = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPinyin(String str) {
        this.pinyin = str;
    }

    public final void setSubRegion(ArrayList<District> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.subRegion = arrayList;
    }

    public District(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ArrayList<Double> center, ArrayList<District> subRegion, ArrayList<Double> centroid, String str7) {
        o.LJIIIZ(center, "center");
        o.LJIIIZ(subRegion, "subRegion");
        o.LJIIIZ(centroid, "centroid");
        this.code = str;
        this.name = str2;
        this.pinyin = str3;
        this.geonameId = num;
        this.asciName = str4;
        this.level = str5;
        this.description = str6;
        this.center = center;
        this.subRegion = subRegion;
        this.centroid = centroid;
        this.multiLanDesc = str7;
    }

    public /* synthetic */ District(String str, String str2, String str3, Integer num, String str4, String str5, String str6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? new ArrayList() : arrayList, (i & 256) != 0 ? new ArrayList() : arrayList2, (i & 512) != 0 ? new ArrayList() : arrayList3, (i & 1024) == 0 ? str7 : null);
    }
}
