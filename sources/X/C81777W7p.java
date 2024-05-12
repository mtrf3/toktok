package X;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* renamed from: X.W7p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81777W7p extends ArrayDeque<Runnable> {
    @Override // java.util.ArrayDeque, java.util.Deque
    public final Object pop() {
        Runnable runnable = (Runnable) super.pop();
        if (runnable instanceof W80) {
            W80 w80 = (W80) runnable;
            if (w80.LJLJJLL > 0) {
                w80.LJLJL = SystemClock.elapsedRealtime() - w80.LJLJJLL;
            }
        }
        return runnable;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        Runnable runnable = (Runnable) obj;
        if (runnable instanceof W80) {
            W80 w80 = (W80) runnable;
            w80.getClass();
            w80.LJLJJLL = SystemClock.elapsedRealtime();
        }
        return super.add(runnable);
    }
}
