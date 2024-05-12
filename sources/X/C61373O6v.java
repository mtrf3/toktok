package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.O6v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61373O6v {
    public static volatile C61373O6v LIZIZ;
    public volatile ExecutorService LIZ;

    public static C61373O6v LIZ() {
        if (LIZIZ == null) {
            synchronized (C61373O6v.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C61373O6v();
                }
            }
        }
        return LIZIZ;
    }
}
