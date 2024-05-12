package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.MaE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57050MaE extends AbstractC65781Prl implements InterfaceC88472Yns<C57051MaF, C76800UCe> {
    public static final C57050MaE LJLIL = new C57050MaE();

    public C57050MaE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57051MaF c57051MaF) {
        C57051MaF withMeta = c57051MaF;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LJI = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}
