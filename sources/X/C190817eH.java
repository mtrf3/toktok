package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190817eH implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final String LJLLJ;
    public final String LJLLL;
    public final String LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public final String LJZ;
    public final String LJZI;
    public final String LJZL;
    public final String LL;
    public final String LLD;
    public final String LLF;
    public final java.util.Map<String, String> LLFF;
    public final java.util.Map<String, String> LLFFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C190817eH() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 33554431, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C190817eH copy$default(C190817eH c190817eH, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, java.util.Map map, java.util.Map map2, int i2, Object obj) {
        String str23 = str;
        String str24 = str2;
        String str25 = str12;
        String str26 = str11;
        String str27 = str10;
        String str28 = str9;
        String str29 = str8;
        String str30 = str13;
        int i3 = i;
        String str31 = str3;
        String str32 = str4;
        String str33 = str5;
        String str34 = str6;
        String str35 = str7;
        java.util.Map map3 = map2;
        String str36 = str22;
        String str37 = str21;
        String str38 = str20;
        String str39 = str15;
        java.util.Map map4 = map;
        String str40 = str14;
        String str41 = str16;
        String str42 = str17;
        String str43 = str18;
        String str44 = str19;
        if ((i2 & 1) != 0) {
            str23 = c190817eH.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str24 = c190817eH.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str31 = c190817eH.LJLJI;
        }
        if ((i2 & 8) != 0) {
            i3 = c190817eH.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str32 = c190817eH.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            str33 = c190817eH.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            str34 = c190817eH.LJLJL;
        }
        if ((i2 & 128) != 0) {
            str35 = c190817eH.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            str29 = c190817eH.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            str28 = c190817eH.LJLL;
        }
        if ((i2 & 1024) != 0) {
            str27 = c190817eH.LJLLI;
        }
        if ((i2 & 2048) != 0) {
            str26 = c190817eH.LJLLILLLL;
        }
        if ((i2 & 4096) != 0) {
            str25 = c190817eH.LJLLJ;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str30 = c190817eH.LJLLL;
        }
        if ((i2 & 16384) != 0) {
            str40 = c190817eH.LJLLLL;
        }
        if ((32768 & i2) != 0) {
            str39 = c190817eH.LJLLLLLL;
        }
        if ((65536 & i2) != 0) {
            str41 = c190817eH.LJLZ;
        }
        if ((131072 & i2) != 0) {
            str42 = c190817eH.LJZ;
        }
        if ((262144 & i2) != 0) {
            str43 = c190817eH.LJZI;
        }
        if ((524288 & i2) != 0) {
            str44 = c190817eH.LJZL;
        }
        if ((1048576 & i2) != 0) {
            str38 = c190817eH.LL;
        }
        if ((2097152 & i2) != 0) {
            str37 = c190817eH.LLD;
        }
        if ((4194304 & i2) != 0) {
            str36 = c190817eH.LLF;
        }
        if ((8388608 & i2) != 0) {
            map4 = c190817eH.LLFF;
        }
        if ((i2 & 16777216) != 0) {
            map3 = c190817eH.LLFFF;
        }
        String str45 = str25;
        return c190817eH.copy(str23, str24, str31, i3, str32, str33, str34, str35, str29, str28, str27, str26, str45, str30, str40, str39, str41, str42, str43, str44, str38, str37, str36, map4, map3);
    }

    public final C190817eH copy(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, java.util.Map<String, String> map, java.util.Map<String, String> allParamsMap) {
        o.LJIIIZ(allParamsMap, "allParamsMap");
        return new C190817eH(str, str2, str3, i, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, map, allParamsMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190817eH)) {
            return false;
        }
        C190817eH c190817eH = (C190817eH) obj;
        return o.LJ(this.LJLIL, c190817eH.LJLIL) && o.LJ(this.LJLILLLLZI, c190817eH.LJLILLLLZI) && o.LJ(this.LJLJI, c190817eH.LJLJI) && this.LJLJJI == c190817eH.LJLJJI && o.LJ(this.LJLJJL, c190817eH.LJLJJL) && o.LJ(this.LJLJJLL, c190817eH.LJLJJLL) && o.LJ(this.LJLJL, c190817eH.LJLJL) && o.LJ(this.LJLJLJ, c190817eH.LJLJLJ) && o.LJ(this.LJLJLLL, c190817eH.LJLJLLL) && o.LJ(this.LJLL, c190817eH.LJLL) && o.LJ(this.LJLLI, c190817eH.LJLLI) && o.LJ(this.LJLLILLLL, c190817eH.LJLLILLLL) && o.LJ(this.LJLLJ, c190817eH.LJLLJ) && o.LJ(this.LJLLL, c190817eH.LJLLL) && o.LJ(this.LJLLLL, c190817eH.LJLLLL) && o.LJ(this.LJLLLLLL, c190817eH.LJLLLLLL) && o.LJ(this.LJLZ, c190817eH.LJLZ) && o.LJ(this.LJZ, c190817eH.LJZ) && o.LJ(this.LJZI, c190817eH.LJZI) && o.LJ(this.LJZL, c190817eH.LJZL) && o.LJ(this.LL, c190817eH.LL) && o.LJ(this.LLD, c190817eH.LLD) && o.LJ(this.LLF, c190817eH.LLF) && o.LJ(this.LLFF, c190817eH.LLFF) && o.LJ(this.LLFFF, c190817eH.LLFFF);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LJLJJI) * 31;
        String str4 = this.LJLJJL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJLJJLL;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJL;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJLJLJ;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJLJLLL;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJLL;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJLLI;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJLLILLLL;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJLLJ;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJLLL;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJLLLL;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.LJLLLLLL;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.LJLZ;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.LJZ;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.LJZI;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.LJZL;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.LL;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.LLD;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.LLF;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        java.util.Map<String, String> map = this.LLFF;
        return this.LLFFF.hashCode() + ((hashCode22 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PoiCollectMobData(enterFrom=" + this.LJLIL + ", enterMethod=" + this.LJLILLLLZI + ", previousPage=" + this.LJLJI + ", enableLocation=" + this.LJLJJI + ", pagePoiId=" + this.LJLJJL + ", pagePoiInfoSource=" + this.LJLJJLL + ", pagePoiCity=" + this.LJLJL + ", pagePoiRegionCode=" + this.LJLJLJ + ", pagePoiDeviceSameCity=" + this.LJLJLLL + ", pageIsClaimed=" + this.LJLL + ", pagePoiDetailType=" + this.LJLLI + ", pageCollectInfo=" + this.LJLLILLLL + ", poiId=" + this.LJLLJ + ", poiInfoSource=" + this.LJLLL + ", poiCity=" + this.LJLLLL + ", poiRegionCode=" + this.LJLLLLLL + ", poiDeviceSameCity=" + this.LJLZ + ", isClaimed=" + this.LJZ + ", poiDetailType=" + this.LJZI + ", collectInfo=" + this.LJZL + ", fromGroupId=" + this.LL + ", groupId=" + this.LLD + ", authorId=" + this.LLF + ", searchParams=" + this.LLFF + ", allParamsMap=" + this.LLFFF + ')';
    }

    public final java.util.Map<String, String> forceToMap() {
        Object opt;
        Object LIZ;
        Object opt2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LJLIL;
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        String str3 = this.LJLJJL;
        if (str3 != null) {
            linkedHashMap.put("page_poi_id", str3);
        }
        String str4 = this.LJLJJLL;
        if (str4 != null) {
            linkedHashMap.put("page_poi_info_source", str4);
        }
        String str5 = this.LJLJL;
        if (str5 != null) {
            linkedHashMap.put("page_poi_city", str5);
        }
        String str6 = this.LJLJLJ;
        if (str6 != null) {
            linkedHashMap.put("page_poi_region_code", str6);
        }
        String str7 = this.LJLJLLL;
        if (str7 != null) {
            linkedHashMap.put("page_poi_device_samecity", str7);
        }
        linkedHashMap.put("enable_location", String.valueOf(this.LJLJJI));
        String str8 = this.LJLJI;
        if (str8 != null) {
            linkedHashMap.put("previous_page", str8);
        }
        if (C78685UuP.LJJJZ(this.LL)) {
            linkedHashMap.put("from_group_id", this.LL);
        }
        String str9 = this.LJLLJ;
        if (str9 != null) {
            linkedHashMap.put("poi_id", str9);
        }
        String str10 = this.LJLZ;
        if (str10 != null) {
            linkedHashMap.put("poi_device_samecity", str10);
        }
        String str11 = this.LJLLLL;
        if (str11 != null) {
            linkedHashMap.put("poi_city", str11);
        }
        String str12 = this.LJLLLL;
        if (str12 != null) {
            linkedHashMap.put("poi_city", str12);
        }
        String str13 = this.LJLLLLLL;
        if (str13 != null) {
            linkedHashMap.put("poi_region_code", str13);
        }
        String str14 = this.LJLLL;
        if (str14 != null) {
            linkedHashMap.put("poi_info_source", str14);
        }
        String str15 = this.LLD;
        if (str15 != null) {
            linkedHashMap.put("group_id", str15);
        }
        String str16 = this.LLF;
        if (str16 != null) {
            linkedHashMap.put("author_id", str16);
        }
        String str17 = this.LJZL;
        if (str17 != null) {
            linkedHashMap.put("collect_info", str17);
            try {
                JSONObject jSONObject = new JSONObject(str17);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String key = keys.next();
                    if (C78685UuP.LJJJZ(key) && (opt2 = jSONObject.opt(key)) != null) {
                        o.LJIIIIZZ(key, "key");
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
        String str18 = this.LJZI;
        if (str18 != null) {
            linkedHashMap.put("poi_detail_type", str18);
        }
        if (C78685UuP.LJJJZ(this.LJZ)) {
            linkedHashMap.put("is_claimed", this.LJZ);
        }
        java.util.Map<String, String> map = this.LLFF;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        if (C78685UuP.LJJJZ(this.LJLL)) {
            linkedHashMap.put("page_is_claimed", this.LJLL);
        }
        String str19 = this.LJLLI;
        if (str19 != null) {
            linkedHashMap.put("page_poi_detail_type", str19);
        }
        String str20 = this.LJLLILLLL;
        if (str20 != null) {
            linkedHashMap.put("page_collect_info", str20);
            try {
                JSONObject jSONObject2 = new JSONObject(str20);
                Iterator<String> keys2 = jSONObject2.keys();
                o.LJIIIIZZ(keys2, "jsonObject.keys()");
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    if (C78685UuP.LJJJZ(next) && (opt = jSONObject2.opt(next)) != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("page_");
                        LIZ2.append(next);
                    }
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
        }
        this.LLFFF.clear();
        this.LLFFF.putAll(linkedHashMap);
        return linkedHashMap;
    }

    public final java.util.Map<String, String> toMap() {
        if (this.LLFFF.isEmpty()) {
            return forceToMap();
        }
        return this.LLFFF;
    }

    public final java.util.Map<String, String> getAllParamsMap() {
        return this.LLFFF;
    }

    public final String getAuthorId() {
        return this.LLF;
    }

    public final String getCollectInfo() {
        return this.LJZL;
    }

    public final int getEnableLocation() {
        return this.LJLJJI;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final String getFromGroupId() {
        return this.LL;
    }

    public final String getGroupId() {
        return this.LLD;
    }

    public final String getPageCollectInfo() {
        return this.LJLLILLLL;
    }

    public final String getPageIsClaimed() {
        return this.LJLL;
    }

    public final String getPagePoiCity() {
        return this.LJLJL;
    }

    public final String getPagePoiDetailType() {
        return this.LJLLI;
    }

    public final String getPagePoiDeviceSameCity() {
        return this.LJLJLLL;
    }

    public final String getPagePoiId() {
        return this.LJLJJL;
    }

    public final String getPagePoiInfoSource() {
        return this.LJLJJLL;
    }

    public final String getPagePoiRegionCode() {
        return this.LJLJLJ;
    }

    public final String getPoiCity() {
        return this.LJLLLL;
    }

    public final String getPoiDetailType() {
        return this.LJZI;
    }

    public final String getPoiDeviceSameCity() {
        return this.LJLZ;
    }

    public final String getPoiId() {
        return this.LJLLJ;
    }

    public final String getPoiInfoSource() {
        return this.LJLLL;
    }

    public final String getPoiRegionCode() {
        return this.LJLLLLLL;
    }

    public final String getPreviousPage() {
        return this.LJLJI;
    }

    public final java.util.Map<String, String> getSearchParams() {
        return this.LLFF;
    }

    public final String isClaimed() {
        return this.LJZ;
    }

    public C190817eH(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, java.util.Map<String, String> map, java.util.Map<String, String> allParamsMap) {
        o.LJIIIZ(allParamsMap, "allParamsMap");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = i;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
        this.LJLJLJ = str7;
        this.LJLJLLL = str8;
        this.LJLL = str9;
        this.LJLLI = str10;
        this.LJLLILLLL = str11;
        this.LJLLJ = str12;
        this.LJLLL = str13;
        this.LJLLLL = str14;
        this.LJLLLLLL = str15;
        this.LJLZ = str16;
        this.LJZ = str17;
        this.LJZI = str18;
        this.LJZL = str19;
        this.LL = str20;
        this.LLD = str21;
        this.LLF = str22;
        this.LLFF = map;
        this.LLFFF = allParamsMap;
    }

    public /* synthetic */ C190817eH(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, java.util.Map map, java.util.Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? null : str12, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : str13, (i2 & 16384) != 0 ? null : str14, (32768 & i2) != 0 ? null : str15, (65536 & i2) != 0 ? null : str16, (131072 & i2) != 0 ? null : str17, (262144 & i2) != 0 ? null : str18, (524288 & i2) != 0 ? null : str19, (1048576 & i2) != 0 ? null : str20, (2097152 & i2) != 0 ? null : str21, (4194304 & i2) != 0 ? null : str22, (8388608 & i2) != 0 ? null : map, (i2 & 16777216) != 0 ? new LinkedHashMap() : map2);
    }
}
