package X;

/* renamed from: X.QTw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67068QTw implements InterfaceC67071QTz {
    public final /* synthetic */ QU0 LJLIL;

    public C67068QTw(QU0 qu0) {
        this.LJLIL = qu0;
    }

    @Override // X.InterfaceC67071QTz
    public final void LJJJLZIJ(boolean z) {
        if (z && this.LJLIL.LJLILLLLZI.hasMessages(101)) {
            this.LJLIL.LJLILLLLZI.removeMessages(101);
            this.LJLIL.LJLILLLLZI.sendMessage(this.LJLIL.LJLILLLLZI.obtainMessage(101));
        }
    }
}
