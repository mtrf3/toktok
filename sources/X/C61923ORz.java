package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.j;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequest$1", f = "StoreFragment.kt", l = {438}, m = "invokeSuspend")
/* renamed from: X.ORz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61923ORz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61923ORz(StoreFragment storeFragment, InterfaceC67352kd<? super C61923ORz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61923ORz(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        GetShopHomepageData getShopHomepageData = null;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C73305Spp status_view = (C73305Spp) this.LJLILLLLZI._$_findCachedViewById(R.id.kf_);
            o.LJIIIIZZ(status_view, "status_view");
            AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this.LJLILLLLZI, 269);
            C61922ORy c61922ORy = new C61922ORy(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj = C90393gh.LIZIZ(status_view, aqS176S0100000_10, c61922ORy, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Response response = (Response) obj;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), (j) response.data, C65330PkU.LIZJ(C65352Pkq.LJI(GetShopHomepageData.class)));
            if (!(fromJson instanceof GetShopHomepageData)) {
                fromJson = null;
            }
            getShopHomepageData = (GetShopHomepageData) fromJson;
        } catch (s unused) {
        }
        if (getShopHomepageData == null) {
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.vl(getShopHomepageData);
        StoreFragment storeFragment = this.LJLILLLLZI;
        storeFragment.Dl(response, getShopHomepageData, storeFragment.LJLLILLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
