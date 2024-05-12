package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder$handleOldDataLayout$2$3$1", f = "PdpDeliveryHolder.kt", l = {407}, m = "invokeSuspend")
/* renamed from: X.AkO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27104AkO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpDeliveryHolder LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C27127Akl LJLJJI;
    public final /* synthetic */ C27124Aki LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27104AkO(PdpDeliveryHolder pdpDeliveryHolder, String str, C27127Akl c27127Akl, C27124Aki c27124Aki, InterfaceC67352kd<? super C27104AkO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpDeliveryHolder;
        this.LJLJI = str;
        this.LJLJJI = c27127Akl;
        this.LJLJJL = c27124Aki;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27104AkO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01db, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L36;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27104AkO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
