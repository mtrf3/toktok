package X;

import com.google.gson.j;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$loadTabListData$1$1$1", f = "StoreFragment.kt", l = {462}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OS1 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Response<j>>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OS1(StoreFragment storeFragment, InterfaceC67352kd<? super OS1> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new OS1(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Response<j>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0 = X.OS5.UNDEFINED.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r6.LJLIL = 1;
        r7 = r3.getShopHomepageTabList(r2, r1, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r7 != r5) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r0 != null) goto L13;
     */
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
            r4 = 1
            if (r0 == 0) goto Ld
            if (r0 != r4) goto L3f
            X.C141335gf.LIZJ(r7)
        Lc:
            return r7
        Ld:
            X.C141335gf.LIZJ(r7)
            X.38c r1 = X.C67332kb.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi> r0 = com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi.class
            java.lang.Object r3 = r1.create(r0)
            com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi r3 = (com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi) r3
            com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment r0 = r6.LJLILLLLZI
            java.lang.String r2 = r0.LJLLILLLL
            X.ORu r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L28
            java.lang.String r1 = r0.LJFF
            if (r1 != 0) goto L2c
        L28:
            java.lang.String r1 = ""
            if (r0 == 0) goto L30
        L2c:
            java.lang.String r0 = r0.LIZLLL
            if (r0 != 0) goto L36
        L30:
            X.OS5 r0 = X.OS5.UNDEFINED
            java.lang.String r0 = r0.getValue()
        L36:
            r6.LJLIL = r4
            java.lang.Object r7 = r3.getShopHomepageTabList(r2, r1, r0, r6)
            if (r7 != r5) goto Lc
            return r5
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OS1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
