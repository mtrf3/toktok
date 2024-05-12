package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VIY implements Executor {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(VIX.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 360));

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        o.LJIIIZ(command, "command");
        ((Handler) this.LJLILLLLZI.getValue()).post(command);
    }
}
