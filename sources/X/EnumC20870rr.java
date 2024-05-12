package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC20870rr {
    UN_SET,
    ACTIVITY_CREATED,
    FRAGMENT_CREATED,
    FIRST_FRAME;

    public static EnumC20870rr valueOf(String str) {
        return (EnumC20870rr) V0N.LJJJ(EnumC20870rr.class, str);
    }

    public final boolean isAtLeast(EnumC20870rr preloadLevel) {
        o.LJIIIZ(preloadLevel, "preloadLevel");
        if (compareTo(preloadLevel) >= 0) {
            return true;
        }
        return false;
    }
}
