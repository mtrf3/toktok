package X;

import fjb.a;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.track.ECLogger$onEvent$1", f = "ECLogger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class JDW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JDW(String str, InterfaceC67352kd interfaceC67352kd, JSONObject jSONObject) {
        super(2, interfaceC67352kd);
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new JDW(this.LJLILLLLZI, interfaceC67352kd, this.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        if (new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(1000) < com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings.LIZ().getEventReportThreshold()) goto L11;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            org.json.JSONObject r3 = r6.LJLIL
            if (r3 == 0) goto L7a
        L8:
            java.lang.String r2 = r6.LJLILLLLZI
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            boolean r1 = X.JDX.LJ
            r0 = 1
            if (r1 != 0) goto L2d
            X.JDX.LJ = r0
            X.JDZ r0 = X.JDX.LIZLLL
            X.FMX.LIZ(r0)
            X.Ol8 r0 = X.JDX.LIZ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-repo>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            X.JDY r0 = X.JDX.LIZJ
            r1.registerChangeListener(r0)
        L2d:
            java.util.List<java.lang.String> r0 = X.JDX.LIZIZ
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L4e
            com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings$EcomEventMonitorConfig r5 = com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings.LIZ()
            java.util.Random r4 = new java.util.Random
            long r0 = java.lang.System.currentTimeMillis()
            r4.<init>(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            int r1 = r4.nextInt(r0)
            int r0 = r5.getEventReportThreshold()
            if (r1 >= r0) goto L7a
        L4e:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "jsonObject.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.nio.charset.Charset r0 = X.PVC.LIZ
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r1 = r1.length
            com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings$EcomEventMonitorConfig r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcomEventMonitorSettings.LIZ()
            int r0 = r0.getEventSizeThreshold()
            if (r1 <= r0) goto L7a
            java.util.HashMap r1 = X.JDX.LIZ(r3)
            java.lang.String r0 = "EC_EVENT_TOO_LARGE: "
            java.lang.String r0 = r0.concat(r2)
            X.C78983UzD.LJIILLIIL(r0, r1)
        L7a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JDW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
