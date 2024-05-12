package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.monitor;

import X.C36018EBq;
import X.C47261Igj;
import X.EDN;
import X.EDT;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ToastResultHandler implements IResultHandler {
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final List<Class<? extends EDT>> LIZIZ() {
        return C47261Igj.LJJIJIIJI(C36018EBq.class, EDN.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.api.IResultHandler
    public final void LIZ(long j, String scene, String uri, List list) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(uri, "uri");
        String message = "ToastResultHandler: " + ((ArrayList) list).size();
        o.LJIIIZ(message, "message");
    }
}
