package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pipo.checkout.api.network.model.HttpResponse;
import com.bytedance.pipo.checkout.api.network.model.response.PlaceDetailResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.a8a, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92304a8a implements InterfaceC92098a5G {
    public final /* synthetic */ InterfaceC67352kd<C92082a50<PlaceDetailResponse>> LIZ;

    public C92304a8a(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC92098a5G
    public final void LIZ(HttpResponse httpResponse) {
        Object fromJson = GsonProtectorUtils.fromJson(C92084a52.LIZ, httpResponse.getResponseString(), (Class<Object>) PlaceDetailResponse.class);
        InterfaceC67352kd<C92082a50<PlaceDetailResponse>> interfaceC67352kd = this.LIZ;
        C92082a50 c92082a50 = new C92082a50(EnumC92085a53.Success, null, fromJson, 2);
        C3C5.m7constructorimpl(c92082a50);
        interfaceC67352kd.resumeWith(c92082a50);
    }

    @Override // X.InterfaceC92098a5G
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC67352kd<C92082a50<PlaceDetailResponse>> interfaceC67352kd = this.LIZ;
        EnumC92085a53 enumC92085a53 = EnumC92085a53.HttpError;
        String message = t.getMessage();
        if (message == null) {
            message = "Http Error";
        }
        C92082a50 c92082a50 = new C92082a50(enumC92085a53, message, null);
        C3C5.m7constructorimpl(c92082a50);
        interfaceC67352kd.resumeWith(c92082a50);
    }
}
