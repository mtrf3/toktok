package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N50 implements NIW {
    public static final N50 LIZ = new N50();
    public static long LIZIZ;

    @Override // X.NIW
    public final void LIZIZ(AwemeRawAd awemeRawAd) {
        C025908h.LIZLLL("result_ad", "comment", awemeRawAd, "comment_sign", "refer");
    }

    @Override // X.NIW
    public final void LIZJ(AwemeRawAd awemeRawAd) {
        C025908h.LIZLLL("result_ad", "othershow", awemeRawAd, "button", "refer");
    }

    @Override // X.NIW
    public final void LJ(AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "click", awemeRawAd);
        LIZLLL.LIZJ("title", "refer");
        LIZLLL.LJI();
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LIZLLL2.LIZJ("title", "refer");
        LIZLLL2.LJI();
    }

    @Override // X.NIW
    public final void LJII(AwemeRawAd awemeRawAd) {
        C025908h.LIZLLL("result_ad", "otherclick", awemeRawAd, "share_sign", "refer");
    }

    @Override // X.NIW
    public final void LJIIIZ(AwemeRawAd awemeRawAd) {
        C025908h.LIZLLL("result_ad", "otherclick", awemeRawAd, "comment_sign", "refer");
    }

    @Override // X.NIW
    public final void LJIIJJI(AwemeRawAd awemeRawAd) {
        C58704N2e.LIZLLL("result_ad", "comment_show", awemeRawAd).LJI();
    }

    @Override // X.NIW
    public final void LJIIL(AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LIZLLL.LIZIZ(1, "have_profile_page");
        LIZLLL.LIZJ("source", "refer");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJIILIIL(AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "click", awemeRawAd);
        LIZLLL.LIZJ("like", "refer");
        LIZLLL.LJI();
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LIZLLL2.LIZJ("like", "refer");
        LIZLLL2.LJI();
    }

    @Override // X.NIW
    public final void LJIILLIIL(AwemeRawAd awemeRawAd) {
        C025908h.LIZLLL("result_ad", "othershow", awemeRawAd, "shop_anchor", "refer");
    }

    @Override // X.NIW
    public final void LJIJ(AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "follow", awemeRawAd);
        LIZLLL.LIZJ("button", "refer");
        LIZLLL.LIZIZ(1, "is_follow_text");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJIJI(Aweme aweme) {
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(new Object[]{aweme});
        C58777N4z.LIZ.getClass();
        searchAdEventLogger.LJIILIIL(C58777N4z.LJIIJJI);
        searchAdEventLogger.LJIILIIL(C58777N4z.LJIIL);
    }

    @Override // X.NIW
    public final void LJIL(AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "click_source", awemeRawAd);
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        if (NPC.LJIIIIZZ() && awemeRawAd != null && O5Y.LJJJJIZL(awemeRawAd) && !O5Y.LJIILLIIL(awemeRawAd)) {
            LIZLLL.LIZIZ(1, "have_profile_page");
            LIZLLL2.LIZIZ(1, "have_profile_page");
        }
        LIZLLL.LIZJ("source", "refer");
        LIZLLL.LJI();
        LIZLLL2.LIZJ("source", "refer");
        LIZLLL2.LJI();
    }

    @Override // X.NIW
    public final void LJJ(AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("button", "refer");
        LIZLLL.LIZIZ(1, "is_follow_text");
        LIZLLL.LJI();
    }

    public static void LJJIJIL(C58655N0h c58655N0h, String str) {
        if (str != null) {
            c58655N0h.LIZIZ(str, "room_id");
        }
    }

    public static void LJJIJL(AwemeRawAd awemeRawAd, String str) {
        String str2;
        if (awemeRawAd != null) {
            str2 = awemeRawAd.getType();
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (o.LJ(str2, "web")) {
            if (awemeRawAd != null && O5Y.LJJJJIZL(awemeRawAd)) {
                str3 = "bg_button";
            } else {
                str3 = "bg_more_button";
            }
        } else if (o.LJ(str2, "app")) {
            str3 = "bg_download_button";
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad_bg", "button_show", awemeRawAd);
        LJJIJIL(LIZLLL, str);
        LIZLLL.LIZJ(str3, "refer");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LIZLLL(int i, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "third_quartile", awemeRawAd);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
        C48145Iuz.LIZ().LJJ(awemeRawAd, "third_quartile");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (X.O5Y.LJJJJIZL(r5) == true) goto L6;
     */
    @Override // X.NIW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r1 = "result_ad_bg"
            java.lang.String r0 = "click"
            X.N0h r3 = X.C58704N2e.LIZLLL(r1, r0, r5)
            LJJIJIL(r3, r6)
            java.lang.String r0 = "otherclick"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r5)
            LJJIJIL(r2, r6)
            if (r5 == 0) goto L39
            boolean r1 = X.O5Y.LJJJJIZL(r5)
            r0 = 1
            if (r1 != r0) goto L39
        L1d:
            java.lang.String r1 = "refer"
            if (r0 == 0) goto L30
            java.lang.String r0 = "bg_button"
            r2.LIZJ(r0, r1)
            r3.LIZJ(r0, r1)
        L29:
            r3.LJI()
            r2.LJI()
            return
        L30:
            java.lang.String r0 = "bg_more_button"
            r2.LIZJ(r0, r1)
            r3.LIZJ(r0, r1)
            goto L29
        L39:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N50.LJFF(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String):void");
    }

    @Override // X.NIW
    public final void LJI(int i, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad_bg", "replay", awemeRawAd);
        LIZLLL.LIZJ("background", "refer");
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJIIJ(AwemeRawAd awemeRawAd, String str) {
        C025908h.LIZLLL("result_ad", str, awemeRawAd, "image_comment", "refer");
    }

    @Override // X.NIW
    public final void LJIILJJIL(AwemeRawAd awemeRawAd, String str) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad_bg", "otherclick", awemeRawAd);
        LJJIJIL(LIZLLL, str);
        LIZLLL.LIZJ("bg_download_button", "refer");
        LIZLLL.LJI();
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("result_ad_bg", "click", awemeRawAd);
        LJJIJIL(LIZLLL2, str);
        LIZLLL2.LIZJ("bg_download_button", "refer");
        LIZLLL2.LJI();
    }

    @Override // X.NIW
    public final void LJIILL(AwemeRawAd awemeRawAd, String str) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LJJIJIL(LIZLLL, str);
        LIZLLL.LIZJ("button", "refer");
        LIZLLL.LJI();
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("result_ad", "click", awemeRawAd);
        LJJIJIL(LIZLLL2, str);
        LIZLLL2.LIZJ("button", "refer");
        LIZLLL2.LJI();
    }

    @Override // X.NIW
    public final void LJIIZILJ(AwemeRawAd awemeRawAd, String str) {
        C025908h.LIZLLL("result_ad", str, awemeRawAd, "like_sign", "refer");
    }

    @Override // X.NIW
    public final void LJJI(int i, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "play_2s", awemeRawAd);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
        C48145Iuz.LIZ().LJJ(awemeRawAd, "play_2s");
    }

    @Override // X.NIW
    public final void LJJIII(int i, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "first_quartile", awemeRawAd);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
        C48145Iuz.LIZ().LJJ(awemeRawAd, "first_quartile");
    }

    @Override // X.NIW
    public final void LJJIIJ(int i, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "play_6s", awemeRawAd);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
        C48145Iuz.LIZ().LJJ(awemeRawAd, "play_6s");
    }

    @Override // X.NIW
    public final void LJJIJ(int i, AwemeRawAd awemeRawAd) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "midpoint", awemeRawAd);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
        C48145Iuz.LIZ().LJJ(awemeRawAd, "midpoint");
    }

    @Override // X.NIW
    public final void LJJIJIIJI(AwemeRawAd awemeRawAd, boolean z) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LIZLLL.LIZJ("sound_button", "refer");
        C0JU.LIZJ(!z ? 1 : 0, LIZLLL, "is_unmute");
    }

    @Override // X.NIW
    public final void LJJIJIIJIL(AwemeRawAd awemeRawAd, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        if (j == 0 || currentTimeMillis - j >= 500) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "othershow", awemeRawAd);
            LIZLLL.LIZJ("sound_button", "refer");
            C0JU.LIZJ(!z ? 1 : 0, LIZLLL, "is_unmute");
            LIZIZ = currentTimeMillis;
        }
    }

    @Override // X.NIW
    public final void LJIIIIZZ(AwemeRawAd awemeRawAd, boolean z, boolean z2) {
        Integer num;
        java.util.Map<String, String> searchAdExtraParams;
        String str;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "receive", awemeRawAd);
        if (z && SearchAdMainService.LJIIJJI().LJ()) {
            LIZLLL.LIZIZ(1, "is_inner");
            if (awemeRawAd != null && (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) != null && (str = searchAdExtraParams.get("inner_ad_position")) != null) {
                num = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                num = null;
            }
            LIZLLL.LIZIZ(num, "inner_g_pos");
        }
        if (z2) {
            N0H.LIZ.getClass();
            LIZLLL.LIZIZ(1, N0H.LJFF.LIZ);
        }
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJIJJLI(AwemeRawAd awemeRawAd, String str, String str2) {
        String str3;
        UrlModel urlModel;
        Long l;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "show", awemeRawAd);
        LIZLLL.LIZIZ(str, "enter_from");
        if (O5Y.LJJIL(awemeRawAd)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL.LIZIZ(str3, "has_anchor");
        LJJIJIL(LIZLLL, str2);
        LIZLLL.LJI();
        String str4 = null;
        if (awemeRawAd != null) {
            urlModel = awemeRawAd.getTrackUrlList();
            l = awemeRawAd.getCreativeId();
            str4 = awemeRawAd.getLogExtra();
        } else {
            urlModel = null;
            l = null;
        }
        new AqS192S0100000_10(awemeRawAd, 32);
        O8Y.LIZ("show", urlModel, l, str4);
    }

    @Override // X.NIW
    public final void LJJIFFI(AwemeRawAd awemeRawAd, int i, boolean z) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "pause", awemeRawAd);
        if (z) {
            LIZLLL.LIZIZ(1, "is_click");
        }
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    @Override // X.NIW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            if (r5 == 0) goto L65
            java.lang.String r1 = "draw_ad"
        L4:
            java.lang.String r0 = "othershow"
            X.N0h r2 = X.C58704N2e.LIZLLL(r1, r0, r4)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "video"
            r2.LIZJ(r0, r1)
            if (r5 == 0) goto L5c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            if (r0 == 0) goto L62
            r0.booleanValue()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
            java.lang.String r1 = "1"
        L24:
            java.lang.String r0 = "is_first"
            r2.LIZIZ(r1, r0)
            com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService r0 = com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LJIIJJI()
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L5c
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_inner"
            r2.LIZIZ(r1, r0)
            if (r4 == 0) goto L60
            java.util.Map r1 = r4.getSearchAdExtraParams()
            if (r1 == 0) goto L60
            java.lang.String r0 = "inner_ad_position"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L60
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L57:
            java.lang.String r0 = "inner_g_pos"
            r2.LIZIZ(r1, r0)
        L5c:
            r2.LJI()
            return
        L60:
            r1 = 0
            goto L57
        L62:
            java.lang.String r1 = "0"
            goto L24
        L65:
            java.lang.String r1 = "result_ad"
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N50.LJJIIJZLJL(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, boolean, boolean):void");
    }

    @Override // X.NIW
    public final void LJJIIZI(AwemeRawAd awemeRawAd, int i, boolean z) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "resume", awemeRawAd);
        if (z) {
            LIZLLL.LIZIZ(1, "is_click");
        }
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJIJJ(AwemeRawAd awemeRawAd, String str, String str2, boolean z) {
        String str3;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LJJIJIL(LIZLLL, str2);
        LIZLLL.LIZIZ(str, "enter_from");
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf != null) {
            valueOf.booleanValue();
            if (valueOf.booleanValue()) {
                str3 = "1";
                LIZLLL.LIZIZ(str3, "is_first");
                LIZLLL.LIZJ("video", "refer");
                LIZLLL.LJI();
            }
        }
        str3 = CardStruct.IStatusCode.DEFAULT;
        LIZLLL.LIZIZ(str3, "is_first");
        LIZLLL.LIZJ("video", "refer");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJJII(AwemeRawAd awemeRawAd, int i, boolean z, String str) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "auto_play", awemeRawAd);
        LJJIJIL(LIZLLL, str);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        C0JU.LIZJ(!z ? 1 : 0, LIZLLL, "is_unmute");
    }

    @Override // X.NIW
    public final void LIZ(AwemeRawAd awemeRawAd, int i, long j, long j2, String str) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "over", awemeRawAd);
        LJJIJIL(LIZLLL, str);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LIZIZ(Long.valueOf(j), "duration");
        LIZLLL.LIZIZ(Long.valueOf(j2), "video_length");
        LIZLLL.LJI();
    }

    @Override // X.NIW
    public final void LJJIIZ(AwemeRawAd awemeRawAd, int i, long j, long j2, String str) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "break", awemeRawAd);
        LJJIJIL(LIZLLL, str);
        LIZLLL.LIZIZ(Integer.valueOf(i + 1), "play_order");
        LIZLLL.LIZIZ(Long.valueOf(j), "duration");
        LIZLLL.LIZIZ(Long.valueOf(j2), "video_length");
        LIZLLL.LJI();
    }
}
