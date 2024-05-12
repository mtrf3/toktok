package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.akB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94635akB extends AbstractC65781Prl implements InterfaceC88472Yns<FrameLayout, C76800UCe> {
    public static final C94635akB LJLIL = new C94635akB();

    public C94635akB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(FrameLayout frameLayout) {
        FrameLayout receiver = frameLayout;
        o.LJIIIZ(receiver, "$receiver");
        View view = new View(receiver.getContext());
        view.setLayoutParams(C93902aYM.LIZIZ(receiver, C93742aVm.LIZIZ(24), C93742aVm.LIZIZ(24), C93742aVm.LIZIZ(2), 0, Integer.valueOf(C93742aVm.LIZIZ(16)), 8388629, 216));
        C94634akA attrBlock = C94634akA.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(view);
        C93902aYM.LIZ(view, receiver);
        return C76800UCe.LIZ;
    }
}
