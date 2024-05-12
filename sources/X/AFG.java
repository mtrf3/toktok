package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFG extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public static final AFG LJLIL = new AFG();

    public AFG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf c26231ARf) {
        C26231ARf it = c26231ARf;
        o.LJIIIZ(it, "it");
        if (it.LJI() instanceof ARH) {
            AbstractC243009gG LJI = it.LJI();
            o.LJII(LJI, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
            ((ARL) ListProtector.get(((ARH) LJI).LJFF, 0)).LIZ(AFL.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
