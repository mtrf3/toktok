package X;

import java.util.LinkedList;

/* renamed from: X.DyB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35603DyB extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C35603DyB LJLIL = new C35603DyB();

    public C35603DyB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        LinkedList<RunnableC35602DyA> linkedList = C35601Dy9.LIZIZ;
        synchronized (linkedList) {
            linkedList.clear();
        }
        return C76800UCe.LIZ;
    }
}
