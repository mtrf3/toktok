package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ML9 extends AbstractC65781Prl implements InterfaceC88472Yns<ML5, C76800UCe> {
    public static final ML9 LJLIL = new ML9();

    public ML9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ML5 ml5) {
        ML5 withMeta = ml5;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LIZIZ = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}
