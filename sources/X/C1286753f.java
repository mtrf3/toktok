package X;

import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.53f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286753f extends AbstractC65781Prl implements InterfaceC88472Yns<TextView, C76800UCe> {
    public static final C1286753f LJLIL = new C1286753f();

    public C1286753f() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(TextView textView) {
        TextView it = textView;
        o.LJIIIZ(it, "it");
        if (it instanceof TuxTextView) {
            ((TuxTextView) it).setTuxFont(72);
        }
        return C76800UCe.LIZ;
    }
}
