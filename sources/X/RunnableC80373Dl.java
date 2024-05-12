package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC80373Dl implements Runnable, Comparable<RunnableC80373Dl> {
    public final C60692Zt LJLIL;
    public final Runnable LJLILLLLZI;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLILLLLZI.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComparableRunnable{taskInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(RunnableC80373Dl runnableC80373Dl) {
        RunnableC80373Dl runnableC80373Dl2 = runnableC80373Dl;
        if (runnableC80373Dl2 == null) {
            return 1;
        }
        return runnableC80373Dl2.LJLIL.LIZJ - this.LJLIL.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(RunnableC80373Dl.class, obj.getClass())) {
            return false;
        }
        return this.LJLIL.equals(((RunnableC80373Dl) obj).LJLIL);
    }

    public RunnableC80373Dl(C60692Zt taskInfo, Runnable runnable) {
        o.LJIIIZ(taskInfo, "taskInfo");
        o.LJIIIZ(runnable, "runnable");
        this.LJLIL = taskInfo;
        this.LJLILLLLZI = runnable;
    }
}
