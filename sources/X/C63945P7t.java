package X;

import com.ss.android.ttve.common.TESpdLogInvoker;

/* renamed from: X.P7t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63945P7t {
    public static volatile C63945P7t LIZIZ;
    public final TESpdLogInvoker LIZ = new TESpdLogInvoker();

    public static C63945P7t LIZ() {
        if (LIZIZ == null) {
            synchronized (C63945P7t.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C63945P7t();
                }
            }
        }
        return LIZIZ;
    }
}
