package X;

import Y.AObjectS123S0200000_7;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes9.dex */
public final class JC6 implements IDW {
    public final C0M6<JCB, JC8> LIZ = new C0M6<>(10);

    @Override // X.IDW
    public final void LIZ(Aweme aweme, String str, G8C g8c) {
        String str2;
        JC9 jc9 = JC9.LIZ;
        JCB LJJJIL = C78977Uz7.LJJJIL(aweme);
        if (LJJJIL == null) {
            return;
        }
        C0M6<JCB, JC8> c0m6 = this.LIZ;
        JC8 LIZIZ = c0m6.LIZIZ(LJJJIL);
        if (LIZIZ == null) {
            if (str == null) {
                str2 = "undefined";
            } else {
                str2 = str;
            }
            LIZIZ = new JC8(LJJJIL, str2);
            c0m6.LIZJ(LJJJIL, LIZIZ);
        }
        LIZIZ.LIZ = jc9;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.addReusableExtraParam("expose_from", "page_scroll");
            if (str == null) {
                str = "undefined";
            }
            awemeRawAd.addReusableExtraParam("expose_page", str);
        }
        g8c.invoke(aweme);
    }

    @Override // X.IDW
    public final void LIZJ(Aweme aweme, String str, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        String str2;
        JCB LJJJIL;
        String str3;
        if (C1DJ.LJJ(aweme)) {
            return;
        }
        if (str == null) {
            str2 = "undefined";
        } else {
            str2 = str;
        }
        if (!C58992Tf.LIZ(str2) || (LJJJIL = C78977Uz7.LJJJIL(aweme)) == null) {
            return;
        }
        C0M6<JCB, JC8> c0m6 = this.LIZ;
        JC8 LIZIZ = c0m6.LIZIZ(LJJJIL);
        if (LIZIZ == null) {
            if (str == null) {
                str3 = "undefined";
            } else {
                str3 = str;
            }
            LIZIZ = new JC8(LJJJIL, str3);
            c0m6.LIZJ(LJJJIL, LIZIZ);
        }
        if (!(LIZIZ.LIZ instanceof JC9)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                awemeRawAd.addReusableExtraParam("expose_from", "page_select");
                if (str == null) {
                    str = "undefined";
                }
                awemeRawAd.addReusableExtraParam("expose_page", str);
            }
            aObjectS123S0200000_7.invoke(aweme);
        }
        LIZIZ.LIZ = JCA.LIZ;
    }

    @Override // X.IDW
    public final void LIZIZ(Aweme aweme, String str, JC7 jc7, InterfaceC88472Yns<? super Aweme, C76800UCe> interfaceC88472Yns) {
        if (aweme == null) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            awemeRawAd.addReusableExtraParam("expose_from", jc7.getValue());
            if (str == null) {
                str = "undefined";
            }
            awemeRawAd.addReusableExtraParam("expose_page", str);
        }
        interfaceC88472Yns.invoke(aweme);
    }
}
