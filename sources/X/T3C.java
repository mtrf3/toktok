package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T3C extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, OSZ<? extends T3A, ? extends T3A>> {
    public static final T3C LJLIL = new T3C();

    public T3C() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final OSZ<? extends T3A, ? extends T3A> invoke(ViewGroup viewGroup) {
        ViewGroup root = viewGroup;
        o.LJIIIZ(root, "root");
        Context context = root.getContext();
        o.LJIIIIZZ(context, "root.context");
        T3A t3a = new T3A(context);
        return new OSZ<>(t3a, t3a);
    }
}
