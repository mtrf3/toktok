package X;

/* renamed from: X.2IA, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class C2IA extends TBS implements InterfaceC88471Ynr<Integer, Integer, Integer> {
    public static final C2IA LJLIL = new C2IA();

    public C2IA() {
        super(2, C38030EwE.class, "min", "min(II)I", 1);
    }

    @Override // X.InterfaceC88471Ynr
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
    }
}
