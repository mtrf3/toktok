package X;

/* renamed from: X.Yal, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87659Yal extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87659Yal LJLIL = new C87659Yal();

    public C87659Yal() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C87656Yai.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
