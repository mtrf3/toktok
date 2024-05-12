package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceC12300e2;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KNLogger implements InterfaceC12300e2 {
    public static final KNLogger INSTANCE = new KNLogger();

    public void setEnabled(boolean z) {
    }

    @Override // X.InterfaceC12300e2
    public boolean getEnabled() {
        return EPLog.INSTANCE.getSEnableLog();
    }

    @Override // X.InterfaceC12300e2
    public void logDebug(String tag, String message) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(message, "message");
        EPLog.d(tag, message);
    }

    @Override // X.InterfaceC12300e2
    public void logError(String tag, String message) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(message, "message");
        EPLog.e(tag, message);
    }

    @Override // X.InterfaceC12300e2
    public void logWarn(String tag, String message) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(message, "message");
        EPLog.w(tag, message);
    }

    @Override // X.InterfaceC12300e2
    public void logError(String tag, String message, Throwable exception) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(message, "message");
        o.LJIIJ(exception, "exception");
        EPLog.e(tag, message, exception);
    }
}
