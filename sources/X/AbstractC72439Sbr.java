package X;

import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.Sbr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72439Sbr implements InterfaceC70769Rq1 {
    @Override // X.InterfaceC70769Rq1
    public void LJLLLLLL(android.net.Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" uri=");
        LIZ.append(uri);
        C79083V1z.LJFF(0, "Lighten:", "onRelease", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" uri=");
        LIZ.append(uri);
        LIZ.append(", imageInfo=");
        LIZ.append(c2047581v);
        C79083V1z.LJFF(0, "Lighten:", "onIntermediateImageSet", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public void LLZZJLIL(android.net.Uri uri, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri=");
        LIZ.append(uri);
        LIZ.append(", throwable=");
        LIZ.append(th);
        C79083V1z.LJFF(0, "Lighten:", "onIntermediateImageFailed", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC70769Rq1
    public void T1(android.net.Uri uri, SmartImageView smartImageView) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uri=");
        LIZ.append(uri);
        C79083V1z.LJFF(0, "Lighten:", "onStart", X1D.LIZIZ(LIZ));
    }
}
