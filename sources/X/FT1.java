package X;

import android.os.Handler;

/* loaded from: classes7.dex */
public final class FT1 extends FT0 {
    public static FT1 LJLILLLLZI;

    public FT1() {
        super(new Handler(C16880lQ.LLJJJJ()));
    }

    public static FT1 LIZ() {
        if (LJLILLLLZI == null) {
            LJLILLLLZI = new FT1();
        }
        return LJLILLLLZI;
    }

    @Override // X.FT0, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C16880lQ.LLLLIIIILLL() == this.LJLIL.getLooper().getThread()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
