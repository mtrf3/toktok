package X;

import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.speeddetector.core.impl.NetworkSpeedDetectorManager$doRepeatUploadData$1", f = "NetworkSpeedDetectorManager.kt", l = {363, 364}, m = "invokeSuspend")
/* renamed from: X.2DN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C42111l1 LJLJI;
    public final /* synthetic */ ConfigData LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DN(C42111l1 c42111l1, ConfigData configData, InterfaceC67352kd<? super C2DN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c42111l1;
        this.LJLJJI = configData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DN c2dn = new C2DN(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2dn.LJLILLLLZI = obj;
        return c2dn;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 == r6) goto L86
            if (r0 != r5) goto L98
            X.C141335gf.LIZJ(r10)
        Lf:
            boolean r0 = X.C30922CBq.LIZIZ
            if (r0 == 0) goto L30
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "doRepeatUploadData delay task end. Thread="
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "SpeedUploadTask"
            X.C0NB.LJIIIZ(r0, r1)
        L30:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L33:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r7 = r9.LJLILLLLZI
            X.2pa r7 = (X.InterfaceC70422pa) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            boolean r0 = X.C30922CBq.LIZIZ
            if (r0 == 0) goto L5f
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "No.3 -> Session("
            r1.append(r0)
            X.1l1 r0 = r9.LJLJI
            java.lang.String r0 = r0.LIZJ
            r1.append(r0)
            java.lang.String r0 = "), repeat send Upload Message. "
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r8.append(r0)
        L5f:
            X.1l1 r0 = r9.LJLJI
            X.XKQ r0 = r0.LJIILJJIL
            r3 = 0
            if (r0 == 0) goto L69
            r0.LIZIZ(r3)
        L69:
            X.1l1 r2 = r9.LJLJI
            X.2DM r1 = new X.2DM
            com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData r0 = r9.LJLJJI
            r1.<init>(r2, r8, r0, r3)
            r0 = 3
            X.XKQ r0 = X.XKX.LIZLLL(r7, r3, r3, r1, r0)
            r2.LJIILJJIL = r0
            com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData r0 = r9.LJLJJI
            long r0 = r0.sendDuration
            r9.LJLIL = r6
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r9)
            if (r0 != r4) goto L89
            return r4
        L86:
            X.C141335gf.LIZJ(r10)
        L89:
            X.1l1 r0 = r9.LJLJI
            X.XKQ r0 = r0.LJIILJJIL
            if (r0 == 0) goto Lf
            r9.LJLIL = r5
            java.lang.Object r0 = X.C79146V4k.LJIJI(r0, r9)
            if (r0 != r4) goto Lf
            return r4
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DN.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
