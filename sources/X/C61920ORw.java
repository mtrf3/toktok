package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$loadProductsFilterData$1", f = "StoreFragment.kt", l = {481}, m = "invokeSuspend")
/* renamed from: X.ORw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61920ORw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61920ORw(StoreFragment storeFragment, InterfaceC67352kd<? super C61920ORw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61920ORw(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                StoreFragment storeFragment = this.LJLILLLLZI;
                C61918ORu c61918ORu = storeFragment.LJLILLLLZI;
                if (c61918ORu != null) {
                    str = c61918ORu.LIZLLL;
                } else {
                    str = null;
                }
                C61919ORv c61919ORv = new C61919ORv(storeFragment, null);
                this.LJLIL = 1;
                obj = OS2.LIZ("shop", "product_tab_list", str, c61919ORv, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            Response response = (Response) obj;
            if (response != null) {
                StoreFragment storeFragment2 = this.LJLILLLLZI;
                storeFragment2.LJLLLL.put("product_filters", C27739Aud.LJI(response));
                if (storeFragment2.LJLJL) {
                    storeFragment2.Il();
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        this.LJLILLLLZI.LJZ = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
