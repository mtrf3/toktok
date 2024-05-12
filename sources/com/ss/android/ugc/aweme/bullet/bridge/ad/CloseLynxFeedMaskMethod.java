package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C2U8;
import X.C40492Fuq;
import X.C59207NLn;
import X.C60193Njp;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CloseLynxFeedMaskMethod extends BaseBridgeMethod {
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
    public CloseLynxFeedMaskMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "closeLynxFeedMask";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Object LIZIZ;
        int hashCode;
        Object LIZIZ2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (C59207NLn.LIZ()) {
            F2Y LIZ = this.contextProviderFactory.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class);
            if (LIZ != null && (LIZIZ2 = LIZ.LIZIZ()) != null) {
                hashCode = LIZIZ2.hashCode();
            }
            hashCode = 0;
        } else {
            F2Y LIZ2 = this.contextProviderFactory.LIZ(C60193Njp.class);
            if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null) {
                hashCode = LIZIZ.hashCode();
            }
            hashCode = 0;
        }
        C2U8.LIZ(new C40492Fuq(hashCode));
    }
}
