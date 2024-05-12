package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.EqB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37655EqB implements InterfaceC1039145z<Object> {
    public final /* synthetic */ InterfaceC88471Ynr LIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<Object> iterator() {
        InterfaceC88471Ynr block = this.LIZ;
        o.LJIIIZ(block, "block");
        C37656EqC c37656EqC = new C37656EqC();
        c37656EqC.LJLJJI = C78555UsJ.LJIILIIL(block, c37656EqC, c37656EqC);
        return c37656EqC;
    }

    public C37655EqB(InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
    }
}
