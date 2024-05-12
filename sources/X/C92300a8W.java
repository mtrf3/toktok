package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pipo.checkout.api.network.model.HttpResponse;
import com.bytedance.pipo.checkout.api.network.model.response.StarlingMessage;
import com.bytedance.pipo.checkout.api.network.model.response.StarlingResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.a8W, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92300a8W implements InterfaceC92098a5G {
    public final /* synthetic */ InterfaceC67352kd<java.util.Map<String, String>> LIZ;

    public C92300a8W(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC92098a5G
    public final void LIZ(HttpResponse httpResponse) {
        Object data;
        StarlingResponse starlingResponse = (StarlingResponse) GsonProtectorUtils.fromJson(C92084a52.LIZ, httpResponse.getResponseString(), StarlingResponse.class);
        InterfaceC67352kd<java.util.Map<String, String>> interfaceC67352kd = this.LIZ;
        StarlingMessage message = starlingResponse.getMessage();
        if (message == null || (data = message.getData()) == null) {
            data = C113554cx.LJJJLIIL();
        }
        C3C5.m7constructorimpl(data);
        interfaceC67352kd.resumeWith(data);
    }

    @Override // X.InterfaceC92098a5G
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC67352kd<java.util.Map<String, String>> interfaceC67352kd = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(t);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }
}
