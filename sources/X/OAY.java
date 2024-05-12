package X;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class OAY implements Executor {
    public static volatile OAY LJLILLLLZI;
    public final Executor LJLIL = C16880lQ.LLLLZLLLI(new OAZ());

    public static OAY LIZ() {
        if (LJLILLLLZI == null) {
            synchronized (OAY.class) {
                if (LJLILLLLZI == null) {
                    LJLILLLLZI = new OAY();
                }
            }
        }
        return LJLILLLLZI;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.execute(runnable);
    }
}
