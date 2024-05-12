package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Ell, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37381Ell implements Runnable {
    public static final RunnableC37381Ell LJLIL = new RunnableC37381Ell();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (C37360ElQ.LIZ.compareAndSet(false, true)) {
                o.LJFF(PatternProtector.compile("<meta name=\"pia-snapshot\" content=\"(.*?)\">", 0), "java.util.regex.Pattern.compile(this, flags)");
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
