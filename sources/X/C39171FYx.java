package X;

import Y.ARunnableS30S0200000_11;
import java.util.Collections;
import java.util.List;

/* renamed from: X.FYx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39171FYx {
    public static final List<String> LIZ = Collections.singletonList("OldAppLogDataMigrator");
    public static volatile int LIZIZ = 1000;
    public static volatile boolean LIZJ = false;
    public static volatile boolean LIZLLL = false;

    public static void LIZ(QI3 qi3, C66758QHy c66758QHy) {
        if (!LIZJ || !qi3.LJJIIJZLJL) {
            return;
        }
        qi3.LJJIZ.LJIIIZ(0, LIZ, "Start to migrate events...", new Object[0]);
        C39025FTh.LJFF.LIZIZ(new Object[0]).submit(new ARunnableS30S0200000_11(c66758QHy, qi3, 41));
    }
}
