package com.ss.android.ugc.aweme.fe.method;

import X.C2U8;
import X.C38049EwX;
import X.C39359FcZ;
import X.C40101FoX;
import X.C40261Fr7;
import X.C40263Fr9;
import X.C40264FrA;
import X.C75252xN;
import X.InterfaceC36488ETs;
import X.InterfaceC40159FpT;
import X.InterfaceC40262Fr8;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CloseMethod extends BaseCommonJavaMethod {
    public CloseMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CloseMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        int i;
        WebView webView;
        WebView webView2;
        if (this.LJLILLLLZI != null) {
            int i2 = 0;
            if (jSONObject != null) {
                String id = jSONObject.optString("reactId");
                SparkContext.Companion.getClass();
                InterfaceC40159FpT LIZ = C39359FcZ.LIZ(id);
                if (LIZ != null) {
                    LIZ.close();
                    o.LJIIIIZZ(id, "id");
                    String str = C75252xN.LIZJ(id).get("__spark_session_id");
                    if (str != null) {
                        C40101FoX.LIZIZ(str);
                        return;
                    }
                    return;
                }
                if (id != null && id.length() != 0 && id != null) {
                    C2U8.LIZ(new C40264FrA(id));
                    o.LJIIIIZZ(id, "id");
                    String str2 = C75252xN.LIZJ(id).get("__spark_session_id");
                    if (str2 != null) {
                        C40101FoX.LIZIZ(str2);
                        return;
                    }
                    return;
                }
            }
            if (this.mContextRef != null) {
                Context actContext = getActContext();
                if (actContext instanceof Activity) {
                    Activity activity = (Activity) actContext;
                    if (!activity.isFinishing()) {
                        if (actContext instanceof InterfaceC40262Fr8) {
                            C38049EwX c38049EwX = this.LJLILLLLZI;
                            if (c38049EwX != null && (webView2 = c38049EwX.LIZ) != null) {
                                i = webView2.hashCode();
                            } else {
                                i = 0;
                            }
                            C2U8.LIZ(new C40263Fr9(i));
                            C38049EwX c38049EwX2 = this.LJLILLLLZI;
                            if (c38049EwX2 != null && (webView = c38049EwX2.LIZ) != null) {
                                i2 = webView.hashCode();
                            }
                            C2U8.LIZ(new C40261Fr7(i2));
                            return;
                        }
                        activity.getWindow().getDecorView().setTag(R.id.bfk, Boolean.TRUE);
                        activity.finish();
                    }
                }
            }
        }
    }
}
