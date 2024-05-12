package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YGn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87105YGn {
    public final C87098YGg LIZ;
    public Runnable LIZIZ;

    public void LIZ() {
    }

    public abstract void LIZIZ();

    public boolean LIZJ() {
        return false;
    }

    public void LIZLLL() {
    }

    public void LJFF() {
    }

    public void LJ() {
        Runnable runnable = this.LIZIZ;
        if (runnable != null) {
            this.LIZ.LIZ.removeCallbacks(runnable);
        }
        this.LIZIZ = null;
    }

    public AbstractC87105YGn(C87098YGg stateContext) {
        o.LJIIIZ(stateContext, "stateContext");
        this.LIZ = stateContext;
    }
}
