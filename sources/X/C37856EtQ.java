package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EtQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37856EtQ implements InterfaceC37861EtV {
    public InterfaceC38263Ezz LIZ;
    public final C37725ErJ LIZIZ = new C37725ErJ(0);
    public final ConcurrentHashMap<EnumC37844EtE, ConcurrentHashMap<String, InterfaceC37666EqM>> LIZJ = new ConcurrentHashMap<>();
    public final String LIZLLL;

    public C37856EtQ(String str) {
        this.LIZLLL = str;
    }

    public final InterfaceC37666EqM LIZIZ(C37904EuC bridgeContext, String bridgeName) {
        o.LJIIJ(bridgeContext, "bridgeContext");
        o.LJIIJ(bridgeName, "bridgeName");
        EnumC37844EtE LIZ = C37859EtT.LIZ(bridgeContext);
        Class<? extends InterfaceC37666EqM> LIZ2 = this.LIZIZ.LIZ(LIZ, bridgeName);
        if (LIZ2 == null) {
            return null;
        }
        InterfaceC37666EqM newInstance = LIZ2.newInstance();
        ConcurrentHashMap<String, InterfaceC37666EqM> concurrentHashMap = this.LIZJ.get(LIZ);
        if (concurrentHashMap == null) {
            this.LIZJ.put(LIZ, new ConcurrentHashMap<>());
            ConcurrentHashMap<String, InterfaceC37666EqM> concurrentHashMap2 = this.LIZJ.get(LIZ);
            if (concurrentHashMap2 != null) {
                concurrentHashMap = concurrentHashMap2;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        o.LJFF(newInstance, "newInstance");
        concurrentHashMap.put(bridgeName, newInstance);
        return newInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r2 != null) goto L18;
     */
    @Override // X.InterfaceC37861EtV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C37904EuC r5, X.C37955Ev1 r6, X.C37906EuE r7) {
        /*
            r4 = this;
            java.lang.String r0 = "bridgeContext"
            kotlin.jvm.internal.o.LJIIJ(r5, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.o.LJIIJ(r6, r0)
            java.lang.String r0 = r6.LIZLLL
            X.EqM r3 = r4.LIZIZ(r5, r0)
            if (r3 == 0) goto L45
            X.Ezz r0 = r4.LIZ
            if (r0 == 0) goto L19
            r3.LIZJ(r0)
        L19:
            java.lang.Object r2 = r6.LJI
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L2a
            X.EqI r1 = new X.EqI
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            r1.<init>(r3, r2)
        L26:
            r1.LIZJ(r7)
        L29:
            return
        L2a:
            boolean r0 = r2 instanceof com.lynx.react.bridge.ReadableMap
            if (r0 == 0) goto L29
            X.EqH r1 = new X.EqH
            com.lynx.react.bridge.ReadableMap r2 = (com.lynx.react.bridge.ReadableMap) r2
            if (r2 == 0) goto L3d
            java.lang.String r0 = "data"
            com.lynx.react.bridge.ReadableMap r0 = r2.getMap(r0)
            if (r0 == 0) goto L41
        L3c:
            r2 = r0
        L3d:
            r1.<init>(r3, r2)
            goto L26
        L41:
            r0 = r2
            if (r2 == 0) goto L3d
            goto L3c
        L45:
            X.C37858EtS.LIZ(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37856EtQ.LIZ(X.EuC, X.Ev1, X.EuE):void");
    }
}
