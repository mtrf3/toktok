package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1T<T, R> implements InterfaceC48038ItG {
    public static final T1T<T, R> LJLIL = new T1T<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String response = (String) obj;
        o.LJIIIZ(response, "response");
        return new T1S(response);
    }
}
