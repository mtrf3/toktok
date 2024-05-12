package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GetThemeMethod extends BaseBridgeMethod {
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
    public GetThemeMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "getTheme";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
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
            android.content.Context r0 = r5.getContext()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L14
        L12:
            r2 = 0
            goto L25
        L14:
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L37
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Exception -> L37
            int r0 = r0.uiMode     // Catch: java.lang.Exception -> L37
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L12
            r2 = 1
        L25:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r1.<init>()     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = "isDarkMode"
            if (r2 == 0) goto L2f
            r3 = 1
        L2f:
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L37
            r0 = 0
            r7.LIZJ(r4, r0, r1)     // Catch: java.lang.Exception -> L37
            goto L41
        L37:
            r2 = move-exception
            r1 = -1
            java.lang.String r0 = "Had trouble in getting current uiMode"
            r7.LIZ(r1, r0)
            X.C16880lQ.LLLLIIL(r2)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
