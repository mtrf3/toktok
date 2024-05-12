package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class DistrictResponse {

    @InterfaceC65349Pkn("district")
    public District district;

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
    public DistrictResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictResponse copy$default(DistrictResponse districtResponse, District district, String str, Integer num, String str2, ArrayList arrayList, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            district = districtResponse.district;
        }
        if ((i & 2) != 0) {
            str = districtResponse.info;
        }
        if ((i & 4) != 0) {
            num = districtResponse.infocode;
        }
        if ((i & 8) != 0) {
            str2 = districtResponse.status;
        }
        if ((i & 16) != 0) {
            arrayList = districtResponse.supportLang;
        }
        if ((i & 32) != 0) {
            str3 = districtResponse.updateTime;
        }
        if ((i & 64) != 0) {
            str4 = districtResponse.version;
        }
        return districtResponse.copy(district, str, num, str2, arrayList, str3, str4);
    }

    public final DistrictResponse copy(District district, String str, Integer num, String str2, ArrayList<String> supportLang, String str3, String str4) {
        o.LJIIIZ(supportLang, "supportLang");
        return new DistrictResponse(district, str, num, str2, supportLang, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictResponse)) {
            return false;
        }
        DistrictResponse districtResponse = (DistrictResponse) obj;
        return o.LJ(this.district, districtResponse.district) && o.LJ(this.info, districtResponse.info) && o.LJ(this.infocode, districtResponse.infocode) && o.LJ(this.status, districtResponse.status) && o.LJ(this.supportLang, districtResponse.supportLang) && o.LJ(this.updateTime, districtResponse.updateTime) && o.LJ(this.version, districtResponse.version);
    }

    public int hashCode() {
        District district = this.district;
        int hashCode = (district == null ? 0 : district.hashCode()) * 31;
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
        LIZ.append("DistrictResponse(district=");
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

    public final District getDistrict() {
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

    public final void setDistrict(District district) {
        this.district = district;
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

    public DistrictResponse(District district, String str, Integer num, String str2, ArrayList<String> supportLang, String str3, String str4) {
        o.LJIIIZ(supportLang, "supportLang");
        this.district = district;
        this.info = str;
        this.infocode = num;
        this.status = str2;
        this.supportLang = supportLang;
        this.updateTime = str3;
        this.version = str4;
    }

    public /* synthetic */ DistrictResponse(District district, String str, Integer num, String str2, ArrayList arrayList, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new District(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : district, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? new ArrayList() : arrayList, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
    }
}
