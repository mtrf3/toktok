package X;

/* renamed from: X.Uos, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78342Uos {
    public static volatile C78342Uos LIZ;
    public static volatile C78341Uor LIZIZ;
    public static volatile C78299UoB LIZJ;
    public static volatile C78344Uou LIZLLL;

    public static C78342Uos LIZLLL() {
        if (LIZ == null) {
            synchronized (C78342Uos.class) {
                if (LIZ == null) {
                    LIZ = new C78342Uos();
                }
            }
        }
        return LIZ;
    }

    public final InterfaceC78401Upp LIZ() {
        if (LIZLLL == null) {
            synchronized (this) {
                if (LIZLLL == null) {
                    LIZLLL = new C78344Uou();
                }
            }
        }
        return LIZLLL;
    }

    public final C78341Uor LIZIZ() {
        if (LIZIZ == null) {
            synchronized (this) {
                if (LIZIZ == null) {
                    LIZIZ = new C78341Uor();
                }
            }
        }
        return LIZIZ;
    }

    public final AbstractC78300UoC LIZJ() {
        if (LIZJ == null) {
            synchronized (this) {
                if (LIZJ == null) {
                    LIZJ = new C78299UoB();
                }
            }
        }
        return LIZJ;
    }
}
