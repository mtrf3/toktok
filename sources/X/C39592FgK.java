package X;

/* renamed from: X.FgK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39592FgK {
    public static float LIZ() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long freeMemory = j - Runtime.getRuntime().freeMemory();
        float f = ((float) freeMemory) / ((float) maxMemory);
        StringBuilder LIZJ = V10.LIZJ("javaMax:", maxMemory, " javaTotal:");
        LIZJ.append(j);
        C0MT.LIZLLL(LIZJ, " javaUsed:", freeMemory, " proportion:");
        LIZJ.append(f);
        C39596FgO.LIZ(X1D.LIZIZ(LIZJ));
        return f;
    }
}
