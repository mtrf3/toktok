package X;

/* renamed from: X.IkX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47497IkX implements InterfaceC47499IkZ {
    public static int LIZJ = 10;
    public static volatile C47497IkX LIZLLL;
    public final C47493IkT LIZ;
    public InterfaceC47499IkZ LIZIZ;

    public static C47497IkX LJ() {
        if (LIZLLL == null) {
            synchronized (C47497IkX.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C47497IkX();
                }
            }
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC47499IkZ
    public final void LIZ() {
        this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC47499IkZ
    public final C47152Iey[] LIZLLL() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC47499IkZ
    public final double calculateSpeed() {
        return this.LIZIZ.calculateSpeed();
    }

    @Override // X.InterfaceC47505Ikf
    public final double getSpeed() {
        return this.LIZIZ.getSpeed();
    }

    public C47497IkX() {
        C47493IkT c47493IkT = new C47493IkT();
        this.LIZ = c47493IkT;
        this.LIZIZ = c47493IkT;
    }

    public static int LIZJ() {
        double speed = LJ().getSpeed();
        if (speed == -1.0d) {
            return -1;
        }
        return (int) ((speed / 8.0d) / 1000.0d);
    }

    @Override // X.InterfaceC47499IkZ
    public final void LIZIZ(double d) {
        this.LIZIZ.LIZIZ(d);
    }

    @Override // X.InterfaceC47499IkZ
    public final void setSpeedQueueSize(int i) {
        this.LIZIZ.setSpeedQueueSize(i);
    }

    @Override // X.InterfaceC47499IkZ
    public final void monitorVideoSpeed(double d, double d2, long j) {
        this.LIZIZ.monitorVideoSpeed(d, d2, j);
    }
}
