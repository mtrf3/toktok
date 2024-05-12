package X;

import Y.ARunnableS51S0100000_15;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XCU {
    public final C40601ia<String, String> LIZ;
    public final XCY LIZIZ;
    public final XCG LIZJ;

    public XCU(XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LIZJ = effectConfig;
        this.LIZ = new C40601ia<>(true);
        this.LIZIZ = new XCY(effectConfig, new C84443XCd(this));
    }

    public final void LIZLLL(Effect effect, boolean z, XCP xcp) {
        o.LJIIJ(effect, "effect");
        LIZJ(effect, z, false, false, false, xcp);
    }

    public final void LJ(List list, java.util.Map map, XDR xdr) {
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            this.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XCG xcg = this.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new XDY(xcg, list, LIZ, map, this.LIZIZ));
        }
    }

    public final void LIZIZ(String requestUrl, String scene, List oidList, XDR xdr) {
        o.LJIIJ(requestUrl, "requestUrl");
        o.LJIIJ(scene, "scene");
        o.LJIIJ(oidList, "oidList");
        String LIZ = C84410XAw.LIZ();
        this.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        XCX xcx = this.LIZJ.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84463XCx(this.LIZJ, requestUrl, scene, oidList, LIZ));
        }
    }

    public static void LIZ(XCU xcu, Effect effect, String str, XCL xcl, boolean z, boolean z2) {
        if (ORY.LJJIJIIJIL(effect.getPanel(), xcu.LIZJ.LJJJJ)) {
            XCG xcg = xcu.LIZJ;
            if (xcg.LJJJIL) {
                XCX xcx = xcg.LJJIIJ;
                if (xcx != null) {
                    if (z) {
                        xcl.LJIIJ = 1;
                        xcl.LJIIJJI = System.currentTimeMillis();
                        xcx.LIZJ.add(0, xcl);
                        C12310e3 c12310e3 = C12310e3.LIZIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("[TaskManager][InsertHead][");
                        LIZ.append(xcl.getId());
                        LIZ.append(']');
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        c12310e3.getClass();
                        C12310e3.LIZ("JKL", LIZIZ);
                    } else {
                        xcl.LJIIJ = 0;
                        xcl.LJIIJJI = System.currentTimeMillis();
                        xcx.LIZJ.add(xcl);
                        C12310e3 c12310e32 = C12310e3.LIZIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[TaskManager][InsertTail][");
                        LIZ2.append(xcl.getId());
                        LIZ2.append(']');
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        c12310e32.getClass();
                        C12310e3.LIZ("JKL", LIZIZ2);
                    }
                    Iterator<AbstractC13830gV> it = xcx.LIZ.values().iterator();
                    boolean z3 = false;
                    while (it.hasNext()) {
                        if (it.next().LIZ()) {
                            z3 = true;
                        }
                    }
                    xcl.LJ();
                    if (!z3) {
                        if (z2) {
                            if (xcl.LIZLLL) {
                                C12310e3 c12310e33 = C12310e3.LIZIZ;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("[Pause][TaskManager][Return][Insert:");
                                LIZ3.append(xcl.getId());
                                LIZ3.append(" isRunning]");
                                String LIZIZ3 = X1D.LIZIZ(LIZ3);
                                c12310e33.getClass();
                                C12310e3.LIZ("JKL", LIZIZ3);
                            } else {
                                if (xcx.LJFF.LIZIZ() + xcx.LIZIZ.size() < xcx.LJII) {
                                    C12310e3 c12310e34 = C12310e3.LIZIZ;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("[Pause][TaskManager][Return][");
                                    LIZ4.append(xcx.LIZIZ.keySet());
                                    LIZ4.append("][Insert:");
                                    LIZ4.append(xcl.getId());
                                    LIZ4.append(']');
                                    String LIZIZ4 = X1D.LIZIZ(LIZ4);
                                    c12310e34.getClass();
                                    C12310e3.LIZ("JKL", LIZIZ4);
                                } else {
                                    C12310e3 c12310e35 = C12310e3.LIZIZ;
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("[Pause][TaskManager][Pause][");
                                    LIZ5.append(xcx.LIZIZ.keySet());
                                    LIZ5.append("][Insert:");
                                    LIZ5.append(xcl.getId());
                                    LIZ5.append(']');
                                    String LIZIZ5 = X1D.LIZIZ(LIZ5);
                                    c12310e35.getClass();
                                    C12310e3.LIZIZ("JKL", LIZIZ5, null);
                                    xcx.LJFF.LIZJ();
                                    InterfaceC13850gX interfaceC13850gX = null;
                                    for (InterfaceC13850gX interfaceC13850gX2 : xcx.LIZIZ.values()) {
                                        if (interfaceC13850gX2 instanceof XCZ) {
                                            interfaceC13850gX2.getClass();
                                            if ((interfaceC13850gX2 instanceof XCL) && (interfaceC13850gX == null || interfaceC13850gX.getLevel() > interfaceC13850gX2.getLevel() || interfaceC13850gX.getModifyTime() > interfaceC13850gX2.getModifyTime())) {
                                                interfaceC13850gX = interfaceC13850gX2;
                                            }
                                        }
                                    }
                                    if (interfaceC13850gX != null) {
                                        C12310e3 c12310e36 = C12310e3.LIZIZ;
                                        StringBuilder LIZ6 = X1D.LIZ();
                                        LIZ6.append("[Pause][TaskManager][执行-Star][任务 - ");
                                        LIZ6.append(interfaceC13850gX.getId());
                                        LIZ6.append(']');
                                        String LIZIZ6 = X1D.LIZIZ(LIZ6);
                                        c12310e36.getClass();
                                        C12310e3.LIZIZ("JKL", LIZIZ6, null);
                                        xcx.LIZLLL.add(interfaceC13850gX);
                                        interfaceC13850gX.pause();
                                        xcx.LIZIZ.remove(interfaceC13850gX.getId());
                                        interfaceC13850gX.setModifyTime(System.currentTimeMillis());
                                        if (interfaceC13850gX instanceof XCZ) {
                                            ((XCZ) interfaceC13850gX).LIZIZ = false;
                                        }
                                        StringBuilder LIZ7 = X1D.LIZ();
                                        LIZ7.append("[Pause][TaskManager][执行-End][任务 - ");
                                        LIZ7.append(interfaceC13850gX.getId());
                                        LIZ7.append(']');
                                        C12310e3.LIZIZ("JKL", X1D.LIZIZ(LIZ7), null);
                                    }
                                }
                            }
                        }
                        xcx.LJIIIIZZ.execute(new ARunnableS51S0100000_15(xcx, 65));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        XCX xcx2 = xcu.LIZJ.LJJIIJ;
        if (xcx2 != null) {
            xcx2.LIZ(xcl);
        }
    }

    public final String LIZJ(Effect effect, boolean z, boolean z2, boolean z3, boolean z4, XCP xcp) {
        String str;
        String str2;
        o.LJIIJ(effect, "effect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C84410XAw.LIZ());
        LIZ.append(" - ");
        LIZ.append(effect.getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (ujb.o.LJJJJJL(effect.getId())) {
            if (xcp != null) {
                xcp.onFail(effect, new C84418XBe(10014));
            }
            return LIZIZ;
        }
        if (xcp != null) {
            this.LIZJ.LJJJ.LIZIZ(LIZIZ, xcp);
        }
        if (z) {
            XCG xcg = this.LIZJ;
            XCX xcx = xcg.LJJIIJ;
            if (xcx != null) {
                xcx.LIZ(new C84479XDn(xcg, effect, LIZIZ));
            }
            return LIZIZ;
        }
        XCK xck = this.LIZJ.LJIILJJIL;
        if (xck != null) {
            str = xck.LIZIZ;
            str2 = xck.LIZ;
        } else {
            str = null;
            str2 = null;
        }
        String uri = effect.getFile_url().getUri();
        boolean LJIILL = C78966Uyw.LJIILL(effect);
        Integer url_sub_type = effect.getFile_url().getUrl_sub_type();
        if (url_sub_type == null || url_sub_type.intValue() != 1 || uri == null || ujb.o.LJJJJJL(uri) || str == null || str2 == null || LJIILL) {
            XCL xcl = new XCL(effect, this.LIZJ, LIZIZ, null);
            xcl.LJIIIZ = z4;
            LIZ(this, effect, LIZIZ, xcl, z2, z3);
        } else {
            LIZIZ(str2, str, C47261Igj.LJJIJ(uri), new C84440XCa(this, xcp, effect, uri, LIZIZ, z4, z2, z3));
        }
        return LIZIZ;
    }

    public final String LJFF(int i, int i2, XDR xdr, String searchId, String keyword, String str, java.util.Map map) {
        o.LJIIJ(searchId, "searchId");
        o.LJIIJ(keyword, "keyword");
        String LIZ = C84410XAw.LIZ();
        if (xdr != null) {
            this.LIZJ.LJJJ.LIZIZ(LIZ, xdr);
        }
        XCG xcg = this.LIZJ;
        XCX xcx = xcg.LJJIIJ;
        if (xcx != null) {
            xcx.LIZ(new C84464XCy(xcg, searchId, keyword, i, i2, map, LIZ, str));
        }
        return LIZ;
    }
}
