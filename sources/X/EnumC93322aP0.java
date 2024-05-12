package X;

/* renamed from: X.aP0, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public enum EnumC93322aP0 {
    Success(0),
    HeaderOverSize(610),
    EmptyRequest(611),
    IsResponseStreaming(612),
    EmptySettings(613),
    ExceptionOccur(614),
    NotMatch(615);

    public final int LJLIL;

    public static EnumC93322aP0 valueOf(String str) {
        return (EnumC93322aP0) V0N.LJJJ(EnumC93322aP0.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    EnumC93322aP0(int i) {
        this.LJLIL = i;
    }
}
