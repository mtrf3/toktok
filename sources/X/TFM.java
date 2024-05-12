package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TFM<T, R> implements InterfaceC48038ItG {
    public static final TFM<T, R> LJLIL = new TFM<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        boolean z;
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        if (it.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
