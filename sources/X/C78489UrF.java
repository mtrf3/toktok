package X;

import java.util.HashMap;

/* renamed from: X.UrF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78489UrF {
    public static C78489UrF LIZIZ;
    public final HashMap<String, C78488UrE> LIZ = new HashMap<>();

    public static C78489UrF LIZ() {
        if (LIZIZ == null) {
            synchronized (C78489UrF.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C78489UrF();
                }
            }
        }
        return LIZIZ;
    }
}
