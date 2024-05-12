package X;

/* loaded from: classes8.dex */
public final class H38 implements InterfaceC162186Yc {
    public final /* synthetic */ C43421H2j LJLIL;

    public H38(C43421H2j c43421H2j) {
        this.LJLIL = c43421H2j;
    }

    @Override // X.InterfaceC162186Yc
    public final void onError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("extract thumbnail fail: ");
        LIZ.append(str);
        C111214Yb.LIZ("CompileTask", X1D.LIZIZ(LIZ));
        C42132GgC c42132GgC = (C42132GgC) this.LJLIL.LJJIIJ.getValue();
        if (c42132GgC != null) {
            c42132GgC.LIZ();
        }
    }
}
