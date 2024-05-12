package X;

/* renamed from: X.Dam, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34152Dam extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34152Dam LJLIL = new C34152Dam();

    public C34152Dam() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34158Das.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
