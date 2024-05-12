package X;

import android.app.Activity;
import fjb.a;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1", f = "RecordConditionCheck.kt", l = {116, 145, 146}, m = "invokeSuspend")
/* renamed from: X.EFe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36110EFe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36110EFe(Activity activity, long j, long j2, long j3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C36110EFe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = activity;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = j3;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36110EFe c36110EFe = new C36110EFe(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c36110EFe.LJLILLLLZI = obj;
        return c36110EFe;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r17
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r0 = r16
            int r3 = r0.LJLIL
            r7 = 0
            r6 = 3
            r2 = 2
            r4 = 1
            if (r3 == 0) goto L1a
            if (r3 == r4) goto L49
            if (r3 == r2) goto L5f
            if (r3 != r6) goto L9a
            X.C141335gf.LIZJ(r5)
        L17:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1a:
            X.C141335gf.LIZJ(r5)
            java.lang.Object r5 = r0.LJLILLLLZI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.C37284EkC.LIZ = r4
            X.EFd r3 = new X.EFd
            android.app.Activity r2 = r0.LJLJI
            r3.<init>(r2, r7)
            X.XKn r3 = X.XKX.LIZIZ(r5, r7, r7, r3, r6)
            X.UtN r2 = X.C36636EZk.LIZ
            X.FXu r5 = new X.FXu
            android.app.Activity r6 = r0.LJLJI
            long r7 = r0.LJLJJI
            long r9 = r0.LJLJJL
            long r11 = r0.LJLJJLL
            r13 = 0
            r5.<init>(r6, r7, r9, r11, r13)
            r0.LJLILLLLZI = r3
            r0.LJLIL = r4
            java.lang.Object r5 = X.XKX.LJI(r2, r5, r0)
            if (r5 != r1) goto L50
            return r1
        L49:
            java.lang.Object r3 = r0.LJLILLLLZI
            X.2mE r3 = (X.InterfaceC68342mE) r3
            X.C141335gf.LIZJ(r5)
        L50:
            r4 = r5
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r4 = (com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog) r4
            r0.LJLILLLLZI = r4
            r2 = 2
            r0.LJLIL = r2
            java.lang.Object r5 = r3.LJI(r0)
            if (r5 != r1) goto L66
            return r1
        L5f:
            java.lang.Object r4 = r0.LJLILLLLZI
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r4 = (com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog) r4
            X.C141335gf.LIZJ(r5)
        L66:
            X.OSZ r5 = (X.OSZ) r5
            java.lang.Object r2 = r5.getFirst()
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            java.lang.Object r2 = r5.getSecond()
            java.lang.Number r2 = (java.lang.Number) r2
            long r12 = r2.longValue()
            X.UtN r2 = X.C36636EZk.LIZ
            X.FNV r3 = new X.FNV
            long r5 = r0.LJLJJL
            X.Pro<X.UCe> r7 = r0.LJLJL
            long r8 = r0.LJLJJLL
            android.app.Activity r14 = r0.LJLJI
            r15 = 0
            r3 = r3
            r3.<init>(r4, r5, r7, r8, r10, r12, r14, r15)
            r0.LJLILLLLZI = r15
            r4 = 3
            r0.LJLIL = r4
            java.lang.Object r0 = X.XKX.LJI(r2, r3, r0)
            if (r0 != r1) goto L17
            return r1
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36110EFe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
