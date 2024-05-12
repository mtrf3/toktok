package com.ss.android.ugc.aweme.ecommerce.jsb;

import X.EnumC38014Evy;
import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OpenThirdPartyAppMethodBullet extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenThirdPartyAppMethodBullet(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openThirdPartyApp";
        this.LJLILLLLZI = EnumC38014Evy.PROTECT;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
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
            java.lang.String r0 = "url"
            java.lang.String r4 = r6.optString(r0)
            java.lang.String r0 = "packageName"
            java.lang.String r2 = r6.optString(r0)
            android.content.Context r0 = X.EF7.LIZIZ()
            boolean r0 = X.C78857UxB.LJJIZ(r0, r2)
            r3 = -1
            if (r0 == 0) goto L52
            X.004 r1 = new X.004     // Catch: java.lang.Exception -> L58
            r1.<init>()     // Catch: java.lang.Exception -> L58
            X.005 r0 = r1.LIZ()     // Catch: java.lang.Exception -> L58
            android.content.Intent r0 = r0.LIZ     // Catch: java.lang.Exception -> L58
            r0.setPackage(r2)     // Catch: java.lang.Exception -> L58
            android.content.Context r2 = r5.getContext()     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L44
            X.005 r1 = r1.LIZ()     // Catch: java.lang.Exception -> L58
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.lang.Exception -> L58
            r1.LIZ(r2, r0)     // Catch: java.lang.Exception -> L58
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> L58
            if (r0 != 0) goto L49
        L44:
            java.lang.String r0 = "context is null"
            r7.LIZ(r3, r0)     // Catch: java.lang.Exception -> L58
        L49:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L58
            r0.<init>()     // Catch: java.lang.Exception -> L58
            r7.onSuccess(r0)     // Catch: java.lang.Exception -> L58
            goto L60
        L52:
            java.lang.String r0 = "app not installed"
            r7.LIZ(r3, r0)
            goto L60
        L58:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r7.LIZ(r3, r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethodBullet.handle(org.json.JSONObject, X.Ehy):void");
    }
}
