package X;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.FMi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38844FMi {
    public static volatile C38844FMi LIZIZ;
    public final List<C38853FMr> LIZ;

    public static C38844FMi LIZ() {
        if (LIZIZ == null) {
            synchronized (C38840FMe.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C38844FMi();
                }
            }
        }
        return LIZIZ;
    }

    public C38844FMi() {
        new C38853FMr();
        this.LIZ = Collections.synchronizedList(new LinkedList());
    }
}
