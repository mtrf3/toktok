package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.4mD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119294mD extends AbstractC65781Prl implements InterfaceC88472Yns<View, Boolean> {
    public static final C119294mD LJLIL = new C119294mD();

    public C119294mD() {
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
