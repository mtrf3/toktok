package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.EiV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37179EiV {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C37178EiU.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C37180EiW.LJLIL);
    public static final ExecutorService LIZJ;
    public static final ExecutorService LIZLLL;
    public static final ExecutorService LJ;
    public static final Handler LJFF;
    public static final C62822Ol8 LJI;
    public static final C37181EiX LJII;

    static {
        ExecutorService LJFF2 = C38995FSd.LJFF();
        o.LJIIIIZZ(LJFF2, "getSerialExecutor()");
        LIZJ = LJFF2;
        C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
        c38027EwB.LIZIZ = "LegoExecutor_executorRequest";
        LIZLLL = C37191Eih.LIZ(c38027EwB);
        ExecutorService LIZLLL2 = C38995FSd.LIZLLL();
        o.LJIIIIZZ(LIZLLL2, "getIOExecutor()");
        LJ = LIZLLL2;
        HandlerThread handlerThread = new HandlerThread("LegoHandler");
        LJI = C221108m2.LIZIZ(C243159gV.INSTANCE);
        LJII = new C37181EiX();
        handlerThread.start();
        LJFF = new Handler(handlerThread.getLooper());
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }

    public static Handler LIZ() {
        return (Handler) LJI.getValue();
    }

    public static ExecutorService LIZIZ(EFN requestType) {
        o.LJIIIZ(requestType, "requestType");
        if (requestType == EFN.P0) {
            return LJ;
        }
        return LIZLLL;
    }

    public static ExecutorService LIZJ(boolean z) {
        if (!z) {
            Object value = LIZ.getValue();
            o.LJIIIIZZ(value, "<get-executorWork>(...)");
            return (ExecutorService) value;
        }
        return LIZJ;
    }
}
