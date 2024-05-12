package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C113504cs;
import X.C2U8;
import X.C36922EeM;
import X.C40304Fro;
import X.C58655N0h;
import X.C58704N2e;
import X.C59284NOm;
import X.C59411NTj;
import X.C63081OpJ;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.N58;
import X.O5Y;
import X.O8Z;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class SendAdLogMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAdLogMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "sendAdLog";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        Aweme aweme5;
        Aweme aweme6;
        Aweme aweme7;
        Aweme aweme8;
        AwemeRawAd awemeRawAd5;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String func = params.optString("func");
        C59284NOm LIZ = C113504cs.LIZ();
        try {
            String tag = params.optString("tag");
            String label = params.optString("label");
            JSONObject optJSONObject = params.optJSONObject("extParam");
            boolean optBoolean = params.optBoolean("has_ad_info", false);
            boolean optBoolean2 = params.optBoolean("is_live", false);
            getKitContainerApi();
            params.optString("creative_id");
            params.optString("creative_id");
            if (optBoolean) {
                String creativeId = params.optString("creative_id");
                String optString = params.optString("log_extra");
                String optString2 = params.optString("group_id");
                if (TextUtils.isEmpty(creativeId)) {
                    params.optString("creative_id");
                    iReturn.LIZ(-1, "empty creativeId");
                } else {
                    o.LJIIIIZZ(tag, "tag");
                    o.LJIIIIZZ(label, "label");
                    o.LJIIIIZZ(creativeId, "creativeId");
                    C58655N0h LJ = C58704N2e.LJ(tag, label, creativeId, optString, optString2);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        o.LJIIIIZZ(keys, "extParam.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            LJ.LIZJ(optJSONObject.opt(next), next);
                        }
                    }
                    if (N58.LIZLLL.contains(label) && (LIZ == null || (((aweme6 = LIZ.LJIIL) == null || !C63081OpJ.LLIIII(aweme6)) && (((aweme7 = LIZ.LJIIL) == null || !O5Y.LJJJIL(aweme7)) && ((aweme8 = LIZ.LJIIL) == null || (awemeRawAd5 = aweme8.getAwemeRawAd()) == null || awemeRawAd5.getRollType() != 1))))) {
                        if (LIZ == null || (aweme5 = LIZ.LJIIL) == null) {
                            awemeRawAd4 = null;
                        } else {
                            awemeRawAd4 = aweme5.getAwemeRawAd();
                        }
                        AdSessionPositionHelper.LJIILL(awemeRawAd4, LJ);
                    }
                    LJ.LJI();
                    params.optString("creative_id");
                    iReturn.onSuccess(null);
                }
            } else {
                o.LJIIIIZZ(tag, "tag");
                if (tag.length() > 0) {
                    o.LJIIIIZZ(label, "label");
                    if (label.length() > 0 && optBoolean2) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            o.LJIIIIZZ(keys2, "keys()");
                            while (keys2.hasNext()) {
                                String key = keys2.next();
                                Object opt = optJSONObject.opt(key);
                                if (opt != null) {
                                    o.LJIIIIZZ(key, "key");
                                    linkedHashMap.put(key, opt);
                                }
                            }
                        }
                        C59411NTj.LIZIZ.LIZ.LJIJI(tag, label, linkedHashMap);
                    }
                }
                if (tag.length() > 0) {
                    o.LJIIIIZZ(label, "label");
                    if (label.length() > 0 && LIZ != null) {
                        C58655N0h LJ2 = C58704N2e.LJ(tag, label, String.valueOf(LIZ.LIZ), LIZ.LIZIZ, String.valueOf(LIZ.LIZJ));
                        if (optJSONObject != null) {
                            Iterator<String> keys3 = optJSONObject.keys();
                            o.LJIIIIZZ(keys3, "extParam.keys()");
                            while (keys3.hasNext()) {
                                String next2 = keys3.next();
                                LJ2.LIZJ(optJSONObject.opt(next2), next2);
                            }
                        }
                        if (N58.LIZLLL.contains(label) && (((aweme2 = LIZ.LJIIL) == null || !C63081OpJ.LLIIII(aweme2)) && (((aweme3 = LIZ.LJIIL) == null || !O5Y.LJJJIL(aweme3)) && ((aweme4 = LIZ.LJIIL) == null || (awemeRawAd3 = aweme4.getAwemeRawAd()) == null || awemeRawAd3.getRollType() != 1)))) {
                            Aweme aweme9 = LIZ.LJIIL;
                            if (aweme9 != null) {
                                awemeRawAd2 = aweme9.getAwemeRawAd();
                            } else {
                                awemeRawAd2 = null;
                            }
                            AdSessionPositionHelper.LJIILL(awemeRawAd2, LJ2);
                        }
                        LJ2.LJI();
                        if (o.LJ(tag, "draw_ad") && o.LJ(label, "click") && (aweme = LIZ.LJIIL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                            Long creativeId2 = awemeRawAd.getCreativeId();
                            String logExtra = awemeRawAd.getLogExtra();
                            new AqS192S0100000_10(LIZ, 28);
                            O8Z.LIZ("click", clickTrackUrlList, creativeId2, logExtra);
                        }
                        params.optString("creative_id");
                        iReturn.onSuccess(null);
                    }
                }
                params.optString("creative_id");
                iReturn.LIZ(-1, "empty tag or label");
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            params.optString("creative_id");
            iReturn.LIZ(-1, "unknown error");
        }
        o.LJIIIIZZ(func, "func");
        C2U8.LIZ(new C40304Fro(null, func, null, params));
    }
}
