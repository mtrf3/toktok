package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37651dp implements InterfaceC17120lo {
    public static long LIZ;
    public static int LIZIZ;

    @Override // X.InterfaceC17120lo
    public void onEvent(String eventName) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "livesdk_live_play")) {
            LIZ = System.currentTimeMillis();
            LIZIZ = 1;
        }
        if (o.LJ(eventName, "livesdk_live_duration")) {
            LIZ = 0L;
            LIZIZ = 0;
        }
    }
}
