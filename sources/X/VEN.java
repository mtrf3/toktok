package X;

import com.lynx.tasm.core.ExternalSourceLoader;

/* loaded from: classes15.dex */
public final class VEN implements InterfaceC60597NqL {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ ExternalSourceLoader LIZJ;

    @Override // X.InterfaceC60597NqL
    public final void LIZ(byte[] bArr, Throwable th) {
        String str;
        ExternalSourceLoader externalSourceLoader = this.LIZJ;
        String str2 = this.LIZ;
        int i = this.LIZIZ;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        externalSourceLoader.LIZ(i, str2, str, bArr);
    }

    public VEN(int i, ExternalSourceLoader externalSourceLoader, String str) {
        this.LIZJ = externalSourceLoader;
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
