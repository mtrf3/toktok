package X;

import Y.AfS61S0100000_9;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class MXT implements InterfaceC56825MRx {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC56825MRx
    public final void LIZIZ(C56890MUk c56890MUk) {
    }

    @Override // X.InterfaceC56825MRx
    public final void LIZ(C56890MUk c56890MUk) {
        String str;
        String optString;
        String str2;
        String str3;
        GeneralTemplateNotice generalTemplateNotice = c56890MUk.LIZ.templateNotice;
        if (generalTemplateNotice == null || (str = generalTemplateNotice.messageExtra) == null || str.length() == 0 || (optString = new JSONObject(str).optString("ad_extra_data")) == null || optString.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject(optString);
        String optString2 = jSONObject.optString("creative_id");
        if (optString2 == null) {
            optString2 = CardStruct.IStatusCode.DEFAULT;
        }
        int optInt = jSONObject.optInt("cost_type");
        if (optInt == 1 && c56890MUk.LJFF) {
            str2 = "show";
        } else {
            str2 = "othershow";
            if (optInt == 3) {
                str2 = "ad_message_show";
            }
        }
        String optString3 = jSONObject.optString("log_extra");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "adExtraDataJson.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            o.LJIIIIZZ(key, "key");
            Object obj = jSONObject.get(key);
            o.LJIIIIZZ(obj, "adExtraDataJson[key]");
            hashMap.put(key, obj);
        }
        hashMap.put("show_message_order", Integer.valueOf(c56890MUk.LIZIZ));
        if (c56890MUk.LJFF) {
            str3 = "secondpage_message";
        } else {
            str3 = "preview_message";
        }
        N0B LIZ2 = MXV.LIZ("message_ad", str2, optString2, optString3, null);
        LIZ2.LIZJ(str3);
        LIZ2.LIZ(hashMap);
        LIZ2.LJ();
    }

    @Override // X.InterfaceC56825MRx
    public final boolean LIZJ(C56889MUj c56889MUj) {
        String optString;
        String str;
        long j;
        C86393XvR LJJIJIL;
        Object LIZ2;
        String str2 = c56889MUj.LIZ.messageExtra;
        if (str2 == null || str2.length() == 0 || (optString = new JSONObject(str2).optString("ad_extra_data")) == null || optString.length() == 0) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(optString);
        String str3 = c56889MUj.LIZ.schemaUrl;
        String optString2 = jSONObject.optString("creative_id");
        if (optString2 == null) {
            optString2 = CardStruct.IStatusCode.DEFAULT;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "adExtraDataJson.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            o.LJIIIIZZ(key, "key");
            Object obj = jSONObject.get(key);
            o.LJIIIIZZ(obj, "adExtraDataJson[key]");
            hashMap.put(key, obj);
        }
        hashMap.put("show_message_order", Integer.valueOf(c56889MUj.LJ));
        String optString3 = jSONObject.optString("log_extra");
        int optInt = jSONObject.optInt("cost_type");
        String optString4 = jSONObject.optString("sticker_type");
        Object obj2 = null;
        String str4 = "ad_message_click";
        String str5 = "otherclick";
        if (!c56889MUj.LJIIIIZZ) {
            if (optInt != 3) {
                str4 = "otherclick";
            }
            N0B LIZ3 = MXV.LIZ("message_ad", str4, optString2, optString3, null);
            LIZ3.LIZJ("preview_message");
            LIZ3.LIZ(hashMap);
            LIZ3.LJ();
            return false;
        }
        int i = MWJ.LIZ[c56889MUj.LIZLLL.ordinal()];
        if (i == 1) {
            str = "secondpage_message_avatar";
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    str = "secondpage_message_root";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str = "secondpage_message_right";
            }
        } else {
            View view = c56889MUj.LIZIZ;
            if (view != null && view.getId() == R.id.h5f) {
                str = "secondpage_message_title";
            } else {
                str = "secondpage_message_middle";
            }
        }
        if (optInt == 1) {
            if (!o.LJ(str, "secondpage_message_avatar")) {
                str5 = "click";
            }
        } else if (optInt == 3) {
            str5 = "ad_message_click";
        }
        if (c56889MUj.LIZIZ != null && o.LJ(optString4, "countdown_reminder_game")) {
            try {
                LIZ2 = UriProtector.parse(UriProtector.getQueryParameter(UriProtector.parse(str3), "url"));
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (!C3C5.m12isFailureimpl(LIZ2)) {
                obj2 = LIZ2;
            }
            android.net.Uri uri = (android.net.Uri) obj2;
            if (uri != null) {
                ICrossPlatformLegacyService LJIJ = CrossPlatformLegacyServiceImpl.LJIJ();
                if (LJIJ.LJIIZILJ(uri) && LJIJ.LJIILJJIL(c56889MUj.LIZIZ.getContext(), uri)) {
                    MXU.LIZ(str5, optString2, optString3, str, hashMap);
                    return true;
                }
            }
        }
        if (str3 != null && str3.length() != 0) {
            android.net.Uri parse = UriProtector.parse(str3);
            if (o.LJ("live", UriProtector.getQueryParameter(parse, "notice_type"))) {
                String queryParameter = UriProtector.getQueryParameter(parse, "uid");
                String queryParameter2 = UriProtector.getQueryParameter(parse, "sec_uid");
                if (queryParameter != null) {
                    C56961MXd c56961MXd = new C56961MXd(queryParameter, queryParameter2, str5, optString2, optString3, str, hashMap);
                    AfS61S0100000_9 afS61S0100000_9 = new AfS61S0100000_9(c56961MXd, 89);
                    AfS61S0100000_9 afS61S0100000_92 = new AfS61S0100000_9(c56961MXd, 90);
                    try {
                        j = CastLongProtector.parseLong(queryParameter);
                    } catch (Exception unused) {
                        j = 0;
                    }
                    ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                    if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
                        LJJIJIL.LJZL(j, queryParameter2).LJJJLIIL(afS61S0100000_9, afS61S0100000_92);
                    }
                    return false;
                }
            }
        }
        MXU.LIZ(str5, optString2, optString3, str, hashMap);
        return false;
    }
}
