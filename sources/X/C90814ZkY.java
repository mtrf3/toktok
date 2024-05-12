package X;

import com.byted.cast.common.bean.MediaInfo;
import com.byted.cast.common.config.IMediaInfoListener;

/* renamed from: X.ZkY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90814ZkY implements IMediaInfoListener {
    public final String LIZ;
    public final /* synthetic */ C90442ZeY LIZIZ;

    @Override // com.byted.cast.common.config.IMediaInfoListener
    public final void onSuccess(MediaInfo mediaInfo) {
        C90442ZeY c90442ZeY = this.LIZIZ;
        if (c90442ZeY.LJIIIIZZ != null) {
            c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastGetMediaInfoResultProtocol(this.LIZ, true);
            this.LIZIZ.LJIIIIZZ.onSuccess(mediaInfo);
        }
    }

    public C90814ZkY(C90442ZeY c90442ZeY, String str) {
        this.LIZIZ = c90442ZeY;
        this.LIZ = str;
    }

    @Override // com.byted.cast.common.config.IMediaInfoListener
    public final void onFail(int i, String str) {
        C90442ZeY c90442ZeY = this.LIZIZ;
        if (c90442ZeY.LJIIIIZZ != null) {
            c90442ZeY.LJIILJJIL.getSourceMonitorUtils().trackByteCastGetMediaInfoResultProtocol(this.LIZ, false);
            this.LIZIZ.LJIIIIZZ.onFail(i, str);
        }
    }
}
