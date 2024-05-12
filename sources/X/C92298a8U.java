package X;

import com.bytedance.pipo.checkout.api.network.model.HttpResponse;
import com.bytedance.pipo.checkout.api.network.model.response.BasicResponse;
import com.bytedance.pipo.checkout.api.network.model.response.PIManageResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.a8U, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92298a8U implements InterfaceC92098a5G {
    public final /* synthetic */ InterfaceC67352kd LIZ;

    public C92298a8U(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC92098a5G
    public final void LIZ(HttpResponse httpResponse) {
        InterfaceC92088a56 interfaceC92088a56;
        if (httpResponse.getStatusCode() != 200) {
            InterfaceC67352kd interfaceC67352kd = this.LIZ;
            C92082a50 c92082a50 = new C92082a50(EnumC92085a53.HttpError, httpResponse.getResponseString(), null, 4);
            C3C5.m7constructorimpl(c92082a50);
            interfaceC67352kd.resumeWith(c92082a50);
            return;
        }
        try {
            String responseStr = new BasicResponse(httpResponse.getResponseString()).getResponseStr();
            if (responseStr == null) {
                interfaceC92088a56 = null;
            } else {
                interfaceC92088a56 = (InterfaceC92088a56) C92084a52.LIZ.LJI(responseStr, PIManageResponse.class);
                System.out.println((Object) o.LJIILLIIL(interfaceC92088a56, "*** gson result "));
            }
            InterfaceC67352kd interfaceC67352kd2 = this.LIZ;
            C92082a50 c92082a502 = new C92082a50(EnumC92085a53.Success, "success", interfaceC92088a56);
            C3C5.m7constructorimpl(c92082a502);
            interfaceC67352kd2.resumeWith(c92082a502);
        } catch (Throwable th) {
            InterfaceC67352kd interfaceC67352kd3 = this.LIZ;
            EnumC92085a53 enumC92085a53 = EnumC92085a53.ParseJsonError;
            String message = th.getMessage();
            if (message == null) {
                message = "api error";
            }
            C92082a50 c92082a503 = new C92082a50(enumC92085a53, message, null);
            C3C5.m7constructorimpl(c92082a503);
            interfaceC67352kd3.resumeWith(c92082a503);
        }
    }

    @Override // X.InterfaceC92098a5G
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        System.out.println((Object) o.LJIILLIIL(t, "on Failure "));
        if (t instanceof C64799Pbv) {
            InterfaceC67352kd interfaceC67352kd = this.LIZ;
            EnumC92085a53 enumC92085a53 = EnumC92085a53.TimeoutError;
            String message = t.getMessage();
            if (message == null) {
                message = "Timeout";
            }
            C92082a50 c92082a50 = new C92082a50(enumC92085a53, message, null);
            C3C5.m7constructorimpl(c92082a50);
            interfaceC67352kd.resumeWith(c92082a50);
            return;
        }
        InterfaceC67352kd interfaceC67352kd2 = this.LIZ;
        EnumC92085a53 enumC92085a532 = EnumC92085a53.HttpError;
        String message2 = t.getMessage();
        if (message2 == null) {
            message2 = "Http Error";
        }
        C92082a50 c92082a502 = new C92082a50(enumC92085a532, message2, null);
        C3C5.m7constructorimpl(c92082a502);
        interfaceC67352kd2.resumeWith(c92082a502);
    }
}
