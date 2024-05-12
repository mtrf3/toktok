package X;

import Y.AObjectS84S0300000_14;
import android.webkit.WebView;
import com.lynx.react.bridge.JavaOnlyMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EvB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37965EvB extends AbstractC37964EvA {
    public final ArrayList<AbstractC37964EvA> LIZ;

    @Override // X.AbstractC37964EvA
    public final String LIZ() {
        return "DEFAULT_BRIDGE_LIFE_CLIENT_IMP";
    }

    public C37965EvB(C37904EuC bridgeContext) {
        o.LJIIJ(bridgeContext, "bridgeContext");
        this.LIZ = new ArrayList<>();
    }

    @Override // X.AbstractC37964EvA
    public final void LIZJ(C37955Ev1 call, C37911EuJ result) {
        JavaOnlyMap javaOnlyMap;
        int i;
        o.LJIIJ(result, "result");
        o.LJIIJ(call, "call");
        int i2 = C37931Eud.LIZLLL[call.LIZ().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && (javaOnlyMap = call.LJJIIJZLJL) != null) {
                C37977EvN c37977EvN = new C37977EvN();
                c37977EvN.LIZ = call.LIZLLL;
                c37977EvN.LIZLLL = call.LJ;
                c37977EvN.LJ = Long.valueOf(call.LJIIJ);
                System.currentTimeMillis();
                if (javaOnlyMap.hasKey("code") && (i = javaOnlyMap.getInt("code", -1000)) != -1000) {
                    c37977EvN.LIZIZ = Integer.valueOf(i);
                }
                c37977EvN.LIZJ = javaOnlyMap.getString("msg", "");
                JSONObject jSONObject = new JSONObject(javaOnlyMap);
                jSONObject.put("runtimeThread", call.LJIJI);
                c37977EvN.LJFF = jSONObject;
                Object obj = call.LJI;
                if (obj != null) {
                    C38010Evu.LIZ.getClass();
                    c37977EvN.LJI = C38010Evu.LJ((JavaOnlyMap) obj);
                }
                c37977EvN.LJII = call.LJJIIZ;
                Integer num = c37977EvN.LIZIZ;
                if (num == null || num.intValue() != 1) {
                    Iterator<InterfaceC37980EvQ> it = call.LJJIIZI.LJIIIIZZ.iterator();
                    while (it.hasNext()) {
                        it.next().LIZ(c37977EvN);
                    }
                    C37936Eui c37936Eui = call.LJIJJLI;
                    c37936Eui.LIZJ = c37977EvN.LIZIZ;
                    String str = c37977EvN.LIZJ;
                    if (str != null) {
                        c37936Eui.LJFF.put("error_message", str);
                    }
                    String str2 = call.LJIJI;
                    if (str2 != null) {
                        c37936Eui.LJFF.put("runtimeThread", str2);
                    }
                    call.LJIJJLI.LIZIZ(call.LJJIIZI.LJIIL);
                } else {
                    Iterator<InterfaceC37980EvQ> it2 = call.LJJIIZI.LJIIIIZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(c37977EvN);
                    }
                }
            }
        } else {
            JSONObject LIZ = result.LIZ();
            C37977EvN c37977EvN2 = new C37977EvN();
            c37977EvN2.LIZ = call.LIZLLL;
            c37977EvN2.LIZLLL = call.LJ;
            c37977EvN2.LJ = Long.valueOf(call.LJIIJ);
            System.currentTimeMillis();
            Object opt = LIZ.opt("code");
            Object obj2 = null;
            if (!(opt instanceof Integer)) {
                opt = null;
            }
            c37977EvN2.LIZIZ = (Integer) opt;
            Object opt2 = LIZ.opt("msg");
            if (!(opt2 instanceof String)) {
                opt2 = null;
            }
            c37977EvN2.LIZJ = (String) opt2;
            LIZ.put("runtimeThread", call.LJIJI);
            c37977EvN2.LJFF = LIZ;
            c37977EvN2.LJI = new JSONObject(call.LJIIJJI);
            C37969EvF c37969EvF = call.LJIIZILJ;
            if (c37969EvF != null) {
                c37969EvF.LJIILJJIL = c37977EvN2.LIZIZ;
            }
            Integer num2 = c37977EvN2.LIZIZ;
            if (num2 == null || num2.intValue() != 1) {
                Iterator<InterfaceC37980EvQ> it3 = call.LJJIIZI.LJIIIIZZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZ(c37977EvN2);
                }
                C37936Eui c37936Eui2 = call.LJIJJLI;
                c37936Eui2.LIZJ = c37977EvN2.LIZIZ;
                String str3 = c37977EvN2.LIZJ;
                if (str3 != null) {
                    c37936Eui2.LJFF.put("error_message", str3);
                }
                String str4 = call.LJIJI;
                if (str4 != null) {
                    c37936Eui2.LJFF.put("runtimeThread", str4);
                }
                call.LJIJJLI.LIZIZ(call.LJJIIZI.LJIIL);
            } else {
                Iterator<InterfaceC37980EvQ> it4 = call.LJJIIZI.LJIIIIZZ.iterator();
                while (it4.hasNext()) {
                    it4.next().LIZIZ(c37977EvN2);
                }
            }
            Object obj3 = result.LIZ;
            if (obj3 instanceof JSONObject) {
                Object opt3 = ((JSONObject) obj3).opt("code");
                if (opt3 instanceof Integer) {
                    obj2 = opt3;
                }
                Integer num3 = (Integer) obj2;
                if (num3 != null) {
                    int intValue = num3.intValue();
                    C37970EvG c37970EvG = call.LJJI;
                    if (c37970EvG != null) {
                        c37970EvG.LIZIZ = Integer.valueOf(intValue);
                    }
                }
            }
            C37970EvG c37970EvG2 = call.LJJI;
            if (c37970EvG2 != null) {
                c37970EvG2.LJIILIIL = Long.valueOf(call.LJJIII - call.LJJII);
            }
            C37970EvG c37970EvG3 = call.LJJI;
            if (c37970EvG3 != null) {
                c37970EvG3.LJIILJJIL = Long.valueOf(call.LJJIII);
            }
            C37969EvF c37969EvF2 = call.LJIIZILJ;
            if (c37969EvF2 != null) {
                c37969EvF2.LJIIIIZZ = call.LJJII;
                c37969EvF2.LJIIIZ = call.LJJIII;
                c37969EvF2.LJIIL = System.currentTimeMillis();
            }
        }
        Iterator<AbstractC37964EvA> it5 = this.LIZ.iterator();
        while (it5.hasNext()) {
            it5.next().LIZJ(call, result);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC37964EvA
    public final void LIZLLL(C37904EuC bridgeContext, C37955Ev1 call) {
        WebView webView;
        C3C4 c3c4;
        C3C4 c3c42;
        o.LJIIJ(call, "call");
        o.LJIIJ(bridgeContext, "bridgeContext");
        if (C37931Eud.LJ[call.LIZ().ordinal()] == 1) {
            String str = call.LJJIIJ;
            if (str != null && !ujb.o.LJJJJIZL(str, "null", false)) {
                try {
                    JSONObject jSONObject = new JSONObject(call.LJJIIJ);
                    C37970EvG c37970EvG = call.LJJI;
                    if (c37970EvG != 0) {
                        Long valueOf = Long.valueOf(jSONObject.optLong("__timestamp"));
                        c37970EvG.LJIILL = valueOf;
                        if (valueOf != null && c37970EvG.LJIILJJIL != null) {
                            long longValue = valueOf.longValue();
                            Long l = c37970EvG.LJIILJJIL;
                            if (l != null) {
                                c37970EvG.LJIILLIIL = Long.valueOf(longValue - l.longValue());
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        Long l2 = c37970EvG.LJIILL;
                        if (l2 != null && c37970EvG.LJIIIIZZ != null) {
                            long longValue2 = l2.longValue();
                            Long l3 = c37970EvG.LJIIIIZZ;
                            if (l3 != null) {
                                c37970EvG.LJFF = Long.valueOf(longValue2 - l3.longValue());
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        }
                        String str2 = call.LJJIIJ;
                        if (str2 != null) {
                            byte[] bytes = str2.getBytes(PVC.LIZ);
                            o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                            c37970EvG.LJIIL = Integer.valueOf(bytes.length);
                        }
                        String type = EnumC37971EvH.H5.getType();
                        o.LJIIJ(type, "type");
                        c37970EvG.LJ = type;
                        String channel = C39130FXi.LIZJ;
                        o.LJIIJ(channel, "channel");
                        c37970EvG.LIZLLL = channel;
                        C37932Eue.LIZLLL.getClass();
                        C39130FXi c39130FXi = C37932Eue.LIZJ;
                        c3c42 = c37970EvG;
                        if (c39130FXi != null) {
                            c39130FXi.LIZ(c37970EvG.LIZ());
                            c3c42 = c37970EvG;
                        }
                    } else {
                        c3c42 = null;
                    }
                    C3C5.m7constructorimpl(c3c42);
                    c3c4 = c3c42;
                } catch (Throwable th) {
                    C3C4 LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                    c3c4 = LIZ;
                }
                C3C5.m10exceptionOrNullimpl(c3c4);
            }
            long currentTimeMillis = System.currentTimeMillis();
            C37969EvF c37969EvF = call.LJIIZILJ;
            if (c37969EvF != null) {
                c37969EvF.LJIILIIL = currentTimeMillis;
                c37969EvF.LJFF = currentTimeMillis;
                c37969EvF.LJIIJJI = currentTimeMillis;
                c37969EvF.LIZIZ = currentTimeMillis;
                c37969EvF.LIZIZ();
            }
            C37969EvF c37969EvF2 = call.LJIIZILJ;
            if (c37969EvF2 != null && (webView = c37969EvF2.LJIJJLI) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("info", c37969EvF2.LIZ());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("jsb_call", Long.valueOf(c37969EvF2.LIZIZ - c37969EvF2.LIZ));
                hashMap2.put("jsb_func_call", Long.valueOf(c37969EvF2.LIZIZ - c37969EvF2.LIZ));
                hashMap2.put("jsb_func_convert_params", Long.valueOf(c37969EvF2.LIZLLL - c37969EvF2.LIZJ));
                hashMap2.put("jsb_func_platform_method", Long.valueOf(c37969EvF2.LJFF - c37969EvF2.LJ));
                hashMap2.put("jsb_func_thread_switch", 0);
                hashMap2.put("jsb_callback_thread_switch", Long.valueOf(c37969EvF2.LJII - c37969EvF2.LJI));
                hashMap2.put("jsb_callback_call", Long.valueOf(c37969EvF2.LJIIJJI - c37969EvF2.LJIIJ));
                hashMap2.put("jsb_callback_convert_params", Long.valueOf(c37969EvF2.LJIIIZ - c37969EvF2.LJIIIIZZ));
                hashMap2.put("jsb_callback_invoke", Long.valueOf(c37969EvF2.LJIILIIL - c37969EvF2.LJIIL));
                hashMap2.put("jsb_func_call_start", Long.valueOf(c37969EvF2.LIZ));
                hashMap2.put("jsb_func_call_end", Long.valueOf(c37969EvF2.LIZIZ));
                hashMap2.put("jsb_callback_thread_switch_start", Long.valueOf(c37969EvF2.LJI));
                hashMap2.put("jsb_callback_thread_switch_end", Long.valueOf(c37969EvF2.LJII));
                hashMap2.put("jsb_callback_call_start", Long.valueOf(c37969EvF2.LJIIJ));
                hashMap2.put("jsb_callback_call_end", Long.valueOf(c37969EvF2.LJIIJJI));
                hashMap.put("perf", hashMap2);
                VMI vmi = VMI.LJ;
                vmi.getClass();
                C38045EwT.LIZ(new AObjectS84S0300000_14(vmi, webView, hashMap, 2));
            }
        }
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(bridgeContext, call);
        }
    }

    @Override // X.AbstractC37964EvA
    public final void LJ(C37904EuC bridgeContext, C37955Ev1 c37955Ev1) {
        WebView webView;
        WebView webView2;
        o.LJIIJ(bridgeContext, "bridgeContext");
        long currentTimeMillis = System.currentTimeMillis();
        C37936Eui c37936Eui = c37955Ev1.LJIJJLI;
        c37936Eui.LIZLLL = "BDXBridge";
        c37936Eui.LIZIZ = c37955Ev1.LJ;
        c37936Eui.LIZ = c37955Ev1.LIZLLL;
        int i = C37931Eud.LIZ[c37955Ev1.LIZ().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c37936Eui.LJ = c37955Ev1.LJJIIZI.LJ;
            }
        } else {
            InterfaceC37958Ev4 interfaceC37958Ev4 = c37955Ev1.LJJIIZI.LIZLLL;
            if (interfaceC37958Ev4 != null) {
                webView = interfaceC37958Ev4.LIZ();
            } else {
                webView = null;
            }
            c37936Eui.LJ = webView;
        }
        if (C37931Eud.LIZIZ[c37955Ev1.LIZ().ordinal()] == 1) {
            String str = c37955Ev1.LIZLLL;
            int i2 = c37955Ev1.LJJ;
            InterfaceC37958Ev4 interfaceC37958Ev42 = bridgeContext.LIZLLL;
            if (interfaceC37958Ev42 != null) {
                webView2 = interfaceC37958Ev42.LIZ();
            } else {
                webView2 = null;
            }
            C37969EvF c37969EvF = new C37969EvF("bridge", "call", str, i2, "BDXBridge", webView2);
            c37955Ev1.LJIIZILJ = c37969EvF;
            c37969EvF.LIZ = c37955Ev1.LJIIJ;
            long j = c37955Ev1.LJIL;
            c37969EvF.LIZJ = j;
            c37969EvF.LIZLLL = currentTimeMillis;
            c37969EvF.LJ = currentTimeMillis;
            C37970EvG c37970EvG = c37955Ev1.LJJI;
            if (c37970EvG != null) {
                c37970EvG.LJIIJ = Long.valueOf(currentTimeMillis - j);
                c37970EvG.LJIIIIZZ = Long.valueOf(c37955Ev1.LJIIJ);
                Long valueOf = Long.valueOf(c37955Ev1.LJIL);
                c37970EvG.LJIIIZ = valueOf;
                if (valueOf != null && c37970EvG.LJIIIIZZ != null) {
                    long longValue = valueOf.longValue();
                    Long l = c37970EvG.LJIIIIZZ;
                    if (l != null) {
                        c37970EvG.LJIIJJI = C0EM.LIZIZ(l, longValue);
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                String str2 = c37955Ev1.LJJIFFI;
                Charset charset = PVC.LIZ;
                if (str2 != null) {
                    byte[] bytes = str2.getBytes(charset);
                    o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                    c37970EvG.LJII = Integer.valueOf(bytes.length);
                    String str3 = c37955Ev1.LIZLLL;
                    o.LJIIJ(str3, "str");
                    c37970EvG.LIZ = str3;
                    String url = c37955Ev1.LJ;
                    o.LJIIJ(url, "url");
                    c37970EvG.LJI = url;
                    String id = C39130FXi.LIZIZ;
                    o.LJIIJ(id, "id");
                    c37970EvG.LIZJ = id;
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJ(bridgeContext, c37955Ev1);
        }
    }

    @Override // X.AbstractC37964EvA
    public final void LJFF(Object obj, String eventName) {
        o.LJIIJ(eventName, "eventName");
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJFF(obj, eventName);
        }
    }

    @Override // X.AbstractC37964EvA
    public final void LJI(Object obj, String eventName) {
        o.LJIIJ(eventName, "eventName");
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJI(obj, eventName);
        }
    }

    @Override // X.AbstractC37964EvA
    public final void LJII(C37904EuC bridgeContext, C37955Ev1 c37955Ev1) {
        o.LJIIJ(bridgeContext, "bridgeContext");
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJII(bridgeContext, c37955Ev1);
        }
    }

    @Override // X.AbstractC37964EvA
    public final void LJIIIIZZ(C37904EuC bridgeContext, C37955Ev1 c37955Ev1) {
        o.LJIIJ(bridgeContext, "bridgeContext");
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(bridgeContext, c37955Ev1);
        }
    }

    @Override // X.AbstractC37964EvA
    public final PZL LJIIIZ(C37904EuC bridgeContext, C37955Ev1 c37955Ev1) {
        o.LJIIJ(bridgeContext, "bridgeContext");
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            AbstractC37964EvA next = it.next();
            if (!next.LJIIIZ(bridgeContext, c37955Ev1).LIZ) {
                C37936Eui c37936Eui = c37955Ev1.LJIJJLI;
                String LIZ = next.LIZ();
                if (LIZ != null) {
                    c37936Eui.LJFF.put("jsb_error_life_client_bid", LIZ);
                } else {
                    c37936Eui.getClass();
                }
                String LIZ2 = next.LIZ();
                if (LIZ2 == null || LIZ2.length() == 0 || C37905EuD.LJIIJJI) {
                    throw new Exception("your lifeClient's bid is illegal, please change it with legal format!");
                }
                return next.LJIIIZ(bridgeContext, c37955Ev1);
            }
        }
        return new PZL(0);
    }

    @Override // X.AbstractC37964EvA
    public final void LIZIZ(C37911EuJ result, C37955Ev1 call, C37904EuC mContext) {
        o.LJIIJ(result, "result");
        o.LJIIJ(call, "call");
        o.LJIIJ(mContext, "mContext");
        if (C37931Eud.LIZJ[call.LIZ().ordinal()] == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            C37969EvF c37969EvF = call.LJIIZILJ;
            if (c37969EvF != null) {
                c37969EvF.LJI = currentTimeMillis;
                c37969EvF.LJII = currentTimeMillis;
                c37969EvF.LJIIJ = currentTimeMillis;
            }
        }
        Iterator<AbstractC37964EvA> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(result, call, mContext);
        }
    }
}
