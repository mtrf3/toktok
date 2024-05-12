package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NlU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60296NlU {
    public final C60292NlQ LIZ;
    public final List<InterfaceC60298NlW> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C60296NlU(C60292NlQ kitInstance, List<? extends InterfaceC60298NlW> delegates) {
        o.LJIIJ(kitInstance, "kitInstance");
        o.LJIIJ(delegates, "delegates");
        this.LIZ = kitInstance;
        this.LIZIZ = delegates;
    }

    public final void LIZ(Iterator<? extends InterfaceC60298NlW> it, C60301NlZ c60301NlZ, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2) {
        try {
            it.next().LIZ(this.LIZ, c60301NlZ.LJLIL, new C60300NlY(this, interfaceC88472Yns, it, c60301NlZ, interfaceC88472Yns2));
        } catch (Exception e) {
            LIZIZ(it, c60301NlZ, interfaceC88472Yns, interfaceC88472Yns2, e);
        }
    }

    public final void LIZIZ(Iterator<? extends InterfaceC60298NlW> it, C60301NlZ c60301NlZ, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2, Throwable th) {
        if (it.hasNext()) {
            LIZ(it, c60301NlZ, interfaceC88472Yns, interfaceC88472Yns2);
        } else {
            interfaceC88472Yns2.invoke(th);
        }
    }
}
