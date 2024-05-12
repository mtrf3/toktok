package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.LgO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54884LgO {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme, List list) {
        boolean z;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String str;
        int i;
        String str2;
        C58704N2e.LIZLLL("draw_ad", "receive", aweme.getAwemeRawAd()).LJI();
        List<Aweme> LJJIJIL = C47261Igj.LJJIJIL(aweme);
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && C78996UzQ.LJJI(aweme, list) >= 0) {
            Aweme aweme2 = (Aweme) ListProtector.get(list, C78996UzQ.LJJIJ(aweme, list));
            if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                int i2 = 2;
                String str3 = "";
                if (aweme.isAd()) {
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "item_repeat", aweme.getAwemeRawAd());
                    if (aweme2.isAd()) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    LIZLLL.LIZIZ(Integer.valueOf(i), "filter_reason");
                    if (!aweme2.isAd()) {
                        str2 = "";
                    } else {
                        AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                        if (awemeRawAd3 != null) {
                            str2 = awemeRawAd3.getCreativeIdStr();
                        } else {
                            str2 = null;
                        }
                    }
                    LIZLLL.LIZIZ(str2, "repeat_cid");
                    LIZLLL.LIZIZ(1, "repeat_type");
                    LIZLLL.LJI();
                }
                if (aweme.isAd() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.isEnableFilterSameVideo()) {
                    if (C63081OpJ.LLJJIJI(aweme)) {
                        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                        LIZLLL2.LIZIZ("8", "ad_show_fail_type");
                        if (aweme2.isAd()) {
                            AwemeRawAd awemeRawAd4 = aweme2.getAwemeRawAd();
                            if (awemeRawAd4 != null) {
                                str3 = awemeRawAd4.getCreativeIdStr();
                            } else {
                                str3 = null;
                            }
                        }
                        LIZLLL2.LIZIZ(str3, "repeat_cid");
                        if (C55511LqV.LIZIZ) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        LIZLLL2.LIZIZ(str, "awemelaunch");
                        LIZLLL2.LJI();
                    }
                    C188727au c188727au = new C188727au();
                    if (aweme2.isAd()) {
                        i2 = 1;
                    }
                    c188727au.LIZLLL(i2, "failed_reason");
                    c188727au.LJIIIZ("group_id", aweme2.getAid());
                    FMX.LJIIL("vv_failed", c188727au.LIZ);
                }
            }
            if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isEnableFilterSameVideo()) {
                ListProtector.remove(LJJIJIL, 0);
            }
        }
        ((FWC) C73340SqO.LJIJJ()).LIZIZ(LJJIJIL);
        NPC.LIZ(LJJIJIL, new C54683Ld9());
        if (!LJJIJIL.isEmpty()) {
            ListIterator<Aweme> listIterator = LJJIJIL.listIterator();
            o.LJIIIIZZ(C73340SqO.LJJIIZI(), "getVastUtilsService()");
            while (listIterator.hasNext()) {
                Aweme next = listIterator.next();
                if (C59252NNg.LJI(next) || C59252NNg.LJ(next)) {
                    if (C59251NNf.LIZIZ(3, next)) {
                        C59252NNg.LJIIIIZZ(next, null, null, true);
                        if (C59251NNf.LIZ(next, false)) {
                            listIterator.remove();
                        }
                    } else {
                        C59252NNg.LJIIIIZZ(next, C10K.LJI, null, false);
                    }
                }
            }
        }
        if (LJJIJIL.isEmpty()) {
            return false;
        }
        AwemeService.LIZ().R1(aweme);
        return true;
    }
}
