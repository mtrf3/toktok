package X;

/* renamed from: X.VEt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79415VEt {
    public static <T> T LIZ(String str, InterfaceC79416VEu<T> interfaceC79416VEu) {
        long currentTimeMillis = System.currentTimeMillis();
        T execute = interfaceC79416VEu.execute();
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
