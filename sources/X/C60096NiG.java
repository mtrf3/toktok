package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker;
import kotlin.jvm.internal.o;

/* renamed from: X.NiG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60096NiG {
    public static String LIZ(GamingAnchorMaker.AnchorExtra anchorExtra, EnumC60097NiH type, String enterFrom) {
        String str;
        String str2;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (anchorExtra == null) {
            return "";
        }
        GamingAnchorMaker.AnchorExtra.AttributionRelated attributionRelated = anchorExtra.attributionRelated;
        int i = attributionRelated.linkType;
        if (i != 0 && i != 1) {
            if (i != 3) {
                return "";
            }
            if (type != EnumC60097NiH.TYPE_CLICK) {
                str2 = "";
            } else {
                str2 = attributionRelated.appsflyerClick;
            }
            if (type == EnumC60097NiH.TYPE_CLICK_LANDING_PAGE) {
                str2 = attributionRelated.appsflyerClickToLandingPage;
            }
            if (type == EnumC60097NiH.TYPE_IMPRESSION) {
                str2 = attributionRelated.appsflyerImpression;
            }
            if (str2 == null || str2.length() == 0) {
                return "";
            }
            Uri.Builder buildUpon = UriProtector.parse(str2).buildUpon();
            buildUpon.appendQueryParameter("advertising_id", EU3.LIZJ());
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "uri.build().toString()");
            return uri;
        }
        if (type != EnumC60097NiH.TYPE_CLICK) {
            str = "";
        } else {
            str = attributionRelated.adjustClick;
        }
        if (type == EnumC60097NiH.TYPE_CLICK_LANDING_PAGE) {
            str = attributionRelated.adjustClickToLandingPage;
        }
        if (type == EnumC60097NiH.TYPE_IMPRESSION) {
            str = attributionRelated.adjustImpression;
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        Uri.Builder buildUpon2 = UriProtector.parse(str).buildUpon();
        buildUpon2.appendQueryParameter("gps_adid", EU3.LIZJ());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enterFrom);
        LIZ.append("-item_anchor");
        buildUpon2.appendQueryParameter("campaign", X1D.LIZIZ(LIZ));
        String uri2 = buildUpon2.build().toString();
        o.LJIIIIZZ(uri2, "uri.build().toString()");
        return uri2;
    }
}
