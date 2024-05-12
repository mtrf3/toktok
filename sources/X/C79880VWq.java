package X;

import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* renamed from: X.VWq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79880VWq<T> implements InterfaceC79878VWo<Throwable> {
    public final /* synthetic */ LynxAlphaVideo LIZ;
    public final /* synthetic */ String LIZIZ;

    public C79880VWq(LynxAlphaVideo lynxAlphaVideo, String str) {
        this.LIZ = lynxAlphaVideo;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC79878VWo
    public final void onResult(Throwable th) {
        DataSource dataSource = this.LIZ.LJLJI;
        if (dataSource != null) {
            dataSource.setAutoRelease(true);
        }
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set video lastFrame failed, lastFrame is ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error msg is ");
        LIZ.append(th);
        lynxAlphaVideo.LJJI(-16, X1D.LIZIZ(LIZ), this.LIZ.LJLL);
    }
}
