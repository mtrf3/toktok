package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C76800UCe;
import X.C78983UzD;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.NDZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class IBEDidStartInteractionMethod extends BaseBridgeMethod {
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
    public IBEDidStartInteractionMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "IBEDidStartInteraction";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        View view;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        super.handle(params, iReturn);
        F2Y LIZ = this.contextProviderFactory.LIZ(VNS.class);
        ViewParent viewParent = null;
        if (LIZ != null && (view = (View) LIZ.LIZIZ()) != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && viewParent != null) {
            NDZ.LIZIZ.LIZLLL = true;
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C78983UzD.LJIILJJIL();
    }
}
