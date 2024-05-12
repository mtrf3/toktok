package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveAdaptLegacyUASetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkFixErrorUASetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import defpackage.a1;
import java.util.Locale;
import ujb.o;
import ujb.s;

/* renamed from: X.CgK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31948CgK implements InterfaceC60455No3 {
    @Override // X.InterfaceC60455No3
    public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
        String str;
        String upperCase;
        if (LiveAdaptLegacyUASetting.INSTANCE.getValue()) {
            WebSettings settings = webKitView.getSettings();
            if (settings == null || (str = settings.getUserAgentString()) == null) {
                str = "";
            }
            if (s.LJJJLZIJ(str, "trill_", false) && s.LJJJLZIJ(str, "musical_ly", false)) {
                String LJJJJZ = o.LJJJJZ(str, "trill_", "musical_ly_", false);
                WebSettings settings2 = webKitView.getSettings();
                if (settings2 != null) {
                    C16880lQ.LLZL(settings2, LJJJJZ);
                }
            }
        }
        C31949CgL.LIZ().getClass();
        Context context = webKitView.getContext();
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (context != null) {
            locale = context.getResources().getConfiguration().locale;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (LiveSparkFixErrorUASetting.INSTANCE.getValue()) {
            upperCase = C16880lQ.LLJILJILJ(iHostAppContext.context()).toUpperCase(Locale.ENGLISH);
        } else {
            upperCase = C16880lQ.LLJILJILJ(iHostAppContext.context()).toUpperCase();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(iHostAppContext.appName());
        LIZ.append("_");
        LIZ.append(iHostAppContext.getVersionCode());
        LIZ.append(" AppVersion/");
        LIZ.append(iHostAppContext.getVersionCode());
        LIZ.append(" JsSdk/2.0 NetType/");
        LIZ.append(upperCase);
        LIZ.append(" Channel/");
        LIZ.append(iHostAppContext.getChannel());
        LIZ.append(" ByteLocale/");
        LIZ.append(locale.toString());
        LIZ.append(" Webcast_ByteLocale/");
        LIZ.append(C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale()));
        LIZ.append(" Region/");
        LIZ.append(C04520Fs.LIZJ());
        LIZ.append(" App/");
        LIZ.append(iHostAppContext.appName());
        LIZ.append(" WebcastSDK/");
        LIZ.append(C30443Bx9.LIZ());
        String LIZIZ = X1D.LIZIZ(LIZ);
        String LIZJ = C31947CgJ.LIZJ(context, webKitView);
        if (!TextUtils.isEmpty(LIZJ)) {
            LIZIZ = a1.LJ(LIZIZ, " ", LIZJ);
        }
        if (!TextUtils.isEmpty(LIZIZ)) {
            C16880lQ.LLZL(webKitView.getSettings(), LIZIZ);
        }
    }
}
