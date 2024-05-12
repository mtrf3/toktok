package X;

import Y.ARunnableS45S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LuA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55738LuA implements InterfaceC55741LuD {
    public final /* synthetic */ C55737Lu9 LIZ;

    public C55738LuA(C55737Lu9 c55737Lu9) {
        this.LIZ = c55737Lu9;
    }

    @Override // X.InterfaceC55741LuD
    public final void LIZ(MDU taskStatus) {
        o.LJIIIZ(taskStatus, "taskStatus");
        FAJ.LIZ("realtime_splash_ret_to_main", false);
        C2NH.LIZ.postAtFrontOfQueue(new ARunnableS45S0100000_9(this.LIZ, 189));
    }
}
