package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NG3 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.m LIZ(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NG3.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):com.google.gson.m");
    }

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        Bundle bundle = new Bundle();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getNativeSiteCustomData();
        } else {
            str = null;
        }
        bundle.putString("bundle_native_site_custom_data", str);
        NLW LIZ = NGL.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIIZZ(context, bundle, aweme);
        }
        return bundle;
    }
}
