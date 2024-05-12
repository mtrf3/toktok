package X;

import defpackage.q;

/* renamed from: X.Ruf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71057Ruf extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C71057Ruf LJLIL = new C71057Ruf();

    public C71057Ruf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("http://");
        return q.LIZIZ(LIZ, (String) C71058Rug.LIZIZ.getValue(), '/', LIZ);
    }
}
