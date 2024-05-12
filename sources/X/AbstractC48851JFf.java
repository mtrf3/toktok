package X;

/* renamed from: X.JFf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48851JFf {
    public final /* synthetic */ int LIZ;
    public volatile Object LIZIZ;

    public abstract Object LIZ();

    public abstract Object LIZIZ(Object... objArr);

    public final Object LIZJ() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = LIZ();
                }
            }
        }
        return this.LIZIZ;
    }

    private final Object LJ(Object... objArr) {
        if (this.LIZIZ == null) {
            synchronized (this) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = LIZIZ(objArr);
                }
            }
        }
        return this.LIZIZ;
    }

    private final Object LJFF(Object... objArr) {
        if (this.LIZIZ == null) {
            synchronized (this) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = LIZIZ(objArr);
                }
            }
        }
        return this.LIZIZ;
    }

    public final Object LIZLLL(Object... objArr) {
        switch (this.LIZ) {
            case 0:
                if (this.LIZIZ == null) {
                    synchronized (this) {
                        if (this.LIZIZ == null) {
                            this.LIZIZ = LIZIZ(objArr);
                        }
                    }
                }
                return this.LIZIZ;
            case 1:
                return LJ(objArr);
            default:
                return LJFF(objArr);
        }
    }
}
