package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.LUf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54337LUf implements Runnable {
    public static final RunnableC54337LUf LJLIL = new RunnableC54337LUf();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            ((ConcurrentHashMap) C54338LUg.LIZ).clear();
            ((CopyOnWriteArraySet) C54338LUg.LIZJ).clear();
            ((CopyOnWriteArraySet) C54338LUg.LIZLLL).clear();
            ((ConcurrentHashMap) C54338LUg.LIZIZ).clear();
        } finally {
            if (LIZ) {
            }
        }
    }
}
