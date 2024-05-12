package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;

/* loaded from: classes7.dex */
public final class ClosePopUpWebPageMethod extends BaseCommonJavaMethod {
    public ClosePopUpWebPageMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ClosePopUpWebPageMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r5, X.InterfaceC36488ETs r6) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<X.F0E> r0 = r4.LJLIL
            java.lang.Object r1 = r0.get()
            X.F0E r1 = (X.F0E) r1
            r3 = 0
            if (r1 == 0) goto L62
            java.lang.Class<X.NWV> r0 = X.NWV.class
            java.lang.Object r2 = r1.LIZ(r0)
            X.NWV r2 = (X.NWV) r2
            if (r2 == 0) goto L63
            android.app.Activity r0 = r2.LJLIL
        L17:
            boolean r0 = r0 instanceof X.ActivityC45651qj
            if (r0 != 0) goto L23
            if (r6 == 0) goto L23
            r1 = -1
            java.lang.String r0 = "not fragmentActivity"
            r6.LIZ(r1, r0)
        L23:
            if (r2 == 0) goto L42
            android.app.Activity r0 = r2.LJLIL
            if (r0 == 0) goto L42
            X.1qj r1 = X.C45804HyK.LJJIFFI(r0)
            if (r1 == 0) goto L42
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NUm r0 = X.NH3.LIZ()
            if (r0 == 0) goto L3d
            X.C59391NSp.LIZ(r1)
        L3d:
            if (r6 == 0) goto L42
            r6.onSuccess(r3)
        L42:
            boolean r0 = com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt.LIZIZ()
            if (r0 == 0) goto L61
            android.app.Activity r1 = X.C84763XOl.LJIIIIZZ()
            if (r1 == 0) goto L61
            X.NH3 r0 = X.C58909NAb.LIZ
            r0.getClass()
            X.NUm r0 = X.NH3.LIZ()
            if (r0 == 0) goto L5c
            X.C59391NSp.LIZ(r1)
        L5c:
            if (r6 == 0) goto L61
            r6.onSuccess(r3)
        L61:
            return
        L62:
            r2 = r3
        L63:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.ClosePopUpWebPageMethod.handle(org.json.JSONObject, X.ETs):void");
    }
}
