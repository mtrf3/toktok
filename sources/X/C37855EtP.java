package X;

/* renamed from: X.EtP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37855EtP implements InterfaceC37861EtV {
    public InterfaceC38263Ezz LIZ;
    public final C37832Et2 LIZIZ = new C37832Et2();
    public C37860EtU LIZJ;
    public boolean LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37861EtV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C37904EuC r11, X.C37955Ev1 r12, X.C37906EuE r13) {
        /*
            r10 = this;
            java.lang.String r0 = "bridgeContext"
            r8 = r11
            kotlin.jvm.internal.o.LJIIJ(r8, r0)
            java.lang.String r0 = "call"
            r9 = r12
            kotlin.jvm.internal.o.LJIIJ(r9, r0)
            X.EtE r2 = X.C37859EtT.LIZ(r8)
            X.Et2 r1 = r10.LIZIZ
            java.lang.String r0 = r9.LIZLLL
            X.EqM r3 = r1.LIZ(r2, r0)
            r6 = r13
            if (r3 == 0) goto La2
            java.lang.Object r5 = r9.LJI
            X.Ezz r0 = r10.LIZ
            if (r0 == 0) goto L24
            r3.LIZJ(r0)
        L24:
            X.Epz r0 = r3.LIZ()
            boolean r0 = r0.getValue()
            java.lang.String r4 = "data"
            if (r0 != 0) goto L60
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L43
            X.EqI r1 = new X.EqI
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            r1.<init>(r3, r5)
            X.Ezz r0 = r10.LIZ
            r1.LIZJ = r0
        L3f:
            r1.LIZJ(r6)
        L42:
            return
        L43:
            boolean r0 = r5 instanceof com.lynx.react.bridge.ReadableMap
            if (r0 == 0) goto La1
            X.EqH r1 = new X.EqH
            com.lynx.react.bridge.ReadableMap r5 = (com.lynx.react.bridge.ReadableMap) r5
            if (r5 == 0) goto L54
            com.lynx.react.bridge.ReadableMap r0 = r5.getMap(r4)
            if (r0 == 0) goto L5c
        L53:
            r5 = r0
        L54:
            r1.<init>(r3, r5)
            X.Ezz r0 = r10.LIZ
            r1.LIZJ = r0
            goto L3f
        L5c:
            r0 = r5
            if (r5 == 0) goto L54
            goto L53
        L60:
            X.EtR r2 = new X.EtR
            r2.<init>(r6)
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L75
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.util.Map r1 = X.C38381F4n.LJIIIIZZ(r5)
            X.EtE r0 = X.EnumC37844EtE.ALL
            r3.LIZIZ(r1, r2, r0)
            goto L42
        L75:
            boolean r0 = r5 instanceof com.lynx.react.bridge.ReadableMap
            if (r0 == 0) goto L97
            com.lynx.react.bridge.ReadableMap r5 = (com.lynx.react.bridge.ReadableMap) r5
            if (r5 == 0) goto L84
            com.lynx.react.bridge.ReadableMap r0 = r5.getMap(r4)
            if (r0 == 0) goto L93
        L83:
            r5 = r0
        L84:
            java.util.HashMap r1 = r5.toHashMap()
            java.lang.String r0 = "(unWrapperParams(params) ?: params).toHashMap()"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            X.EtE r0 = X.EnumC37844EtE.ALL
            r3.LIZIZ(r1, r2, r0)
            goto L42
        L93:
            r0 = r5
            if (r5 == 0) goto L84
            goto L83
        L97:
            X.3mF r1 = X.C113554cx.LJJJLIIL()
            X.EtE r0 = X.EnumC37844EtE.ALL
            r3.LIZIZ(r1, r2, r0)
            goto L42
        La1:
            return
        La2:
            X.EtU r5 = r10.LIZJ
            if (r5 == 0) goto Ld9
            java.util.LinkedHashMap<java.lang.String, X.EtW> r0 = r5.LIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            X.EtW r1 = (X.InterfaceC37862EtW) r1
            X.EvB r0 = r8.LIZJ
            r0.LJIIIIZZ(r8, r9)
            X.EtX r4 = new X.EtX
            r4.<init>(r5, r6, r7, r8, r9)
            r1.LIZIZ(r9, r4)
            X.EvB r0 = r8.LIZJ
            r0.LJII(r8, r9)
        Ld4:
            return
        Ld5:
            X.C37858EtS.LIZ(r6)
            goto Ld4
        Ld9:
            X.C37858EtS.LIZ(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37855EtP.LIZ(X.EuC, X.Ev1, X.EuE):void");
    }
}
