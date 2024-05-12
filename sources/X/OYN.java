package X;

import Y.AfS19S1200000_10;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.AqS65S1200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OYN {
    public static void LIZIZ(Context context, SharePackage sharePackage, String str, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oversize_cause", "100M");
            FMX.LJIILJJIL("share_snapchat_oversized", jSONObject);
        } catch (Throwable unused) {
        }
        C05L.LIZLLL(context, R.string.dhn);
        sharePackage.extras.putString("share_form", "url_form");
        C62485Ofh.LIZJ(context, sharePackage, new C62509Og5(aweme, str, C78857UxB.LJJIIJ(1476399115, "bpea-98")));
    }

    public static void LIZ(Context context, SharePackage sharePackage, InterfaceC62225ObV channel, String downloadPath, Aweme aweme, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(downloadPath, "downloadPath");
        o.LJIIIZ(aweme, "aweme");
        String LIZ = C62358Ode.LIZ(channel, sharePackage.itemType, sharePackage.description);
        File file = new File(downloadPath);
        if (!file.exists() || file.length() > 104857600) {
            if (context instanceof Activity) {
                C217628gQ c217628gQ = C217628gQ.LIZIZ;
                if (c217628gQ.LIZJ((Activity) context)) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ == null || c217628gQ.LIZJ(LJIIIIZZ)) {
                        C44936HkK.LIZ(new AqS65S1200000_10(sharePackage, LIZ, aweme, 6));
                        return;
                    } else {
                        LIZIZ(LJIIIIZZ, sharePackage, LIZ, aweme);
                        return;
                    }
                }
            }
            LIZIZ(context, sharePackage, LIZ, aweme);
            return;
        }
        OYF.LIZLLL(channel, sharePackage.url, sharePackage.itemType).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LJIILLIIL(new AfS19S1200000_10(interfaceC88471Ynr, sharePackage, downloadPath, 1));
    }
}
