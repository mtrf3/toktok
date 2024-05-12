package X;

import com.bytedance.keva.Keva;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.GjT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42335GjT implements Runnable {
    public static final RunnableC42335GjT LJLIL = new RunnableC42335GjT();

    public static void LIZ() {
        C42336GjU c42336GjU = C42326GjK.LJFF;
        java.util.Map<String, ?> all = c42336GjU.LIZJ().getAll();
        o.LJIIIIZZ(all, "countKeva.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Keva LIZJ = c42336GjU.LIZJ();
            o.LJII(value, "null cannot be cast to non-null type kotlin.Int");
            LIZJ.storeInt(key, ((Integer) value).intValue() + 1);
        }
        C42326GjK.LJFF.LIZIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
