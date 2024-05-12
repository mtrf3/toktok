package X;

import java.io.File;

/* renamed from: X.ah4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94442ah4 extends AbstractC38911fr {
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

    public C94442ah4(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC31104CIq
    public final void LJI(File file) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success: ");
        String str2 = null;
        if (file != null) {
            str = file.getPath();
        } else {
            str = null;
        }
        LIZ.append(str);
        C94034aaU.LIZ("ImageLoader", X1D.LIZIZ(LIZ));
        InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI;
        if (file != null) {
            str2 = file.getPath();
        }
        interfaceC88472Yns.invoke(str2);
    }

    @Override // X.InterfaceC31104CIq
    public final void onFailed(Throwable th) {
        C94034aaU.LIZ("ImageLoader", "download fail");
        this.LJLILLLLZI.invoke(null);
    }
}
