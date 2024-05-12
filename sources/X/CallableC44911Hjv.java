package X;

import java.util.concurrent.Callable;

/* renamed from: X.Hjv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44911Hjv<V> implements Callable {
    public static final CallableC44911Hjv<V> LJLIL = new CallableC44911Hjv<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (C85990Xow.LJIIJ()) {
            KUN LJIILLIIL = C1A7.LJIILLIIL("user_growth");
            if (LJIILLIIL.LIZ(-1, "japan_share_download_dot") != 1) {
                LJIILLIIL.LJ("japan_share_download_dot", 1);
            }
        }
        return Boolean.TRUE;
    }
}
