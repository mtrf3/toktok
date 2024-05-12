package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.MKy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56644MKy extends AbstractC65781Prl implements InterfaceC88472Yns<C56639MKt, C76800UCe> {
    public static final C56644MKy LJLIL = new C56644MKy();

    public C56644MKy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C56639MKt c56639MKt) {
        C56639MKt withMeta = c56639MKt;
        o.LJIIIZ(withMeta, "$this$withMeta");
        if (withMeta.LJ <= 0) {
            withMeta.LJ = SystemClock.uptimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
