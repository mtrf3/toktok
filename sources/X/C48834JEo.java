package X;

import android.hardware.display.DisplayManager;
import kotlin.jvm.internal.o;

/* renamed from: X.JEo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48834JEo extends AbstractC65781Prl implements InterfaceC65784Pro<DisplayManager> {
    public static final C48834JEo INSTANCE = new C48834JEo();

    public C48834JEo() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final DisplayManager invoke() {
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "display");
            o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            return (DisplayManager) LLILL;
        } catch (Throwable unused) {
            return null;
        }
    }
}
