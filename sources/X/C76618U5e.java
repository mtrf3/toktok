package X;

/* renamed from: X.U5e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76618U5e extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC75441TjB, Boolean> {
    public static final C76618U5e LJLIL = new C76618U5e();

    public C76618U5e() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InterfaceC75441TjB interfaceC75441TjB) {
        boolean z;
        InterfaceC75441TjB interfaceC75441TjB2 = interfaceC75441TjB;
        if (interfaceC75441TjB2.scene() == 2 && (interfaceC75441TjB2 instanceof U64)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
