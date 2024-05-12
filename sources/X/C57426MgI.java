package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import java.net.URLEncoder;
import java.util.Objects;

/* renamed from: X.MgI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57426MgI {
    public final QrCodeScanService LIZ = QrCodeScanImpl.LJIIJ();

    public final void LIZ(Context context, String str) {
        boolean z;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String securityUrl = this.LIZ.getSecurityUrl(str);
        if (context != null) {
            QrCodeScanImpl.LJIIJ();
            android.net.Uri parse = UriProtector.parse(securityUrl);
            boolean z2 = false;
            if (TextUtils.equals(UriProtector.getQueryParameter(parse, "use_spark"), "1")) {
                if (securityUrl.startsWith("http")) {
                    try {
                        securityUrl = "aweme://webview?url=" + URLEncoder.encode(securityUrl, "UTF-8");
                    } catch (Exception unused) {
                        securityUrl = "aweme://webview?url=".concat(securityUrl);
                    }
                }
                try {
                    z = Objects.equals(UriProtector.parse(securityUrl).getHost(), "webview");
                } catch (Throwable unused2) {
                    z = false;
                }
                if (((Boolean) C52810Ko2.LIZ.getValue()).booleanValue() && !z) {
                    return;
                }
                String host = parse.getHost();
                if ((host != null && host.contains("lynxview")) || TextUtils.equals(UriProtector.getQueryParameter(parse, "hybrid_sdk_version"), "bullet")) {
                    z2 = true;
                }
                Bundle LIZJ = AnonymousClass036.LIZJ("need_sec_link", "1", "sec_link_scene", "qrcode");
                IHybridKitService LJIIJJI = HybridKitTaskImpl.LJIIJJI();
                if (z2) {
                    str2 = null;
                } else {
                    str2 = "crossPlatform";
                }
                LJIIJJI.LIZLLL(context, securityUrl, str2, LIZJ);
                return;
            }
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            Bundle LIZ = C0JT.LIZ("show_load_dialog", true, "show_not_official_content_warning", false);
            LIZ.putBoolean("hide_nav_bar", false);
            LIZ.putBoolean("use_webview_title", true);
            LIZ.putBoolean("safeTemplate", true);
            intent.putExtra("hide_more", false);
            intent.putExtra("enter_from", "qr_code");
            intent.putExtra("need_sec_link", true);
            intent.putExtra("sec_link_scene", "qrcode");
            intent.putExtra("need_detect_2_jump", true);
            intent.putExtras(LIZ);
            intent.setData(UriProtector.parse(securityUrl));
            C16880lQ.LIZJ(context, intent);
        }
    }
}
