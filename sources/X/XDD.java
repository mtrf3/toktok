package X;

import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import com.ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDD extends XDF<Boolean, EffectCheckUpdateResponse> {
    public final C0FT LJIIL;
    public final XCG LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final int LJIILLIIL;
    public final java.util.Map<String, String> LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XDF, X.XCZ
    public final void LIZ() {
        String LIZIZ;
        String str;
        VNB fetchFromNetwork;
        G0J g0j;
        EffectCheckUpdateResponse effectCheckUpdateResponse;
        int i = this.LJIILLIIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("effect_version");
                        LIZ.append(this.LJIILJJIL);
                        LIZIZ = X1D.LIZIZ(LIZ);
                    } else {
                        String str2 = this.LJIILJJIL;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str2);
                        LIZIZ = JBR.LJFF(LIZ2, C10820be.LIZ, "info_sticker_version", LIZ2);
                    }
                } else {
                    String str3 = this.LJIILJJIL;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str3);
                    LIZIZ = JBR.LJFF(LIZ3, C10820be.LIZ, "effect_version", LIZ3);
                }
            } else {
                LIZIZ = XDN.LIZIZ(this.LJIILJJIL, this.LJIILL);
            }
        } else {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("effect_version");
            LIZ4.append(this.LJIILJJIL);
            LIZIZ = X1D.LIZIZ(LIZ4);
        }
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJIILIIL.LJJIFFI);
        if (interfaceC84458XCs != null) {
            str = interfaceC84458XCs.queryToValue(LIZIZ);
        } else {
            str = null;
        }
        if (str != null) {
            try {
                G0J g0j2 = this.LJIILIIL.LJIJ;
                if (g0j2 != null) {
                    CheckUpdateVersionModel checkUpdateVersionModel = (CheckUpdateVersionModel) ((KNJsonConverter) g0j2.LIZ).convertJsonToObj(str, CheckUpdateVersionModel.class);
                    if (checkUpdateVersionModel != null) {
                        C78685UuP.LJJLJ(this.LJIIL, checkUpdateVersionModel.getVersion());
                        if (this.LIZIZ) {
                            return;
                        }
                        try {
                            XD6 LJI = LJI();
                            X62 x62 = (X62) this.LJIILIIL.LJIJI.LIZ;
                            if (x62 != null && (fetchFromNetwork = x62.fetchFromNetwork(LJI)) != null) {
                                String LIZLLL = C79045V0n.LIZLLL(fetchFromNetwork.LIZJ);
                                if (!C107244Iu.LIZIZ(LIZLLL) && (g0j = this.LJIILIIL.LJIJ) != null && (effectCheckUpdateResponse = (EffectCheckUpdateResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(LIZLLL, EffectCheckUpdateResponse.class)) != null) {
                                    LJIIL(0L, 0L, 0L, effectCheckUpdateResponse);
                                    return;
                                }
                            }
                            LJIIJ(null, null, new C84418XBe(10002));
                            return;
                        } catch (Exception e) {
                            LJIIJ(null, null, new C84418XBe(e));
                            C71313Ryn.LIZJ("checkUpdate Failed: ", e, C12310e3.LIZIZ, "CheckUpdateTask", null);
                            return;
                        }
                    }
                }
            } catch (Exception e2) {
                C71313Ryn.LIZJ("Json Parse Exception: ", e2, C12310e3.LIZIZ, "CheckUpdateTask", null);
            }
        }
        LJIIL(0L, 0L, 0L, new EffectCheckUpdateResponse(true, null, 0, 6, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // X.XDF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.XD6 LJI() {
        /*
            r11 = this;
            X.XCG r0 = r11.LJIILIIL
            X.V2B.LJIIJJI(r0)
            java.lang.String r5 = ""
            boolean r0 = X.C107244Iu.LIZIZ(r5)
            java.lang.String r4 = "version"
            if (r0 == 0) goto La8
            r1 = r4
        L10:
            X.XCG r0 = r11.LJIILIIL
            java.lang.Object r0 = r0.LJJIIZI
            X.Ecg r7 = X.C36819Ech.LIZ(r0, r1)
            java.lang.String r2 = "app_version"
            java.lang.String r1 = r7.getString(r2, r5)
            X.XCG r0 = r11.LJIILIIL
            java.lang.String r0 = r0.LIZLLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r3 = 1
            r6 = r0 ^ 1
            if (r6 == 0) goto L34
            X.XCG r0 = r11.LJIILIIL
            java.lang.String r0 = r0.LIZLLL
            if (r0 == 0) goto La6
        L31:
            r7.putString(r2, r0)
        L34:
            X.XCG r0 = r11.LJIILIIL
            java.util.HashMap r2 = X.XCH.LIZ(r0, r3)
            java.lang.String r1 = r11.LJIILJJIL
            if (r1 == 0) goto La4
        L3e:
            java.lang.String r0 = "panel"
            r2.put(r0, r1)
            int r1 = r11.LJIILLIIL
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L96
            r0 = 2
            if (r1 == r0) goto L4f
            r0 = 3
            if (r1 == r0) goto L93
        L4f:
            java.lang.String r3 = "/panel/check"
        L51:
            if (r6 == 0) goto L88
            r2.put(r4, r5)
        L56:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.LJIIZILJ
            if (r0 == 0) goto L5d
            r2.putAll(r0)
        L5d:
            X.XCG r0 = r11.LJIILIIL
            java.lang.String r1 = r0.LJJIII
            if (r1 == 0) goto L68
            java.lang.String r0 = "test_status"
            r2.put(r0, r1)
        L68:
            X.XD6 r4 = new X.XD6
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            X.XCG r0 = r11.LJIILIIL
            java.lang.String r0 = r0.LJJIIJZLJL
            r1.append(r0)
            X.XCG r0 = r11.LJIILIIL
            java.lang.String r0 = r0.LIZ
            java.lang.String r5 = X.C65429Pm5.LIZLLL(r1, r0, r3, r1, r2)
            r6 = 0
            X.XD7 r7 = X.XD7.GET
            r10 = 250(0xfa, float:3.5E-43)
            r8 = r6
            r9 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L88:
            X.0FT r0 = r11.LJIIL
            java.lang.Object r0 = r0.LIZ
            if (r0 == 0) goto L8f
            r5 = r0
        L8f:
            r2.put(r4, r5)
            goto L56
        L93:
            java.lang.String r3 = "/sticker/checkUpdate"
            goto L51
        L96:
            java.lang.String r1 = r11.LJIILL
            if (r1 == 0) goto La2
        L9a:
            java.lang.String r0 = "category"
            r2.put(r0, r1)
            java.lang.String r3 = "/category/check"
            goto L51
        La2:
            r1 = r5
            goto L9a
        La4:
            r1 = r5
            goto L3e
        La6:
            r0 = r5
            goto L31
        La8:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            X.XCG r0 = r11.LJIILIIL
            X.V2B.LJIIJJI(r0)
            r1.append(r5)
            java.lang.String r0 = X.C10820be.LIZ
            java.lang.String r1 = X.JBR.LJFF(r1, r0, r4, r1)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDD.LJI():X.XD6");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse, X.XDH] */
    @Override // X.XDF
    public final EffectCheckUpdateResponse LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, EffectCheckUpdateResponse.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XDD(XCG effectConfig, String taskFlag, String str, String str2, int i, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJIILIIL = effectConfig;
        this.LJIILJJIL = str;
        this.LJIILL = str2;
        this.LJIILLIIL = i;
        this.LJIIZILJ = map;
        this.LJIIL = new C0FT((Object) null);
    }
}
