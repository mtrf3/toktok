package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.N3o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58740N3o {
    public static final C58740N3o LIZ = new C58740N3o();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C48382Iyo.LJLIL);

    public static java.util.Map LIZIZ() {
        return (java.util.Map) LIZIZ.getValue();
    }

    public static final long LIZ(Aweme aweme) {
        float f;
        AwemeRawAd awemeRawAd;
        Float effectivePlayTime;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (effectivePlayTime = awemeRawAd.getEffectivePlayTime()) != null) {
            f = effectivePlayTime.floatValue();
        } else {
            f = 3.0f;
        }
        return O6R.LJJIJ(f * 1000);
    }

    public static final void LJFF(String creativeId) {
        o.LJIIIZ(creativeId, "creativeId");
        C58740N3o c58740N3o = LIZ;
        java.util.Map awemeState = LIZIZ();
        o.LJIIIIZZ(awemeState, "awemeState");
        for (Aweme it : C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJ(OJ4.LJJJJLL(C5UN.LJJLJ(awemeState), C58598MzC.LJLIL), new AqS33S1000000_10(creativeId, 7))))) {
            if (LJII(it)) {
                o.LJIIIIZZ(it, "it");
                LIZLLL(it, "click");
                c58740N3o.LJI(it);
            }
            o.LJIIIIZZ(it, "it");
            java.util.Map awemeState2 = LIZIZ();
            o.LJIIIIZZ(awemeState2, "awemeState");
            awemeState2.put(it, Integer.valueOf(LIZJ(c58740N3o, it) | 1));
        }
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.useEffectivePlayAction()) {
            return true;
        }
        return false;
    }

    public final void LJI(Aweme aweme) {
        java.util.Map awemeState = LIZIZ();
        o.LJIIIIZZ(awemeState, "awemeState");
        awemeState.put(aweme, Integer.valueOf(LIZJ(this, aweme) | 2));
    }

    public static int LIZJ(C58740N3o c58740N3o, Aweme aweme) {
        if (aweme == null) {
            c58740N3o.getClass();
        } else {
            c58740N3o.getClass();
            Integer num = (Integer) LIZIZ().get(aweme);
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    public static void LIZLLL(Aweme aweme, String str) {
        UrlModel urlModel;
        Long l;
        String str2;
        if (LJII(aweme)) {
            HashMap LIZJ = C03660Ck.LIZJ("trueview_play_type", str);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C55707Ltf c55707Ltf = new C55707Ltf();
            c55707Ltf.LIZ = aweme.getAwemeRawAd();
            c55707Ltf.LJ = LIZJ;
            JSONObject LIZ2 = c55707Ltf.LIZ();
            o.LJIIIIZZ(LIZ2, "ExtraJsonBuilder()\n     …Map(adExtraData).create()");
            if (awemeRawAd != null) {
                C58776N4y.LIZ("draw_ad", "trueview_play", LIZ2, awemeRawAd);
            }
        } else {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            C55707Ltf c55707Ltf2 = new C55707Ltf();
            c55707Ltf2.LIZ = aweme.getAwemeRawAd();
            JSONObject LIZ3 = c55707Ltf2.LIZ();
            o.LJIIIIZZ(LIZ3, "ExtraJsonBuilder()\n     …weme.awemeRawAd).create()");
            if (awemeRawAd2 != null) {
                C58776N4y.LIZ("draw_ad", "trueview_play", LIZ3, awemeRawAd2);
            }
        }
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                urlModel = awemeRawAd3.getEffectivePlayTrackUrlList();
                l = awemeRawAd3.getCreativeId();
                str2 = awemeRawAd3.getLogExtra();
            } else {
                urlModel = null;
                l = null;
                str2 = null;
            }
            new AqS192S0100000_10(aweme, 55);
            O8Y.LIZ("play_valid", urlModel, l, str2);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "trueview_play", awemeRawAd3);
            if (!LJII(aweme)) {
                str = null;
            }
            LIZLLL.LIZIZ(str, "trueview_play_type");
            LIZLLL.LJII();
        }
    }

    public static final void LJ(long j, Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            long LIZ2 = LIZ(aweme);
            C58740N3o c58740N3o = LIZ;
            if (j >= LIZ2 && (LIZJ(c58740N3o, aweme) & 2) == 0) {
                if (LJII(aweme)) {
                    LIZLLL(aweme, "play");
                } else {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        UrlModel effectivePlayTrackUrlList = awemeRawAd.getEffectivePlayTrackUrlList();
                        Long creativeId = awemeRawAd.getCreativeId();
                        String logExtra = awemeRawAd.getLogExtra();
                        new AqS192S0100000_10(awemeRawAd, 56);
                        O8Y.LIZ("play_valid", effectivePlayTrackUrlList, creativeId, logExtra);
                    }
                }
            }
            LIZIZ().remove(aweme);
        }
    }
}
