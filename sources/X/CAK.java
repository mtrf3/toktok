package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CAK<T> implements InterfaceC73592SuS {
    public static final CAK<T> LJLIL = new CAK<>();

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        C29383Bg3 userEvent = (C29383Bg3) obj;
        o.LJIIIZ(userEvent, "userEvent");
        if (userEvent.LIZ == EnumC05180Ig.Login) {
            return true;
        }
        return false;
    }
}
