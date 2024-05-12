package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Eu1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37893Eu1 {
    public static final C37905EuD LIZ(String url, AbstractC38233EzV abstractC38233EzV, C60737Nsb context) {
        List<? extends AbstractC37668EqO> list;
        o.LJIIJ(url, "url");
        o.LJIIJ(context, "context");
        C37905EuD c37905EuD = new C37905EuD();
        C37894Eu2 c37894Eu2 = new C37894Eu2(url);
        String valueOf = String.valueOf(c37894Eu2.hashCode());
        C37904EuC c37904EuC = c37905EuD.LIZ.LIZ;
        c37904EuC.LIZLLL = c37894Eu2;
        ((ArrayList) c37904EuC.LJII).add(new C37898Eu6(c37904EuC));
        Iterator it = ((ArrayList) c37904EuC.LJII).iterator();
        while (it.hasNext()) {
            ((AbstractC37899Eu7) it.next()).LJIIIIZZ();
        }
        c37904EuC.LJI = valueOf;
        EnumC37844EtE enumC37844EtE = EnumC37844EtE.Worker;
        o.LJIIJ(enumC37844EtE, "<set-?>");
        c37904EuC.LJIIJJI = enumC37844EtE;
        C37936Eui c37936Eui = c37904EuC.LJIIL;
        if (valueOf != null) {
            c37936Eui.LJFF.put("containerId", valueOf);
        } else {
            c37936Eui.getClass();
        }
        C37922EuU c37922EuU = c37905EuD.LJ;
        c37922EuU.LIZLLL = valueOf;
        WeakReference<C37905EuD> weakReference = c37922EuU.LJFF;
        if (weakReference == null || weakReference.get() == null) {
            c37922EuU.LJFF = new WeakReference<>(c37905EuD);
        }
        c37905EuD.LJ.LJFF(InterfaceC37930Euc.class, new C37896Eu4(valueOf));
        C37855EtP c37855EtP = c37905EuD.LIZ.LIZ.LJIIIZ;
        C37922EuU context2 = c37905EuD.LJ;
        c37855EtP.getClass();
        o.LJIIJ(context2, "context");
        c37855EtP.LIZ = context2;
        C37832Et2 c37832Et2 = c37855EtP.LIZIZ;
        c37832Et2.getClass();
        ((C37829Esz) c37832Et2.LIZIZ.getValue()).LIZIZ = context2;
        C37932Eue c37932Eue = c37905EuD.LIZ;
        C37903EuB c37903EuB = c37932Eue.LIZ.LIZ;
        if (c37903EuB != null) {
            c37903EuB.LIZ = c37855EtP;
        }
        C37984EvU c37984EvU = new C37984EvU(context);
        c37932Eue.getClass();
        c37932Eue.LIZ.LJIIIIZZ.add(c37984EvU);
        if (abstractC38233EzV != null && (list = abstractC38233EzV.LIZIZ) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                AbstractC37668EqO bridge = (AbstractC37668EqO) it2.next();
                EnumC37844EtE platformType = EnumC37844EtE.ALL;
                o.LJIIJ(bridge, "bridge");
                o.LJIIJ(platformType, "platformType");
                C37855EtP c37855EtP2 = c37905EuD.LIZ.LIZ.LJIIIZ;
                c37855EtP2.getClass();
                C37832Et2 c37832Et22 = c37855EtP2.LIZIZ;
                c37832Et22.getClass();
                if (C37846EtG.LIZ[platformType.ordinal()] != 1) {
                    c37832Et22.LIZIZ(platformType).put(((C37773Es5) bridge).getName(), bridge);
                } else {
                    C37773Es5 c37773Es5 = (C37773Es5) bridge;
                    c37832Et22.LIZIZ(EnumC37844EtE.WEB).put(c37773Es5.getName(), bridge);
                    c37832Et22.LIZIZ(EnumC37844EtE.LYNX).put(c37773Es5.getName(), bridge);
                    c37832Et22.LIZIZ(EnumC37844EtE.Worker).put(c37773Es5.getName(), bridge);
                    c37832Et22.LIZIZ(platformType).put(c37773Es5.getName(), bridge);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("register method ");
                LIZ.append(((C37773Es5) bridge).getName());
                C37750Eri.LIZ(X1D.LIZIZ(LIZ));
            }
        }
        C37750Eri.LIZ("success create worker bridge, url = ".concat(url));
        return c37905EuD;
    }
}
