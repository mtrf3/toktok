package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9rM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249889rM extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C249889rM LJLIL = new C249889rM();

    public C249889rM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Iterator it = ((ArrayList) C249849rI.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC250059rd) it.next()).LJIIZILJ();
        }
        C249849rI.LIZIZ();
        return C76800UCe.LIZ;
    }
}
