package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TFN<T> implements InterfaceC73592SuS {
    public static final TFN<T> LJLIL = new TFN<>();

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        if (it.length() > 0) {
            return true;
        }
        return false;
    }
}
