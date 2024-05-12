package X;

import com.bytedance.pumbaa.common.interfaces.ILogger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PwR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66071PwR implements InterfaceC37650Eq6 {
    public final ILogger LIZ;

    @Override // X.InterfaceC37650Eq6
    public final void LIZ() {
        this.LIZ.setDebugMode(true);
    }

    @Override // X.InterfaceC37650Eq6
    public final boolean isLoggerReady() {
        return this.LIZ.isLoggerReady();
    }

    public C66071PwR(ILogger iLogger) {
        this.LIZ = iLogger;
        new ConcurrentHashMap();
    }

    @Override // X.InterfaceC37650Eq6
    public final void LIZIZ(long j, long j2, C66044Pw0 c66044Pw0) {
        this.LIZ.upload(j, j2, "sky_eye_alog_scene", new C66070PwQ(c66044Pw0));
    }

    @Override // X.InterfaceC37650Eq6
    public final void d(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        this.LIZ.d(tag, message, th);
    }

    @Override // X.InterfaceC37650Eq6
    public final void e(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        this.LIZ.e(tag, message, th);
    }

    @Override // X.InterfaceC37650Eq6
    public final void i(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        this.LIZ.i(tag, message, th);
    }

    @Override // X.InterfaceC37650Eq6
    public final void v(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        this.LIZ.v(tag, message, th);
    }

    @Override // X.InterfaceC37650Eq6
    public final void w(String tag, String message, Throwable th) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        this.LIZ.w(tag, message, th);
    }
}
