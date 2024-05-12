package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SwipeUpVideoMethod extends BaseBridgeMethod {
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
    public SwipeUpVideoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "swipeUpVideo";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == 0) goto L8;
     */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r5, X.InterfaceC37146Ehy r6) {
        /*
            r4 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.F3T r1 = r4.contextProviderFactory
            java.lang.Class<X.NtS> r0 = X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class
            X.F2Y r0 = r1.LIZ(r0)
            r3 = 0
            if (r0 == 0) goto L45
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 == 0) goto L45
            int r2 = r0.hashCode()
            if (r2 != 0) goto L36
        L21:
            X.F3T r1 = r4.contextProviderFactory
            java.lang.Class<X.Njp> r0 = X.C60193Njp.class
            X.F2Y r0 = r1.LIZ(r0)
            if (r0 == 0) goto L36
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 == 0) goto L35
            int r3 = r0.hashCode()
        L35:
            r2 = r3
        L36:
            X.Ful r1 = new X.Ful
            java.lang.String r0 = "refer"
            java.lang.String r0 = r5.optString(r0)
            r1.<init>(r2, r0)
            X.C2U8.LIZ(r1)
            return
        L45:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.SwipeUpVideoMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
