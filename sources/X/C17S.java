package X;

import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.17S, reason: invalid class name */
/* loaded from: classes.dex */
public class C17S extends C00K {
    public final Choreographer LIZIZ;
    public final C00L LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.00L] */
    public C17S(C00I c00i) {
        super(c00i);
        this.LIZIZ = C16880lQ.LLIIIJ();
        this.LIZJ = new Choreographer.FrameCallback() { // from class: X.00L
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C00I c00i2 = C17S.this.LIZ;
                c00i2.LIZ.LJ = SystemClock.uptimeMillis();
                C00M c00m = c00i2.LIZ;
                long j2 = c00m.LJ;
                long uptimeMillis = SystemClock.uptimeMillis();
                for (int i = 0; i < c00m.LIZIZ.size(); i++) {
                    C00J c00j = (C00J) ListProtector.get(c00m.LIZIZ, i);
                    if (c00j != null) {
                        Long orDefault = c00m.LIZ.getOrDefault(c00j, null);
                        if (orDefault != null) {
                            if (orDefault.longValue() < uptimeMillis) {
                                c00m.LIZ.remove(c00j);
                            }
                        }
                        c00j.LIZ(j2);
                    }
                }
                if (c00m.LJFF) {
                    int size = c00m.LIZIZ.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else if (ListProtector.get(c00m.LIZIZ, size) == null) {
                            ListProtector.remove(c00m.LIZIZ, size);
                        }
                    }
                    c00m.LJFF = false;
                }
                if (c00i2.LIZ.LIZIZ.size() > 0) {
                    C00M c00m2 = c00i2.LIZ;
                    if (c00m2.LIZLLL == null) {
                        c00m2.LIZLLL = new C17S(c00m2.LIZJ);
                    }
                    C17S c17s = c00m2.LIZLLL;
                    c17s.LIZIZ.postFrameCallback(c17s.LIZJ);
                }
            }
        };
    }
}
