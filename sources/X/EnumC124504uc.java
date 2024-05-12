package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC124504uc {
    UNINITIALIZED,
    IDLE,
    INITIALIZED,
    FADEOUT_ENDED,
    LOOP_PAUSED,
    RUNNING;

    public static EnumC124504uc valueOf(String str) {
        return (EnumC124504uc) V0N.LJJJ(EnumC124504uc.class, str);
    }

    public final boolean isAtLeast(EnumC124504uc state) {
        o.LJIIIZ(state, "state");
        if (compareTo(state) >= 0) {
            return true;
        }
        return false;
    }
}
