package X;

import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$onEvent$2", f = "StoreFragment.kt", l = {1169, 1170}, m = "invokeSuspend")
/* renamed from: X.9Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238679Yh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public StoreFragment LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ StoreFragment LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ CartRefreshEvent LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238679Yh(StoreFragment storeFragment, int i, int i2, CartRefreshEvent cartRefreshEvent, InterfaceC67352kd<? super C238679Yh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = storeFragment;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = cartRefreshEvent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238679Yh(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238679Yh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
