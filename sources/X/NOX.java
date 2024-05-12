package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NOX implements NOH {
    public static final NOX LIZ = new NOX();

    public static final boolean LIZJ(AwemeRawAd awemeRawAd) {
        NativeSiteConfig nativeSiteConfig;
        if (awemeRawAd != null) {
            nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        } else {
            nativeSiteConfig = null;
        }
        if (nativeSiteConfig == null || !TextUtils.equals(nativeSiteConfig.getRenderType(), "lynx") || TextUtils.isEmpty(nativeSiteConfig.getLynxScheme())) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(Aweme aweme) {
        if (aweme != null) {
            return LIZJ(aweme.getAwemeRawAd());
        }
        return false;
    }

    public static final String LIZ(AwemeRawAd awemeRawAd, Context context, Boolean bool) {
        Object obj;
        Object obj2;
        int i;
        AutofillModel autofillModel;
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd != null) {
            PreloadData preloadData = awemeRawAd.getPreloadData();
            Object obj3 = null;
            if (preloadData != null) {
                obj = preloadData.getSiteId();
            } else {
                obj = null;
            }
            jSONObject.put("siteId", obj);
            Long adId = awemeRawAd.getAdId();
            if (adId != null) {
                obj2 = String.valueOf(adId);
            } else {
                obj2 = null;
            }
            jSONObject.put("adId", obj2);
            jSONObject.put("creativeId", awemeRawAd.getCreativeIdStr());
            jSONObject.put("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                obj3 = String.valueOf(groupId);
            }
            jSONObject.put("groupId", obj3);
            jSONObject.put("webUrl", awemeRawAd.getWebUrl());
            jSONObject.put("pageData", awemeRawAd.getNativeSiteAdInfo());
            jSONObject.put("appData", awemeRawAd.getAppData());
            jSONObject.put("isRTL", C90193gN.LIZIZ(context) ? 1 : 0);
            int i2 = 0;
            if (context != null) {
                i = C63081OpJ.LJJJJLI(context);
            } else {
                i = 0;
            }
            jSONObject.put("topSafeAreaHeight", i);
            if (C53201KuL.LIZ() && (autofillModel = awemeRawAd.getAutofillModel()) != null && autofillModel.getEnable()) {
                i2 = 1;
            }
            jSONObject.put("isAutoFillEnable", i2);
            jSONObject.put("autoFillInfo", AdAutofillService.LJIIIIZZ().LIZIZ());
            if (o.LJ(bool, Boolean.TRUE)) {
                jSONObject.put("landPageShowType", C59445NUr.LIZJ(awemeRawAd));
            }
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "dataObj.toString()");
        return jSONObject2;
    }
}
