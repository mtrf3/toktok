package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fq8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40200Fq8 implements F22 {
    public final JSONObject LJLIL;

    @Override // X.F22
    public final String getName() {
        return "pageReused";
    }

    @Override // X.F22
    public final /* bridge */ /* synthetic */ Object getParams() {
        return this.LJLIL;
    }

    public C40200Fq8(C60238NkY c60238NkY) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        android.net.Uri uri = c60238NkY.LLIL;
        if (uri != null) {
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            o.LJFF(queryParameterNames, "uri.queryParameterNames");
            for (String str : queryParameterNames) {
                jSONObject2.put(str, UriProtector.getQueryParameter(uri, str));
            }
        }
        jSONObject.put("queryItems", jSONObject2);
        this.LJLIL = jSONObject;
    }
}
