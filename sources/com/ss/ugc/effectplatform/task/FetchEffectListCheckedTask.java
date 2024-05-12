package com.ss.ugc.effectplatform.task;

import X.C113554cx;
import X.C12310e3;
import X.C15180ig;
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
import X.XDR;
import X.XDV;
import X.XET;
import Y.ARunnableS51S0100000_15;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.net.EffectNetListCheckedResponse;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS0S0100300_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchEffectListCheckedTask extends XDF<EffectChannelModel, EffectNetListCheckedResponse> {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final Map<String, String> LJIILJJIL;
    public final String LJIILL;

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
        HashMap LIZ = XCH.LIZ(this.LJIIL, true);
        LIZ.put("panel", this.LJIILIIL);
        Map<String, String> map = this.LJIILJJIL;
        if (map != null) {
            LIZ.putAll(map);
        }
        String LIZLLL = XDN.LIZLLL(this.LJIIL.LJFF, this.LJIILIIL);
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI);
        if (interfaceC84458XCs != null && (queryToValue = interfaceC84458XCs.queryToValue(LIZLLL)) != null) {
            try {
                G0J g0j = this.LJIIL.LJIJ;
                if (g0j != null) {
                    Version version2 = (Version) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(queryToValue, Version.class);
                    if (version2 != null && (version = version2.getVersion()) != null) {
                        LIZ.put("version", version);
                    }
                }
            } catch (Exception e) {
                C71313Ryn.LIZJ("Json Parse Exception: ", e, C12310e3.LIZIZ, "FetchEffectListCheckedTask", null);
            }
        }
        XD7 xd7 = XD7.GET;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(C65429Pm5.LIZLLL(LIZ2, this.LJIIL.LIZ, "/effects/v5", LIZ2, LIZ), null, xd7, null, null, LiveCoverMinSizeSetting.DEFAULT);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    public final void LJIILL(C84418XBe c84418XBe) {
        XCG xcg = this.LJIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, false, "all_effect_checked", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ))), c84418XBe.LIZIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.XDH, com.ss.ugc.effectplatform.model.net.EffectNetListCheckedResponse] */
    @Override // X.XDF
    public final EffectNetListCheckedResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, EffectNetListCheckedResponse.class);
    }

    public final long LJIIZILJ(String str, EffectChannelModel effectChannelModel) {
        String convertObjToJson;
        boolean z;
        String convertObjToJson2;
        long j;
        long j2;
        String LIZJ = XDN.LIZJ(this.LJIIL.LJFF, this.LJIILIIL);
        long j3 = 0;
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.LJII) {
                InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI);
                if (interfaceC84458XCs != null) {
                    j2 = interfaceC84458XCs.save(LIZJ, str);
                } else {
                    j2 = 0;
                }
                j3 = j2 / 1024;
            } else {
                G0J g0j = this.LJIIL.LJIJ;
                if (g0j != null && (convertObjToJson2 = ((KNJsonConverter) g0j.LIZ).convertObjToJson(effectChannelModel)) != null) {
                    InterfaceC84458XCs interfaceC84458XCs2 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI);
                    if (interfaceC84458XCs2 != null) {
                        j = interfaceC84458XCs2.save(LIZJ, convertObjToJson2);
                    } else {
                        j = 0;
                    }
                    j3 = j / 1024;
                }
            }
        } catch (Exception e) {
            C71313Ryn.LIZJ("Exception: ", e, C12310e3.LIZIZ, "FetchEffectListCheckedTask", null);
        }
        try {
            Version version = new Version(effectChannelModel.getVersion());
            G0J g0j2 = this.LJIIL.LJIJ;
            if (g0j2 != null && (convertObjToJson = ((KNJsonConverter) g0j2.LIZ).convertObjToJson(version)) != null) {
                String LIZLLL = XDN.LIZLLL(this.LJIIL.LJFF, this.LJIILIIL);
                InterfaceC84458XCs interfaceC84458XCs3 = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIIL.LJJIFFI);
                if (interfaceC84458XCs3 != null) {
                    interfaceC84458XCs3.save(LIZLLL, convertObjToJson);
                }
            }
        } catch (Exception e2) {
            C71313Ryn.LIZJ("Json Exception: ", e2, C12310e3.LIZIZ, "FetchEffectListCheckedTask", null);
        }
        return j3;
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
        LJIILL(c84418XBe);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchEffectListCheckedTask(XCG effectConfig, String panel, String taskFlag, Map map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag, effectConfig);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIIL = effectConfig;
        this.LJIILIIL = panel;
        this.LJIILJJIL = map;
        this.LJIILL = taskFlag;
    }

    @Override // X.XDF
    public final void LJIIJJI(long j, long j2, long j3, String json, EffectNetListCheckedResponse effectNetListCheckedResponse) {
        long LJIIZILJ;
        long currentTimeMillis;
        EffectNetListCheckedResponse effectNetListCheckedResponse2 = effectNetListCheckedResponse;
        o.LJIIJ(json, "json");
        if (o.LJ(effectNetListCheckedResponse2.getUpdated(), Boolean.FALSE)) {
            new XDV(this.LJIIL, this.LJIILIIL, this.LJIILL).LJI(new AqS0S0100300_15(this, j, j2, j3, 2), new AqS181S0100000_15(this, 215));
            return;
        }
        EffectChannelModel data = effectNetListCheckedResponse2.getData();
        if (data == null) {
            return;
        }
        XDM.LIZ.getClass();
        XDM.LJIILIIL(data.getUrl_prefix(), data.getEffect_list());
        XDM.LJIILIIL(data.getUrl_prefix(), data.getCollection_list());
        XET xet = new XET(this.LJIILIIL, this.LJIIL.LJIIIIZZ, false);
        if (this.LJII) {
            EffectChannelResponse LIZ = xet.LIZ(data);
            XDR LIZ2 = this.LJIIL.LJJJ.LIZ(this.LJIILL);
            if (LIZ2 != null) {
                LIZ2.preProcess(LIZ);
            }
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, LIZ, 26), 64));
            currentTimeMillis = System.currentTimeMillis();
            LJIIZILJ = LJIIZILJ(json, data);
        } else {
            EffectChannelResponse LIZ3 = xet.LIZ(data);
            LJIIZILJ = LJIIZILJ(json, data);
            XDR LIZ4 = this.LJIIL.LJJJ.LIZ(this.LJIILL);
            if (LIZ4 != null) {
                LIZ4.preProcess(LIZ3);
            }
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, LIZ3, 27), 64));
            currentTimeMillis = System.currentTimeMillis();
        }
        LJIILLIIL(j, j2, j3, LJIIZILJ, currentTimeMillis);
    }

    public final void LJIILLIIL(long j, long j2, long j3, long j4, long j5) {
        XCG xcg = this.LJIIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLIIZ(interfaceC58749N3x, true, "all_effect_checked", xcg, C113554cx.LJJL(new OSZ("log_id", this.LJI), new OSZ("panel", this.LJIILIIL), new OSZ("duration", Long.valueOf(j5 - j)), new OSZ("network_time", Long.valueOf(j2 - j)), new OSZ("json_time", Long.valueOf(j3 - j2)), new OSZ("io_time", Long.valueOf(j5 - j3)), new OSZ("size", Long.valueOf(j4))), "");
        }
    }
}
