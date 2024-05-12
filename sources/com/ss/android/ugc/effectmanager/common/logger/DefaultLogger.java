package com.ss.android.ugc.effectmanager.common.logger;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DefaultLogger implements ILogger {
    public static final DefaultLogger INSTANCE = new DefaultLogger();

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void e(String str, Throwable th) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void d(String msg) {
        o.LJIIJ(msg, "msg");
        EPLog.INSTANCE.getSEnableLog();
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void i(String msg) {
        o.LJIIJ(msg, "msg");
        EPLog.INSTANCE.getSEnableLog();
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void w(String msg) {
        o.LJIIJ(msg, "msg");
        EPLog.INSTANCE.getSEnableLog();
    }
}
