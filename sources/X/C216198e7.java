package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.8e7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216198e7 extends AbstractC65781Prl implements InterfaceC88472Yns<C216678et, C76800UCe> {
    public static final C216198e7 LJLIL = new C216198e7();

    public C216198e7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C216678et c216678et) {
        C216678et it = c216678et;
        o.LJIIIZ(it, "it");
        Iterator<AbstractC216018dp> it2 = it.LIZJ.LIZ.iterator();
        while (it2.hasNext()) {
            AbstractC216018dp next = it2.next();
            if (next instanceof C216028dq) {
                ((C216028dq) next).LJI = true;
            }
        }
        Iterator<AbstractC216018dp> it3 = it.LIZJ.LIZJ.iterator();
        while (it3.hasNext()) {
            AbstractC216018dp next2 = it3.next();
            if (next2 instanceof C216028dq) {
                ((C216028dq) next2).LJI = true;
            }
        }
        return C76800UCe.LIZ;
    }
}
