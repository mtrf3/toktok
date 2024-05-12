package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb;

import X.C37150Ei2;
import X.C78983UzD;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class SetSharedMemoryItemMethod extends BaseBridgeMethod {
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
    public SetSharedMemoryItemMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "setSharedMemoryItem";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            Iterator<String> keys = params.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                String value = params.optString(key);
                o.LJIIIIZZ(key, "key");
                o.LJIIIIZZ(value, "value");
                C37150Ei2.LIZ.put(key, value);
            }
            iReturn.LIZJ(1, null, null);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
