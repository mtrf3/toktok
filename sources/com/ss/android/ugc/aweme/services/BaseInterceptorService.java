package com.ss.android.ugc.aweme.services;

import X.C30869C9p;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class BaseInterceptorService {
    public void promptIfNeededOrToast(Context context, String errorMsg, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(errorMsg, "errorMsg");
        C30869C9p.LIZIZ(context, errorMsg);
    }
}
