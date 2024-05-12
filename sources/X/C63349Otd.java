package X;

import com.bytedance.im.core.client.ReportTaskInfoConfig;

/* renamed from: X.Otd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63349Otd {
    public static final ReportTaskInfoConfig LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        ReportTaskInfoConfig reportTaskInfoConfig = new ReportTaskInfoConfig();
        reportTaskInfoConfig.enable = 1;
        reportTaskInfoConfig.timeoutDurationMs = 30000L;
        reportTaskInfoConfig.executeTooLongMs = 30000L;
        reportTaskInfoConfig.callbackTooLongMs = 5000L;
        LIZ = reportTaskInfoConfig;
        LIZIZ = C221108m2.LIZIZ(C63350Ote.LJLIL);
    }
}
