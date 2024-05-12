package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeleteRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import kotlin.jvm.internal.o;

/* renamed from: X.AkG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27096AkG {
    public static final /* synthetic */ C27096AkG LIZ = new C27096AkG();
    public static final InterfaceC789838c LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ("https://oec-api.tiktokv.com/");
        LIZ2.LIZIZ(new GecNetInterceptor());
        LIZIZ = LIZ2.LJFF();
    }

    public static AbstractC73672Svk LIZIZ(String id) {
        o.LJIIIZ(id, "id");
        return ((AddressApi) LIZIZ.create(AddressApi.class)).deleteAddress(new DeleteRequest(C47261Igj.LJJIJ(id)));
    }

    public static AbstractC73672Svk LIZJ(GetShippingAddressRequest getShippingAddressRequest) {
        if (getShippingAddressRequest == null) {
            return ((AddressApi) LIZIZ.create(AddressApi.class)).getAddressList();
        }
        return ((AddressApi) LIZIZ.create(AddressApi.class)).getAddressList(getShippingAddressRequest);
    }

    public static AbstractC73672Svk LIZLLL(CandDetailPlaceRequest candDetailPlaceRequest) {
        return ((AddressApi) LIZIZ.create(AddressApi.class)).getCandDetailPlace(candDetailPlaceRequest);
    }

    public static AbstractC73672Svk LJ(CandInputRequest candInputRequest) {
        return ((AddressApi) LIZIZ.create(AddressApi.class)).getCandInput(candInputRequest);
    }

    public static AbstractC73672Svk LIZ(Address address, Integer num) {
        return ((AddressApi) LIZIZ.create(AddressApi.class)).checkAddress(new CheckShippingAddressRequest(address, num));
    }

    public static AbstractC73672Svk LJFF(Region region, Integer num, Integer num2) {
        return ((AddressApi) LIZIZ.create(AddressApi.class)).getInputItems(new InputItemRequest(region, num, null, num2));
    }
}
