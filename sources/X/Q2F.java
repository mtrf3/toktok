package X;

/* loaded from: classes12.dex */
public enum Q2F {
    ValueCommand(0),
    IdentifierCommand(1),
    FunctionCommand(2),
    OperateCommand(3),
    Unsupported(Integer.MAX_VALUE);

    public final int LJLIL;

    public static Q2F valueOf(String str) {
        return (Q2F) V0N.LJJJ(Q2F.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    Q2F(int i) {
        this.LJLIL = i;
    }
}
