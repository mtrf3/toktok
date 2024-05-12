package X;

/* renamed from: X.EZq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36642EZq implements InterfaceC36334ENu {
    public final /* synthetic */ InterfaceC36644EZs<String> LIZ;

    public C36642EZq(C36645EZt c36645EZt) {
        this.LIZ = c36645EZt;
    }

    @Override // X.InterfaceC36334ENu
    public final void LIZ(byte[] bArr) {
        if (bArr != null) {
            InterfaceC36644EZs<String> interfaceC36644EZs = this.LIZ;
            String str = new String(bArr, PVC.LIZ);
            if (interfaceC36644EZs != null) {
                interfaceC36644EZs.onSuccess(str);
                return;
            }
            return;
        }
        InterfaceC36644EZs<String> interfaceC36644EZs2 = this.LIZ;
        if (interfaceC36644EZs2 == null) {
            return;
        }
        new RuntimeException("empty result");
        interfaceC36644EZs2.onFail();
    }

    @Override // X.InterfaceC36334ENu
    public final void LIZIZ(int i, Throwable th) {
        InterfaceC36644EZs<String> interfaceC36644EZs = this.LIZ;
        if (interfaceC36644EZs != null) {
            interfaceC36644EZs.onFail();
        }
    }
}
