package X;

/* renamed from: X.DbX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34199DbX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34199DbX LJLIL = new C34199DbX();

    public C34199DbX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34203Dbb.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
