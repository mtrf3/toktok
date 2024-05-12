package com.ss.android.ugc.aweme.account.util;

import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TimeoutHandler extends SafeHandler {
    @Override // com.ss.android.ugc.aweme.account.base.SafeHandler, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.account.base.SafeHandler
    public final void destroy() {
        super.destroy();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 2) {
            destroy();
        } else {
            if (i != 1) {
                return;
            }
            destroy();
        }
    }
}
