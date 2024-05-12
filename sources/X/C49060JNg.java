package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JNg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49060JNg extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup.LayoutParams, C76800UCe> {
    public static final C49060JNg LJLIL = new C49060JNg();

    public C49060JNg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ViewGroup.LayoutParams layoutParams) {
        C018905p c018905p;
        ViewGroup.LayoutParams updateLayoutParams = layoutParams;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        if (updateLayoutParams instanceof C018905p) {
            c018905p = (C018905p) updateLayoutParams;
            if (c018905p != null) {
                c018905p.bottomToTop = R.id.n5u;
            }
        } else {
            c018905p = null;
        }
        C49072JNs.LIZ.getClass();
        if (((Number) C49072JNs.LIZIZ.getValue()).intValue() == 2) {
            if (c018905p != null) {
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = (int) C78847Ux1.LJJIFFI(6);
            }
        } else if (c018905p != null) {
            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = (int) C78847Ux1.LJJIFFI(1);
        }
        return C76800UCe.LIZ;
    }
}
