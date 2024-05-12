package X;

import Y.IDdS378S0100000_6;
import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EYa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36600EYa implements InterfaceC36618EYs {
    @Override // X.InterfaceC36618EYs
    public final String LIZ(String url, JSONObject jSONObject) {
        o.LJIIIZ(url, "url");
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        SecLinkManager.SecLinkDataApi secLinkDataApi = (SecLinkManager.SecLinkDataApi) C65083PgV.LJIIIIZZ(SecLinkManager.SecLinkDataApi.class, "https://www.tiktok.com/link/");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EJ6("Content-Type", "application/json"));
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        Charset forName = Charset.forName("UTF-8");
        o.LJIIIIZZ(forName, "forName(\"UTF-8\")");
        byte[] bytes = jSONObject2.getBytes(forName);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        return secLinkDataApi.executePost(url, new TypedByteArray(null, bytes, new String[0]), arrayList).execute().LIZIZ;
    }

    @Override // X.InterfaceC36618EYs
    public final void LIZIZ(String url, JSONObject jSONObject, C36619EYt c36619EYt) {
        o.LJIIIZ(url, "url");
        if (TextUtils.isEmpty(url)) {
            return;
        }
        SecLinkManager.SecLinkDataApi secLinkDataApi = (SecLinkManager.SecLinkDataApi) C65083PgV.LJIIIIZZ(SecLinkManager.SecLinkDataApi.class, "https://www.tiktok.com/link/");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EJ6("Content-Type", "application/json"));
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        Charset forName = Charset.forName("UTF-8");
        o.LJIIIIZZ(forName, "forName(\"UTF-8\")");
        byte[] bytes = jSONObject2.getBytes(forName);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        secLinkDataApi.executePost(url, new TypedByteArray(null, bytes, new String[0]), arrayList).enqueue(new IDdS378S0100000_6(c36619EYt, 7));
    }
}
