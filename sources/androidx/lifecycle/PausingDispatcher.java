package androidx.lifecycle;

import X.C36636EZk;
import X.MBA;
import X.XKW;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class PausingDispatcher extends XKW {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // X.XKW
    public boolean isDispatchNeeded(MBA context) {
        o.LJIIIZ(context, "context");
        if (C36636EZk.LIZ.LJJIJIL().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }

    @Override // X.XKW
    public void dispatch(MBA context, Runnable block) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }
}
