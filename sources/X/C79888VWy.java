package X;

import android.graphics.Bitmap;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;

/* renamed from: X.VWy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79888VWy<T> implements InterfaceC79878VWo<Bitmap> {
    public final /* synthetic */ LynxAlphaVideo LIZ;

    public C79888VWy(LynxAlphaVideo lynxAlphaVideo) {
        this.LIZ = lynxAlphaVideo;
    }

    @Override // X.InterfaceC79878VWo
    public final void onResult(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        if (bitmap2 != null) {
            LLog.LIZLLL(2, "x-alpha-video", "non-null poster and set done ");
            ((C79885VWv) lynxAlphaVideo.mView).setMPoster(bitmap2);
            ((C79885VWv) lynxAlphaVideo.mView).setMIsShowPoster(true);
            lynxAlphaVideo.mView.invalidate();
        }
    }
}
