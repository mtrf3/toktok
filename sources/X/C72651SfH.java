package X;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.SfH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72651SfH extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C72651SfH LJLIL = new C72651SfH();

    public C72651SfH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Queue<C72655SfL> queue = C72650SfG.LIZ;
        if (!queue.isEmpty()) {
            ((LinkedList) queue).remove();
        }
        if (!queue.isEmpty()) {
            ((C72655SfL) ((LinkedList) queue).peek()).LIZ.invoke();
        }
        return C76800UCe.LIZ;
    }
}
