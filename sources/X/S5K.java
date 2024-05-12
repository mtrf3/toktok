package X;

import java.io.File;

/* loaded from: classes13.dex */
public final class S5K implements InterfaceC31104CIq {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC67352kd<String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC31104CIq
    public final void LJI(File file) {
        if (file != null) {
            S5A.LIZ("finish", "download_image", Boolean.TRUE, null, Long.valueOf(System.currentTimeMillis() - this.LJLIL), 8);
            InterfaceC67352kd<String> interfaceC67352kd = this.LJLILLLLZI;
            String absolutePath = file.getAbsolutePath();
            C3C5.m7constructorimpl(absolutePath);
            interfaceC67352kd.resumeWith(absolutePath);
            return;
        }
        S5A.LIZ("finish", "download_image", Boolean.FALSE, "file is null", null, 16);
        InterfaceC67352kd<String> interfaceC67352kd2 = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download image ");
        OUR.LJ(new Throwable(JBR.LJFF(LIZ, this.LJLJI, " failed", LIZ)), interfaceC67352kd2);
    }

    @Override // X.InterfaceC31104CIq
    public final void onFailed(Throwable th) {
        String str;
        Boolean bool = Boolean.FALSE;
        String str2 = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        S5A.LIZ("finish", "download_image", bool, str, null, 16);
        InterfaceC67352kd<String> interfaceC67352kd = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download image failed: ");
        if (th != null) {
            str2 = th.getMessage();
        }
        LIZ.append(str2);
        OUR.LJ(new Throwable(X1D.LIZIZ(LIZ)), interfaceC67352kd);
    }

    public S5K(long j, String str, C84654XKg c84654XKg) {
        this.LJLIL = j;
        this.LJLILLLLZI = c84654XKg;
        this.LJLJI = str;
    }
}
