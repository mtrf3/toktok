package X;

import kotlin.SafePublicationLazyImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C221108m2 {
    public static final C62822Ol8 LIZIZ(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        return new C62822Ol8(initializer);
    }

    public static final <T> C5H3<T> LIZ(EnumC221088m0 mode, InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(initializer, "initializer");
        int i = C221098m1.LIZ[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C62820Ol6(initializer);
                }
                throw new C162476Zf();
            }
            return new SafePublicationLazyImpl(initializer);
        }
        return new C62822Ol8(initializer);
    }
}
