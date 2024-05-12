package X;

/* renamed from: X.XKo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84662XKo<T> extends XKZ<T> implements XLE {
    public final InterfaceC67352kd<T> LJLJI;

    @Override // kotlinx.coroutines.JobSupport
    public final boolean LJJL() {
        return true;
    }

    @Override // X.XLE
    public final XLE getCallerFrame() {
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLJI;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void LJJII(Object obj) {
        XKV.LIZ(C56509MFt.LJIILIIL(obj), C78555UsJ.LJJII(this.LJLJI), null);
    }

    @Override // X.XKZ
    public void LJJLL(Object obj) {
        this.LJLJI.resumeWith(C56509MFt.LJIILIIL(obj));
    }

    public C84662XKo(InterfaceC67352kd interfaceC67352kd, MBA mba) {
        super(mba, true);
        this.LJLJI = interfaceC67352kd;
    }
}
