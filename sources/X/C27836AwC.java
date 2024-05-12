package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import fjb.a;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity$tryFetchBillInfoForCart$1$1", f = "TransparentLoadingOSPActivity.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.AwC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27836AwC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitRequestParam LJLILLLLZI;
    public final /* synthetic */ TransparentLoadingOSPActivity LJLJI;
    public final /* synthetic */ HashMap<String, Object> LJLJJI;
    public final /* synthetic */ OrderSubmitRequestParam LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27836AwC(OrderSubmitRequestParam orderSubmitRequestParam, TransparentLoadingOSPActivity transparentLoadingOSPActivity, HashMap<String, Object> hashMap, OrderSubmitRequestParam orderSubmitRequestParam2, InterfaceC67352kd<? super C27836AwC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitRequestParam;
        this.LJLJI = transparentLoadingOSPActivity;
        this.LJLJJI = hashMap;
        this.LJLJJL = orderSubmitRequestParam2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27836AwC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        if (r4 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27836AwC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
