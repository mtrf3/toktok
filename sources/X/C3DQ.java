package X;

import java.util.UUID;

/* renamed from: X.3DQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(String.valueOf(System.currentTimeMillis()));
        LIZ2.append("-");
        LIZ2.append(UUID.randomUUID().toString());
        return X1D.LIZIZ(LIZ2);
    }
}
