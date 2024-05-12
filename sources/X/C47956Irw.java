package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.Irw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C47956Irw implements InterfaceC162186Yc, ISuperEntrancePrivacyService, InterfaceC46754IWo {
    public static java.util.Map LIZ() {
        String upperCase;
        HashMap hashMap = new HashMap();
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language)) {
            hashMap.put("language", language);
        }
        String LIZ = C39399FdD.LIZ(Locale.getDefault());
        if (!TextUtils.isEmpty(LIZ)) {
            hashMap.put("region", LIZ.toLowerCase(Locale.getDefault()));
        }
        String LIZ2 = C39399FdD.LIZ(Resources.getSystem().getConfiguration().locale);
        if (TextUtils.isEmpty(LIZ2)) {
            upperCase = "";
        } else {
            upperCase = LIZ2.toUpperCase(Locale.getDefault());
        }
        hashMap.put("country", upperCase);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService
    public boolean hasPrivacyPermission(Context context) {
        return AVServiceProxyImpl.lambda$superEntrancePrivacyService$2(context);
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static void LIZIZ(StringBuilder sb, int i, StringBuilder sb2, String str) {
        sb.append(i);
        TTVideoEngineLog.d(str, X1D.LIZIZ(sb2));
    }
}
