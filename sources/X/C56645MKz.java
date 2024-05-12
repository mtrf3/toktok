package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.MKz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56645MKz extends AbstractC65781Prl implements InterfaceC88472Yns<C56639MKt, C76800UCe> {
    public static final C56645MKz LJLIL = new C56645MKz();

    public C56645MKz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C56639MKt c56639MKt) {
        C56639MKt withMeta = c56639MKt;
        o.LJIIIZ(withMeta, "$this$withMeta");
        if (withMeta.LJI <= 0) {
            withMeta.LJI = SystemClock.uptimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
