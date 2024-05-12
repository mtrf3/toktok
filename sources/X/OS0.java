package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$loadTabListData$1", f = "StoreFragment.kt", l = {461}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OS0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OS0(StoreFragment storeFragment, InterfaceC67352kd<? super OS0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OS0(this.LJLILLLLZI, interfaceC67352kd);
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
                OS1 os1 = new OS1(storeFragment, null);
                this.LJLIL = 1;
                obj = OS2.LIZ("shop", "homepage_tab_list", str, os1, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            Response response = (Response) obj;
            if (response != null) {
                StoreFragment storeFragment2 = this.LJLILLLLZI;
                storeFragment2.LJLLLL.put("tab_list_data", C27739Aud.LJI(response));
                if (storeFragment2.LJLJL) {
                    storeFragment2.Il();
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        this.LJLILLLLZI.LJLZ = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
