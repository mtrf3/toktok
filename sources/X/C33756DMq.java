package X;

/* renamed from: X.DMq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33756DMq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33756DMq LJLIL = new C33756DMq();

    public C33756DMq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) C33755DMp.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
