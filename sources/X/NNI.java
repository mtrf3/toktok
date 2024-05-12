package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNI extends NNJ {
    @Override // X.NNJ
    public final boolean LIZIZ() {
        String str;
        NNG nng = NNG.LIZIZ;
        nng.LIZ.LIZLLL("ad_lynx_download_LocalOpenUrlHandler_doHandle", "begin", String.valueOf(LIZLLL().LIZ.LIZJ));
        String scheme = UriProtector.parse(LJI()).getScheme();
        if (scheme != null) {
            str = scheme.toLowerCase();
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || (!TextUtils.equals("sslocal", str) && !TextUtils.equals("localsdk", str))) {
            if (o.LJ(str, "aweme")) {
                nng.LIZ.LIZLLL("ad_lynx_download_LocalOpenUrlHandler_doHandle", "open", String.valueOf(LIZLLL().LIZ.LIZJ));
                IEcUgVSAService LJIIJJI = EcUgVSAService.LJIIJJI();
                if (LJIIJJI != null && (LJIIJJI.LJ(LJI()) || LJIIJJI.LJIIIZ(LJI()) || LJIIJJI.LJIIIIZZ(LJI()))) {
                    ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LIZJ());
                    if (LJJIFFI != null) {
                        return nng.LJIIIIZZ(LJJIFFI, LJI());
                    }
                    return nng.open(LJI());
                }
                return nng.open(LJI());
            }
            nng.LIZ.LIZLLL("ad_lynx_download_LocalOpenUrlHandler_doHandle", "fail", String.valueOf(LIZLLL().LIZ.LIZJ));
            return false;
        }
        nng.LIZIZ(LJI());
        nng.LIZ.LIZLLL("ad_lynx_download_LocalOpenUrlHandler_doHandle", "startAdsAppActivity", String.valueOf(LIZLLL().LIZ.LIZJ));
        return nng.LIZ(LIZJ(), LJI());
    }

    @Override // X.NNJ
    public final boolean LIZ() {
        String str;
        if (TextUtils.isEmpty(LJI()) || C56209M4f.LIZ(LJI())) {
            return false;
        }
        String scheme = UriProtector.parse(LJI()).getScheme();
        if (scheme != null) {
            str = scheme.toLowerCase();
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        if ((TextUtils.isEmpty(str) || (!TextUtils.equals("sslocal", str) && !TextUtils.equals("localsdk", str))) && !o.LJ(str, "aweme")) {
            return false;
        }
        return true;
    }

    public final String LJI() {
        return LIZLLL().LIZJ.LIZ;
    }
}
