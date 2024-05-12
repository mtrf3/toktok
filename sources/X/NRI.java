package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NRI {
    public static final /* synthetic */ int LIZ = 0;

    public static final NRB LIZ(AwemeRawAd ad) {
        o.LJIIIZ(ad, "ad");
        if (ad.getOmVast() == null) {
            return NRB.BEGIN_TO_RENDER;
        }
        switch (ad.getOmVast().impression_type) {
            case 1:
                return NRB.DEFINED_BY_JAVASCRIPT;
            case 2:
                return NRB.UNSPECIFIED;
            case 3:
                return NRB.LOADED;
            case 4:
                return NRB.BEGIN_TO_RENDER;
            case 5:
                return NRB.ONE_PIXEL;
            case 6:
                return NRB.VIEWABLE;
            case 7:
                return NRB.AUDIBLE;
            case 8:
                return NRB.OTHER;
            default:
                return NRB.BEGIN_TO_RENDER;
        }
    }
}
