package X;

import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.8m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221118m3 {
    public static final EnumC221088m0 LIZ;

    static {
        EnumC221088m0 enumC221088m0;
        int i = Build.VERSION.SDK_INT;
        if (i != 31 && i != 32) {
            enumC221088m0 = EnumC221088m0.PUBLICATION;
        } else {
            enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        }
        LIZ = enumC221088m0;
    }

    public static final <T> C5H3<T> LIZ(InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(initializer, "initializer");
        return C221108m2.LIZ(LIZ, initializer);
    }
}
