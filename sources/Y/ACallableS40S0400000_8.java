package Y;

import X.C09900aA;
import X.C165256e9;
import X.C16880lQ;
import X.C2MA;
import X.C39579Fg7;
import X.C47483IkJ;
import X.C48135Iup;
import X.C48136Iuq;
import X.C48387Iyt;
import X.C50898JyI;
import X.C63081OpJ;
import X.C68322mC;
import X.C72083SQt;
import X.C76800UCe;
import X.C78847Ux1;
import X.C8HX;
import X.EnumC50899JyJ;
import X.EnumC61742ba;
import X.FMX;
import X.IDP;
import X.IPH;
import X.IZ8;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ACallableS40S0400000_8 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS40S0400000_8 aCallableS40S0400000_8) {
        JSONObject jSONObject;
        String str;
        String str2;
        IDP idp = (IDP) aCallableS40S0400000_8.l0;
        Video video = (Video) aCallableS40S0400000_8.l1;
        C2MA c2ma = (C2MA) aCallableS40S0400000_8.l2;
        IPH iph = (IPH) aCallableS40S0400000_8.l3;
        idp.getClass();
        JSONObject jSONObject2 = new JSONObject();
        try {
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject2.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject2.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject2.put("playUrl", JsonParseUtils.LIZLLL(video.getProperPlayAddr()));
            jSONObject2.put("video_duration", video.getDuration());
            C47483IkJ.LIZIZ(jSONObject2);
            if (idp.LLJLILLLLZIIL == null) {
                idp.LLJLILLLLZIIL = C39579Fg7.LJIIIZ(C39579Fg7.LJIIL());
            }
            File file = idp.LLJLILLLLZIIL;
            if (file != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(file.getPath());
                LIZ.append("/");
                C48135Iup c48135Iup = C48135Iup.LIZ;
                String bitRatedRatioUri = video.getPlayAddr().getBitRatedRatioUri();
                c48135Iup.getClass();
                LIZ.append(C48135Iup.LIZ(bitRatedRatioUri));
                str2 = new C165256e9(X1D.LIZIZ(LIZ)).toString();
            } else {
                str2 = "";
            }
            jSONObject2.put("file", str2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!IZ8.LJIIIZ()) {
            C8HX.LIZIZ("type_log_play_succuss", "play_success", jSONObject2);
            C09900aA.LJIIJJI("aweme_media_error_rate", 0, jSONObject2);
            if (VideoBitRateABManager.LJFF.LJ()) {
                str = "aweme_media_bitrated_error_rate";
            } else {
                str = "aweme_media_original_error_rate";
            }
            C09900aA.LJIIJJI(str, 0, jSONObject2);
        }
        if (C72083SQt.LJJLIIIJLLLLLLLZ(c2ma)) {
            try {
                jSONObject = new JSONObject(jSONObject2.toString());
                jSONObject.put("aweme_id", c2ma.getCurrentAweme().getAid());
                jSONObject.put("creative_id", c2ma.getCurrentAweme().getAwemeRawAd().getCreativeId());
                if (C63081OpJ.LLIIII(c2ma.getCurrentAweme())) {
                    jSONObject.put("is_topview", true);
                }
            } catch (Exception e2) {
                jSONObject = new JSONObject();
                C16880lQ.LLLLIIL(e2);
            }
            C09900aA.LJIIJJI("aweme_ad_media_play_error_rate", 0, jSONObject);
            if (C72083SQt.LJJLL(c2ma)) {
                C78847Ux1.LJJJJLI(1, 0, c2ma.getCurrentAweme());
            }
        }
        if (C72083SQt.LJJLL(c2ma) && iph != null) {
            long j = iph.LIZJ / 1000;
            if (j > 60 || j < 7) {
                C78847Ux1.LJJJJLI(4, 1, c2ma.getCurrentAweme());
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("alarm_reason", "duration_alarm");
                    if (c2ma.getCurrentAweme() != null) {
                        jSONObject3.put("group_id", c2ma.getCurrentAweme().getAid());
                    }
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                }
                MobClick obtain = MobClick.obtain();
                obtain.setEventName("ad_alarm");
                obtain.setLabelName("homepage_hot");
                obtain.setJsonObject(jSONObject3);
                FMX.onEvent(obtain);
                return null;
            }
            C78847Ux1.LJJJJLI(4, 0, c2ma.getCurrentAweme());
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$1(ACallableS40S0400000_8 aCallableS40S0400000_8) {
        String str;
        EnumC61742ba enumC61742ba;
        if (!TextUtils.isEmpty(((SearchResultParam) aCallableS40S0400000_8.l0).getKeyword())) {
            str = ((SearchResultParam) aCallableS40S0400000_8.l0).getKeyword();
        } else {
            str = (String) ((C68322mC) aCallableS40S0400000_8.l1).element;
        }
        boolean z = true;
        if (((SearchResultParam) aCallableS40S0400000_8.l0).getShouldRecordInHistory() != 1) {
            z = false;
        }
        if (!TextUtils.isEmpty(str) && z) {
            SearchServiceImpl.LLLZI().LJJLJLI((ECSearchEntranceData) aCallableS40S0400000_8.l3, (Integer) aCallableS40S0400000_8.l2).LIZJ(new SearchHistory(str, 0));
            ECSearchEntranceData eCSearchEntranceData = (ECSearchEntranceData) aCallableS40S0400000_8.l3;
            if (eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                if (LJJJJZI != null) {
                    enumC61742ba = LJJJJZI.LJJIIJ((ECSearchEntranceData) aCallableS40S0400000_8.l3);
                } else {
                    enumC61742ba = null;
                }
                if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                    SearchServiceImpl.LLLZI().LJJLJLI(null, null).LIZJ(new SearchHistory(str, 0));
                }
            } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                SearchServiceImpl.LLLZI().LJJLJLI(null, null).LIZJ(new SearchHistory(str, 0));
            }
        }
        return C76800UCe.LIZ;
    }

    public ACallableS40S0400000_8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
