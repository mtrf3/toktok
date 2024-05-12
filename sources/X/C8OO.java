package X;

/* renamed from: X.8OO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C8OO LJLIL = new C8OO();

    public C8OO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int LIZIZ;
        if (!C202677xP.LIZ()) {
            LIZIZ = C7MY.LIZIZ(14);
        } else if (C8D3.LIZJ()) {
            LIZIZ = C7MY.LIZIZ(6);
        } else if (C8PQ.LIZ() || ((Number) C8PQ.LIZ.getValue()).intValue() == 3) {
            LIZIZ = C7MY.LIZIZ(12);
        } else {
            LIZIZ = C7MY.LIZIZ(8);
        }
        return Integer.valueOf(LIZIZ);
    }
}
