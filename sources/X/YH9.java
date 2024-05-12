package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YH9 {
    public final YH7 LIZ;
    public final YHC LIZIZ;
    public C73411SrX LIZJ;

    public final void LIZ() {
        C73411SrX c73411SrX = this.LIZJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LIZIZ.end();
    }

    public YH9(YH7 yh7, YHC task) {
        o.LJIIIZ(task, "task");
        this.LIZ = yh7;
        this.LIZIZ = task;
    }
}
