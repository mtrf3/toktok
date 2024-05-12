package com.ss.android.ugc.aweme.compliance.sandbox.network;

import X.C09900aA;
import X.C38244Ezg;
import X.C38245Ezh;
import X.C38458F7m;
import X.C38459F7n;
import X.C64797Pbt;
import X.C64908Pdg;
import X.EJ6;
import X.EnumC58731N3f;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.ORS;
import X.ORZ;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OrbuSandboxTTNetInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        String url;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        if (!C38245Ezh.LIZIZ(null, null) && (url = request.getUrl()) != null && url.length() != 0) {
            try {
                Uri parse = UriProtector.parse(url);
                C38458F7m c38458F7m = new C38458F7m();
                c38458F7m.LIZ = EnumC58731N3f.PNS_URL_BEFORE_STORE_REGION.getLogType();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", parse.getHost());
                jSONObject.put("path", parse.getPath());
                c38458F7m.LIZIZ = jSONObject;
                C09900aA.LJII(new C38459F7n(c38458F7m));
            } catch (Exception unused) {
            }
        }
        List<EJ6> headers = request.getHeaders();
        o.LJIIIIZZ(headers, "request.headers");
        List<EJ6> LLJILJILJ = ORZ.LLJILJILJ(headers);
        ORS.LJJLIL(C38244Ezg.LJLIL, LLJILJILJ);
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ = LLJILJILJ;
        return f7s.LIZ(newBuilder.LIZ());
    }
}
