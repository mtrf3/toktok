package com.ss.ugc.effectplatform.task;

import X.C0FT;
import X.C113554cx;
import X.C12310e3;
import X.C63081OpJ;
import X.C65429Pm5;
import X.C71313Ryn;
import X.C78685UuP;
import X.C84418XBe;
import X.G0J;
import X.InterfaceC58749N3x;
import X.InterfaceC84458XCs;
import X.JBR;
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
import X.XDP;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse;
import com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS0S0100300_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchPanelInfoPagingCheckedTask extends XDF<PanelInfoModel, PanelInfoPagingCheckedResponse> {
    public final C0FT LJIIL;
    public final boolean LJIILIIL;
    public final XCG LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final String LJIJJLI;
    public final Map<String, String> LJIL;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    /* loaded from: classes9.dex */
    public static final class Version {
        public String version;

        /* JADX WARN: Multi-variable type inference failed */
        public Version() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Version copy$default(Version version, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = version.version;
            }
            return version.copy(str);
        }

        public final Version copy(String str) {
            return new Version(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Version) && o.LJ(this.version, ((Version) obj).version);
            }
            return true;
        }

        public int hashCode() {
            String str = this.version;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Version(version=");
            return JBR.LJFF(LIZ, this.version, ")", LIZ);
        }

        public final String getVersion() {
            return this.version;
        }

        public Version(String str) {
            this.version = str;
        }

        public final void setVersion(String str) {
            this.version = str;
        }

        public /* synthetic */ Version(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str);
        }
    }

    @Override // X.XDF
    public final XD6 LJI() {
        String queryToValue;
        String version;
        HashMap LIZ = XCH.LIZ(this.LJIILJJIL, true);
        LIZ.put("panel", this.LJIILL);
        String str = this.LJIILJJIL.LJFF;
        String panel = this.LJIILL;
        boolean z = this.LJIILIIL;
        String str2 = this.LJIIZILJ;
        int i = this.LJIJI;
        int i2 = this.LJIJ;
        int i3 = this.LJIJJ;
        String str3 = this.LJIJJLI;
        o.LJIIJ(panel, "panel");
        StringBuilder LIZ2 = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ2, XDN.LJII(z, str, i, panel, str2, i2, i3, str3), "effect_version", LIZ2);
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILJJIL.LJJIFFI);
        if (interfaceC84458XCs != null && (queryToValue = interfaceC84458XCs.queryToValue(LJFF)) != null) {
            try {
                G0J g0j = this.LJIILJJIL.LJIJ;
                if (g0j != null) {
                    Version version2 = (Version) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(queryToValue, Version.class);
                    if (version2 != null && (version = version2.getVersion()) != null) {
                        LIZ.put("panel_version", version);
                    }
                }
            } catch (Exception e) {
                C71313Ryn.LIZJ("Json Parse Exception: ", e, C12310e3.LIZIZ, "FetchPanelInfoPagingCheckedTask", null);
            }
        }
        String str4 = this.LJIIZILJ;
        if (str4 == null) {
            str4 = "all";
        }
        LIZ.put("category", str4);
        LIZ.put("cursor", String.valueOf(this.LJIJI));
        LIZ.put("count", String.valueOf(this.LJIJ));
        LIZ.put("sorting_position", String.valueOf(this.LJIJJ));
        String str5 = this.LJIJJLI;
        if (str5 == null) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("version", str5);
        String str6 = this.LJIILJJIL.LJJIII;
        if (str6 != null) {
            LIZ.put("test_status", str6);
        }
        Map<String, String> map = this.LJIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this.LJIILJJIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ3, this.LJIILJJIL.LIZ, "/panel/infoAndCategoryEffectsPaged", LIZ3, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIILJJIL.LJIILL;
    }

    public final void LJIILL(C84418XBe c84418XBe) {
        XCG xcg = this.LJIILJJIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, false, "panel_paged", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILL), new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ))), c84418XBe.LIZIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.PanelInfoPagingCheckedResponse, X.XDH] */
    @Override // X.XDF
    public final PanelInfoPagingCheckedResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, PanelInfoPagingCheckedResponse.class);
    }

    public final void LJIIZILJ(String str, PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse) {
        boolean z;
        String convertObjToJson;
        String LJII = XDN.LJII(this.LJIILIIL, this.LJIILJJIL.LJFF, this.LJIJI, this.LJIILL, this.LJIIZILJ, this.LJIJ, this.LJIJJ, this.LJIJJLI);
        try {
            if (str.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            long j = 0;
            if (z && this.LJII) {
                C0FT c0ft = this.LJIIL;
                InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILJJIL.LJJIFFI);
                if (interfaceC84458XCs != null) {
                    j = interfaceC84458XCs.save(LJII, str);
                }
                C78685UuP.LJJLJ(c0ft, Long.valueOf(j / 1024));
                return;
            }
            G0J g0j = this.LJIILJJIL.LJIJ;
            if (g0j != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(panelInfoPagingCheckedResponse)) != null) {
                C0FT c0ft2 = this.LJIIL;
                InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILJJIL.LJJIFFI);
                if (interfaceC84458XCs2 != null) {
                    j = interfaceC84458XCs2.save(LJII, convertObjToJson);
                }
                C78685UuP.LJJLJ(c0ft2, Long.valueOf(j / 1024));
            }
        } catch (Exception e) {
            C71313Ryn.LIZJ("Exception: ", e, C12310e3.LIZIZ, "FetchPanelInfoPagingCheckedTask", null);
        }
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed: ");
        LIZ.append(c84418XBe);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("FetchPanelInfoPagingCheckedTask", LIZIZ, null);
        c84418XBe.LIZ(str, this.LJIILJJIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
        LJIILL(c84418XBe);
    }

    public final void LJIILLIIL(long j, long j2, long j3, long j4) {
        XCG xcg = this.LJIILJJIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, true, "panel_paged", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILL), new OSZ("duration", Long.valueOf(j4 - j)), new OSZ("network_time", Long.valueOf(j2 - j)), new OSZ("json_time", Long.valueOf(j3 - j2)), new OSZ("io_time", Long.valueOf(j4 - j3)), new OSZ("size", this.LJIIL.LIZ)), "");
        }
    }

    @Override // X.XDF
    public final void LJIIJJI(long j, long j2, long j3, String json, PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse) {
        Boolean bool;
        PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse2 = panelInfoPagingCheckedResponse;
        o.LJIIJ(json, "json");
        PanelInfoCheckedResponse panelInfoResponse = panelInfoPagingCheckedResponse2.getPanelInfoResponse();
        if (panelInfoResponse != null) {
            bool = panelInfoResponse.getUpdated();
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            new XDP(this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI).LJI(new AqS0S0100300_15(this, j, j2, j3, 1), new AqS181S0100000_15(this, 217));
            return;
        }
        C12310e3.LIZIZ.getClass();
        C12310e3.LIZ("FetchPanelInfoPagingCheckedTask", "Suc: load data from server");
        PanelInfoModel responseData = panelInfoPagingCheckedResponse2.getResponseData();
        if (responseData == null) {
            return;
        }
        CategoryEffectModel category_effects = responseData.getCategory_effects();
        long currentTimeMillis = System.currentTimeMillis();
        if (category_effects != null) {
            XDM xdm = XDM.LIZ;
            XCG xcg = this.LJIILJJIL;
            String str = this.LJIILL;
            xdm.getClass();
            XDM.LIZJ(xcg, str, responseData, true);
            if (this.LJII) {
                LJIIL(j, j2, j3, panelInfoPagingCheckedResponse2);
                currentTimeMillis = System.currentTimeMillis();
                LJIIZILJ(json, panelInfoPagingCheckedResponse2);
            } else {
                LJIIZILJ(json, panelInfoPagingCheckedResponse2);
                LJIIL(j, j2, j3, panelInfoPagingCheckedResponse2);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        LJIILLIIL(j, j2, j3, currentTimeMillis);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPanelInfoPagingCheckedTask(XCG effectConfig, String panel, String taskFlag, String str, int i, int i2, int i3, String str2, Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag, effectConfig);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIILJJIL = effectConfig;
        this.LJIILL = panel;
        this.LJIILLIIL = taskFlag;
        this.LJIIZILJ = str;
        this.LJIJ = i;
        this.LJIJI = i2;
        this.LJIJJ = i3;
        this.LJIJJLI = str2;
        this.LJIL = map;
        this.LJIIL = new C0FT((Object) 0L);
        this.LJIILIIL = true;
    }
}
