package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.2NC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NC extends AbstractC65781Prl implements InterfaceC88472Yns<View, Boolean> {
    public static final C2NC LJLIL = new C2NC();

    public C2NC() {
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