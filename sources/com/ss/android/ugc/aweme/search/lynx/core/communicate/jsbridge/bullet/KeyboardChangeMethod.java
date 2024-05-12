package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C50345JpN;
import X.C84763XOl;
import X.F3T;
import X.IGF;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KeyboardChangeMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardChangeMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "KeyboardChange";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "KeyboardChange");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            Integer valueOf = Integer.valueOf(params.optInt("pop_up"));
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
                ((NextLiveData) ((KeyboardModel) ViewModelProviders.of((ActivityC45651qj) LJIIIIZZ).get(KeyboardModel.class)).LJLIL.getValue()).setValue(valueOf);
            }
            iReturn.onSuccess(new JSONObject());
        } catch (Exception e) {
            IGF.LIZ(e, "KeyboardChange");
            iReturn.LIZ(0, e.getMessage());
            C16880lQ.LLLLIIL(e);
        }
    }
}
