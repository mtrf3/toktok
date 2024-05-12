package X;

import java.io.File;

/* renamed from: X.FgU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39602FgU implements InterfaceC39612Fge<String> {
    public final /* synthetic */ File LIZ;

    public C39602FgU(File file) {
        this.LIZ = file;
    }

    @Override // X.InterfaceC39612Fge
    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResponse:");
        LIZ.append(str);
        C39596FgO.LIZ(X1D.LIZIZ(LIZ));
        if (this.LIZ.exists()) {
            C16880lQ.LLLZZIL(this.LIZ);
        }
    }

    @Override // X.InterfaceC39612Fge
    public final void onFailure(Throwable th) {
        if (th != null) {
            th.printStackTrace();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailure:");
        LIZ.append(th);
        C39596FgO.LIZ(X1D.LIZIZ(LIZ));
    }
}
