package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ljj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55091Ljj extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final C55091Ljj LJLIL = new C55091Ljj();

    public C55091Ljj() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        FVC it = fvc;
        o.LJIIIZ(it, "it");
        View LJIIIIZZ = LQA.LIZIZ.LJIIIIZZ(it.LIZIZ);
        if (LJIIIIZZ == null) {
            return new View(it.LIZIZ);
        }
        return LJIIIIZZ;
    }
}
