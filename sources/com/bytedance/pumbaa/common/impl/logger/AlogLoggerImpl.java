package com.bytedance.pumbaa.common.impl.logger;

import X.C03880Dg;
import X.C09900aA;
import X.C39562Ffq;
import X.C39563Ffr;
import X.C65300Pk0;
import X.C66004PvM;
import X.InterfaceC39565Fft;
import X.InterfaceC39566Ffu;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.ss.android.agilelogger.ALog;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AlogLoggerImpl implements ILogger {
    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void registerLogCallback(InterfaceC39566Ffu interfaceC39566Ffu) {
        o.LJIIIZ(null, "callback");
        throw null;
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void unregisterLogCallback(InterfaceC39566Ffu interfaceC39566Ffu) {
        o.LJIIIZ(null, "callback");
        throw null;
    }

    static {
        new ConcurrentHashMap();
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final boolean isLoggerReady() {
        if (ALog.isInitSuccess() && ALog.sConfig != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void setDebugMode(boolean z) {
        ALog.setDebug(z);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void d(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(tag, message);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void e(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        ALog.e(tag, message, th);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void i(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(tag, message);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void v(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(tag, message);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void w(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        ALog.w(tag, message, th);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.ILogger
    public final void upload(long j, long j2, String scene, InterfaceC39565Fft callback) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(callback, "callback");
        ALog.syncFlush();
        C66004PvM c66004PvM = ALog.sConfig;
        o.LJIIIIZZ(c66004PvM, "ALog.sConfig");
        String str = c66004PvM.LJFF;
        long j3 = 1000;
        long j4 = j / j3;
        long j5 = j2 / j3;
        C39563Ffr c39563Ffr = C39563Ffr.LIZ;
        C39562Ffq c39562Ffq = new C39562Ffq(callback);
        if (new C03880Dg(2).LIZJ(10303, "com/bytedance/apm/ApmAgent", "activeUploadAlog", C09900aA.class, new Object[]{str, Long.valueOf(j4), Long.valueOf(j5), scene, c39563Ffr, c39562Ffq}, "void", new C65300Pk0(false, "(Ljava/lang/String;JJLjava/lang/String;Lcom/bytedance/apm/alog/IALogActiveUploadObserver;Lcom/bytedance/apm/alog/IALogActiveUploadCallback;)V", "2320237642421764676")).LIZ) {
            return;
        }
        C09900aA.LIZ(str, j4, j5, scene, c39563Ffr, c39562Ffq);
    }
}
