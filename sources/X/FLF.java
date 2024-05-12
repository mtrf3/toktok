package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes7.dex */
public final class FLF extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final FLF LJLIL = new FLF();

    public FLF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3 = FLE.LIZ;
        boolean z3 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str2 = FLE.LIZ;
        } else {
            Context LIZIZ = EF7.LIZIZ();
            try {
                str = WebSettings.getDefaultUserAgent(LIZIZ);
            } catch (Throwable unused) {
                str = null;
            }
            FLE.LIZ = str;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str2 = FLE.LIZ;
            } else if (FLE.LIZIZ || !(LIZIZ instanceof Activity)) {
                str2 = FLE.LIZ;
            } else {
                try {
                    WebView webView = new WebView(LIZIZ);
                    FLE.LIZ = webView.getSettings().getUserAgentString();
                    FLE.LIZIZ = true;
                    webView.destroy();
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                }
                str2 = FLE.LIZ;
            }
        }
        if (C00F.LIZ(31744, 0, "ad_web_ua_update_frequency", true) != 0) {
            FLE.LIZJ = System.currentTimeMillis();
            FLE.LIZJ().edit().putLong("ad_user_agent_update_time", FLE.LIZJ).apply();
        }
        if (str2 == null || str2.length() == 0) {
            z3 = true;
        }
        if (z3) {
            String property = System.getProperty("http.agent");
            if (property == null) {
                return "";
            }
            return property;
        }
        return str2;
    }
}
