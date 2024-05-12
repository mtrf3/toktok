package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eum, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37940Eum extends C37942Euo implements InterfaceC60614Nqc {
    public InterfaceC37958Ev4 LJLILLLLZI;
    public InterfaceC37947Eut LJLJI;
    public WeakReference<InterfaceC60761Nsz> LJLJJI;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final C37905EuD LJLIL = new C37905EuD();
    public final C37938Euk LJLJJL = new C37938Euk();
    public final List<String> LJLJJLL = new ArrayList();
    public final List<String> LJLJL = new ArrayList();
    public final List<String> LJLJLJ = new ArrayList();
    public final List<String> LJLJLLL = new ArrayList();
    public final List<InterfaceC37980EvQ> LJLL = new ArrayList();

    @Override // X.InterfaceC60613Nqb
    public final void LJ(Context context, InterfaceC60761Nsz kitView) {
        o.LJIIJ(context, "context");
        o.LJIIJ(kitView, "kitView");
    }

    @Override // X.InterfaceC60614Nqc
    public final C37952Euy LJIILIIL() {
        return new C37952Euy(this.LJLIL);
    }

    @Override // X.InterfaceC60705Ns5
    public final void onDestroy() {
        InterfaceC60761Nsz interfaceC60761Nsz;
        InterfaceC37947Eut interfaceC37947Eut;
        this.LJLIL.LJ();
        C37938Euk c37938Euk = this.LJLJJL;
        c37938Euk.LJLIL.LIZJ();
        Iterator<Map.Entry<String, C37943Eup>> it = c37938Euk.LJLILLLLZI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LIZJ();
        }
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LJLILLLLZI;
        if (interfaceC37958Ev4 != null) {
            interfaceC37958Ev4.onDestroy();
        }
        WeakReference<InterfaceC60761Nsz> weakReference = this.LJLJJI;
        if (weakReference != null && (interfaceC60761Nsz = weakReference.get()) != null && (interfaceC37947Eut = this.LJLJI) != null) {
            interfaceC37947Eut.LIZIZ(interfaceC60761Nsz);
        }
        this.LJLLILLLL = true;
    }

    @Override // X.C37942Euo
    public final C37905EuD LJIIIZ() {
        return this.LJLIL;
    }

    public static int LJIIZILJ(Integer num) {
        if (num == null) {
            return 3;
        }
        if (num.intValue() == 1) {
            return 0;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        if (num.intValue() != -2) {
            return 3;
        }
        return 2;
    }

    @Override // X.InterfaceC60705Ns5
    public final boolean LIZIZ(String str) {
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LJLILLLLZI;
        if (interfaceC37958Ev4 != null && interfaceC37958Ev4.LIZIZ(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC60705Ns5
    public final void LIZJ(String url) {
        o.LJIIJ(url, "url");
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LJLILLLLZI;
        if (interfaceC37958Ev4 != null) {
            interfaceC37958Ev4.LIZJ(url);
        }
    }

    @Override // X.InterfaceC60705Ns5
    public final void LIZLLL(String url) {
        o.LJIIJ(url, "url");
        InterfaceC37958Ev4 interfaceC37958Ev4 = this.LJLILLLLZI;
        if (interfaceC37958Ev4 != null) {
            interfaceC37958Ev4.LIZLLL(url);
        }
    }

    @Override // X.InterfaceC60614Nqc
    public final void LJFF(String name) {
        o.LJIIJ(name, "name");
        throw new Exception("This method is supported only in hybrid-bridge-cn");
    }

    @Override // X.C37942Euo
    public final boolean LJIIJ(C37955Ev1 call) {
        o.LJIIJ(call, "call");
        C37938Euk c37938Euk = this.LJLJJL;
        c37938Euk.getClass();
        C37943Eup c37943Eup = c37938Euk.LJLILLLLZI.get(call.LJIIIIZZ);
        if (c37943Eup != null) {
            String bridgeName = call.LIZLLL;
            o.LJIIJ(bridgeName, "bridgeName");
            if (c37943Eup.LJLIL.containsKey(bridgeName)) {
                return true;
            }
        }
        C37943Eup c37943Eup2 = c37938Euk.LJLIL;
        String bridgeName2 = call.LIZLLL;
        c37943Eup2.getClass();
        o.LJIIJ(bridgeName2, "bridgeName");
        if (c37943Eup2.LJLIL.containsKey(bridgeName2)) {
            return true;
        }
        return false;
    }

    @Override // X.C37942Euo
    public final void LJIIJJI(C37909EuH c37909EuH) {
        this.LJLIL.LIZ.LIZ.LJFF = c37909EuH;
    }

    @Override // X.C37942Euo
    public final void LJIILJJIL(C38236EzY info) {
        EnumC38004Evo access;
        String str;
        InterfaceC60761Nsz interfaceC60761Nsz;
        C60737Nsb hybridContext;
        C38518F9u c38518F9u;
        InterfaceC60761Nsz interfaceC60761Nsz2;
        C60737Nsb hybridContext2;
        o.LJIIJ(info, "info");
        C37938Euk c37938Euk = this.LJLJJL;
        c37938Euk.getClass();
        if (info.LIZJ.length() > 0) {
            if (c37938Euk.LJLILLLLZI.get(info.LIZJ) == null) {
                c37938Euk.LJLILLLLZI.put(info.LIZJ, new C37943Eup());
            }
            C37943Eup c37943Eup = c37938Euk.LJLILLLLZI.get(info.LIZJ);
            if (c37943Eup != null) {
                c37943Eup.LJLIL.put(info.LIZ, info);
            }
        } else {
            C37943Eup c37943Eup2 = c37938Euk.LJLIL;
            c37943Eup2.getClass();
            c37943Eup2.LJLIL.put(info.LIZ, info);
        }
        int i = C38086Ex8.LIZ[info.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        access = EnumC38004Evo.SECURE;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    access = EnumC38004Evo.PROTECT;
                }
            } else {
                access = EnumC38004Evo.PRIVATE;
            }
        } else {
            access = EnumC38004Evo.PUBLIC;
        }
        C37872Etg c37872Etg = C37872Etg.LIZIZ;
        String name = info.LIZ;
        c37872Etg.getClass();
        o.LJIIJ(name, "name");
        o.LJIIJ(access, "access");
        ConcurrentHashMap<String, C37873Eth> concurrentHashMap = C37872Etg.LIZ;
        C37873Eth c37873Eth = concurrentHashMap.get("DEFAULT");
        if (c37873Eth == null) {
            c37873Eth = new C37873Eth();
            concurrentHashMap.put("DEFAULT", c37873Eth);
        }
        c37873Eth.LIZ.put(name, C38002Evm.LIZ(access.getValue()));
        WeakReference<InterfaceC60761Nsz> weakReference = c37938Euk.LJLJI;
        Object obj = null;
        if (weakReference != null && (interfaceC60761Nsz2 = weakReference.get()) != null && (hybridContext2 = interfaceC60761Nsz2.getHybridContext()) != null) {
            str = hybridContext2.containerId;
        } else {
            str = null;
        }
        WeakReference<InterfaceC60761Nsz> weakReference2 = c37938Euk.LJLJI;
        if (weakReference2 != null && (interfaceC60761Nsz = weakReference2.get()) != null && (hybridContext = interfaceC60761Nsz.getHybridContext()) != null && (c38518F9u = hybridContext.runtimeInfo) != null) {
            obj = c38518F9u.get((Object) "originUrl");
        }
        String valueOf = String.valueOf(obj);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bridgeName", info.LIZ);
        FD5.LJI("tt_registerBridge", str, valueOf, jSONObject);
    }

    @Override // X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        o.LJIIJ(context, "context");
        C37922EuU c37922EuU = this.LJLIL.LJ;
        if (c37922EuU != null) {
            Activity LJZ = V1B.LJZ(context);
            if (LJZ != null) {
                c37922EuU.LJII(LJZ);
            }
            this.LJLJJL.LJIJ(context);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sdk.xbridge.registry.core.BDXBridgeContextWrapper");
    }

    @Override // X.C37942Euo, X.InterfaceC60614Nqc
    public final void LIZ(String name, JSONObject jSONObject) {
        o.LJIIJ(name, "name");
        this.LJLIL.LJFF(name, jSONObject);
    }

    @Override // X.C37942Euo
    public final void LJIIIIZZ(List<String> bridgeNames, List<? extends JSONObject> params) {
        o.LJIIJ(bridgeNames, "bridgeNames");
        o.LJIIJ(params, "params");
        C37905EuD c37905EuD = this.LJLIL;
        c37905EuD.getClass();
        Iterator<String> it = bridgeNames.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i >= 0) {
                ((ArrayList) c37905EuD.LIZJ).add(new OSZ(ListProtector.get(bridgeNames, i), ListProtector.get(params, i)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.C37942Euo
    public final void LJIIL(Class<? extends InterfaceC37666EqM> cls, EnumC37844EtE scope) {
        o.LJIIJ(scope, "scope");
        C37831Et1.LIZIZ(cls, scope, 4);
    }

    @Override // X.C37942Euo
    public final <T> void LJIILLIIL(Class<T> cls, T t) {
        C37922EuU c37922EuU = this.LJLIL.LJ;
        if (c37922EuU != null) {
            c37922EuU.LJI(cls, t);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sdk.xbridge.registry.core.BDXBridgeContextWrapper");
    }

    @Override // X.InterfaceC60613Nqb
    public final void LJI(Context context, InterfaceC60761Nsz kitView, C37953Euz c37953Euz) {
        String namespace;
        o.LJIIJ(kitView, "kitView");
        FD5.LIZJ(System.currentTimeMillis(), kitView.getHybridContext().containerId, "prepare_jsb_start");
        kitView.getHybridContext().LIZIZ(C60728NsS.class);
        C37905EuD c37905EuD = this.LJLIL;
        View LIZJ = kitView.LIZJ();
        if (LIZJ != null) {
            c37905EuD.LIZIZ(LIZJ, kitView.getHybridContext().containerId, true);
            this.LJLIL.LIZLLL("legacy", this.LJLJJL);
            C37905EuD c37905EuD2 = this.LJLIL;
            this.LJLILLLLZI = c37905EuD2.LIZ.LIZ.LIZLLL;
            C37922EuU c37922EuU = c37905EuD2.LJ;
            if (c37922EuU != null) {
                c37922EuU.LJI(InterfaceC60761Nsz.class, kitView);
                Activity LJZ = V1B.LJZ(context);
                if (LJZ != null) {
                    c37922EuU.LJII(LJZ);
                }
                C60737Nsb hybridContext = kitView.getHybridContext();
                hybridContext.LJII(C37942Euo.class, this);
                C37831Et1.LIZIZ(C60711NsB.class, null, 6);
                C37831Et1.LIZIZ(C60895Nv9.class, null, 6);
                InterfaceC37947Eut interfaceC37947Eut = this.LJLJI;
                if (interfaceC37947Eut != null) {
                    interfaceC37947Eut.LJ(context, kitView);
                }
                C37944Euq c37944Euq = (C37944Euq) hybridContext.LIZIZ(C37944Euq.class);
                if (c37944Euq != null) {
                    C31929Cg1 LJI = c37944Euq.LJI();
                    if (LJI != null && (namespace = LJI.LIZJ()) != null && namespace.length() != 0) {
                        C37905EuD c37905EuD3 = this.LJLIL;
                        c37905EuD3.getClass();
                        o.LJIIJ(namespace, "namespace");
                        C37904EuC c37904EuC = c37905EuD3.LIZ.LIZ;
                        C37856EtQ c37856EtQ = new C37856EtQ(namespace);
                        C37922EuU bridgeContext = c37905EuD3.LJ;
                        o.LJIIJ(bridgeContext, "bridgeContext");
                        c37856EtQ.LIZ = bridgeContext;
                        c37904EuC.LJIIJ = c37856EtQ;
                        Iterator<Class<? extends InterfaceC37666EqM>> it = LJI.LIZIZ().iterator();
                        while (it.hasNext()) {
                            C37905EuD.LIZJ(this.LJLIL, it.next());
                        }
                    }
                    Iterator it2 = C61878OQg.INSTANCE.iterator();
                    while (it2.hasNext()) {
                        LJIIL((Class) it2.next(), EnumC37844EtE.ALL);
                    }
                    Iterator it3 = C61878OQg.INSTANCE.iterator();
                    while (it3.hasNext()) {
                        LJIILJJIL((C38236EzY) it3.next());
                    }
                    Iterator it4 = C61878OQg.INSTANCE.iterator();
                    while (it4.hasNext()) {
                        this.LJLIL.LIZ((InterfaceC37882Etq) it4.next());
                    }
                    for (Class<? extends InterfaceC37666EqM> cls : c37944Euq.LJII()) {
                        C37905EuD c37905EuD4 = this.LJLIL;
                        EnumC37844EtE scope = EnumC37844EtE.ALL;
                        c37905EuD4.getClass();
                        o.LJIIJ(scope, "scope");
                        C37855EtP c37855EtP = c37905EuD4.LIZ.LIZ.LJIIIZ;
                        c37855EtP.getClass();
                        C37832Et2 c37832Et2 = c37855EtP.LIZIZ;
                        c37832Et2.getClass();
                        ((C37829Esz) c37832Et2.LIZIZ.getValue()).LIZIZ(cls, scope, "DEFAULT");
                    }
                    java.util.Map<Class<?>, C37924EuW<?>> LJIIIIZZ = c37944Euq.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        C37922EuU c37922EuU2 = this.LJLIL.LJ;
                        if (c37922EuU2 != null) {
                            c37922EuU2.LIZ.putAll(LJIIIIZZ);
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sdk.xbridge.registry.core.BDXBridgeContextWrapper");
                        }
                    }
                    C31929Cg1 LJI2 = c37944Euq.LJI();
                    C31897CfV LJFF = c37944Euq.LJFF();
                    if (LJI2 != null || LJFF != null) {
                        C37905EuD c37905EuD5 = this.LJLIL;
                        C37941Eun c37941Eun = new C37941Eun(this, LJFF, hybridContext, LJI2);
                        C37932Eue c37932Eue = c37905EuD5.LIZ;
                        c37932Eue.getClass();
                        C37904EuC c37904EuC2 = c37932Eue.LIZ;
                        c37904EuC2.getClass();
                        C37965EvB c37965EvB = c37904EuC2.LIZJ;
                        c37965EvB.getClass();
                        c37965EvB.LIZ.add(c37941Eun);
                    }
                }
                this.LJLJJI = new WeakReference<>(kitView);
                this.LJLIL.LIZ(new C37885Ett(this));
                C37905EuD c37905EuD6 = this.LJLIL;
                C38098ExK c38098ExK = new C38098ExK(this);
                C37932Eue c37932Eue2 = c37905EuD6.LIZ;
                c37932Eue2.getClass();
                c37932Eue2.LIZ.LJIIIIZZ.add(c38098ExK);
                this.LJLLI = true;
                FD5.LIZJ(System.currentTimeMillis(), kitView.getHybridContext().containerId, "prepare_jsb_end");
                kitView.getHybridContext().LIZIZ(C60728NsS.class);
                this.LJLJJL.LJLJI = this.LJLJJI;
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.sdk.xbridge.registry.core.BDXBridgeContextWrapper");
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC60613Nqb
    public final void LJII(Context context, C60540NpQ c60540NpQ, String str) {
        C37905EuD c37905EuD = this.LJLIL;
        c37905EuD.getClass();
        C37932Eue c37932Eue = c37905EuD.LIZ;
        c37932Eue.getClass();
        C37946Eus c37946Eus = new C37946Eus(c37932Eue.LIZ);
        c60540NpQ.LIZIZ((String) c37946Eus.LIZ, LynxBridgeDelegateModule.class, c37946Eus.LIZIZ);
        c37932Eue.LIZ.LJI = str;
    }
}
