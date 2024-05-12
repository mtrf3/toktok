package X;

import Y.ACallableS83S0200000_6;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ng5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59961Ng5 implements IHostLogDepend {
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void onEventV3Map(String eventName, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        FMX.LJIIL(eventName, map);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void putCommonParams(java.util.Map<String, String> params, boolean z) {
        o.LJIIIZ(params, "params");
        QJY.LJI(params, z);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final C76800UCe reportJSBError(C31926Cfy c31926Cfy, java.util.Map<String, ? extends Object> params) {
        o.LJIIIZ(params, "params");
        C10K.LIZJ(new ACallableS83S0200000_6(c31926Cfy, params, 12));
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final C76800UCe reportJSBFetchError(C31926Cfy c31926Cfy, java.util.Map<String, ? extends Object> params) {
        WebView webView;
        Object LIZ;
        Integer num;
        Integer num2;
        Object LIZ2;
        String str;
        String str2;
        String str3;
        Integer num3;
        Integer num4;
        o.LJIIIZ(params, "params");
        Object obj = params.get("platform");
        int i = 0;
        int i2 = -99;
        if (o.LJ(obj, EnumC37847EtH.LYNX.name())) {
            VNS vns = (VNS) FCS.LIZIZ(c31926Cfy, VNS.class);
            if (vns != null) {
                try {
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                    VLQ vlq = new VLQ();
                    Object obj2 = params.get("url");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    vlq.LJLJI = str;
                    Object obj3 = params.get("requestErrorCode");
                    if ((obj3 instanceof Integer) && (num4 = (Integer) obj3) != null) {
                        i2 = num4.intValue();
                    }
                    vlq.LJLJJL = i2;
                    Object obj4 = params.get("requestErrorMsg");
                    if (obj4 instanceof String) {
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    vlq.LJLJJLL = str2;
                    Object obj5 = params.get("method");
                    if (obj5 instanceof String) {
                        str3 = (String) obj5;
                    } else {
                        str3 = null;
                    }
                    vlq.LJLILLLLZI = str3;
                    Object obj6 = params.get("statusCode");
                    if ((obj6 instanceof Integer) && (num3 = (Integer) obj6) != null) {
                        i = num3.intValue();
                    }
                    vlq.LJLJJI = i;
                    lynxViewMonitor.reportJsbFetchError(vns, vlq);
                    LIZ2 = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                C3C5.m6boximpl(LIZ2);
            }
        } else if (o.LJ(obj, EnumC37847EtH.WEB.name()) && (webView = (WebView) FCS.LIZIZ(c31926Cfy, WebView.class)) != null) {
            try {
                C38222EzK c38222EzK = C38222EzK.LJFF;
                new VJ7();
                Object obj7 = params.get("url");
                if (obj7 instanceof String) {
                }
                Object obj8 = params.get("requestErrorCode");
                if ((obj8 instanceof Integer) && (num2 = (Integer) obj8) != null) {
                    num2.intValue();
                }
                Object obj9 = params.get("requestErrorMsg");
                if (obj9 instanceof String) {
                }
                Object obj10 = params.get("method");
                if (obj10 instanceof String) {
                }
                Object obj11 = params.get("statusCode");
                if ((obj11 instanceof Integer) && (num = (Integer) obj11) != null) {
                    num.intValue();
                }
                c38222EzK.getClass();
                try {
                    if (c38222EzK.LJ()) {
                        c38222EzK.LJFF(webView);
                    }
                } catch (Exception unused) {
                    C70657RoD.LJIILL();
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th2) {
                LIZ = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void handleReportADLog(C31926Cfy c31926Cfy, String name, C59963Ng7 params, IReportADLogResultCallback callback, EnumC37847EtH type) {
        boolean z;
        String l;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(type, "type");
        C59284NOm LIZ = C113504cs.LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", params.LIZ);
        jSONObject.put("tag", params.LIZIZ);
        String str = params.LIZJ;
        if (str != null) {
            jSONObject.put("refer", str);
        }
        String str2 = params.LIZLLL;
        if (str2 != null) {
            jSONObject.put("group_id", str2);
        }
        String str3 = params.LJ;
        if (str3 != null) {
            jSONObject.put("creative_id", str3);
        }
        String str4 = params.LJFF;
        if (str4 != null) {
            jSONObject.put("log_extra", str4);
        }
        InterfaceC78280Uns interfaceC78280Uns = params.LJI;
        if (interfaceC78280Uns != null) {
            jSONObject.put("extParams", C78501UrR.LIZIZ(interfaceC78280Uns));
        }
        try {
            String tag = jSONObject.optString("tag");
            String label = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParams");
            if (optJSONObject != null) {
                z = optJSONObject.optBoolean("has_ad_info", false);
            } else {
                z = false;
            }
            jSONObject.optString("creative_id");
            jSONObject.optString("creative_id");
            if (z) {
                String creativeId = jSONObject.optString("creative_id");
                String optString = jSONObject.optString("log_extra");
                String optString2 = jSONObject.optString("group_id");
                if (TextUtils.isEmpty(creativeId)) {
                    jSONObject.optString("creative_id");
                    callback.onFailure(0, "empty creativeId");
                } else {
                    C59127NIl LIZ2 = C59128NIm.LIZ();
                    LIZ2.LIZ = tag;
                    LIZ2.LIZIZ = label;
                    LIZ2.LIZJ = creativeId;
                    LIZ2.LJII(optString);
                    LIZ2.LIZLLL = optString2;
                    LIZ2.LJI(optJSONObject);
                    LIZ2.LJIIIZ((Context) FCS.LIZIZ(c31926Cfy, Context.class));
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
                    LJ.LJII();
                    jSONObject.optString("creative_id");
                    callback.onSuccess(new C61335O5j(), "");
                }
            } else {
                o.LJIIIIZZ(tag, "tag");
                if (tag.length() > 0) {
                    o.LJIIIIZZ(label, "label");
                    if (label.length() > 0 && LIZ != null) {
                        C59127NIl LIZ3 = C59128NIm.LIZ();
                        LIZ3.LIZ = tag;
                        LIZ3.LIZIZ = label;
                        LIZ3.LIZLLL(Long.valueOf(LIZ.LIZ));
                        LIZ3.LJII(LIZ.LIZIZ);
                        Long valueOf = Long.valueOf(LIZ.LIZJ);
                        if (valueOf == null) {
                            l = null;
                        } else {
                            l = valueOf.toString();
                        }
                        LIZ3.LIZLLL = l;
                        LIZ3.LJI(optJSONObject);
                        LIZ3.LJIIIZ((Context) FCS.LIZIZ(c31926Cfy, Context.class));
                        C58655N0h LJ2 = C58704N2e.LJ(tag, label, String.valueOf(LIZ.LIZ), LIZ.LIZIZ, String.valueOf(LIZ.LIZJ));
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            o.LJIIIIZZ(keys2, "extParam.keys()");
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                LJ2.LIZJ(optJSONObject.opt(next2), next2);
                            }
                        }
                        LJ2.LJII();
                        if (o.LJ(tag, "draw_ad") && o.LJ(label, "click") && (aweme = LIZ.LJIIL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                            Long creativeId2 = awemeRawAd.getCreativeId();
                            String logExtra = awemeRawAd.getLogExtra();
                            new AqS192S0100000_10(LIZ, 34);
                            O8Y.LIZ("click", clickTrackUrlList, creativeId2, logExtra);
                        }
                        jSONObject.optString("creative_id");
                        callback.onSuccess(new C61335O5j(), "");
                    }
                }
                jSONObject.optString("creative_id");
                callback.onFailure(0, "empty_tag_or_label_or_adinfo");
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            jSONObject.optString("creative_id");
            callback.onFailure(0, "unknown error");
        }
        C2U8.LIZ(new C40304Fro(null, name, null, jSONObject));
    }
}
