package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.91X, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C91X extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ float LJLIL = 1.0f;

    public C91X() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View it = view;
        o.LJIIIZ(it, "it");
        if (!C2302491w.LIZ() || !C91Y.LIZIZ.contains(Integer.valueOf(it.getId()))) {
            it.setAlpha(this.LJLIL);
        }
        return C76800UCe.LIZ;
    }
}
