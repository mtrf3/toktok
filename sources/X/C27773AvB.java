package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$checkLawful$1", f = "OrderSubmitViewModel.kt", l = {1070}, m = "invokeSuspend")
/* renamed from: X.AvB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27773AvB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PhoneCredit LJLILLLLZI;
    public final /* synthetic */ OrderSubmitViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27773AvB(PhoneCredit phoneCredit, OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27773AvB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = phoneCredit;
        this.LJLJI = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27773AvB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:8:0x0033, B:9:0x0036, B:11:0x003a, B:13:0x004d, B:15:0x0053, B:17:0x005c, B:18:0x0060, B:22:0x0040, B:24:0x0016, B:26:0x0028), top: B:2:0x0006 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L13
            if (r0 != r3) goto Lb
            goto L33
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L13:
            X.C141335gf.LIZJ(r7)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest     // Catch: java.lang.Throwable -> L64
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> L64
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L64
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L64
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L64
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r6.LJLJI     // Catch: java.lang.Throwable -> L64
            X.Ay6 r0 = r0.LLILL     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L31
            r6.LJLIL = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = X.C27954Ay6.LLLLZLLIL(r2, r6)     // Catch: java.lang.Throwable -> L64
            if (r7 != r5) goto L36
            return r5
        L31:
            r7 = r4
            goto L40
        L33:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Throwable -> L64
        L36:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulResponse r7 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulResponse) r7     // Catch: java.lang.Throwable -> L64
            if (r7 == 0) goto L40
            java.lang.Integer r0 = r7.getCode()     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L4d
        L40:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r2 = r6.LJLJI     // Catch: java.lang.Throwable -> L64
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4     // Catch: java.lang.Throwable -> L64
            r0 = 1240(0x4d8, float:1.738E-42)
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L64
            r2.setState(r1)     // Catch: java.lang.Throwable -> L64
            goto L5a
        L4d:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L40
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r1 = r6.LJLJI     // Catch: java.lang.Throwable -> L64
            X.AvD r0 = X.C27775AvD.LJLIL     // Catch: java.lang.Throwable -> L64
            r1.setState(r0)     // Catch: java.lang.Throwable -> L64
        L5a:
            if (r7 == 0) goto L60
            java.lang.Integer r4 = r7.getCode()     // Catch: java.lang.Throwable -> L64
        L60:
            X.C27949Ay1.LJJJI(r4)     // Catch: java.lang.Throwable -> L64
            goto L79
        L64:
            java.lang.String r0 = "check lawful Fail"
            X.C78983UzD.LJIILL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r1 = r6.LJLJI
            X.AvE r0 = X.C27776AvE.LJLIL
            r1.setState(r0)
            java.lang.Integer r1 = new java.lang.Integer
            r0 = -1
            r1.<init>(r0)
            X.C27949Ay1.LJJJI(r1)
        L79:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27773AvB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
