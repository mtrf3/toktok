package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Wis, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83066Wis implements InterfaceC84524XFg {
    @Override // X.InterfaceC84524XFg
    public final void ensureNotReachHere(Throwable th) {
        C60903NvH.LJIIJJI().LJJIIZI().LJIIIZ("vesdk", th);
    }

    @Override // X.P84
    public final void monitorLog(String logType, JSONObject logExtra) {
        o.LJIIIZ(logType, "logType");
        o.LJIIIZ(logExtra, "logExtra");
        C43882HKc.LIZIZ(logType, logExtra);
    }
}
