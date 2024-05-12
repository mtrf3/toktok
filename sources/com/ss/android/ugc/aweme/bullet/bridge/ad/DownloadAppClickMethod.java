package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C2U8;
import X.C39551Fff;
import X.C58909NAb;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.NH3;
import X.NTF;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DownloadAppClickMethod extends BaseBridgeMethod {
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
    public DownloadAppClickMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "download_app_click";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        boolean z;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Context context = getContext();
        if (context == null) {
            return;
        }
        String optString = params.optString("app_id");
        boolean z2 = true;
        if (optString == null || optString.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iReturn.LIZ(-1, "app_id is empty");
            return;
        }
        if (params.optInt("direct_download", 0) != 1) {
            z2 = false;
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() != null && NTF.LJIIJ(context, optString, z2)) {
            C2U8.LIZ(new C39551Fff());
            iReturn.onSuccess(null);
        } else {
            iReturn.LIZ(-1, "handle failed");
        }
    }
}
