package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.JRk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49168JRk extends AbstractC65781Prl implements InterfaceC88472Yns<JSE, Object> {
    public static final C49168JRk LJLIL = new C49168JRk();

    public C49168JRk() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(JSE jse) {
        InterfaceC48908JHk interfaceC48908JHk;
        JSE it = jse;
        o.LJIIIZ(it, "it");
        WeakReference<InterfaceC48908JHk> weakReference = it.LIZIZ;
        if (weakReference != null && (interfaceC48908JHk = weakReference.get()) != null) {
            interfaceC48908JHk.LLLLLJLJLL();
            return C76800UCe.LIZ;
        }
        return null;
    }
}
