package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C16880lQ;
import X.C36922EeM;
import X.C78857UxB;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.OHT;
import Y.ARunnableS5S1100000_4;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CopyContentMethod extends BaseBridgeMethod {
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
    public CopyContentMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "copyContent";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Context context = getContext();
        if (context == null) {
            return;
        }
        String optString = params.optString("content");
        String optString2 = params.optString("toastMsg");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0) {
            iReturn.LIZ(-1, "content or toastMsg is empty");
            return;
        }
        try {
            OHT.LIZ(optString, optString, context, C78857UxB.LJJIIJ(1476399128, "bpea-217"));
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS5S1100000_4(context, optString2, 0));
        iReturn.onSuccess(null);
    }
}
