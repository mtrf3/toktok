package com.ss.android.ugc.aweme.web.jsbridge;

import X.C113504cs;
import X.C2U8;
import X.C36922EeM;
import X.C40304Fro;
import X.C58655N0h;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.C59284NOm;
import X.C59411NTj;
import X.InterfaceC36488ETs;
import X.O8Z;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdCommonJsMethod extends BaseCommonJavaMethod {
    public final WeakReference<Context> LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdCommonJsMethod(X.C38150EyA r3, java.lang.ref.WeakReference r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L18
            X.EwX r0 = r3.LJ
        L4:
            r2.<init>(r0)
            r2.LJLJI = r4
            java.lang.String r1 = "sendAdLog"
            if (r3 == 0) goto L17
            X.EwX r0 = r3.LJ
            if (r0 == 0) goto L14
            r0.LJI(r1, r2)
        L14:
            r3.LIZ(r1, r2)
        L17:
            return
        L18:
            r0 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod.<init>(X.EyA, java.lang.ref.WeakReference):void");
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String l;
        AwemeRawAd awemeRawAd;
        if (jSONObject == null) {
            return;
        }
        String func = jSONObject.optString("func");
        C59284NOm LIZ = C113504cs.LIZ();
        if (o.LJ(func, "sendAdLog")) {
            try {
                String tag = jSONObject.optString("tag");
                String label = jSONObject.optString("label");
                JSONObject optJSONObject = jSONObject.optJSONObject("extParam");
                boolean optBoolean = jSONObject.optBoolean("has_ad_info", false);
                boolean optBoolean2 = jSONObject.optBoolean("is_live", false);
                if (optBoolean) {
                    String creativeId = jSONObject.optString("creative_id");
                    String optString = jSONObject.optString("log_extra");
                    String optString2 = jSONObject.optString("group_id");
                    if (TextUtils.isEmpty(creativeId)) {
                        if (interfaceC36488ETs != null) {
                            interfaceC36488ETs.LIZ(-1, "empty creativeId");
                        }
                    } else {
                        C59127NIl LIZ2 = C59128NIm.LIZ();
                        LIZ2.LIZ = tag;
                        LIZ2.LIZIZ = label;
                        LIZ2.LIZJ = creativeId;
                        LIZ2.LJII(optString);
                        LIZ2.LIZLLL = optString2;
                        LIZ2.LJI(optJSONObject);
                        LIZ2.LJIIIZ(this.LJLJI.get());
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
                        if (interfaceC36488ETs != null) {
                            interfaceC36488ETs.onSuccess(null);
                        }
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
                            LIZ3.LJIIIZ(this.LJLJI.get());
                            C58655N0h LJ2 = C58704N2e.LJ(tag, label, String.valueOf(LIZ.LIZ), LIZ.LIZIZ, String.valueOf(LIZ.LIZJ));
                            if (optJSONObject != null) {
                                Iterator<String> keys3 = optJSONObject.keys();
                                o.LJIIIIZZ(keys3, "extParam.keys()");
                                while (keys3.hasNext()) {
                                    String next2 = keys3.next();
                                    LJ2.LIZJ(optJSONObject.opt(next2), next2);
                                }
                            }
                            LJ2.LJII();
                            if (o.LJ(tag, "draw_ad") && o.LJ(label, "click")) {
                                Aweme aweme = LIZ.LJIIL;
                                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                                    UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                                    Long creativeId2 = awemeRawAd.getCreativeId();
                                    String logExtra = awemeRawAd.getLogExtra();
                                    new AqS192S0100000_10(LIZ, 61);
                                    O8Z.LIZ("click", clickTrackUrlList, creativeId2, logExtra);
                                }
                                JSONObjectProtectorUtils.getString(optJSONObject, "refer");
                            }
                            if (interfaceC36488ETs != null) {
                                interfaceC36488ETs.onSuccess(null);
                            }
                        }
                    }
                    if (interfaceC36488ETs != null) {
                        interfaceC36488ETs.LIZ(-1, "empty tag or label");
                    }
                }
            } catch (Exception e) {
                C36922EeM.LIZ(e);
                if (interfaceC36488ETs != null) {
                    interfaceC36488ETs.LIZ(-1, "unknown error");
                }
            }
        }
        o.LJIIIIZZ(func, "func");
        C2U8.LIZ(new C40304Fro(null, func, null, jSONObject));
    }
}
