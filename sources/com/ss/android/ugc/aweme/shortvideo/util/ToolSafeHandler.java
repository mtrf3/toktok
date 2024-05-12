package com.ss.android.ugc.aweme.shortvideo.util;

import X.C16880lQ;
import X.GGE;
import Y.IDRunnableS6S0101000;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* loaded from: classes8.dex */
public class ToolSafeHandler extends SafeHandler {
    public boolean LJLILLLLZI;

    public ToolSafeHandler(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.SafeHandler, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (GGE.LIZ[event.ordinal()] != 1) {
            return;
        }
        removeCallbacksAndMessages(null);
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(9, this, 4);
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            post(iDRunnableS6S0101000);
        } else {
            iDRunnableS6S0101000.run();
        }
        this.LJLILLLLZI = true;
    }
}
