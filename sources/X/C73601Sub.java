package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sub, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73601Sub<T> implements InterfaceC73592SuS {
    public static final C73601Sub<T> LJLIL = new C73601Sub<>();

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        Integer it = (Integer) obj;
        o.LJIIIZ(it, "it");
        if (it.intValue() == 1) {
            return true;
        }
        return false;
    }
}
