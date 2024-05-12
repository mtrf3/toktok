package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import java.util.PriorityQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Boh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29919Boh {
    public static C29919Boh LJ;
    public boolean LIZIZ;
    public InterfaceC29920Boi LIZLLL;
    public final PriorityQueue<InterfaceC29920Boi> LIZ = new PriorityQueue<>(20, C29918Bog.LJLIL);
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    public final void LIZIZ() {
        if (!this.LIZIZ && !this.LIZ.isEmpty()) {
            InterfaceC29920Boi task = this.LIZ.poll();
            this.LIZLLL = task;
            this.LIZIZ = true;
            o.LJIIIIZZ(task, "task");
            this.LIZJ.postDelayed(new ARunnableS41S0100000_5(task, 234), 1000L);
        }
    }

    public final void LIZ(AbstractC29877Bo1 abstractC29877Bo1) {
        if (this.LIZ.contains(abstractC29877Bo1) || o.LJ(this.LIZLLL, abstractC29877Bo1)) {
            return;
        }
        this.LIZ.offer(abstractC29877Bo1);
        LIZIZ();
    }
}
