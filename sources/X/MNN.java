package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MNN extends AbstractC65781Prl implements InterfaceC88472Yns<C57009MYz, C76800UCe> {
    public static final MNN LJLIL = new MNN();

    public MNN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57009MYz c57009MYz) {
        C57009MYz withMeta = c57009MYz;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LIZJ = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}
