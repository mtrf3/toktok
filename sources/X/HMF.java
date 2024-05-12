package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;

/* loaded from: classes8.dex */
public final class HMF extends AbstractC85293Wj {
    public final /* synthetic */ ShareChannelInfo LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    public HMF(ShareChannelInfo shareChannelInfo) {
        this.LJLIL = shareChannelInfo;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null) {
            HME.LIZIZ.put(this.LJLIL.channelKey, new BitmapDrawable(bitmap));
        }
    }
}
