package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.im.OpenChatExt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NN6 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void LIZ(Context context, Aweme aweme) {
        char c;
        if (aweme == null || !aweme.isAd()) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String type = awemeRawAd.getType();
        if (TextUtils.isEmpty(type)) {
            return;
        }
        type.getClass();
        switch (type.hashCode()) {
            case -1354573786:
                if (type.equals("coupon")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 117588:
                if (type.equals("web")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3148996:
                if (type.equals("form")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 106642798:
                if (type.equals("phone")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 957829685:
                if (type.equals("counsel")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1893962841:
                if (type.equals("redpacket")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c == 5) {
                                NN1.LJJIL(context, aweme, "button");
                                NN1.LJJIJL(context, aweme);
                                C58704N2e.LIZLLL("homepage_ad", "click_redpacket", awemeRawAd).LJII();
                            }
                        }
                    } else {
                        NN1.LJJJJJ(context, "click_call", aweme, NN1.LJIIIZ(context, aweme));
                        C58704N2e.LIZLLL("homepage_ad", "click_call", aweme.getAwemeRawAd()).LJII();
                        NN1.LJJIL(context, aweme, "button");
                    }
                } else {
                    NN1.LJJJJJ(context, "click_form", aweme, NN1.LJIIIZ(context, aweme));
                    C58704N2e.LIZLLL("homepage_ad", "click_form", aweme.getAwemeRawAd()).LJII();
                    NN1.LJJIL(context, aweme, "button");
                }
            }
            if (OpenChatExt.LIZIZ(openUrl)) {
                NN1.LJJJJIZL(context, "homepage_ad", "click_message", aweme, NN1.LJIIL(context, aweme, false, null));
                C58704N2e.LIZLLL("homepage_ad", "click_message", awemeRawAd).LJII();
            } else {
                NN1.LJJIL(context, aweme, "button");
                NN1.LJJIJLIJ(context, aweme);
                C58704N2e.LIZLLL("homepage_ad", "click_button", awemeRawAd).LJII();
            }
        } else {
            NN1.LJJIL(context, aweme, "button");
            NN1.LJJJJJ(context, "click_coupon", aweme, NN1.LJIIIZ(context, aweme));
            C58704N2e.LIZLLL("homepage_ad", "click_coupon", awemeRawAd).LJII();
        }
        NOE.LJJIIJ(context, aweme, 8, null);
    }
}
