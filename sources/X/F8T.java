package X;

/* loaded from: classes7.dex */
public abstract class F8T extends F8Y implements F8Z {
    public abstract boolean LJFF();

    @Override // X.F8Y
    public void LIZLLL() {
        if (LJFF()) {
            F8U.INSTANCE.addUncaughtExceptionConsumer(this);
            LIZIZ();
            F8X.LIZ();
        }
    }

    @Override // X.F8Y
    public final F88 LJ() {
        return F88.REGISTER_EXCEPTION;
    }
}
