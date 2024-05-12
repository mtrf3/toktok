package X;

import Y.ACallableS41S0000000_6;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.IFeedItemList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class FWC implements FWA {
    public static volatile FWC LJ;
    public static final C68712Qxw LJFF;
    public IFeedItemList LIZIZ;
    public List<Aweme> LIZJ;
    public final java.util.Map<String, String> LIZLLL = new HashMap();
    public final FWD LIZ = new FWD();

    static {
        C16880lQ.LJLLJ(FWC.class);
        LJFF = new C68712Qxw();
    }

    public static boolean LIZ(String str) {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) LJFF.LIZJ();
            if (showAdDataBase != null) {
                List<FWF> LIZJ = showAdDataBase.LJIJ().LIZJ(str);
                if (C79004UzY.LJJIFFI(LIZJ)) {
                    return false;
                }
                return LIZJ.contains(new FWF(str, null));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void LIZIZ(List<Aweme> list) {
        int i;
        Object obj;
        if (list == null || C79004UzY.LJJIFFI(list)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.LIZ.LIZ(currentTimeMillis)) {
                ((HashMap) this.LIZLLL).clear();
                C10K.LIZ(new ACallableS41S0000000_6(4));
            }
            this.LIZ.LIZJ(currentTimeMillis);
            Iterator<Aweme> it = list.iterator();
            EF7.LIZIZ();
            while (it.hasNext()) {
                Aweme next = it.next();
                if (next != null && next.isAd()) {
                    String aid = next.getAid();
                    String str = "1";
                    if (LIZLLL(next)) {
                        it.remove();
                        if (C63081OpJ.LLJJIJI(next)) {
                            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                            LIZLLL.LIZIZ("12", "ad_show_fail_type");
                            LIZLLL.LIZIZ(LIZJ(aid), "repeat_cid");
                            if (!C55511LqV.LIZIZ) {
                                str = "2";
                            }
                            LIZLLL.LIZIZ(str, "awemelaunch");
                            LIZLLL.LJI();
                        }
                        if (next.isAd()) {
                            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                            LIZLLL2.LIZIZ(1, "filter_reason");
                            LIZLLL2.LIZIZ(LIZJ(aid), "repeat_cid");
                            LIZLLL2.LIZIZ(2, "repeat_type");
                            LIZLLL2.LJI();
                        }
                    } else if (this.LIZJ != null && next.getAwemeRawAd() != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                        for (Aweme aweme : this.LIZJ) {
                            if (aweme != null && TextUtils.equals(aid, aweme.getAid())) {
                                it.remove();
                                if (C63081OpJ.LLJJIJI(next)) {
                                    C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "show_failed", next.getAwemeRawAd());
                                    LIZLLL3.LIZIZ("8", "ad_show_fail_type");
                                    if (C55511LqV.LIZIZ) {
                                        obj = "1";
                                    } else {
                                        obj = "2";
                                    }
                                    LIZLLL3.LIZIZ(obj, "awemelaunch");
                                    LIZLLL3.LIZIZ(LIZJ(aid), "repeat_cid");
                                    LIZLLL3.LJI();
                                }
                                C58655N0h LIZLLL4 = C58704N2e.LIZLLL("draw_ad", "item_repeat", next.getAwemeRawAd());
                                if (aweme.isAd()) {
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                LIZLLL4.LIZIZ(Integer.valueOf(i), "filter_reason");
                                LIZLLL4.LIZIZ(LIZJ(aid), "repeat_cid");
                                LIZLLL4.LIZIZ(2, "repeat_type");
                                LIZLLL4.LJI();
                            }
                        }
                    }
                }
            }
            this.LIZJ = list;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final String LIZJ(String str) {
        FWF LIZIZ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((HashMap) this.LIZLLL).containsKey(str)) {
            return (String) ((HashMap) this.LIZLLL).get(str);
        }
        if (LIZ(str)) {
            try {
                ShowAdDataBase showAdDataBase = (ShowAdDataBase) LJFF.LIZJ();
                if (showAdDataBase == null || (LIZIZ = showAdDataBase.LJIJ().LIZIZ(str)) == null) {
                    return null;
                }
                return LIZIZ.LIZIZ;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean LIZLLL(Aweme aweme) {
        if (!aweme.isAd()) {
            return false;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid) || aweme.getAwemeRawAd().isDiableAdShowFilter()) {
            return false;
        }
        if (((HashMap) this.LIZLLL).containsKey(aid)) {
            return true;
        }
        return LIZ(aid);
    }
}
