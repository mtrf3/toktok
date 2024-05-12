package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.DyA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC35602DyA implements Runnable {
    public final View LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C35601Dy9.LIZIZ(this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC35602DyA(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
    }
}
