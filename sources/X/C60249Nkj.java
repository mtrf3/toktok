package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nkj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60249Nkj {
    public final C60342NmE LIZ = new C60342NmE();
    public final java.util.Map<Class<? extends InterfaceC60250Nkk<InterfaceC60282NlG, InterfaceC60281NlF, InterfaceC40516FvE, InterfaceC60227NkN>>, InterfaceC60250Nkk<InterfaceC60282NlG, InterfaceC60281NlF, InterfaceC40516FvE, InterfaceC60227NkN>> LIZIZ = new LinkedHashMap();
    public final C60229NkP LIZJ = new C60229NkP();
    public final java.util.Map<String, InterfaceC60283NlH> LIZLLL = new LinkedHashMap();
    public Object LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final C60263Nkx LIZ() {
        C60229NkP c60229NkP = this.LIZJ;
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            if (o.LJ(entry.getKey(), "defaultPackageBundle")) {
                C60248Nki LIZJ = LIZJ((InterfaceC60283NlH) entry.getValue(), "defaultPackageBundle");
                c60229NkP.getClass();
                c60229NkP.LJ = LIZJ;
            } else {
                Object name = entry.getKey();
                C60248Nki LIZJ2 = LIZJ((InterfaceC60283NlH) entry.getValue(), (String) entry.getKey());
                c60229NkP.getClass();
                o.LJIIJ(name, "name");
                c60229NkP.LJFF.put(name, LIZJ2);
            }
        }
        c60229NkP.getClass();
        C60219NkF c60219NkF = new C60219NkF(c60229NkP.LIZ, c60229NkP.LIZIZ, c60229NkP.LIZJ, c60229NkP.LIZLLL, c60229NkP.LJ, c60229NkP.LJFF, c60229NkP.LJI);
        for (Object obj : ((LinkedHashMap) this.LIZIZ).values()) {
            if ((obj instanceof C60273Nl7) || (obj instanceof C60265Nkz)) {
                if (obj != null) {
                    java.util.Map<String, InterfaceC60283NlH> map = this.LIZLLL;
                    if (map != null) {
                        c60219NkF.LJLIL = C65777Prh.LIZJ(map);
                        c60219NkF.LJLILLLLZI = this.LJ;
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                    }
                }
                return new C60263Nkx(c60219NkF);
            }
        }
        return new C60263Nkx(c60219NkF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C60249Nkj LIZIZ(java.lang.Class r7, boolean r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L1f
            java.lang.String r0 = r7.getName()
            X.Nkk r2 = X.C37693Eqn.LIZ(r0)
            if (r2 == 0) goto L1e
            java.util.Map<java.lang.Class<? extends X.Nkk<X.NlG, X.NlF, X.FvE, X.NkN>>, X.Nkk<X.NlG, X.NlF, X.FvE, X.NkN>> r1 = r6.LIZIZ
            java.lang.Class r0 = r2.getClass()
            r1.put(r0, r2)
            X.NkP r0 = r6.LIZJ
            java.util.List<X.Nkk<?, ?, ?, ?>> r0 = r0.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
        L1e:
            return r6
        L1f:
            java.lang.String r0 = r7.getName()
            X.Nkk r4 = X.C37693Eqn.LIZ(r0)
            if (r4 != 0) goto L5d
            java.lang.String r2 = r7.getName()
            int r1 = r2.hashCode()
            r0 = -162289164(0xfffffffff653a9f4, float:-1.0732634E33)
            if (r1 == r0) goto L9e
            r0 = 303164586(0x1211ecaa, float:4.6045643E-28)
            if (r1 == r0) goto L90
        L3b:
            X.Nl8 r4 = new X.Nl8
            r4.<init>()
        L40:
            boolean r0 = r4 instanceof X.C60272Nl6
            if (r0 == 0) goto L70
            X.NkH r5 = new X.NkH
            X.F0S r3 = X.F0S.LYNX
            java.lang.Class<X.Nl6> r2 = X.C60272Nl6.class
            java.lang.String r1 = "com.bytedance.ies.bullet.kit.lynx.ILynxKitApi"
            java.lang.String r0 = "com.bytedance.ies.bullet.kit.lynx.LynxKitApi"
            r5.<init>(r3, r2, r1, r0)
        L51:
            X.NkP r0 = r6.LIZJ
            r0.getClass()
            java.util.List<X.NkH> r0 = r0.LJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r5)
        L5d:
            java.util.Map<java.lang.Class<? extends X.Nkk<X.NlG, X.NlF, X.FvE, X.NkN>>, X.Nkk<X.NlG, X.NlF, X.FvE, X.NkN>> r1 = r6.LIZIZ
            java.lang.Class r0 = r4.getClass()
            r1.put(r0, r4)
            X.NkP r0 = r6.LIZJ
            java.util.List<X.Nkk<?, ?, ?, ?>> r0 = r0.LIZJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            goto L1e
        L70:
            boolean r0 = r4 instanceof X.C60273Nl7
            if (r0 == 0) goto L82
            X.NkH r5 = new X.NkH
            X.F0S r3 = X.F0S.RN
            java.lang.Class<X.Nl7> r2 = X.C60273Nl7.class
            java.lang.String r1 = "com.bytedance.ies.bullet.kit.rn.IRnKitApi"
            java.lang.String r0 = "com.bytedance.ies.bullet.kit.rn.RnKitApi"
            r5.<init>(r3, r2, r1, r0)
            goto L51
        L82:
            X.NkH r5 = new X.NkH
            X.F0S r3 = X.F0S.WEB
            java.lang.Class<X.Nl8> r2 = X.C60274Nl8.class
            java.lang.String r1 = "com.bytedance.ies.bullet.kit.web.IWebKitApi"
            java.lang.String r0 = "com.bytedance.ies.bullet.kit.web.WebKitApi"
            r5.<init>(r3, r2, r1, r0)
            goto L51
        L90:
            java.lang.String r0 = "com.bytedance.ies.bullet.kit.lynx.ILynxKitApi"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3b
            X.Nl6 r4 = new X.Nl6
            r4.<init>()
            goto L40
        L9e:
            java.lang.String r0 = "com.bytedance.ies.bullet.kit.rn.IRnKitApi"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3b
            X.Nl7 r4 = new X.Nl7
            r4.<init>()
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60249Nkj.LIZIZ(java.lang.Class, boolean):X.Nkj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C60248Nki LIZJ(InterfaceC60283NlH interfaceC60283NlH, String str) {
        C60264Nky c60264Nky = new C60264Nky(interfaceC60283NlH);
        F3T f3t = new F3T();
        f3t.LJ(NX1.class, new F25(new C60267Nl1(interfaceC60283NlH)));
        C60248Nki c60248Nki = new C60248Nki(c60264Nky, f3t, new AqS176S0100000_10(interfaceC60283NlH, 128));
        InterfaceC60283NlH interfaceC60283NlH2 = (InterfaceC60283NlH) ((LinkedHashMap) this.LIZLLL).get(str);
        if (interfaceC60283NlH2 != null) {
            for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                Object apiClass = entry.getKey();
                try {
                    InterfaceC60253Nkn LLLLIIL = ((InterfaceC60250Nkk) entry.getValue()).LLLLIIL(interfaceC60283NlH2);
                    if (LLLLIIL != null) {
                        o.LJIIJ(apiClass, "apiClass");
                        c60248Nki.LIZ.put(apiClass, LLLLIIL);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return c60248Nki;
    }
}
