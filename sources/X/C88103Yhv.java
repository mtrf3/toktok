package X;

/* renamed from: X.Yhv, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88103Yhv extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88103Yhv LJLIL = new C88103Yhv();

    public C88103Yhv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C88099Yhr.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
