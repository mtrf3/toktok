package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class AllDistrictResponse {

    @InterfaceC65349Pkn("district")
    public ArrayList<District> district;

    @InterfaceC65349Pkn("info")
    public String info;

    @InterfaceC65349Pkn("infocode")
    public Integer infocode;

    @InterfaceC65349Pkn("status")
    public String status;

    @InterfaceC65349Pkn("support_lang")
    public ArrayList<String> supportLang;

    @InterfaceC65349Pkn("update_time")
    public String updateTime;

    @InterfaceC65349Pkn("version")
    public String version;

    /* JADX WARN: Multi-variable type inference failed */
    public AllDistrictResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllDistrictResponse copy$default(AllDistrictResponse allDistrictResponse, ArrayList arrayList, String str, Integer num, String str2, ArrayList arrayList2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = allDistrictResponse.district;
        }
        if ((i & 2) != 0) {
            str = allDistrictResponse.info;
        }
        if ((i & 4) != 0) {
            num = allDistrictResponse.infocode;
        }
        if ((i & 8) != 0) {
            str2 = allDistrictResponse.status;
        }
        if ((i & 16) != 0) {
            arrayList2 = allDistrictResponse.supportLang;
        }
        if ((i & 32) != 0) {
            str3 = allDistrictResponse.updateTime;
        }
        if ((i & 64) != 0) {
            str4 = allDistrictResponse.version;
        }
        return allDistrictResponse.copy(arrayList, str, num, str2, arrayList2, str3, str4);
    }

    public final AllDistrictResponse copy(ArrayList<District> district, String str, Integer num, String str2, ArrayList<String> supportLang, String str3, String str4) {
        o.LJIIIZ(district, "district");
        o.LJIIIZ(supportLang, "supportLang");
        return new AllDistrictResponse(district, str, num, str2, supportLang, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllDistrictResponse)) {
            return false;
        }
        AllDistrictResponse allDistrictResponse = (AllDistrictResponse) obj;
        return o.LJ(this.district, allDistrictResponse.district) && o.LJ(this.info, allDistrictResponse.info) && o.LJ(this.infocode, allDistrictResponse.infocode) && o.LJ(this.status, allDistrictResponse.status) && o.LJ(this.supportLang, allDistrictResponse.supportLang) && o.LJ(this.updateTime, allDistrictResponse.updateTime) && o.LJ(this.version, allDistrictResponse.version);
    }

    public int hashCode() {
        int hashCode = this.district.hashCode() * 31;
        String str = this.info;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.infocode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.status;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.supportLang.hashCode()) * 31;
        String str3 = this.updateTime;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AllDistrictResponse(district=");
        LIZ.append(this.district);
        LIZ.append(", info=");
        LIZ.append((Object) this.info);
        LIZ.append(", infocode=");
        LIZ.append(this.infocode);
        LIZ.append(", status=");
        LIZ.append((Object) this.status);
        LIZ.append(", supportLang=");
        LIZ.append(this.supportLang);
        LIZ.append(", updateTime=");
        LIZ.append((Object) this.updateTime);
        LIZ.append(", version=");
        LIZ.append((Object) this.version);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ArrayList<District> getDistrict() {
        return this.district;
    }

    public final String getInfo() {
        return this.info;
    }

    public final Integer getInfocode() {
        return this.infocode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final ArrayList<String> getSupportLang() {
        return this.supportLang;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setDistrict(ArrayList<District> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.district = arrayList;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setInfocode(Integer num) {
        this.infocode = num;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setSupportLang(ArrayList<String> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.supportLang = arrayList;
    }

    public final void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public AllDistrictResponse(ArrayList<District> district, String str, Integer num, String str2, ArrayList<String> supportLang, String str3, String str4) {
        o.LJIIIZ(district, "district");
        o.LJIIIZ(supportLang, "supportLang");
        this.district = district;
        this.info = str;
        this.infocode = num;
        this.status = str2;
        this.supportLang = supportLang;
        this.updateTime = str3;
        this.version = str4;
    }

    public /* synthetic */ AllDistrictResponse(ArrayList arrayList, String str, Integer num, String str2, ArrayList arrayList2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? new ArrayList() : arrayList2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
    }
}
