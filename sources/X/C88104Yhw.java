package X;

/* renamed from: X.Yhw, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88104Yhw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88104Yhw LJLIL = new C88104Yhw();

    public C88104Yhw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88099Yhr.LIZ() & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
