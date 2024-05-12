package X;

/* renamed from: X.QTp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67061QTp implements InterfaceC67030QSk {
    public volatile boolean LIZ = true;
    public volatile InterfaceC67030QSk LIZIZ;

    @Override // X.InterfaceC67030QSk
    public final void remove() {
        this.LIZ = false;
        if (this.LIZIZ != null) {
            this.LIZIZ.remove();
        }
    }
}
