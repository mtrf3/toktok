package X;

/* renamed from: X.Umy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78224Umy extends AbstractC65781Prl implements InterfaceC65784Pro<O98> {
    public static final C78224Umy LJLIL = new C78224Umy();

    public C78224Umy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final O98 invoke() {
        InterfaceC78233Un7 interfaceC78233Un7;
        InterfaceC78190UmQ interfaceC78190UmQ = (InterfaceC78190UmQ) C32260ClM.LIZ(InterfaceC78190UmQ.class);
        if (interfaceC78190UmQ != null) {
            interfaceC78233Un7 = interfaceC78190UmQ.LIZ(EnumC78220Umu.LYNX);
        } else {
            interfaceC78233Un7 = null;
        }
        if (!(interfaceC78233Un7 instanceof InterfaceC78242UnG)) {
            return null;
        }
        return ((InterfaceC78242UnG) interfaceC78233Un7).getPerfService();
    }
}
