package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C16880lQ;
import X.C9X3;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class GetNativeItemMethod extends BaseBridgeMethod {
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
    public GetNativeItemMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "getNativeItem";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            String LIZIZ = C9X3.LIZ.LIZIZ(params.optString("key"), "");
            if (!TextUtils.isEmpty(LIZIZ)) {
                iReturn.onSuccess(LIZIZ);
            } else {
                iReturn.LIZ(0, "value is null");
            }
        } catch (Exception e) {
            iReturn.LIZ(0, e.getMessage());
            C16880lQ.LLLLIIL(e);
        }
    }
}
