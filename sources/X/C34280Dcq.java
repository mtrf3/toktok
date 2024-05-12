package X;

/* renamed from: X.Dcq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34280Dcq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34280Dcq LJLIL = new C34280Dcq();

    public C34280Dcq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Boolean) C34276Dcm.LJ.getValue()).booleanValue() || (C34276Dcm.LIZ() & 1) == 1) {
            C34281Dcr.LIZ().LJI();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
