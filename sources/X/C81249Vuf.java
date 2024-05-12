package X;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.Vuf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81249Vuf {
    public static final C81249Vuf LIZIZ = new C81249Vuf();
    public static boolean LIZJ = true;
    public final Queue<EnumC81251Vuh> LIZ = new ArrayBlockingQueue(20);

    public final String toString() {
        return this.LIZ.toString();
    }

    public final void LIZ(EnumC81251Vuh enumC81251Vuh) {
        if (!LIZJ) {
            return;
        }
        if (((ArrayBlockingQueue) this.LIZ).size() + 1 > 20) {
            ((ArrayBlockingQueue) this.LIZ).poll();
        }
        ((ArrayBlockingQueue) this.LIZ).add(enumC81251Vuh);
    }
}
