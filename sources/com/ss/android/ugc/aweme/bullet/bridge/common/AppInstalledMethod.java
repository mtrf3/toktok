package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AppInstalledMethod extends BaseBridgeMethod {
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
    public AppInstalledMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "isAppInstalled";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r2 != 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r7, X.InterfaceC37146Ehy r8) {
        /*
            r6 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "pkg_name"
            java.lang.String r5 = r7.optString(r0)
            java.lang.String r0 = "open_url"
            java.lang.String r4 = r7.optString(r0)
            X.F3T r1 = r6.contextProviderFactory
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r3 = r1.LIZJ(r0)
            android.content.Context r3 = (android.content.Context) r3
            r2 = -1
            if (r3 == 0) goto L48
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L30
            boolean r2 = X.FCD.LJFF(r3, r5)
            r0 = 1
            if (r2 == r0) goto L48
        L30:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L48
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            r1.setData(r0)
            boolean r2 = X.FCD.LJ(r3, r1)
        L48:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "installed"
            r1.put(r0, r2)
            r8.LIZIZ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
