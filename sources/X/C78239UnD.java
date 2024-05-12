package X;

/* renamed from: X.UnD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78239UnD implements InterfaceC72822Si2 {
    public final InterfaceC72822Si2 LJLIL;
    public boolean LJLILLLLZI;

    public C78239UnD(C78215Ump c78215Ump) {
        this.LJLIL = c78215Ump;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLIL.onReceiveJsEvent(c199097rd);
    }
}
