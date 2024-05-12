package X;

/* renamed from: X.2IB, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class C2IB extends TBS implements InterfaceC88471Ynr<Integer, Integer, Integer> {
    public static final C2IB LJLIL = new C2IB();

    public C2IB() {
        super(2, C38030EwE.class, "max", "max(II)I", 1);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
    }
}
