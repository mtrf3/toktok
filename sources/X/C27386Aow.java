package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.repo.RegionApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Aow, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27386Aow {
    public static final /* synthetic */ C27386Aow LIZ = new C27386Aow();
    public static final InterfaceC789838c LIZIZ = C40084FoG.LIZIZ("https://oec-api.tiktokv.com/");

    public static AbstractC73672Svk LIZ(RegionRequest request) {
        o.LJIIIZ(request, "request");
        return ((RegionApi) LIZIZ.create(RegionApi.class)).getDistricts(request);
    }

    public static AbstractC73672Svk LIZIZ(SearchDistrictRequest request) {
        o.LJIIIZ(request, "request");
        return ((RegionApi) LIZIZ.create(RegionApi.class)).getSearchDistricts(request);
    }
}
