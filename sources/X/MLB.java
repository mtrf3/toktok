package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLB extends AbstractC65781Prl implements InterfaceC88472Yns<ML5, C76800UCe> {
    public static final MLB LJLIL = new MLB();

    public MLB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ML5 ml5) {
        ML5 withMeta = ml5;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LJI = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}