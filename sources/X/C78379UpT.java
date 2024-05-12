package X;

/* renamed from: X.UpT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78379UpT {
    public static volatile C78379UpT LIZ;
    public static volatile C78391Upf LIZIZ;
    public static volatile C78392Upg LIZJ;
    public static volatile C1GE LIZLLL;
    public static volatile C78389Upd LJ;
    public static volatile C78276Uno LJFF;

    public static C78379UpT LJ() {
        if (LIZ == null) {
            synchronized (C78379UpT.class) {
                if (LIZ == null) {
                    LIZ = new C78379UpT();
                }
            }
        }
        return LIZ;
    }

    public final C78276Uno LIZ() {
        if (LJFF == null) {
            synchronized (this) {
                if (LJFF == null) {
                    LJFF = new C78276Uno();
                }
            }
        }
        return LJFF;
    }

    public final C1GE LIZIZ() {
        if (LIZLLL == null) {
            synchronized (this) {
                if (LIZLLL == null) {
                    LIZLLL = new C1GE();
                }
            }
        }
        return LIZLLL;
    }

    public final InterfaceC78402Upq LIZJ() {
        if (LIZJ == null) {
            synchronized (this) {
                if (LIZJ == null) {
                    LIZJ = new C78392Upg();
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC78403Upr LIZLLL() {
        if (LIZIZ == null) {
            synchronized (this) {
                if (LIZIZ == null) {
                    LIZIZ = new C78391Upf();
                }
            }
        }
        return LIZIZ;
    }
}
