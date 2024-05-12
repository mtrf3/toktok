package X;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.ak9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94633ak9 extends AbstractC65781Prl implements InterfaceC88472Yns<FrameLayout, C76800UCe> {
    public static final C94633ak9 LJLIL = new C94633ak9();

    public C94633ak9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(FrameLayout frameLayout) {
        FrameLayout receiver = frameLayout;
        o.LJIIIZ(receiver, "$receiver");
        AppCompatTextView appCompatTextView = new AppCompatTextView(receiver.getContext(), null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZIZ(receiver, -2, -2, C93742aVm.LIZIZ(2), 0, null, 17, 248));
        C94632ak8 attrBlock = C94632ak8.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, receiver);
        return C76800UCe.LIZ;
    }
}
