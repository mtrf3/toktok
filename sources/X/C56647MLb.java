package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.MLb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56647MLb extends AbstractC65781Prl implements InterfaceC88472Yns<C57009MYz, C76800UCe> {
    public static final C56647MLb LJLIL = new C56647MLb();

    public C56647MLb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57009MYz c57009MYz) {
        C57009MYz withMeta = c57009MYz;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LIZIZ = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}
