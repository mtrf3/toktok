package X;

import com.google.gson.Gson;

/* renamed from: X.2nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69432nz {
    public static volatile Gson LIZ;

    public static Gson LIZ() {
        if (LIZ == null) {
            synchronized (C69432nz.class) {
                if (LIZ == null) {
                    LIZ = new Gson();
                }
            }
        }
        return LIZ;
    }
}
