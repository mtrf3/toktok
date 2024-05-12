package X;

/* renamed from: X.VEr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79413VEr {
    public static <T> T LIZ(String str, InterfaceC79414VEs<T> interfaceC79414VEs) {
        long currentTimeMillis = System.currentTimeMillis();
        T execute = interfaceC79414VEs.execute();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 10) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("time cost too mush! ");
            LIZ.append(str);
            LIZ.append(", time:");
            LIZ.append(currentTimeMillis2);
            X1D.LIZIZ(LIZ);
        }
        return execute;
    }
}
