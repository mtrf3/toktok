package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AAN extends HSS {
    public C188727au LJLJLJ;

    @Override // X.HSS
    public final boolean LJJIIJZLJL() {
        return true;
    }

    @Override // X.HSS
    public final String LJJIJIL() {
        return "app_page";
    }

    public final JSONObject LJJJJJ() {
        String str;
        JSONObject jSONObject = new JSONObject();
        AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
        if (anchorCommonStruct != null) {
            jSONObject.put("live_event_id", AAP.LIZ(anchorCommonStruct.getSchema()));
            if (!TextUtils.isEmpty(anchorCommonStruct.getExtra())) {
                try {
                    if (new JSONObject(anchorCommonStruct.getExtra()).optBoolean("is_paid_event", false)) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = "1";
                    }
                    jSONObject.put("is_free_event", str);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return jSONObject;
    }

    @Override // X.S1E
    public final S1E clone() {
        return new AAN();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.LIVE_EVENT.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIFFI(eventMapBuilder, LJJJJJ());
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", LJJII().getAwemeRawAd());
        LIZLLL.LIZJ("live_anchor", "refer");
        LIZLLL.LJI();
        super.LJ(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        HSS.LJJIFFI(c188727au, LJJJJJ());
        LJJJ(c188727au);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String schema;
        Long l;
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLJ = eventMapBuilder;
        Activity LJJI = LJJI();
        if (C2NU.LIZ.LIZIZ()) {
            HSS.LJJIFFI(eventMapBuilder, LJJJJJ());
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", LJJII().getAwemeRawAd());
            LIZLLL.LIZJ("live_anchor", "refer");
            LIZLLL.LJI();
            HSS.LJJIZ(this, eventMapBuilder, 6);
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                EventBus.LIZJ().LJIILJJIL(this);
                String LIZ = AAP.LIZ(schema);
                Bundle bundle = new Bundle();
                bundle.putFloat("bundle_dialog_screen_size", 0.95f);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("&live_event_enter_from=anchor&group_id=");
                String aid = LJJII().getAid();
                String str2 = "";
                if (aid == null) {
                    aid = "";
                }
                LIZ2.append(aid);
                bundle.putString("bundle_url_extra_param", X1D.LIZIZ(LIZ2));
                bundle.putString("bundle_Hybrid_Dialog_Fragment_from_label", "live_event_from_anchor_maker");
                if (LJJII().isAd() && LJJII().getAwemeRawAd() != null) {
                    C247839o3 c247839o3 = C9X3.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    AwemeRawAd awemeRawAd = LJJII().getAwemeRawAd();
                    Long l2 = null;
                    if (awemeRawAd != null) {
                        l = awemeRawAd.getCreativeId();
                    } else {
                        l = null;
                    }
                    jSONObject.put("creative_id", l);
                    AwemeRawAd awemeRawAd2 = LJJII().getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        str = awemeRawAd2.getLogExtra();
                    } else {
                        str = null;
                    }
                    jSONObject.put("log_extra", str);
                    AwemeRawAd awemeRawAd3 = LJJII().getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        l2 = awemeRawAd3.getGroupId();
                    }
                    jSONObject.put("group_id", l2);
                    c247839o3.LIZJ(jSONObject.toString(), "live_event_ad_info");
                    String string = bundle.getString("bundle_url_extra_param");
                    if (string == null) {
                        string = "";
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("&is_ads=true");
                    LIZ3.append(string);
                    bundle.putString("bundle_url_extra_param", X1D.LIZIZ(LIZ3));
                }
                String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
                C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                if (LIZ != null) {
                    str2 = LIZ;
                }
                currentUserID.toString();
                LJJIJIL.LIZJ(LJJI, str2, currentUserID, bundle, new AAM(System.currentTimeMillis()));
                return;
            }
            return;
        }
        AnonymousClass114.LIZ(LJJI, R.string.ime);
    }

    @QD3
    public final void onWebViewFinish(C25741A8j event) {
        java.util.Map LJJJLIIL;
        String str;
        o.LJIIIZ(event, "event");
        String str2 = "";
        String str3 = null;
        if (this instanceof HSD) {
            C188727au LJJIJIIJI = LJJIJIIJI();
            LJJIJIIJI.LJ(event.LJLIL, "duration");
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getSchema();
            } else {
                str = null;
            }
            String LIZ = AAP.LIZ(str);
            if (LIZ == null) {
                LIZ = "";
            }
            LJJIJIIJI.LJIIIZ("live_event_id", LIZ);
            FMX.LJIIL("multi_anchor_stay_time", LJJIJIIJI.LIZ);
        }
        C188727au LJJIJIIJI2 = LJJIJIIJI();
        C188727au c188727au = this.LJLJLJ;
        if (c188727au == null || (LJJJLIIL = c188727au.LIZ) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        LJJIJIIJI2.LJII(new HashMap(LJJJLIIL));
        LJJIJIIJI2.LJ(event.LJLIL, "duration");
        AnchorCommonStruct anchorCommonStruct2 = this.LJLJJL;
        if (anchorCommonStruct2 != null) {
            str3 = anchorCommonStruct2.getSchema();
        }
        String LIZ2 = AAP.LIZ(str3);
        if (LIZ2 != null) {
            str2 = LIZ2;
        }
        LJJIJIIJI2.LJIIIZ("live_event_id", str2);
        FMX.LJIIL("multi_anchor_stay_time", LJJIJIIJI2.LIZ);
        EventBus.LIZJ().LJIJ(this);
    }
}
