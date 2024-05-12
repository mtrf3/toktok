package X;

import java.util.HashMap;

/* renamed from: X.2RK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RK implements M5A {
    public static final HashMap<String, Integer> LJLIL = new HashMap<>();

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        LJLIL.clear();
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        System.currentTimeMillis();
    }
}
