package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import kotlin.jvm.internal.o;

/* renamed from: X.5N3, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5N3 {
    public HandlerThread LIZ;
    public Handler LIZIZ;
    public final Object LIZJ;
    public final C5N2 LIZLLL;

    public final Handler LIZ() {
        Handler handler;
        synchronized (this.LIZJ) {
            handler = this.LIZIZ;
            if (handler == null) {
                HandlerThread handlerThread = this.LIZ;
                if (handlerThread == null) {
                    HandlerThread handlerThread2 = new HandlerThread("nle-ve-async");
                    handlerThread2.start();
                    this.LIZIZ = new Handler(handlerThread2.getLooper());
                    this.LIZ = handlerThread2;
                } else {
                    this.LIZIZ = new Handler(handlerThread.getLooper());
                }
                handler = this.LIZIZ;
                o.LJI(handler);
            } else {
                o.LJI(handler);
            }
        }
        return handler;
    }

    public final void LIZLLL() {
        synchronized (this.LIZJ) {
            this.LIZIZ = null;
            try {
                HandlerThread handlerThread = this.LIZ;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.LIZ = null;
            } catch (Exception e) {
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("NLEVEPublic2: asyncHandlerThread quit failed ");
                    LIZ.append(e.getMessage());
                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                }
            }
        }
    }

    public C5N3(C5N2 session) {
        o.LJIIIZ(session, "session");
        this.LIZLLL = session;
        this.LIZJ = new Object();
    }
}
