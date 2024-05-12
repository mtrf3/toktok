package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.task.FetchPanelInfoCheckedTask;
import com.ss.ugc.effectplatform.task.FetchPanelInfoPagingCheckedTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCT {
    public static final /* synthetic */ int LJI = 0;
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final XCG LJFF;

    public final C84482XDq LJIIIZ() {
        return (C84482XDq) this.LIZIZ.getValue();
    }

    public final XCU LJIIJ() {
        return (XCU) this.LIZ.getValue();
    }

    public XCT(XCG effectConfig) {
        InterfaceC84458XCs LIZ;
        o.LJIIJ(effectConfig, "effectConfig");
        this.LJFF = effectConfig;
        this.LIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 835));
        this.LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 834));
        this.LIZJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 837));
        this.LIZLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 833));
        C221108m2.LIZIZ(new AqS165S0100000_15(this, 836));
        this.LJ = C221108m2.LIZIZ(C84450XCk.LJLIL);
        if (effectConfig.LJJIIJZLJL != null) {
            if (effectConfig.LJIJ != null) {
                if (!C107244Iu.LIZIZ(effectConfig.LJIIIIZZ)) {
                    if (!C10820be.LJ(effectConfig.LJIIIIZZ)) {
                        C10820be.LJIIJJI(effectConfig.LJIIIIZZ);
                        if (!C10820be.LJ(effectConfig.LJIIIIZZ)) {
                            C12310e3 c12310e3 = C12310e3.LIZIZ;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Cache directory error");
                            LIZ2.append(effectConfig.LJIIIIZZ);
                            String LIZIZ = X1D.LIZIZ(LIZ2);
                            c12310e3.getClass();
                            C12310e3.LIZIZ("EffectPlatform", LIZIZ, null);
                        }
                    }
                    if (!C10820be.LJ(effectConfig.LJJIJIL)) {
                        C10820be.LJIIJJI(effectConfig.LJJIJIL);
                    }
                    if (effectConfig.LJJIIJ == null) {
                        InterfaceExecutorC06770Oj interfaceExecutorC06770Oj = effectConfig.LJIL;
                        XCJ xcj = new XCJ();
                        xcj.LIZIZ = effectConfig.LJJ;
                        xcj.LIZ = interfaceExecutorC06770Oj == null ? new C1IW() : interfaceExecutorC06770Oj;
                        effectConfig.LJJIIJ = xcj.LIZ();
                    }
                    String dirPath = effectConfig.LJIIIIZZ;
                    if (!C10820be.LJ(dirPath)) {
                        C10820be.LJIIJJI(effectConfig.LJIIIIZZ);
                        if (!C10820be.LJ(effectConfig.LJIIIIZZ)) {
                            C12310e3 c12310e32 = C12310e3.LIZIZ;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("Cache directory error");
                            LIZ3.append(effectConfig.LJIIIIZZ);
                            String LIZIZ2 = X1D.LIZIZ(LIZ3);
                            c12310e32.getClass();
                            C12310e3.LIZIZ("EffectPlatform", LIZIZ2, null);
                        }
                    }
                    C0FT c0ft = effectConfig.LJJIFFI;
                    if (c0ft.LIZ == null) {
                        if (C84395XAh.LIZ(dirPath) == null) {
                            C84395XAh.LIZ.put(dirPath, new XBJ(effectConfig));
                        }
                        List<String> list = effectConfig.LJJIIZ;
                        if (list != null && (LIZ = C84395XAh.LIZ(dirPath)) != null) {
                            LIZ.LIZ(list);
                        }
                        C78685UuP.LJJLJ(effectConfig.LJJIFFI, C84395XAh.LIZ(dirPath));
                    } else {
                        Object obj = c0ft.LIZ;
                        o.LJIIJ(dirPath, "dirPath");
                        C84395XAh.LIZ.put(dirPath, obj);
                    }
                    XCB.LIZLLL.LIZ = effectConfig.LJIJJ.LIZ;
                    if (XAQ.LIZ == null) {
                        XAQ.LIZ = new XCE();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("EffectConfiguration Error! Cache directory error");
            }
            throw new IllegalArgumentException("EffectConfiguration Error! Not set json convert");
        }
        throw new IllegalArgumentException("EffectConfiguration Error! Not set host !!!");
    }

    public final void LIZ(Effect effect) {
        String str;
        o.LJIIJ(effect, "effect");
        XCU LJIIJ = LJIIJ();
        LJIIJ.getClass();
        String LJIL = C78966Uyw.LJIL(effect);
        if (!C107244Iu.LIZIZ(LJIL) && (str = LJIIJ.LIZ.get(LJIL)) != null) {
            XCX xcx = LJIIJ.LIZJ.LJJIIJ;
            if (xcx != null) {
                InterfaceC13850gX interfaceC13850gX = xcx.LIZIZ.get(str);
                if (interfaceC13850gX != null) {
                    C12310e3 c12310e3 = C12310e3.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[Cancel][TaskManager][ExecutingList][");
                    LIZ.append(str);
                    LIZ.append(']');
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    c12310e3.getClass();
                    C12310e3.LIZLLL("JKL", LIZIZ);
                    interfaceC13850gX.cancel();
                } else {
                    InterfaceC13850gX interfaceC13850gX2 = xcx.LJI.get(str);
                    if (interfaceC13850gX2 != null) {
                        C12310e3 c12310e32 = C12310e3.LIZIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[Cancel][TaskManager][PausingList][");
                        LIZ2.append(str);
                        LIZ2.append(']');
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        c12310e32.getClass();
                        C12310e3.LIZLLL("JKL", LIZIZ2);
                        interfaceC13850gX2.cancel();
                        xcx.LJI.remove(str);
                    } else {
                        Iterator<InterfaceC13850gX> it = xcx.LIZJ.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            InterfaceC13850gX next = it.next();
                            if (o.LJ(next.getId(), str)) {
                                C12310e3 c12310e33 = C12310e3.LIZIZ;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("[Cancel][TaskManager][WaitingList][");
                                LIZ3.append(str);
                                LIZ3.append(']');
                                String LIZIZ3 = X1D.LIZIZ(LIZ3);
                                c12310e33.getClass();
                                C12310e3.LIZ("JKL", LIZIZ3);
                                next.cancel();
                                xcx.LIZJ.remove(next);
                                break;
                            }
                        }
                    }
                }
            }
            C40601ia<String, String> c40601ia = LJIIJ.LIZ;
            if (c40601ia != null) {
                C65777Prh.LIZJ(c40601ia).remove(LJIL);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    public final void LIZIZ(String panel) {
        o.LJIIJ(panel, "panel");
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJFF.LJJIFFI);
        if (interfaceC84458XCs != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effect_version");
            LIZ.append(panel);
            interfaceC84458XCs.remove(X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(com.ss.ugc.effectplatform.model.Effect r7) {
        /*
            r6 = this;
            java.lang.String r0 = "effect"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            java.lang.String r0 = r7.getUnzipPath()
            boolean r0 = ujb.o.LJJJJJL(r0)
            r5 = 0
            if (r0 == 0) goto L11
            return r5
        L11:
            X.34K r4 = new X.34K
            r4.<init>()
            X.XCG r0 = r6.LJFF
            X.XCM r0 = r0.LJJIZ
            r0.getClass()
            boolean r0 = X.XCM.LIZJ(r7)
            r4.element = r0
            r3 = 1
            if (r0 == 0) goto L78
            com.ss.ugc.effectplatform.model.UrlModel r0 = r7.getTrans_file_url()
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto L8b
            boolean r0 = r4.element
            if (r0 == 0) goto L89
            X.XCG r0 = r6.LJFF
            java.lang.String r1 = r0.LJIIIIZZ
            java.lang.String r0 = "parentDir"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.lang.String r0 = r7.getTransResPath()
            boolean r0 = ujb.o.LJJJJJL(r0)
            if (r0 == 0) goto L51
            X.XDM r0 = X.XDM.LIZ
            r0.getClass()
            X.XDM.LJIIJJI(r7, r1)
        L51:
            X.0e3 r0 = X.C12310e3.LIZIZ
            r0.getClass()
            java.lang.String r1 = "checkEffect"
            java.lang.String r0 = "effect has trans res"
            X.C12310e3.LIZ(r1, r0)
            java.lang.String r0 = r7.getTransResPath()
            boolean r0 = X.C10820be.LJ(r0)
            if (r0 == 0) goto L89
            r0 = 1
        L69:
            r4.element = r0
            if (r0 == 0) goto L70
            X.C84405XAr.LIZIZ(r7)
        L70:
            X.XCU r1 = r6.LJIIJ()
            r0 = 0
            r1.LIZLLL(r7, r3, r0)
        L78:
            boolean r0 = r4.element
            if (r0 == 0) goto L88
            X.XDM r0 = X.XDM.LIZ
            r0.getClass()
            boolean r0 = X.XDM.LJFF(r7)
            if (r0 == 0) goto L88
            r5 = 1
        L88:
            return r5
        L89:
            r0 = 0
            goto L69
        L8b:
            X.1rW<java.lang.String> r2 = X.C84405XAr.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r7.getUnzipPath()
            r1.append(r0)
            java.lang.String r0 = "_trans_"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.add(r0)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XCT.LJIIJJI(com.ss.ugc.effectplatform.model.Effect):boolean");
    }

    public final boolean LJIIL(Effect effect) {
        o.LJIIJ(effect, "effect");
        if (LJIIJJI(effect)) {
            return ((C84393XAf) this.LIZLLL.getValue()).LIZ(effect);
        }
        return false;
    }

    public final void LJIILIIL(Effect effect) {
        String LJII;
        InterfaceC84458XCs interfaceC84458XCs;
        o.LJIIJ(effect, "effect");
        XCU LJIIJ = LJIIJ();
        LJIIJ.getClass();
        if (LJIIJ.LIZJ.LJJIFFI.LIZ != null && !ujb.o.LJJJJJL(effect.getUnzipPath()) && (LJII = C10820be.LJII(effect.getUnzipPath())) != null && (interfaceC84458XCs = (InterfaceC84458XCs) LJIIJ.LIZJ.LJJIFFI.LIZ) != null) {
            XBL.LJIJJ.getClass();
            interfaceC84458XCs.LIZIZ(XBQ.LIZJ(LJII));
        }
        C84393XAf c84393XAf = (C84393XAf) this.LIZLLL.getValue();
        c84393XAf.getClass();
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effect: ");
        LIZ.append(effect.getEffect_id());
        LIZ.append(", name: ");
        LIZ.append(effect.getName());
        LIZ.append(" markModelUsed");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("AlgorithmRepository", LIZIZ);
        if (X99.LIZIZ(effect)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("decrypt error effect: ");
            LIZ2.append(effect.getEffect_id());
            LIZ2.append(", name: ");
            LIZ2.append(effect.getName());
            LIZ2.append(", requirements_sec: ");
            LIZ2.append(effect.getRequirements_sec());
            C12310e3.LIZIZ("AlgorithmRepository", X1D.LIZIZ(LIZ2), null);
            return;
        }
        String[] LIZ3 = X99.LIZ(effect, c84393XAf.LJFF.LJIJ);
        if (LIZ3 == null || LIZ3.length == 0) {
            C12310e3.LIZ("AlgorithmRepository", "effect: " + effect.getEffect_id() + ", name: " + effect.getName() + " returned empty resourceNameArrayOfEffect");
            return;
        }
        c84393XAf.LIZJ.LJ();
        for (String str : LIZ3) {
            C12310e3 c12310e32 = C12310e3.LIZIZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("markModelUsed: resourceName: ");
            LIZ4.append(str);
            String LIZIZ2 = X1D.LIZIZ(LIZ4);
            c12310e32.getClass();
            C12310e3.LIZ("AlgorithmRepository", LIZIZ2);
            c84393XAf.LIZLLL().markModelUsed(str);
        }
    }

    public final void LJIILL(Effect effect) {
        String str;
        XCX xcx;
        o.LJIIJ(effect, "effect");
        XCU LJIIJ = LJIIJ();
        LJIIJ.getClass();
        String LJIL = C78966Uyw.LJIL(effect);
        if (!C107244Iu.LIZIZ(LJIL) && (str = LJIIJ.LIZ.get(LJIL)) != null && (xcx = LJIIJ.LIZJ.LJJIIJ) != null) {
            InterfaceC13850gX interfaceC13850gX = xcx.LIZIZ.get(str);
            if (interfaceC13850gX != null) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[Pause][TaskManager][ExecutingList][");
                LIZ.append(str);
                LIZ.append(']');
                String LIZIZ = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZLLL("JKL", LIZIZ);
                interfaceC13850gX.pause();
                xcx.LJI.put(str, interfaceC13850gX);
                return;
            }
            Iterator<InterfaceC13850gX> it = xcx.LIZJ.iterator();
            while (it.hasNext()) {
                InterfaceC13850gX next = it.next();
                if (o.LJ(next.getId(), str)) {
                    C12310e3 c12310e32 = C12310e3.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[Pause][TaskManager][WaitingList][");
                    LIZ2.append(str);
                    LIZ2.append(']');
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    c12310e32.getClass();
                    C12310e3.LIZ("JKL", LIZIZ2);
                    next.pause();
                    xcx.LIZJ.remove(next);
                    return;
                }
            }
        }
    }

    public final void LIZJ(XDR xdr, XEU xeu, List effectList) {
        String uri;
        List<String> url_prefix;
        o.LJIIJ(effectList, "effectList");
        XCU LJIIJ = LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : effectList) {
            Effect effect = (Effect) obj;
            Integer url_sub_type = effect.getFile_url().getUrl_sub_type();
            if (url_sub_type != null && url_sub_type.intValue() == 1 && (uri = effect.getFile_url().getUri()) != null && !ujb.o.LJJJJJL(uri) && ((url_prefix = effect.getFile_url().getUrl_prefix()) == null || url_prefix.isEmpty())) {
                if (!C78966Uyw.LJIILL(effect)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String uri2 = ((Effect) it.next()).getFile_url().getUri();
            if (uri2 != null) {
                arrayList2.add(uri2);
            }
        }
        XCK xck = LJIIJ.LIZJ.LJIILJJIL;
        if (xck != null) {
            String str = xck.LIZIZ;
            String str2 = xck.LIZ;
            if (str != null && str2 != null && !arrayList2.isEmpty()) {
                LJIIJ.LIZIZ(str2, str, arrayList2, new C84441XCb(LJIIJ, xdr, effectList, LIZ, xeu));
                return;
            }
        }
        if (xdr != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XCX xcx = LJIIJ.LIZJ.LJJIIJ;
        if (xcx == null) {
            return;
        }
        xcx.LIZ(new XCW(LJIIJ.LIZJ, effectList, LIZ, xeu));
    }

    public final void LJFF(ArrayList<String> arrayList, java.util.Map<String, String> map, XDR<EffectListResponse> xdr) {
        XCU LJIIJ = LJIIJ();
        LJIIJ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            LJIIJ.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XCG xcg = LJIIJ.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new XDZ(xcg, arrayList, LIZ, map, true, LJIIJ.LIZIZ));
        }
    }

    public final void LJI(String str, java.util.Map<String, String> map, XDR<FetchFavoriteListResponse> xdr) {
        C84465XCz c84465XCz = (C84465XCz) this.LIZJ.getValue();
        c84465XCz.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            c84465XCz.LIZIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XDC xdc = new XDC(c84465XCz.LIZIZ, str, LIZ, map);
        XCX xcx = c84465XCz.LIZIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xdc);
        }
    }

    public final void LJIIZILJ(Effect effect, boolean z, boolean z2) {
        String str;
        o.LJIIJ(effect, "effect");
        XCU LJIIJ = LJIIJ();
        LJIIJ.getClass();
        String LJIL = C78966Uyw.LJIL(effect);
        if (!C107244Iu.LIZIZ(LJIL) && (str = LJIIJ.LIZ.get(LJIL)) != null) {
            XDR LIZ = LJIIJ.LIZJ.LJJJ.LIZ(str);
            if (!(LIZ instanceof XCP)) {
                LIZ = null;
            }
            LJIIJ.LIZJ(effect, false, z, z2, true, (XCP) LIZ);
        }
    }

    public final void LJ(List<String> effectIds, boolean z, java.util.Map<String, String> map, XDR<List<Effect>> xdr) {
        o.LJIIJ(effectIds, "effectIds");
        if (z) {
            LJIIJ().LJ(effectIds, map, new C84444XCe(this, xdr));
        } else {
            LJIIJ().LJ(effectIds, map, xdr);
        }
    }

    public final void LJIILJJIL(String str, List effectIds, boolean z, XDR xdr) {
        o.LJIIJ(effectIds, "effectIds");
        C84465XCz c84465XCz = (C84465XCz) this.LIZJ.getValue();
        c84465XCz.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            c84465XCz.LIZIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XD5 xd5 = new XD5(c84465XCz.LIZIZ, str, LIZ, effectIds, z);
        XCX xcx = c84465XCz.LIZIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xd5);
        }
    }

    public final void LIZLLL(Effect effect, boolean z, boolean z2, boolean z3, XCP xcp) {
        o.LJIIJ(effect, "effect");
        LJIIJ().LIZJ(effect, false, z, z2, z3, xcp);
    }

    public final void LJII(String panel, boolean z, String str, int i, int i2, boolean z2, java.util.Map<String, String> map, XDR<PanelInfoModel> xdr) {
        InterfaceC13850gX fetchPanelInfoCheckedTask;
        o.LJIIJ(panel, "panel");
        C84482XDq LJIIIZ = LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        if (z2) {
            fetchPanelInfoCheckedTask = new XDO(LJIIIZ.LIZ, panel, LIZ, z, str, i, i2);
        } else {
            fetchPanelInfoCheckedTask = new FetchPanelInfoCheckedTask(LJIIIZ.LIZ, panel, LIZ, z, str, i, i2, map);
        }
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchPanelInfoCheckedTask);
        }
    }

    public final void LJIILLIIL(int i, String creationId, String imageUri, Integer num, Integer num2, String str, HashMap hashMap, C74576TOq c74576TOq) {
        o.LJIIJ(creationId, "creationId");
        o.LJIIJ(imageUri, "imageUri");
        C84482XDq LJIIIZ = LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, c74576TOq);
        XDB xdb = new XDB(LJIIIZ.LIZ, i, creationId, imageUri, num, num2, str, hashMap, LIZ);
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(xdb);
        }
    }

    public final void LJIIIIZZ(String panel, String str, int i, int i2, int i3, String str2, boolean z, java.util.Map<String, String> map, XDR<PanelInfoModel> xdr) {
        InterfaceC13850gX fetchPanelInfoPagingCheckedTask;
        o.LJIIJ(panel, "panel");
        C84482XDq LJIIIZ = LJIIIZ();
        LJIIIZ.getClass();
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            LJIIIZ.LIZ.LJJJ.LIZIZ(LIZ, xdr);
        }
        if (z) {
            fetchPanelInfoPagingCheckedTask = new XDP(LJIIIZ.LIZ, panel, LIZ, str, i, i2, i3, str2);
        } else {
            fetchPanelInfoPagingCheckedTask = new FetchPanelInfoPagingCheckedTask(LJIIIZ.LIZ, panel, LIZ, str, i, i2, i3, str2, map);
        }
        XCX xcx = LJIIIZ.LIZ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(fetchPanelInfoPagingCheckedTask);
        }
    }
}
