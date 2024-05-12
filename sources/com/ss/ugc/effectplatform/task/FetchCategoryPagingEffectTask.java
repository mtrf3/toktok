package com.ss.ugc.effectplatform.task;

import X.C08380Uo;
import X.C113554cx;
import X.C12310e3;
import X.C63081OpJ;
import X.C65429Pm5;
import X.C71313Ryn;
import X.C78685UuP;
import X.G0J;
import X.InterfaceC58749N3x;
import X.InterfaceC84458XCs;
import X.OSZ;
import X.X1D;
import X.X62;
import X.XCG;
import X.XCH;
import X.XD6;
import X.XD7;
import X.XDF;
import X.XDH;
import X.XDM;
import X.XDN;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchCategoryPagingEffectTask extends XDF<CategoryPageModel, CategoryEffectListResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final String LJIJ;
    public final Map<String, String> LJIJI;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    /* loaded from: classes15.dex */
    public static final class CategoryVersion {
        public final int cursor;
        public final int sorting_position;
        public final String version;

        public static /* synthetic */ CategoryVersion copy$default(CategoryVersion categoryVersion, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = categoryVersion.version;
            }
            if ((i3 & 2) != 0) {
                i = categoryVersion.cursor;
            }
            if ((i3 & 4) != 0) {
                i2 = categoryVersion.sorting_position;
            }
            return categoryVersion.copy(str, i, i2);
        }

        public final CategoryVersion copy(String version, int i, int i2) {
            o.LJIIJ(version, "version");
            return new CategoryVersion(version, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryVersion)) {
                return false;
            }
            CategoryVersion categoryVersion = (CategoryVersion) obj;
            return o.LJ(this.version, categoryVersion.version) && this.cursor == categoryVersion.cursor && this.sorting_position == categoryVersion.sorting_position;
        }

        public int hashCode() {
            String str = this.version;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.cursor) * 31) + this.sorting_position;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CategoryVersion(version=");
            LIZ.append(this.version);
            LIZ.append(", cursor=");
            LIZ.append(this.cursor);
            LIZ.append(", sorting_position=");
            return C08380Uo.LIZ(LIZ, this.sorting_position, ")", LIZ);
        }

        public final int getCursor() {
            return this.cursor;
        }

        public final int getSorting_position() {
            return this.sorting_position;
        }

        public final String getVersion() {
            return this.version;
        }

        public CategoryVersion(String version, int i, int i2) {
            o.LJIIJ(version, "version");
            this.version = version;
            this.cursor = i;
            this.sorting_position = i2;
        }
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("panel", this.LJIILIIL);
        String str = this.LJIILJJIL;
        if (str == null) {
            str = "hot";
        }
        LIZ.put("category", str);
        LIZ.put("cursor", String.valueOf(this.LJIILLIIL));
        LIZ.put("count", String.valueOf(this.LJIILL));
        LIZ.put("sorting_position", String.valueOf(this.LJIIZILJ));
        String str2 = this.LJIJ;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("version", str2);
        String str3 = this.LJIIL.LJJIII;
        if (str3 != null) {
            LIZ.put("test_status", str3);
        }
        Map<String, String> map = this.LJIJI;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/category/page/effects", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    public final long LJIILL(CategoryEffectListResponse categoryEffectListResponse) {
        long j;
        G0J g0j;
        String convertObjToJson;
        try {
            g0j = this.LJIIL.LJIJ;
        } catch (Exception e) {
            C71313Ryn.LIZJ("Json Exception: ", e, C12310e3.LIZIZ, "FetchCategoryPagingEffectTask", null);
        }
        if (g0j != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(categoryEffectListResponse)) != null) {
            j = convertObjToJson.length();
            return j / 1024;
        }
        j = 0;
        return j / 1024;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse, X.XDH] */
    @Override // X.XDF
    public final CategoryEffectListResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, CategoryEffectListResponse.class);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:7|8|(4:10|12|13|(7:17|(1:19)|20|(1:24)|25|26|(4:28|(1:33)|30|31)(1:34)))|38|12|13|(8:15|17|(0)|20|(2:22|24)|25|26|(0)(0))) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.XDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.String r23, java.lang.String r24, X.C84418XBe r25) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.FetchCategoryPagingEffectTask.LJIIJ(java.lang.String, java.lang.String, X.XBe):void");
    }

    public final long LJIILLIIL(String str, CategoryEffectListResponse categoryEffectListResponse, CategoryVersion categoryVersion) {
        String convertObjToJson;
        InterfaceC84458XCs interfaceC84458XCs;
        boolean z;
        String convertObjToJson2;
        long j;
        long j2;
        String LIZ = XDN.LIZ(this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ);
        long j3 = 0;
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.LJII) {
                InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI);
                if (interfaceC84458XCs2 != null) {
                    j2 = interfaceC84458XCs2.save(LIZ, str);
                } else {
                    j2 = 0;
                }
                j3 = j2 / 1024;
            } else {
                G0J g0j = this.LJIIL.LJIJ;
                if (g0j != null && (convertObjToJson2 = ((KNJsonConverter) g0j.LIZ).convertObjToJson(categoryEffectListResponse)) != null) {
                    InterfaceC84458XCs interfaceC84458XCs3 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI);
                    if (interfaceC84458XCs3 != null) {
                        j = interfaceC84458XCs3.save(LIZ, convertObjToJson2);
                    } else {
                        j = 0;
                    }
                    j3 = j / 1024;
                }
            }
        } catch (Exception e) {
            C71313Ryn.LIZJ("Json Exception: ", e, C12310e3.LIZIZ, "FetchCategoryPagingEffectTask", null);
        }
        try {
            G0J g0j2 = this.LJIIL.LJIJ;
            if (g0j2 != null && (convertObjToJson = ((KNJsonConverter) g0j2.LIZ).convertObjToJson(categoryVersion)) != null && (interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI)) != null) {
                interfaceC84458XCs.save(XDN.LIZIZ(this.LJIILIIL, this.LJIILJJIL), convertObjToJson);
            }
        } catch (Exception e2) {
            C71313Ryn.LIZJ("Json Exception: ", e2, C12310e3.LIZIZ, "FetchCategoryPagingEffectTask", null);
        }
        return j3;
    }

    @Override // X.XDF
    public final void LJIIJJI(long j, long j2, long j3, String json, CategoryEffectListResponse categoryEffectListResponse) {
        String str;
        int i;
        int i2;
        long LJIILL;
        long currentTimeMillis;
        CategoryEffectModel category_effects;
        CategoryEffectModel category_effects2;
        CategoryEffectModel category_effects3;
        CategoryEffectListResponse categoryEffectListResponse2 = categoryEffectListResponse;
        o.LJIIJ(json, "json");
        CategoryPageModel data = categoryEffectListResponse2.getData();
        if (data != null) {
            XDM xdm = XDM.LIZ;
            XCG xcg = this.LJIIL;
            String str2 = this.LJIILIIL;
            xdm.getClass();
            XDM.LIZIZ(xcg, str2, data, true);
            CategoryPageModel data2 = categoryEffectListResponse2.getData();
            if (data2 == null || (category_effects3 = data2.getCategory_effects()) == null || (str = category_effects3.getVersion()) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            CategoryPageModel data3 = categoryEffectListResponse2.getData();
            if (data3 != null && (category_effects2 = data3.getCategory_effects()) != null) {
                i = category_effects2.getCursor();
            } else {
                i = 0;
            }
            CategoryPageModel data4 = categoryEffectListResponse2.getData();
            if (data4 != null && (category_effects = data4.getCategory_effects()) != null) {
                i2 = category_effects.getSorting_position();
            } else {
                i2 = 0;
            }
            CategoryVersion categoryVersion = new CategoryVersion(str, i, i2);
            if (this.LJII) {
                LJIIL(j, j2, j3, categoryEffectListResponse2);
                currentTimeMillis = System.currentTimeMillis();
                if (this.LJIILLIIL == 0) {
                    LJIILL = LJIILLIIL(json, categoryEffectListResponse2, categoryVersion);
                } else {
                    LJIILL = LJIILL(categoryEffectListResponse2);
                }
            } else {
                if (this.LJIILLIIL == 0) {
                    LJIILL = LJIILLIIL(json, categoryEffectListResponse2, categoryVersion);
                } else {
                    LJIILL = LJIILL(categoryEffectListResponse2);
                }
                LJIIL(j, j2, j3, categoryEffectListResponse2);
                currentTimeMillis = System.currentTimeMillis();
            }
            XCG xcg2 = this.LJIIL;
            InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg2.LJIJJ.LIZ;
            if (interfaceC58749N3x != null) {
                OSZ[] oszArr = new OSZ[8];
                oszArr[0] = new OSZ("log_id", this.LJI);
                oszArr[1] = new OSZ("panel", this.LJIILIIL);
                String str3 = this.LJIILJJIL;
                if (str3 == null) {
                    str3 = "";
                }
                oszArr[2] = new OSZ("category", str3);
                oszArr[3] = new OSZ("duration", Long.valueOf(currentTimeMillis - j));
                oszArr[4] = new OSZ("network_time", Long.valueOf(j2 - j));
                oszArr[5] = new OSZ("json_time", Long.valueOf(j3 - j2));
                oszArr[6] = new OSZ("io_time", Long.valueOf(currentTimeMillis - j3));
                oszArr[7] = new OSZ("size", Long.valueOf(LJIILL));
                C63081OpJ.LLIIZ(interfaceC58749N3x, true, "category_paged", xcg2, C113554cx.LJJL(oszArr), "");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchCategoryPagingEffectTask(XCG effectConfig, String panel, String taskFlag, String str, int i, int i2, int i3, String str2, Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag, effectConfig);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = panel;
        this.LJIILJJIL = str;
        this.LJIILL = i;
        this.LJIILLIIL = i2;
        this.LJIIZILJ = i3;
        this.LJIJ = str2;
        this.LJIJI = map;
    }
}
