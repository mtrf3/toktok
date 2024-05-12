package X;

import android.graphics.Bitmap;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* renamed from: X.VWx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79887VWx<T> implements InterfaceC79878VWo<Bitmap> {
    public final /* synthetic */ LynxAlphaVideo LIZ;

    public C79887VWx(LynxAlphaVideo lynxAlphaVideo) {
        this.LIZ = lynxAlphaVideo;
    }

    @Override // X.InterfaceC79878VWo
    public final void onResult(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        LynxAlphaVideo lynxAlphaVideo = this.LIZ;
        if (bitmap2 != null) {
            LLog.LIZLLL(2, "x-alpha-video", "non-null last-frame and set done ");
            DataSource dataSource = lynxAlphaVideo.LJLJI;
            if (dataSource != null) {
                dataSource.setAutoRelease(true);
            }
            lynxAlphaVideo.LJLJLLL = bitmap2;
            ((C79885VWv) lynxAlphaVideo.mView).setMLastFrame(bitmap2);
        }
    }
}
