package com.ss.android.ugc.aweme.fe.method;

import X.C113504cs;
import X.C38049EwX;
import X.C58909NAb;
import X.C59284NOm;
import X.C84763XOl;
import X.EF7;
import X.InterfaceC36488ETs;
import X.NH3;
import X.NNC;
import X.NTF;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenAdLandPageLinksMethod extends BaseCommonJavaMethod {
    public OpenAdLandPageLinksMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenAdLandPageLinksMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        boolean z;
        Context baseContext;
        C59284NOm LIZ = C113504cs.LIZ();
        if (jSONObject != null) {
            str = jSONObject.optString("url");
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "empty url");
                return;
            }
            return;
        }
        if (jSONObject.optInt("isDeeplink") == 1) {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (baseContext = LJIIIIZZ.getBaseContext()) != null) {
                C58909NAb.LIZ.getClass();
                if (NH3.LIZ() != null && NTF.LJIILL(baseContext, str)) {
                    if (interfaceC36488ETs != null) {
                        interfaceC36488ETs.onSuccess(null);
                        return;
                    }
                    return;
                }
            }
            if (interfaceC36488ETs == null) {
                return;
            }
            interfaceC36488ETs.LIZJ(0, "can not open third app", null);
            return;
        }
        String title = jSONObject.optString("title");
        int optInt = jSONObject.optInt("landingStyle", 0);
        int optInt2 = jSONObject.optInt("landingAccessStyle", 0);
        int optInt3 = jSONObject.optInt("landingExitStyle", 0);
        String optString = jSONObject.optString("refer", "");
        try {
            Context LIZIZ = EF7.LIZIZ();
            o.LJIIIIZZ(title, "title");
            z2 = NNC.LIZ(LIZIZ, LIZIZ(str, title, optInt, optInt2, optInt3, LIZ, optString)).LIZ();
        } catch (Throwable unused) {
        }
        if (z2) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.onSuccess(null);
            }
        } else {
            if (interfaceC36488ETs == null) {
                return;
            }
            interfaceC36488ETs.LIZ(-1, "can not handle url");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0349, code lost:
    
        if (r1 != null) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.NNR LIZIZ(java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, X.C59284NOm r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.OpenAdLandPageLinksMethod.LIZIZ(java.lang.String, java.lang.String, int, int, int, X.NOm, java.lang.String):X.NNR");
    }
}
