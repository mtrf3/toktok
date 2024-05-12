package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequest$1$response$2", f = "StoreFragment.kt", l = {444}, m = "invokeSuspend")
/* renamed from: X.ORy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61922ORy extends AbstractC65782Prm implements InterfaceC88473Ynt<Long, Boolean, InterfaceC67352kd<? super Response<m>>, Object> {
    public int LJLIL;
    public /* synthetic */ long LJLILLLLZI;
    public /* synthetic */ boolean LJLJI;
    public final /* synthetic */ StoreFragment LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61922ORy(StoreFragment storeFragment, InterfaceC67352kd<? super C61922ORy> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = storeFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61922ORy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Long l, Boolean bool, InterfaceC67352kd<? super Response<m>> interfaceC67352kd) {
        long longValue = l.longValue();
        boolean booleanValue = bool.booleanValue();
        C61922ORy c61922ORy = new C61922ORy(this.LJLJJI, interfaceC67352kd);
        c61922ORy.LJLILLLLZI = longValue;
        c61922ORy.LJLJI = booleanValue;
        return c61922ORy.invokeSuspend(C76800UCe.LIZ);
    }
}
