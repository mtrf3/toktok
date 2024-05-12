package com.ss.android.ugc.aweme.effectcreator.services;

import X.C93561aSr;
import X.H78;
import X.X1D;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TiktokLogImpl implements ILog {
    public static final C93561aSr Companion = new C93561aSr();

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void logStack(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void d(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[CKE]::");
        LIZ.append(tag);
        H78.LIZIZ(X1D.LIZIZ(LIZ), msg);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void e(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[CKE]::");
        LIZ.append(tag);
        H78.LIZLLL(X1D.LIZIZ(LIZ), new Exception(msg));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void i(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[CKE]::");
        LIZ.append(msg);
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void w(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[CKE]::");
        LIZ.append(msg);
        H78.LJII(X1D.LIZIZ(LIZ));
    }
}
