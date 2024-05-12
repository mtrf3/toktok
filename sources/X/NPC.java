package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NPC {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LJIIIIZZ() {
        return SearchAdMainService.LJIIJJI().LIZ();
    }

    public static final Aweme LIZJ(String str) {
        IAwemeService LIZ2 = AwemeService.LIZ();
        Aweme o6 = LIZ2.o6(str);
        Aweme i6 = LIZ2.i6(str);
        if (o6 == null) {
            return i6;
        }
        return o6;
    }

    public static final boolean LJ(String scheme) {
        o.LJIIIZ(scheme, "scheme");
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!o.LJ(lowerCase, "sslocal") && !o.LJ(lowerCase, "localsdk")) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(android.net.Uri uri) {
        String scheme = uri.getScheme();
        String str = "";
        if (scheme == null) {
            scheme = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        String host = uri.getHost();
        if (host == null) {
            host = "";
        }
        LIZ2.append(host);
        String path = uri.getPath();
        if (path != null) {
            str = path;
        }
        LIZ2.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (o.LJ(scheme, "aweme") && o.LJ(LIZIZ, "music/ttm/subscribe/loading")) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        android.net.Uri uri = UriProtector.parse(str);
        o.LJIIIIZZ(uri, "uri");
        if (LJFF(uri)) {
            return true;
        }
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        String lowerCase = scheme.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (LJ(lowerCase) || TextUtils.equals(lowerCase, "aweme")) {
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return FCD.LJ(EF7.LIZIZ(), intent);
    }

    public static final boolean LJII(Context context) {
        if (context == null) {
            return false;
        }
        return SearchAdMainService.LJIIJJI().LIZJ(context);
    }

    public static boolean LJIIIZ(AdStickerData adStickerData) {
        if (adStickerData == null) {
            return false;
        }
        if (adStickerData.getEnableShowInterval()) {
            if (adStickerData.getStartShowTime() < 0.0f || adStickerData.getStopShowTime() <= adStickerData.getStartShowTime()) {
                return false;
            }
        } else if (adStickerData.getShowSeconds() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(String str) {
        android.net.Uri parse;
        String scheme;
        if (TextUtils.isEmpty(str) || (parse = UriProtector.parse(str)) == null || (scheme = parse.getScheme()) == null || LJ(scheme)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return FCD.LJ(EF7.LIZIZ(), intent);
    }

    public static final void LIZ(List<Aweme> list, FWB<Object> fwb) {
        int size;
        if (list == null || list.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            Aweme aweme = (Aweme) ListProtector.get(list, size);
            if (aweme.isAd()) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd == null || !awemeRawAd.isHideIfExists() || !o.LJ(awemeRawAd.getType(), "app") || !FCD.LJFF(EF7.LIZIZ(), awemeRawAd.getPackageName())) {
                    return;
                }
                fwb.invoke(awemeRawAd, "feed_download_ad");
                C58704N2e.LIZLLL("feed_download_ad", "hide_app", awemeRawAd).LJII();
                ListProtector.remove(list, size);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final int LIZIZ(Context context, Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getLearnMoreBgColor();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return C78609UtB.LJJJ(R.attr.eb, context);
        }
        return ColorProtector.parseColor(str);
    }

    public static final int LIZLLL(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        String buttonBgColor;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adLive = awemeRawAd.getAdLive()) == null || (buttonBgColor = adLive.getButtonBgColor()) == null) {
            return C78609UtB.LJJJ(R.attr.eb, context);
        }
        return ColorProtector.parseColor(buttonBgColor);
    }

    public static final void LJIIJJI(int i, List<? extends Aweme> list, FWB<? super Aweme> fwb) {
        String str;
        if (list == null) {
            return;
        }
        for (Aweme aweme : list) {
            boolean z = false;
            if (aweme.isAd()) {
                fwb.invoke(aweme);
                C58704N2e.LIZLLL("draw_ad", "receive", aweme.getAwemeRawAd()).LJII();
            } else {
                try {
                    FFL.LJIIIZ().getClass();
                    z = FFL.LJ(31744, "feed_video_receive_report_enable", true, false);
                } catch (Throwable unused) {
                }
                if (z) {
                    HashMap hashMap = new HashMap();
                    String aid = aweme.getAid();
                    o.LJIIIIZZ(aid, "aweme.aid");
                    hashMap.put("aweme_id", aid);
                    hashMap.put("aweme_type", String.valueOf(aweme.getAwemeType()));
                    int distributeType = aweme.getDistributeType();
                    if (distributeType != 1) {
                        if (distributeType != 2) {
                            if (distributeType != 3) {
                                str = "";
                            } else {
                                str = "long_with_short";
                            }
                        } else {
                            str = "long_direct";
                        }
                    } else {
                        str = "short";
                    }
                    C116484hg.LIZIZ(hashMap, "impr_type", str, i, "feed_page_type");
                    FMX.LJIIL("video_receive", hashMap);
                }
            }
        }
    }
}
