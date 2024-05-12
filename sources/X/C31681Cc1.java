package X;

import java.io.File;

/* renamed from: X.Cc1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31681Cc1 implements InterfaceC31104CIq {
    public final /* synthetic */ InterfaceC67352kd<File> LJLIL;

    public C31681Cc1(C84654XKg c84654XKg) {
        this.LJLIL = c84654XKg;
    }

    @Override // X.InterfaceC31104CIq
    public final void LJI(File file) {
        if (file != null) {
            InterfaceC67352kd<File> interfaceC67352kd = this.LJLIL;
            C3C5.m7constructorimpl(file);
            interfaceC67352kd.resumeWith(file);
        } else {
            InterfaceC67352kd<File> interfaceC67352kd2 = this.LJLIL;
            C3C4 LIZ = C141335gf.LIZ(new Throwable("download image failed: file is null"));
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd2.resumeWith(LIZ);
        }
    }

    @Override // X.InterfaceC31104CIq
    public final void onFailed(Throwable th) {
        String str;
        InterfaceC67352kd<File> interfaceC67352kd = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download image failed: ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        OUR.LJ(new Throwable(X1D.LIZIZ(LIZ)), interfaceC67352kd);
    }
}
