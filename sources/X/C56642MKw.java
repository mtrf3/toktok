package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.MKw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56642MKw extends AbstractC65781Prl implements InterfaceC88472Yns<C56639MKt, C76800UCe> {
    public static final C56642MKw LJLIL = new C56642MKw();

    public C56642MKw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C56639MKt c56639MKt) {
        C56639MKt withMeta = c56639MKt;
        o.LJIIIZ(withMeta, "$this$withMeta");
        withMeta.LIZIZ = SystemClock.uptimeMillis();
        return C76800UCe.LIZ;
    }
}
