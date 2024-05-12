package com.ss.android.ugc.aweme.poi;

import X.C07670Rv;
import X.C1JX;
import X.C44977Hkz;
import X.C69432nz;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiData implements Serializable {
    public static final C44977Hkz Companion = new C44977Hkz();

    @InterfaceC65349Pkn("address")
    public final String address;

    @InterfaceC65349Pkn("city")
    public final String city;

    @InterfaceC65349Pkn("country")
    public final String country;

    @InterfaceC65349Pkn("details")
    public final String details;

    @InterfaceC65349Pkn("display_category")
    public final String displayCategory;

    @InterfaceC65349Pkn("distance")
    public final String distance;

    @InterfaceC65349Pkn("district")
    public final String district;

    @InterfaceC65349Pkn("formatted_address")
    public final String formattedAddress;

    @InterfaceC65349Pkn("hight_positions")
    public final String hightPositions;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("is_rtl")
    public final Integer isRTL;

    @InterfaceC65349Pkn("latitude")
    public final double latitude;

    @InterfaceC65349Pkn("location")
    public final String location;

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    @InterfaceC65349Pkn("longitude")
    public final double longitude;

    @InterfaceC65349Pkn("mob_param")
    public final PoiMobParam mobParam;

    @InterfaceC65349Pkn("name")
    public final String name;
    public PoiDetails poiDetails;

    @InterfaceC65349Pkn("service_id")
    public final String poiId;

    @InterfaceC65349Pkn("province")
    public final String province;

    @InterfaceC65349Pkn("telephone")
    public final String telephone;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PoiData() {
        /*
            r25 = this;
            r1 = 0
            r3 = 0
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r25
            r2 = r1
            r5 = r3
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r24 = r1
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.PoiData.<init>():void");
    }

    public static /* synthetic */ PoiData copy$default(PoiData poiData, String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14, Integer num, String str15, String str16, int i, Object obj) {
        double d3 = d2;
        double d4 = d;
        String str17 = str;
        String str18 = str2;
        String str19 = str10;
        String str20 = str9;
        String str21 = str4;
        String str22 = str3;
        String str23 = str5;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        String str27 = str15;
        String str28 = str16;
        String str29 = str12;
        PoiMobParam poiMobParam2 = poiMobParam;
        String str30 = str11;
        String str31 = str14;
        String str32 = str13;
        Integer num2 = num;
        if ((i & 1) != 0) {
            str17 = poiData.id;
        }
        if ((i & 2) != 0) {
            str18 = poiData.name;
        }
        if ((i & 4) != 0) {
            d4 = poiData.latitude;
        }
        if ((i & 8) != 0) {
            d3 = poiData.longitude;
        }
        if ((i & 16) != 0) {
            str22 = poiData.location;
        }
        if ((i & 32) != 0) {
            str21 = poiData.address;
        }
        if ((i & 64) != 0) {
            str23 = poiData.district;
        }
        if ((i & 128) != 0) {
            str24 = poiData.city;
        }
        if ((i & 256) != 0) {
            str25 = poiData.province;
        }
        if ((i & 512) != 0) {
            str26 = poiData.country;
        }
        if ((i & 1024) != 0) {
            str20 = poiData.formattedAddress;
        }
        if ((i & 2048) != 0) {
            str19 = poiData.telephone;
        }
        if ((i & 4096) != 0) {
            str30 = poiData.distance;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str29 = poiData.poiId;
        }
        if ((i & 16384) != 0) {
            str32 = poiData.details;
        }
        if ((32768 & i) != 0) {
            poiMobParam2 = poiData.mobParam;
        }
        if ((65536 & i) != 0) {
            str31 = poiData.logId;
        }
        if ((131072 & i) != 0) {
            num2 = poiData.isRTL;
        }
        if ((262144 & i) != 0) {
            str27 = poiData.hightPositions;
        }
        if ((i & 524288) != 0) {
            str28 = poiData.displayCategory;
        }
        String str33 = str19;
        return poiData.copy(str17, str18, d4, d3, str22, str21, str23, str24, str25, str26, str20, str33, str30, str29, str32, poiMobParam2, str31, num2, str27, str28);
    }

    public final PoiData copy(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14, Integer num, String str15, String str16) {
        return new PoiData(str, str2, d, d2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, poiMobParam, str14, num, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiData)) {
            return false;
        }
        PoiData poiData = (PoiData) obj;
        return o.LJ(this.id, poiData.id) && o.LJ(this.name, poiData.name) && Double.compare(this.latitude, poiData.latitude) == 0 && Double.compare(this.longitude, poiData.longitude) == 0 && o.LJ(this.location, poiData.location) && o.LJ(this.address, poiData.address) && o.LJ(this.district, poiData.district) && o.LJ(this.city, poiData.city) && o.LJ(this.province, poiData.province) && o.LJ(this.country, poiData.country) && o.LJ(this.formattedAddress, poiData.formattedAddress) && o.LJ(this.telephone, poiData.telephone) && o.LJ(this.distance, poiData.distance) && o.LJ(this.poiId, poiData.poiId) && o.LJ(this.details, poiData.details) && o.LJ(this.mobParam, poiData.mobParam) && o.LJ(this.logId, poiData.logId) && o.LJ(this.isRTL, poiData.isRTL) && o.LJ(this.hightPositions, poiData.hightPositions) && o.LJ(this.displayCategory, poiData.displayCategory);
    }

    public final PoiDetails getPoiDetails() {
        String str;
        PoiDetails poiDetails = this.poiDetails;
        if (poiDetails != null) {
            return poiDetails;
        }
        try {
            str = this.details;
        } catch (Exception e) {
            if (e.getMessage() == null) {
                e.toString();
            }
        }
        if (str == null) {
            return null;
        }
        this.poiDetails = (PoiDetails) C69432nz.LIZ().LJI(str, PoiDetails.class);
        return this.poiDetails;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZIZ = C1JX.LIZIZ(this.longitude, C1JX.LIZIZ(this.latitude, (i2 + hashCode2) * 31, 31), 31);
        String str3 = this.location;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (LIZIZ + hashCode3) * 31;
        String str4 = this.address;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.district;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.city;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.province;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        String str8 = this.country;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str9 = this.formattedAddress;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str10 = this.telephone;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str11 = this.distance;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        String str12 = this.poiId;
        if (str12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str12.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        String str13 = this.details;
        if (str13 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str13.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        PoiMobParam poiMobParam = this.mobParam;
        if (poiMobParam == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = poiMobParam.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        String str14 = this.logId;
        if (str14 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str14.hashCode();
        }
        int i15 = (i14 + hashCode15) * 31;
        Integer num = this.isRTL;
        if (num == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num.hashCode();
        }
        int i16 = (i15 + hashCode16) * 31;
        String str15 = this.hightPositions;
        if (str15 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str15.hashCode();
        }
        int i17 = (i16 + hashCode17) * 31;
        String str16 = this.displayCategory;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return i17 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoiData(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", district=");
        sb.append(this.district);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", province=");
        sb.append(this.province);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", formattedAddress=");
        sb.append(this.formattedAddress);
        sb.append(", telephone=");
        sb.append(this.telephone);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", poiId=");
        sb.append(this.poiId);
        sb.append(", details=");
        sb.append(this.details);
        sb.append(", mobParam=");
        sb.append(this.mobParam);
        sb.append(", logId=");
        sb.append(this.logId);
        sb.append(", isRTL=");
        sb.append(this.isRTL);
        sb.append(", hightPositions=");
        sb.append(this.hightPositions);
        sb.append(", displayCategory=");
        return C07670Rv.LIZIZ(sb, this.displayCategory, ')');
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getDisplayCategory() {
        return this.displayCategory;
    }

    public final String getDistance() {
        return this.distance;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getHightPositions() {
        return this.hightPositions;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final PoiMobParam getMobParam() {
        return this.mobParam;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getTelephone() {
        return this.telephone;
    }

    public final Integer isRTL() {
        return this.isRTL;
    }

    public PoiData(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, PoiMobParam poiMobParam, String str14, Integer num, String str15, String str16) {
        this.id = str;
        this.name = str2;
        this.latitude = d;
        this.longitude = d2;
        this.location = str3;
        this.address = str4;
        this.district = str5;
        this.city = str6;
        this.province = str7;
        this.country = str8;
        this.formattedAddress = str9;
        this.telephone = str10;
        this.distance = str11;
        this.poiId = str12;
        this.details = str13;
        this.mobParam = poiMobParam;
        this.logId = str14;
        this.isRTL = num;
        this.hightPositions = str15;
        this.displayCategory = str16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PoiData(java.lang.String r25, java.lang.String r26, double r27, double r29, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, com.ss.android.ugc.aweme.poi.PoiMobParam r42, java.lang.String r43, java.lang.Integer r44, java.lang.String r45, java.lang.String r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r24 = this;
            r23 = r46
            r0 = r47
            r22 = r45
            r21 = r44
            r8 = r31
            r4 = r27
            r9 = r32
            r2 = r25
            r16 = r39
            r10 = r33
            r3 = r26
            r20 = r43
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r19 = r42
            r17 = r40
            r18 = r41
            r1 = r0 & 1
            if (r1 == 0) goto L2d
            r2 = 0
        L2d:
            r1 = r0 & 2
            if (r1 == 0) goto L32
            r3 = 0
        L32:
            r1 = r0 & 4
            r6 = 0
            if (r1 == 0) goto L3a
            r4 = 0
        L3a:
            r1 = r0 & 8
            if (r1 == 0) goto La2
        L3e:
            r1 = r0 & 16
            if (r1 == 0) goto L43
            r8 = 0
        L43:
            r1 = r0 & 32
            if (r1 == 0) goto L48
            r9 = 0
        L48:
            r1 = r0 & 64
            if (r1 == 0) goto L4d
            r10 = 0
        L4d:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L52
            r11 = 0
        L52:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L57
            r12 = 0
        L57:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L5c
            r13 = 0
        L5c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L61
            r14 = 0
        L61:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L66
            r15 = 0
        L66:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L6c
            r16 = 0
        L6c:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L72
            r17 = 0
        L72:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L78
            r18 = 0
        L78:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L80
            r19 = 0
        L80:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L87
            r20 = 0
        L87:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L8e
            r21 = 0
        L8e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L95
            r22 = 0
        L95:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L9c
            r23 = 0
        L9c:
            r1 = r24
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        La2:
            r6 = r29
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.PoiData.<init>(java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.poi.PoiMobParam, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
