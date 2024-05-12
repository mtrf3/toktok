package X;

/* renamed from: X.Pbl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64789Pbl {
    public static volatile C64789Pbl LIZ;

    public static C64789Pbl LIZ() {
        if (LIZ == null) {
            synchronized (C64789Pbl.class) {
                if (LIZ == null) {
                    LIZ = new C64789Pbl();
                }
            }
        }
        return LIZ;
    }
}
