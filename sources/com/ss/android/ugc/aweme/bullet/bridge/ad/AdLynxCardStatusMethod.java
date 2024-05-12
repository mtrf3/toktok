package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdLynxCardStatusMethod extends BaseBridgeMethod {
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
    public AdLynxCardStatusMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "adLynxCardStatus";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r3 == 0) goto L12;
     */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r6, X.InterfaceC37146Ehy r7) {
        /*
            r5 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r1 = "status"
            boolean r0 = r6.has(r1)
            if (r0 != 0) goto L19
            r1 = -1
            java.lang.String r0 = "status is empty"
            r7.LIZ(r1, r0)
            return
        L19:
            int r4 = r6.optInt(r1)
            X.F3T r1 = r5.contextProviderFactory
            java.lang.Class<X.NtS> r0 = X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class
            X.F2Y r0 = r1.LIZ(r0)
            r2 = 0
            if (r0 == 0) goto L65
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 == 0) goto L65
            int r3 = r0.hashCode()
            if (r3 != 0) goto L49
        L34:
            X.F3T r1 = r5.contextProviderFactory
            java.lang.Class<X.Njp> r0 = X.C60193Njp.class
            X.F2Y r0 = r1.LIZ(r0)
            if (r0 == 0) goto L49
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 == 0) goto L48
            int r2 = r0.hashCode()
        L48:
            r3 = r2
        L49:
            java.lang.String r0 = "scene"
            java.lang.String r2 = r6.optString(r0)
            java.lang.String r0 = "containerKey"
            java.lang.String r1 = r6.optString(r0)
            X.F9N r0 = new X.F9N
            r0.<init>(r4, r3, r2, r1)
            X.C2U8.LIZ(r0)
            r2 = 1
            java.lang.String r1 = "post status success"
            r0 = 0
            r7.LIZJ(r2, r1, r0)
            return
        L65:
            r3 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxCardStatusMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
