package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ML0 extends AbstractC65781Prl implements InterfaceC88472Yns<C56639MKt, C76800UCe> {
    public static final ML0 LJLIL = new ML0();

    public ML0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C56639MKt c56639MKt) {
        C56639MKt withMeta = c56639MKt;
        o.LJIIIZ(withMeta, "$this$withMeta");
        if (withMeta.LJIIIIZZ <= 0) {
            withMeta.LJIIIIZZ = SystemClock.uptimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
