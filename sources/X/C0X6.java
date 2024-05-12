package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.0X6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X6 implements Callable<Integer> {
    public final C0X3 LJLIL;
    public ScheduledFuture<Integer> LJLILLLLZI;

    public C0X6(C0X3 c0x3) {
        this.LJLIL = c0x3;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        C0X3 c0x3 = this.LJLIL;
        C0X5 c0x5 = c0x3.LJLJL;
        if (c0x5 != C0X5.USER_CANCEL && c0x5 != C0X5.USE_PROVIDERS) {
            c0x3.LJLJJL = true;
            C0U7.LIZJ().LIZIZ(this.LJLIL);
        }
        C09000Wy.LIZ.LIZIZ(this.LJLIL, true);
        return null;
    }
}
