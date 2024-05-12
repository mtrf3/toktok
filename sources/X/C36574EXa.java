package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EXa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36574EXa extends XKW {
    @Override // X.XKW
    public final boolean isDispatchNeeded(MBA context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.XKW
    public final void dispatch(MBA context, Runnable block) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(block, "block");
        block.run();
    }
}
