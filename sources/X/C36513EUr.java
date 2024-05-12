package X;

import java.util.Random;

/* renamed from: X.EUr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36513EUr {
    public static final void LIZ(Throwable th) {
        if (C35810E3q.LJIIIIZZ() || new Random().nextFloat() < 0.005f) {
            if ("frameArray".equals(th.getMessage())) {
                C78983UzD.LJIJ(th, "frameArray");
            } else {
                C78983UzD.LJIJ(th, "DoframeController");
            }
        }
    }
}
