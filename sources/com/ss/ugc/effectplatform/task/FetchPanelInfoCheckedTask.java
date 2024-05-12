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
import X.XDO;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS0S0100300_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchPanelInfoCheckedTask extends XDF<PanelInfoModel, PanelInfoCheckedResponse> {
    public final C0FT LJIIL;
    public final XCG LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final Map<String, String> LJIJJ;

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
        HashMap LIZ = XCH.LIZ(this.LJIILIIL, true);
        LIZ.put("panel", this.LJIILJJIL);
        String LJFF = XDN.LJFF(this.LJIJI, this.LJIJ, this.LJIILIIL.LJFF, this.LJIILJJIL, this.LJIIZILJ, this.LJIILLIIL);
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
        if (interfaceC84458XCs != null && (queryToValue = interfaceC84458XCs.queryToValue(LJFF)) != null) {
            try {
                G0J g0j = this.LJIILIIL.LJIJ;
                if (g0j != null) {
                    Version version2 = (Version) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(queryToValue, Version.class);
                    if (version2 != null && (version = version2.getVersion()) != null) {
                        LIZ.put("version", version);
                    }
                }
            } catch (Exception e) {
                C71313Ryn.LIZJ("Json Parse Exception: ", e, C12310e3.LIZIZ, "FetchPanelInfoCheckedTask", null);
            }
        }
        if (this.LJIILLIIL) {
            LIZ.put("has_category_effects", String.valueOf(true));
            String str = this.LJIIZILJ;
            if (str == null) {
                str = "default";
            }
            LIZ.put("category", str);
            LIZ.put("cursor", String.valueOf(this.LJIJI));
            LIZ.put("count", String.valueOf(this.LJIJ));
        }
        String str2 = this.LJIILIIL.LJJIII;
        if (str2 != null) {
            LIZ.put("test_status", str2);
        }
        Map<String, String> map = this.LJIJJ;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIILIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIILIIL.LIZ, "/panel/tryGetInfo", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIILIIL.LJIILL;
    }

    public final void LJIILL(C84418XBe c84418XBe) {
        XCG xcg = this.LJIILIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, false, "panel_checked", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILJJIL), new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ))), c84418XBe.LIZIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.PanelInfoCheckedResponse, X.XDH] */
    @Override // X.XDF
    public final PanelInfoCheckedResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, PanelInfoCheckedResponse.class);
    }

    public final void LJIIZILJ(String str, PanelInfoCheckedResponse panelInfoCheckedResponse) {
        String convertObjToJson;
        boolean z;
        String convertObjToJson2;
        String LJ = XDN.LJ(this.LJIJI, this.LJIJ, this.LJIILIIL.LJFF, this.LJIILJJIL, this.LJIIZILJ, this.LJIILLIIL);
        try {
            if (str.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            long j = 0;
            if (z && this.LJII) {
                C0FT c0ft = this.LJIIL;
                InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
                if (interfaceC84458XCs != null) {
                    j = interfaceC84458XCs.save(LJ, str);
                }
                C78685UuP.LJJLJ(c0ft, Long.valueOf(j / 1024));
            } else {
                G0J g0j = this.LJIILIIL.LJIJ;
                if (g0j != null && (convertObjToJson2 = ((KNJsonConverter) g0j.LIZ).convertObjToJson(panelInfoCheckedResponse)) != null) {
                    C0FT c0ft2 = this.LJIIL;
                    InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
                    if (interfaceC84458XCs2 != null) {
                        j = interfaceC84458XCs2.save(LJ, convertObjToJson2);
                    }
                    C78685UuP.LJJLJ(c0ft2, Long.valueOf(j / 1024));
                }
            }
        } catch (Exception e) {
            C71313Ryn.LIZJ("Exception: ", e, C12310e3.LIZIZ, "FetchPanelInfoCheckedTask", null);
        }
        PanelInfoModel data = panelInfoCheckedResponse.getData();
        if (data != null) {
            try {
                Version version = new Version(data.getVersion());
                G0J g0j2 = this.LJIILIIL.LJIJ;
                if (g0j2 != null && (convertObjToJson = ((KNJsonConverter) g0j2.LIZ).convertObjToJson(version)) != null) {
                    String LJFF = XDN.LJFF(this.LJIJI, this.LJIJ, this.LJIILIIL.LJFF, this.LJIILJJIL, this.LJIIZILJ, this.LJIILLIIL);
                    InterfaceC84458XCs interfaceC84458XCs3 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
                    if (interfaceC84458XCs3 != null) {
                        interfaceC84458XCs3.save(LJFF, convertObjToJson);
                    }
                }
            } catch (Exception e2) {
                C71313Ryn.LIZJ("Json Exception: ", e2, C12310e3.LIZIZ, "FetchPanelInfoCheckedTask", null);
            }
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
        C12310e3.LIZIZ("FetchPanelInfoCheckedTask", LIZIZ, null);
        c84418XBe.LIZ(str, this.LJIILIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
        LJIILL(c84418XBe);
    }

    public final void LJIILLIIL(long j, long j2, long j3, long j4) {
        XCG xcg = this.LJIILIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, true, "panel_checked", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILJJIL), new OSZ("duration", Long.valueOf(j4 - j)), new OSZ("network_time", Long.valueOf(j2 - j)), new OSZ("json_time", Long.valueOf(j3 - j2)), new OSZ("io_time", Long.valueOf(j4 - j3)), new OSZ("size", this.LJIIL.LIZ)), "");
        }
    }

    @Override // X.XDF
    public final void LJIIJJI(long j, long j2, long j3, String json, PanelInfoCheckedResponse panelInfoCheckedResponse) {
        long currentTimeMillis;
        PanelInfoCheckedResponse panelInfoCheckedResponse2 = panelInfoCheckedResponse;
        o.LJIIJ(json, "json");
        if (o.LJ(panelInfoCheckedResponse2.getUpdated(), Boolean.FALSE)) {
            new XDO(this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI).LJI(new AqS0S0100300_15(this, j, j2, j3, 0), new AqS181S0100000_15(this, 216));
            return;
        }
        C12310e3.LIZIZ.getClass();
        C12310e3.LIZ("FetchPanelInfoCheckedTask", "Suc: load data from server");
        PanelInfoModel data = panelInfoCheckedResponse2.getData();
        if (data == null) {
            return;
        }
        XDM xdm = XDM.LIZ;
        XCG xcg = this.LJIILIIL;
        String str = this.LJIILJJIL;
        xdm.getClass();
        XDM.LIZJ(xcg, str, data, true);
        if (this.LJII) {
            LJIIL(j, j2, j3, panelInfoCheckedResponse2);
            currentTimeMillis = System.currentTimeMillis();
            LJIIZILJ(json, panelInfoCheckedResponse2);
        } else {
            LJIIZILJ(json, panelInfoCheckedResponse2);
            LJIIL(j, j2, j3, panelInfoCheckedResponse2);
            currentTimeMillis = System.currentTimeMillis();
        }
        LJIILLIIL(j, j2, j3, currentTimeMillis);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPanelInfoCheckedTask(XCG effectConfig, String panel, String taskFlag, boolean z, String str, int i, int i2, Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag, effectConfig);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIILIIL = effectConfig;
        this.LJIILJJIL = panel;
        this.LJIILL = taskFlag;
        this.LJIILLIIL = z;
        this.LJIIZILJ = str;
        this.LJIJ = i;
        this.LJIJI = i2;
        this.LJIJJ = map;
        this.LJIIL = new C0FT((Object) 0L);
    }
}
