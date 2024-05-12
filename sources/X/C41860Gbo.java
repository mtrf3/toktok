package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Gbo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41860Gbo {
    public static final int LIZIZ = Q7K.LIZIZ("studio_publish_log_max_length", LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    public final InterfaceC41862Gbq LIZ;

    public C41860Gbo() {
        this(0);
    }

    public static boolean LIZ() {
        C60903NvH.LJIIJJI().LJJIIJ();
        return false;
    }

    public C41860Gbo(InterfaceC41862Gbq logger) {
        o.LJIIIZ(logger, "logger");
        this.LIZ = logger;
    }

    public /* synthetic */ C41860Gbo(int i) {
        this(new C78996UzQ());
    }

    public static final void LIZJ(String stage, String message) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(message, "message");
        LIZ();
    }

    public final void LIZIZ(String stage, Throwable throwable) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(throwable, "throwable");
        if (C19N.LJ("enable_publish_online_business_log", true)) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("[stage-", stage, "][thread-");
            LIZIZ2.append(C16880lQ.LLLLIIIILLL().getName());
            LIZIZ2.append("] ");
            LIZIZ2.append(android.util.Log.getStackTraceString(throwable));
            this.LIZ.log(C40689Fy1.LLIIII(LIZIZ, X1D.LIZIZ(LIZIZ2)));
        }
    }
}
