package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6DG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DG extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public static final C6DG LJLIL = new C6DG();

    public C6DG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View it = view;
        o.LJIIIZ(it, "it");
        C139355dT c139355dT = C6DF.LIZ;
        if (!c139355dT.LIZ.getBoolean("read_text_guide_shown", false)) {
            c139355dT.LIZ.storeBoolean("read_text_guide_shown", true);
            C6DF.LIZIZ(it);
        }
        return C76800UCe.LIZ;
    }
}
