package X;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class NJV extends O43 {
    public final String LIZIZ;
    public final String LIZJ;
    public final SimpleDateFormat LIZLLL;

    @Override // X.O43
    public final InputStream LIZIZ(String str) {
        return null;
    }

    @Override // X.O43
    public final String LIZLLL() {
        return "";
    }

    @Override // X.O43, X.NJM
    public final WebResourceResponse LIZ(String str) {
        boolean z;
        IAdLandPagePreloadService LJJI;
        String LIZJ;
        IAdLandPagePreloadService LJJI2;
        JSONObject LJIIJ;
        JSONObject optJSONObject;
        int LJJLIIIJJIZ;
        String LIZJ2;
        java.util.Map LJJL;
        String str2 = this.LIZIZ;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str2 == null || str2.length() == 0 || (LJJI = AdLandPagePreloadServiceImpl.LJJI()) == null || (LIZJ = O3U.LIZJ(LJJI.LJIIL(this.LIZJ), str2)) == null || LIZJ.length() == 0 || (LJJI2 = AdLandPagePreloadServiceImpl.LJJI()) == null || (LJIIJ = LJJI2.LJIIJ(LIZJ)) == null || (optJSONObject = LJIIJ.optJSONObject(C82519Wa3.LJ(str))) == null) {
            return null;
        }
        File file = new File(LIZJ, optJSONObject.optString("fileName"));
        if (file.exists() && !file.isFile()) {
            if (!TextUtils.isEmpty(str) && (LJJLIIIJJIZ = s.LJJLIIIJJIZ(str, '?', 0, false, 6)) != -1) {
                str = str.substring(0, LJJLIIIJJIZ);
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("respHeader");
            if (optJSONObject2 == null || (LIZJ2 = optJSONObject2.optString("content-type")) == null) {
                LIZJ2 = LIZJ(str);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            IESSettingsProxy iESSettingsProxy = C2YJ.LIZIZ.LIZ;
            o.LJIIIIZZ(iESSettingsProxy, "get()");
            int prememCacheMaxAgeInDays = iESSettingsProxy.getAdLandingPageConfig().getPrememCacheMaxAgeInDays();
            if (prememCacheMaxAgeInDays <= 0) {
                LJJL = C113554cx.LJJJLIIL();
            } else {
                long j = prememCacheMaxAgeInDays * 86400;
                long currentTimeMillis = System.currentTimeMillis();
                LJJL = C113554cx.LJJL(new OSZ("access-control-allow-credentials", "true"), new OSZ("access-control-allow-headers", "Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Credentials"), new OSZ("access-control-allow-methods", "GET"), new OSZ("access-control-allow-origin", "*"), new OSZ("access-control-max-age", String.valueOf(j)), new OSZ("x-content-type-options", "nosniff"), new OSZ("x-xss-protection", CardStruct.IStatusCode.DEFAULT), new OSZ("timing-allow-origin", "*"), new OSZ("age", CardStruct.IStatusCode.DEFAULT), new OSZ("cache-control", C61845OOz.LIZ("public, max-age=", j)), new OSZ("date", i0.LJFF(this.LIZLLL.format(new Date(currentTimeMillis)), " GMT")), new OSZ("expires", i0.LJFF(this.LIZLLL.format(new Date((1000 * j) + currentTimeMillis)), " GMT")));
            }
            return O43.LJ(LIZJ2, "", fileInputStream, LJJL);
        }
        return null;
    }

    @Override // X.O43
    public final String LIZJ(String str) {
        if (str != null && (ujb.o.LJJJJ(str, ".shtml", false) || ujb.o.LJJJJ(str, ".do", false))) {
            return "text/html";
        }
        return super.LIZJ(str);
    }

    public NJV(String str, String str2) {
        super(true);
        this.LIZIZ = str2;
        this.LIZJ = "feed";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.LIZLLL = simpleDateFormat;
    }
}
