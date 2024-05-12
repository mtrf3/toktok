package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequestV2$1$deferred$1$2$2", f = "StoreFragment.kt", l = {354}, m = "invokeSuspend")
/* renamed from: X.FoV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40099FoV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;
    public final /* synthetic */ GetShopHomepageData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40099FoV(StoreFragment storeFragment, GetShopHomepageData getShopHomepageData, InterfaceC67352kd<? super C40099FoV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
        this.LJLJI = getShopHomepageData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40099FoV(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C40098FoU c40098FoU = new C40098FoU(null);
            this.LJLIL = 1;
            if (C74209TAn.LIZJ(1000L, c40098FoU, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        StoreFragment storeFragment = this.LJLILLLLZI;
        storeFragment.Dl(null, this.LJLJI, storeFragment.LJLLILLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
