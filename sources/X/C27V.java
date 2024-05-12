package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.27V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27V extends AbstractC65781Prl implements InterfaceC88472Yns<View, View> {
    public static final C27V LJLIL = new C27V();

    public C27V() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewParent, android.view.View] */
    @Override // X.InterfaceC88472Yns
    public final View invoke(View view) {
        View view2 = view;
        o.LJIIIZ(view2, "view");
        ?? parent = view2.getParent();
        if (parent instanceof View) {
            return parent;
        }
        return null;
    }
}
