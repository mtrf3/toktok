package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C60996Nwm;
import X.C61410O8g;
import X.C78983UzD;
import X.C84763XOl;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.KL2;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class IBEGetViewSizeMethod extends BaseBridgeMethod {
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
    public IBEGetViewSizeMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "IBEGetViewSize";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = getContext();
        }
        if (LJIIIIZZ == null) {
            C78983UzD.LJIILJJIL();
            iReturn.LIZJ(0, "", new JSONObject());
            return;
        }
        int LJIILL = KL2.LJIILL(LJIIIIZZ, C60996Nwm.LJIIIIZZ(LJIIIIZZ));
        int LJIILL2 = KL2.LJIILL(LJIIIIZZ, (C60996Nwm.LJ(LJIIIIZZ) - KL2.LIZJ(LJIIIIZZ, 58.0f)) - C61410O8g.LIZIZ(LJIIIIZZ));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", LJIILL);
        jSONObject.put("height", LJIILL2);
        iReturn.LIZJ(1, "", jSONObject.put("scale", Float.valueOf(LJIIIIZZ.getResources().getDisplayMetrics().density)));
    }
}
