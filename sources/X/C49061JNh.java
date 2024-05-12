package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JNh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49061JNh extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup.LayoutParams, C76800UCe> {
    public static final C49061JNh LJLIL = new C49061JNh();

    public C49061JNh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ViewGroup.LayoutParams layoutParams) {
        C018905p c018905p;
        ViewGroup.LayoutParams updateLayoutParams = layoutParams;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        if (updateLayoutParams instanceof C018905p) {
            c018905p = (C018905p) updateLayoutParams;
        } else {
            c018905p = null;
        }
        C49072JNs.LIZ.getClass();
        if (((Number) C49072JNs.LIZIZ.getValue()).intValue() == 1) {
            if (c018905p != null) {
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = (int) C78847Ux1.LJJIFFI(3);
            }
        } else if (c018905p != null) {
            c018905p.bottomToTop = R.id.n5u;
            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = (int) C78847Ux1.LJJIFFI(0);
        }
        return C76800UCe.LIZ;
    }
}
