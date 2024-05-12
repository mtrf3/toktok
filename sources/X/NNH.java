package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNH extends NNJ {
    @Override // X.NNJ
    public final boolean LIZIZ() {
        String str;
        NNG nng = NNG.LIZIZ;
        nng.LIZ.LIZLLL("ad_lynx_download_JumpMarketHandler_doHandle", "begin", String.valueOf(LIZLLL().LIZ.LIZJ));
        String str2 = LIZLLL().LIZJ.LIZ;
        if (TextUtils.isEmpty(str2)) {
            nng.LIZ.LIZLLL("ad_lynx_download_JumpMarketHandler_doHandle", "empty_url", String.valueOf(LIZLLL().LIZ.LIZJ));
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str2);
        String scheme = parse.getScheme();
        if (scheme != null) {
            str = AnonymousClass028.LIZJ("getDefault()", scheme, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            nng.LIZ.LIZLLL("ad_lynx_download_JumpMarketHandler_doHandle", "empty_schema", String.valueOf(LIZLLL().LIZ.LIZJ));
            return false;
        }
        if (o.LJ("market", str)) {
            nng.LIZ.LIZLLL("ad_lynx_download_JumpMarketHandler_doHandle", "jumpMarket", String.valueOf(LIZLLL().LIZ.LIZJ));
            return nng.LIZ.LJIIIZ(LIZJ(), str2, parse, LIZLLL());
        }
        nng.LIZ.LIZLLL("ad_lynx_download_JumpMarketHandler_doHandle", "fail", String.valueOf(LIZLLL().LIZ.LIZJ));
        return false;
    }

    @Override // X.NNJ
    public final boolean LIZ() {
        if (TextUtils.isEmpty(LIZLLL().LIZJ.LIZ)) {
            return false;
        }
        return true;
    }
}
