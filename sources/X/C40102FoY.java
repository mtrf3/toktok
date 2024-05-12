package X;

import com.google.gson.j;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$onAccountResult$1", f = "StoreFragment.kt", l = {1186}, m = "invokeSuspend")
/* renamed from: X.FoY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40102FoY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40102FoY(StoreFragment storeFragment, InterfaceC67352kd<? super C40102FoY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40102FoY(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        GetShopHomepageData getShopHomepageData;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        CartEntry cartEntry = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                StoreFragment storeFragment = this.LJLILLLLZI;
                ShopApi shopApi = (ShopApi) C67332kb.LIZ().create(ShopApi.class);
                String str = storeFragment.LJLLILLLL;
                this.LJLIL = 1;
                obj = shopApi.getShopHomepage(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            try {
                Object LIZLLL = C27739Aud.LJFF().LIZLLL((j) ((Response) obj).data, C65330PkU.LIZJ(C65352Pkq.LJI(GetShopHomepageData.class)));
                if (!(LIZLLL instanceof GetShopHomepageData)) {
                    LIZLLL = null;
                }
                getShopHomepageData = (GetShopHomepageData) LIZLLL;
            } catch (s unused) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused2) {
        }
        if (getShopHomepageData != null) {
            cartEntry = getShopHomepageData.cartEntry;
            if (cartEntry != null) {
                this.LJLILLLLZI.LJLLLLLL = cartEntry.link + "&trackParams=" + android.net.Uri.encode(C27739Aud.LJI(this.LJLILLLLZI.LJLIL));
                this.LJLILLLLZI.Gl(cartEntry.itemCount);
                return C76800UCe.LIZ;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
