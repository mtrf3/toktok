package com.ss.ugc.effectplatform.task;

import X.C0FT;
import X.C10820be;
import X.C113554cx;
import X.C12310e3;
import X.C61597OFl;
import X.C63081OpJ;
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
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.PanelInfoResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchPanelInfoTask extends XDF<PanelInfoModel, PanelInfoResponse> {
    public final C0FT LJIIL;
    public final XCG LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public final String LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final Map<String, String> LJIJI;

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
        String str;
        HashMap LIZ = XCH.LIZ(this.LJIILIIL, true);
        LIZ.put("panel", this.LJIILJJIL);
        if (this.LJIILL) {
            LIZ.put("has_category_effects", String.valueOf(true));
            String str2 = this.LJIILLIIL;
            if (str2 == null) {
                str2 = "default";
            }
            LIZ.put("category", str2);
            LIZ.put("cursor", String.valueOf(this.LJIJ));
            LIZ.put("count", String.valueOf(this.LJIIZILJ));
        }
        String str3 = this.LJIILIIL.LJJIII;
        if (str3 != null) {
            LIZ.put("test_status", str3);
        }
        Map<String, String> map = this.LJIJI;
        if (map != null) {
            LIZ.putAll(map);
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIILIIL.LJJIIJZLJL);
        LIZ2.append(this.LJIILIIL.LIZ);
        if (this.LJIILIIL.LJIIZILJ == 2) {
            str = "/panel/info/v2";
        } else {
            str = "/panel/info";
        }
        LIZ2.append(str);
        return new XD6(C61597OFl.LIZ(LIZ, X1D.LIZIZ(LIZ2)), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIILIIL.LJIILL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.PanelInfoResponse, X.XDH] */
    @Override // X.XDF
    public final PanelInfoResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, PanelInfoResponse.class);
    }

    public final void LJIILL(String str, PanelInfoResponse panelInfoResponse) {
        String str2;
        String convertObjToJson;
        InterfaceC84458XCs interfaceC84458XCs;
        boolean z;
        String convertObjToJson2;
        String LJI = XDN.LJI(this.LJIJ, this.LJIIZILJ, this.LJIILIIL.LJFF, this.LJIILJJIL, this.LJIILLIIL, this.LJIILL);
        try {
            if (str.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            long j = 0;
            if (z && this.LJII) {
                C0FT c0ft = this.LJIIL;
                InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
                if (interfaceC84458XCs2 != null) {
                    j = interfaceC84458XCs2.save(LJI, str);
                }
                C78685UuP.LJJLJ(c0ft, Long.valueOf(j / 1024));
            } else {
                G0J g0j = this.LJIILIIL.LJIJ;
                if (g0j != null && (convertObjToJson2 = ((KNJsonConverter) g0j.LIZ).convertObjToJson(panelInfoResponse)) != null) {
                    C0FT c0ft2 = this.LJIIL;
                    InterfaceC84458XCs interfaceC84458XCs3 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
                    if (interfaceC84458XCs3 != null) {
                        j = interfaceC84458XCs3.save(LJI, convertObjToJson2);
                    }
                    C78685UuP.LJJLJ(c0ft2, Long.valueOf(j / 1024));
                }
            }
        } catch (Exception e) {
            C71313Ryn.LIZJ("Exception: ", e, C12310e3.LIZIZ, "NewFetchPanelInfoTask", null);
        }
        try {
            PanelInfoModel responseData = panelInfoResponse.getResponseData();
            if (responseData != null) {
                str2 = responseData.getVersion();
            } else {
                str2 = null;
            }
            Version version = new Version(str2);
            G0J g0j2 = this.LJIILIIL.LJIJ;
            if (g0j2 != null && (convertObjToJson = ((KNJsonConverter) g0j2.LIZ).convertObjToJson(version)) != null && (interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI)) != null) {
                String str3 = this.LJIILJJIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                LIZ.append(C10820be.LIZ);
                LIZ.append("effect_version");
                interfaceC84458XCs.save(X1D.LIZIZ(LIZ), convertObjToJson);
            }
        } catch (Exception e2) {
            C71313Ryn.LIZJ("Json Exception: ", e2, C12310e3.LIZIZ, "FetchPanelInfoTask", null);
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
        C12310e3.LIZIZ("FetchPanelInfoTask", LIZIZ, null);
        c84418XBe.LIZ(str, this.LJIILIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
        XCG xcg = this.LJIILIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, false, "panel", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILJJIL), new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ))), c84418XBe.LIZIZ);
        }
    }

    @Override // X.XDF
    public final void LJIIJJI(long j, long j2, long j3, String json, PanelInfoResponse panelInfoResponse) {
        long currentTimeMillis;
        PanelInfoResponse panelInfoResponse2 = panelInfoResponse;
        o.LJIIJ(json, "json");
        PanelInfoModel data = panelInfoResponse2.getData();
        if (data != null) {
            XDM xdm = XDM.LIZ;
            XCG xcg = this.LJIILIIL;
            String str = this.LJIILJJIL;
            xdm.getClass();
            XDM.LIZJ(xcg, str, data, false);
            if (this.LJII) {
                LJIIL(j, j2, j3, panelInfoResponse2);
                currentTimeMillis = System.currentTimeMillis();
                LJIILL(json, panelInfoResponse2);
            } else {
                LJIILL(json, panelInfoResponse2);
                LJIIL(j, j2, j3, panelInfoResponse2);
                currentTimeMillis = System.currentTimeMillis();
            }
            XCG xcg2 = this.LJIILIIL;
            InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg2.LJIJJ.LIZ;
            if (interfaceC58749N3x != null) {
                OSZ[] oszArr = new OSZ[8];
                oszArr[0] = new OSZ("log_id", this.LJI);
                oszArr[1] = new OSZ("panel", this.LJIILJJIL);
                String str2 = this.LJIILLIIL;
                if (str2 == null) {
                    str2 = "";
                }
                oszArr[2] = new OSZ("category", str2);
                oszArr[3] = new OSZ("duration", Long.valueOf(currentTimeMillis - j));
                oszArr[4] = new OSZ("network_time", Long.valueOf(j2 - j));
                oszArr[5] = new OSZ("json_time", Long.valueOf(j3 - j2));
                oszArr[6] = new OSZ("io_time", Long.valueOf(currentTimeMillis - j3));
                oszArr[7] = new OSZ("size", this.LJIIL.LIZ);
                C63081OpJ.LLIIZ(interfaceC58749N3x, true, "panel", xcg2, C113554cx.LJJL(oszArr), "");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPanelInfoTask(XCG effectConfig, String panel, String taskFlag, boolean z, String str, int i, int i2, Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag, effectConfig);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIILIIL = effectConfig;
        this.LJIILJJIL = panel;
        this.LJIILL = z;
        this.LJIILLIIL = str;
        this.LJIIZILJ = i;
        this.LJIJ = i2;
        this.LJIJI = map;
        this.LJIIL = new C0FT((Object) 0L);
    }
}
