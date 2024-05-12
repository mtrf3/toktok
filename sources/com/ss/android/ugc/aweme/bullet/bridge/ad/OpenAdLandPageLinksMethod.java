package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OpenAdLandPageLinksMethod extends BaseBridgeMethod {
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
    public OpenAdLandPageLinksMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openAdLandPageLinks";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:55|(1:57)(1:92)|58|59|(3:83|84|(4:86|87|74|(2:76|77)(2:78|79)))|61|(1:(2:64|65)(1:(1:67)))|68|(1:70)|71|72|73|74|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r27, X.InterfaceC37146Ehy r28) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdLandPageLinksMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
