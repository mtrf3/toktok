package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;

/* renamed from: X.VWr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79881VWr<T> implements InterfaceC79878VWo<Throwable> {
    public final /* synthetic */ LynxAlphaVideo LIZ;
    public final /* synthetic */ String LIZIZ;

    public C79881VWr(LynxAlphaVideo lynxAlphaVideo, String str) {
        this.LIZ = lynxAlphaVideo;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC79878VWo
    public final void onResult(Throwable th) {
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set video poster failed, poster is ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error msg is ");
        LIZ.append(th);
        lynxAlphaVideo.LJJI(-15, X1D.LIZIZ(LIZ), this.LIZ.LJLL);
    }
}
