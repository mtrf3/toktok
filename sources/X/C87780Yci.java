package X;

/* renamed from: X.Yci, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87780Yci extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87780Yci LJLIL = new C87780Yci();

    public C87780Yci() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C87781Ycj.LIZ() & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
