package X;

import android.net.Uri;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N36 extends QQE<C68922R3e> {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ Uri.Builder LIZIZ;

    @Override // X.QQE
    public final void onResponse(C68922R3e c68922R3e) {
        String str;
        JSONObject jSONObject;
        C68922R3e c68922R3e2 = c68922R3e;
        if (c68922R3e2 != null && (jSONObject = c68922R3e2.LJIILJJIL) != null) {
            str = jSONObject.optString("verify_ticket");
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ;
            Uri.Builder builder = this.LIZIZ;
            if (str == null) {
                str = "";
            }
            String builder2 = builder.appendQueryParameter("verify_ticket", str).toString();
            o.LJIIIIZZ(builder2, "urlWithAppId\n           …              .toString()");
            interfaceC88472Yns.invoke(builder2);
            return;
        }
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LIZ;
        String builder3 = this.LIZIZ.toString();
        o.LJIIIIZZ(builder3, "urlWithAppId.toString()");
        interfaceC88472Yns2.invoke(builder3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public N36(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, Uri.Builder builder) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = builder;
    }
}
