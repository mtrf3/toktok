package X;

/* renamed from: X.W5o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81724W5o implements InterfaceC78852Ux6<W6U> {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ W6U[] LJLILLLLZI;

    @Override // X.InterfaceC78852Ux6
    /* renamed from: apply */
    public final boolean mo42apply(W6U w6u) {
        W6U w6u2 = w6u;
        if (w6u2.LIZIZ(this.LJLIL)) {
            this.LJLILLLLZI[0] = w6u2;
        }
        return w6u2.LIZIZ(this.LJLIL);
    }

    public C81724W5o(android.net.Uri uri, W6U[] w6uArr) {
        this.LJLIL = uri;
        this.LJLILLLLZI = w6uArr;
    }
}
