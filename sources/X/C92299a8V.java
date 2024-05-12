package X;

import com.bytedance.pipo.checkout.api.network.model.HttpResponse;
import com.bytedance.pipo.checkout.api.network.model.request.DistrictRequest;
import com.bytedance.pipo.checkout.api.network.model.response.AllDistrictResponse;
import com.bytedance.pipo.checkout.api.network.model.response.District;
import com.bytedance.pipo.checkout.api.network.model.response.DistrictResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a8V, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92299a8V implements InterfaceC92098a5G {
    public final /* synthetic */ InterfaceC67352kd<C92082a50<List<District>>> LIZ;
    public final /* synthetic */ C92083a51 LIZIZ;
    public final /* synthetic */ DistrictRequest LIZJ;

    @Override // X.InterfaceC92098a5G
    public final void LIZ(HttpResponse httpResponse) {
        boolean z;
        C92082a50 c92082a50;
        Object subRegion;
        InterfaceC67352kd<C92082a50<List<District>>> interfaceC67352kd = this.LIZ;
        C92083a51 c92083a51 = this.LIZIZ;
        if (this.LIZJ.getGeonameid() == null && this.LIZJ.getCode() == null) {
            z = true;
        } else {
            z = false;
        }
        c92083a51.getClass();
        if (httpResponse.getStatusCode() != 200) {
            c92082a50 = new C92082a50(EnumC92085a53.HttpError, httpResponse.getResponseString(), null, 4);
        } else {
            String str = "";
            try {
                if (z) {
                    AllDistrictResponse allDistrictResponse = (AllDistrictResponse) C92084a52.LIZ.LJI(httpResponse.getResponseString(), AllDistrictResponse.class);
                    if (!o.LJ(allDistrictResponse.getStatus(), "1")) {
                        EnumC92085a53 enumC92085a53 = EnumC92085a53.ApiError;
                        String info = allDistrictResponse.getInfo();
                        if (info != null) {
                            str = info;
                        }
                        c92082a50 = new C92082a50(enumC92085a53, str, null);
                    } else {
                        c92082a50 = new C92082a50(EnumC92085a53.Success, "success", allDistrictResponse.getDistrict());
                    }
                } else {
                    DistrictResponse districtResponse = (DistrictResponse) C92084a52.LIZ.LJI(httpResponse.getResponseString(), DistrictResponse.class);
                    if (!o.LJ(districtResponse.getStatus(), "1")) {
                        EnumC92085a53 enumC92085a532 = EnumC92085a53.ApiError;
                        String info2 = districtResponse.getInfo();
                        if (info2 != null) {
                            str = info2;
                        }
                        c92082a50 = new C92082a50(enumC92085a532, str, null);
                    } else {
                        EnumC92085a53 enumC92085a533 = EnumC92085a53.Success;
                        District district = districtResponse.getDistrict();
                        if (district != null) {
                            subRegion = district.getSubRegion();
                            if (subRegion == null) {
                            }
                            c92082a50 = new C92082a50(enumC92085a533, "success", subRegion);
                        }
                        subRegion = C61878OQg.INSTANCE;
                        c92082a50 = new C92082a50(enumC92085a533, "success", subRegion);
                    }
                }
            } catch (Throwable th) {
                EnumC92085a53 enumC92085a534 = EnumC92085a53.ApiError;
                String message = th.getMessage();
                if (message == null) {
                    message = "Error";
                }
                c92082a50 = new C92082a50(enumC92085a534, message, null);
            }
        }
        C3C5.m7constructorimpl(c92082a50);
        interfaceC67352kd.resumeWith(c92082a50);
    }

    @Override // X.InterfaceC92098a5G
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC67352kd<C92082a50<List<District>>> interfaceC67352kd = this.LIZ;
        EnumC92085a53 enumC92085a53 = EnumC92085a53.HttpError;
        String message = t.getMessage();
        if (message == null) {
            message = "Http Error";
        }
        C92082a50 c92082a50 = new C92082a50(enumC92085a53, message, null);
        C3C5.m7constructorimpl(c92082a50);
        interfaceC67352kd.resumeWith(c92082a50);
    }

    public C92299a8V(C84654XKg c84654XKg, C92083a51 c92083a51, DistrictRequest districtRequest) {
        this.LIZ = c84654XKg;
        this.LIZIZ = c92083a51;
        this.LIZJ = districtRequest;
    }
}
