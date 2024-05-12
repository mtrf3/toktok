package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C2U8;
import X.C38316F2a;
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
public final class ExpandAdLynxCardMethod extends BaseBridgeMethod {
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
    public ExpandAdLynxCardMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "expandAdLynxCard";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Object LIZIZ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (!params.has("expand")) {
            iReturn.LIZ(-1, "expand is empty");
            return;
        }
        int optInt = params.optInt("expand");
        F2Y LIZ = this.contextProviderFactory.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.class);
        int i = 0;
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            i = LIZIZ.hashCode();
        }
        C2U8.LIZ(new C38316F2a(optInt, i));
        iReturn.onSuccess(null);
    }
}
