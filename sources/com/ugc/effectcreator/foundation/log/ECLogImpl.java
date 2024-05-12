package com.ugc.effectcreator.foundation.log;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ECLogImpl implements ILog {
    public boolean enableLog = true;

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void d(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void e(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void i(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void logStack(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog
    public void w(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
    }

    public final boolean getEnableLog() {
        return this.enableLog;
    }

    public final void setEnableLog(boolean z) {
        this.enableLog = z;
    }
}
