package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MBC {
    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends MBD> E LIZ(MBD mbd, InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        if (o.LJ(mbd.getKey(), key)) {
            return mbd;
        }
        return null;
    }

    public static MBA LIZIZ(MBD mbd, InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        if (o.LJ(mbd.getKey(), key)) {
            return MBB.INSTANCE;
        }
        return mbd;
    }
}
