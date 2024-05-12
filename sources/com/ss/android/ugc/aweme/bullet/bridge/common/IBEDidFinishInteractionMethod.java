package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C58986NDa;
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
public final class IBEDidFinishInteractionMethod extends BaseBridgeMethod {
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
    public IBEDidFinishInteractionMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "IBEDidFinishInteraction";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        View view;
        C58986NDa c58986NDa;
        View view2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        F2Y LIZ = this.contextProviderFactory.LIZ(VNS.class);
        Object obj = null;
        if (LIZ != null && (view2 = (View) LIZ.LIZIZ()) != null) {
            obj = view2.getParent();
        }
        if ((obj instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (view = (View) obj) != null) {
            NDZ.LIZIZ.LIZJ = 1;
            ViewParent parent = view.getParent();
            if ((parent instanceof C58986NDa) && (c58986NDa = (C58986NDa) parent) != null) {
                c58986NDa.setInterceptTouchEvent(true);
                c58986NDa.setEnabled(false);
                c58986NDa.setClickable(false);
            } else {
                C78983UzD.LJIILJJIL();
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C78983UzD.LJIILJJIL();
    }
}
