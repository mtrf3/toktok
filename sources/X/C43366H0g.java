package X;

/* renamed from: X.H0g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43366H0g {
    public final int LIZ;
    public final boolean LIZIZ;
    public long LIZJ;

    public C43366H0g(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }

    public static void LIZ(C43366H0g c43366H0g, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z;
        int i = c43366H0g.LIZ;
        c43366H0g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c43366H0g.LIZJ > i) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LJI = JBR.LJI("allow:", z, " gap:");
        LJI.append(currentTimeMillis - c43366H0g.LIZJ);
        LJI.append(" filterGap:");
        LJI.append(i);
        String LIZIZ = X1D.LIZIZ(LJI);
        if (z) {
            if (c43366H0g.LIZIZ) {
                c43366H0g.LIZJ = currentTimeMillis;
            }
            interfaceC65784Pro.invoke();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InvokeFilter ");
            LIZ.append(LIZIZ);
            H7B.LIZ(X1D.LIZIZ(LIZ));
        }
    }
}
