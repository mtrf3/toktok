package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS13S1400000_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.IDqS452S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FPu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38934FPu implements InterfaceC38196Eyu, InterfaceC39974FmU {
    public static final C38933FPt LJLLI = C38933FPt.LJLIL;
    public static final C38939FPz LJLLILLLL = C38939FPz.LJLIL;
    public final java.util.Map<String, InterfaceC38932FPs> LJLIL;
    public final java.util.Map<String, InterfaceC38217EzF> LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public InterfaceC88472Yns<? super InterfaceC38217EzF, C76800UCe> LJLJL;
    public final InterfaceC88472Yns<F3T, List<InterfaceC38217EzF>> LJLJLJ;
    public final F3T LJLJLLL;
    public FQ4<C38937FPx> LJLL;

    @Override // X.InterfaceC39974FmU
    public final C39976FmW getLoggerWrapper() {
        return (C39976FmW) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC38196Eyu
    public final java.util.Map<String, InterfaceC38217EzF> Zd() {
        java.util.Map<String, InterfaceC38217EzF> map = this.LJLILLLLZI;
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            List<InterfaceC38217EzF> invoke = this.LJLJLJ.invoke(this.LJLJLLL);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (InterfaceC38217EzF interfaceC38217EzF : invoke) {
                sb.append(interfaceC38217EzF.getName());
                String str = FQ3.LIZ;
                sb.append(str);
                InterfaceC38217EzF interfaceC38217EzF2 = (InterfaceC38217EzF) ((LinkedHashMap) this.LJLILLLLZI).get(interfaceC38217EzF.getName());
                if (interfaceC38217EzF2 != null) {
                    sb2.append(interfaceC38217EzF2.getName());
                    sb2.append(str);
                    interfaceC38217EzF2.release();
                }
                this.LJLILLLLZI.put(interfaceC38217EzF.getName(), interfaceC38217EzF);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start to register bridges: ");
            LIZ.append((Object) sb);
            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), EnumC39958FmE.D, null, 4);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("these bridges has been registered! use the newer one.");
            LIZ2.append(" replaced list: ");
            LIZ2.append((Object) sb2);
            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), EnumC39958FmE.W, null, 4);
            for (FQ0 fq0 : (List) this.LJLJI.getValue()) {
                InterfaceC38196Eyu interfaceC38196Eyu = fq0.LJLIL;
                boolean z = fq0.LJLILLLLZI;
                java.util.Set<String> keySet = interfaceC38196Eyu.Zd().keySet();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("start to register and merge bridges: ");
                LIZ3.append(keySet);
                C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ3), EnumC39958FmE.D, null, 4);
                for (Map.Entry<String, InterfaceC38217EzF> entry : interfaceC38196Eyu.Zd().entrySet()) {
                    if (this.LJLILLLLZI.containsKey(entry.getKey())) {
                        if (z) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("bridge method named ");
                            C39973FmT.LIZIZ(this, C025908h.LIZIZ(LIZ4, entry.getKey(), " has been registered!", " use the newer one.", LIZ4), EnumC39958FmE.W, null, 4);
                            InterfaceC37788EsK interfaceC37788EsK = (InterfaceC37788EsK) ((LinkedHashMap) this.LJLILLLLZI).get(entry.getKey());
                            if (interfaceC37788EsK != null) {
                                interfaceC37788EsK.release();
                            }
                            this.LJLILLLLZI.put(entry.getKey(), entry.getValue());
                        } else {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("bridge method named ");
                            C39973FmT.LIZIZ(this, C025908h.LIZIZ(LIZ5, entry.getKey(), " has been registered!", " use the older one.", LIZ5), EnumC39958FmE.W, null, 4);
                            entry.getValue().release();
                        }
                    } else {
                        this.LJLILLLLZI.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return map;
    }

    @Override // X.InterfaceC37788EsK
    public final void release() {
        Iterator it = ((LinkedHashMap) this.LJLIL).entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC37788EsK) ((Map.Entry) it.next()).getValue()).release();
        }
        Iterator it2 = ((LinkedHashMap) this.LJLILLLLZI).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC37788EsK) ((Map.Entry) it2.next()).getValue()).release();
        }
        ((LinkedHashMap) this.LJLIL).clear();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC38196Eyu
    public final boolean i9() {
        return this.LJLJJI;
    }

    public final void LIZ(InterfaceC38217EzF interfaceC38217EzF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register bridge method named ");
        LIZ.append(interfaceC38217EzF.getName());
        LIZ.append('.');
        C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ), EnumC39958FmE.D, null, 4);
        if (this.LJLILLLLZI.containsKey(interfaceC38217EzF.getName())) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("bridge method named ");
            LIZ2.append(interfaceC38217EzF.getName());
            LIZ2.append(" has been registered!");
            LIZ2.append(" use the newer one.");
            C39973FmT.LIZIZ(this, X1D.LIZIZ(LIZ2), EnumC39958FmE.W, null, 4);
            InterfaceC37788EsK interfaceC37788EsK = (InterfaceC37788EsK) ((LinkedHashMap) this.LJLILLLLZI).get(interfaceC38217EzF.getName());
            if (interfaceC37788EsK != null) {
                interfaceC37788EsK.release();
            }
        }
        this.LJLILLLLZI.put(interfaceC38217EzF.getName(), interfaceC38217EzF);
    }

    public final void LIZJ(InterfaceC88471Ynr<? super String, ? super InterfaceC38217EzF, C76800UCe> interfaceC88471Ynr) {
        AqS188S0100000_6 aqS188S0100000_6 = new AqS188S0100000_6(interfaceC88471Ynr, (InterfaceC88471Ynr<InterfaceC63694OzC<Object>, Object, InterfaceC63694OzC<Object>>) 18);
        Iterator it = ((LinkedHashMap) this.LJLIL).entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC38932FPs) ((Map.Entry) it.next()).getValue()).we(aqS188S0100000_6);
        }
        Iterator it2 = ((LinkedHashMap) Zd()).entrySet().iterator();
        while (it2.hasNext()) {
            aqS188S0100000_6.invoke(C61878OQg.INSTANCE, ((Map.Entry) it2.next()).getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(C38934FPu c38934FPu) {
        List LJJIJIIJI;
        for (Map.Entry entry : ((LinkedHashMap) c38934FPu.LJLIL).entrySet()) {
            if (this.LJLIL.containsKey(entry.getKey())) {
                InterfaceC38932FPs interfaceC38932FPs = (InterfaceC38932FPs) ((LinkedHashMap) this.LJLIL).get(entry.getKey());
                if (interfaceC38932FPs != null) {
                    interfaceC38932FPs.Gh((InterfaceC38932FPs) entry.getValue());
                }
            } else {
                this.LJLIL.put(entry.getKey(), entry.getValue());
            }
        }
        ((List) this.LJLJI.getValue()).add(new FQ0(c38934FPu));
        FQ4<C38937FPx> fq4 = this.LJLL;
        if (fq4 == null) {
            this.LJLL = c38934FPu.LJLL;
            return;
        }
        FQ4<C38937FPx> fq42 = c38934FPu.LJLL;
        if (fq42 == null || (LJJIJIIJI = C47261Igj.LJJIJIIJI(fq4, fq42)) == null) {
            return;
        }
        this.LJLL = new C38935FPv(LJJIJIIJI);
    }

    @Override // X.InterfaceC38196Eyu
    public final void fl(AqS172S0100000_6 aqS172S0100000_6) {
        this.LJLJL = aqS172S0100000_6;
    }

    @Override // X.InterfaceC38196Eyu
    public final InterfaceC38217EzF ti(String func) {
        o.LJIIJ(func, "func");
        return (InterfaceC38217EzF) ((LinkedHashMap) Zd()).get(func);
    }

    @Override // X.InterfaceC39974FmU
    public final void printReject(Throwable th, String extraMsg) {
        o.LJIIJ(extraMsg, "extraMsg");
        C39973FmT.LIZJ(this, th, extraMsg);
    }

    @Override // X.InterfaceC39974FmU
    public final void printLog(String msg, EnumC39958FmE logLevel, String subModule) {
        o.LJIIJ(msg, "msg");
        o.LJIIJ(logLevel, "logLevel");
        o.LJIIJ(subModule, "subModule");
        C39973FmT.LIZ(this, msg, logLevel, subModule);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38934FPu(List<? extends FQ1> scopeProviderFactories, InterfaceC88472Yns<? super F3T, ? extends List<? extends InterfaceC38217EzF>> bridgeProvider, F3T contextProviderFactory, FQ4<C38937FPx> fq4) {
        o.LJIIJ(scopeProviderFactories, "scopeProviderFactories");
        o.LJIIJ(bridgeProvider, "bridgeProvider");
        o.LJIIJ(contextProviderFactory, "contextProviderFactory");
        this.LJLJLJ = bridgeProvider;
        this.LJLJLLL = contextProviderFactory;
        this.LJLL = fq4;
        this.LJLIL = new LinkedHashMap();
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = C221108m2.LIZIZ(FQ2.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 133));
        for (FQ1 fq1 : scopeProviderFactories) {
            this.LJLIL.put(fq1.getName(), C38936FPw.LIZ(fq1, this.LJLJLLL));
        }
    }

    @Override // X.InterfaceC38196Eyu
    public final void P(String funcName, Object params, InterfaceC38189Eyn interfaceC38189Eyn, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        o.LJIIJ(funcName, "funcName");
        o.LJIIJ(params, "params");
        if (this.LJLJJI) {
            return;
        }
        IDqS452S0100000_6 iDqS452S0100000_6 = new IDqS452S0100000_6(this, 1);
        FQ4<C38937FPx> fq4 = this.LJLL;
        if (fq4 == null) {
            iDqS452S0100000_6.invoke(funcName, params, interfaceC38189Eyn, interfaceC88472Yns);
        } else {
            fq4.LIZ(new AqS172S0100000_6(iDqS452S0100000_6, 113), new C38937FPx(funcName, params, interfaceC38189Eyn, interfaceC88472Yns), new AqS13S1400000_6(iDqS452S0100000_6, funcName, params, interfaceC38189Eyn, interfaceC88472Yns, 0));
        }
    }
}
