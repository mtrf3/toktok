package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class F0V extends C70657RoD {
    public final ConcurrentHashMap<Class<?>, HashMap<String, Class<?>>> LIZJ = new ConcurrentHashMap<>();

    public final void LJJIIZ(HashMap<Class<?>, HashMap<String, Class<?>>> hashMap) {
        String obj = this.LIZJ.keys().toString();
        if (obj != null) {
            C37936Eui.LJII.put("jsb_init_bridge_list", obj);
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (valueOf != null) {
            C37936Eui.LJII.put("jsb_init_bridge_list_time", valueOf);
        }
        this.LIZJ.putAll(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1 A[SYNTHETIC] */
    @Override // X.C70657RoD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C37904EuC r19, X.C37955Ev1 r20) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F0V.LIZLLL(X.EuC, X.Ev1):void");
    }

    public static void LJJIIJZLJL(InterfaceC60761Nsz interfaceC60761Nsz, C38236EzY c38236EzY, C37955Ev1 c37955Ev1) {
        C37936Eui c37936Eui = c37955Ev1.LJIJJLI;
        if (interfaceC60761Nsz != null) {
            c37936Eui.LJFF.put("jsb_check_register", interfaceC60761Nsz);
            C37942Euo c37942Euo = (C37942Euo) interfaceC60761Nsz.getHybridContext().LIZIZ(C37942Euo.class);
            if (c37942Euo != null) {
                c37942Euo.LJIILJJIL(c38236EzY);
                c37955Ev1.LJIJJLI.LJFF.put("jsb_check_hybrid_bridge_service", c37942Euo);
                return;
            }
            return;
        }
        c37936Eui.getClass();
    }
}
