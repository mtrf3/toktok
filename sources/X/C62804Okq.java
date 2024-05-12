package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Okq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62804Okq extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C62804Okq LJLIL = new C62804Okq();

    public C62804Okq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        C47663InD c47663InD;
        try {
            UVX uvx = C62634Oi6.LIZ;
            if (uvx != null && (c47663InD = (C47663InD) uvx.LJLIL) != null) {
                Uri.Builder buildUpon = UriProtector.parse("https://s.lemon8-app.com/h5/feoffline/tiktok/introduction").buildUpon();
                buildUpon.appendQueryParameter("client_key", c47663InD.LIZIZ);
                buildUpon.appendQueryParameter("ui_language", (String) c47663InD.LIZJ);
                buildUpon.appendQueryParameter("locale", (String) c47663InD.LIZLLL);
                buildUpon.appendQueryParameter("state", "tiktok_authorize");
                String uri = buildUpon.build().toString();
                if (uri != null) {
                    return uri;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
