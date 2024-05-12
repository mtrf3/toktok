package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83312Wmq<Param, Target> {
    public final AtomicInteger LIZ;
    public int LIZIZ;
    public final AtomicBoolean LIZJ;
    public final String LIZLLL;
    public final Param LJ;

    public abstract void LIZIZ(C83310Wmo c83310Wmo);

    public void LIZJ(C83310Wmo c83310Wmo) {
    }

    public boolean LIZLLL() {
        return false;
    }

    public final void LIZ(int i) {
        this.LIZ.set(i);
    }

    public AbstractC83312Wmq(String mTaskId, Param param) {
        o.LJIIIZ(mTaskId, "mTaskId");
        this.LIZLLL = mTaskId;
        this.LJ = param;
        this.LIZ = new AtomicInteger(-1);
        this.LIZJ = new AtomicBoolean(false);
        LIZ(0);
    }
}
