package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.JRj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49167JRj extends AbstractC65781Prl implements InterfaceC88472Yns<JSE, Object> {
    public static final C49167JRj LJLIL = new C49167JRj();

    public C49167JRj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(JSE jse) {
        InterfaceC48908JHk interfaceC48908JHk;
        JSE it = jse;
        o.LJIIIZ(it, "it");
        WeakReference<InterfaceC48908JHk> weakReference = it.LIZIZ;
        if (weakReference != null && (interfaceC48908JHk = weakReference.get()) != null) {
            interfaceC48908JHk.contextPause();
            return C76800UCe.LIZ;
        }
        return null;
    }
}
