package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ML8 extends AbstractC65781Prl implements InterfaceC88472Yns<ML5, C76800UCe> {
    public static final ML8 LJLIL = new ML8();

    public ML8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ML5 ml5) {
        ML5 withMeta = ml5;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LIZ = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}
