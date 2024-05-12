package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MLA extends AbstractC65781Prl implements InterfaceC88472Yns<ML5, C76800UCe> {
    public static final MLA LJLIL = new MLA();

    public MLA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ML5 ml5) {
        ML5 withMeta = ml5;
        o.LJIIIZ(withMeta, "$this$withMeta");
        if (withMeta.LIZLLL <= 0) {
            withMeta.LIZLLL = SystemClock.uptimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
