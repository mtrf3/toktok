package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.2N8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2N8 extends AbstractC65781Prl implements InterfaceC88472Yns<View, Boolean> {
    public static final C2N8 LJLIL = new C2N8();

    public C2N8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(View view) {
        boolean z;
        View it = view;
        o.LJIIIZ(it, "it");
        if (it.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
