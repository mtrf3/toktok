package X;

import Y.ACallableS112S0100000_9;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.MaG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57052MaG extends AbstractC65781Prl implements InterfaceC88472Yns<C57051MaF, C76800UCe> {
    public static final C57052MaG LJLIL = new C57052MaG();

    public C57052MaG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57051MaF c57051MaF) {
        C57051MaF withMeta = c57051MaF;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LJIIIZ = SystemClock.uptimeMillis();
        C10K.LIZJ(new ACallableS112S0100000_9(withMeta, 33));
        C57053MaH.LIZ = null;
        return C76800UCe.LIZ;
    }
}
