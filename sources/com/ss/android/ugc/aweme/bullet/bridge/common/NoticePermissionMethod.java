package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C16880lQ;
import X.C40322Fs6;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.V1B;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class NoticePermissionMethod extends BaseBridgeMethod {
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
    public NoticePermissionMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "noticePermission";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Activity activity;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Context context = getContext();
        if (context == null || !(context instanceof Activity) || (activity = (Activity) context) == null || !V1B.LJJZZI(activity, true)) {
            return;
        }
        boolean optBoolean = params.optBoolean("toOpen");
        boolean LIZJ = C40322Fs6.LIZJ(context);
        if (!LIZJ && optBoolean) {
            try {
                C40322Fs6.LIZLLL(context);
            } catch (Exception unused) {
                C16880lQ.LIZJ(context, new Intent("android.settings.SETTINGS"));
            }
        }
        if (LIZJ) {
            iReturn.onSuccess("");
        } else {
            iReturn.LIZ(0, "");
        }
    }
}
