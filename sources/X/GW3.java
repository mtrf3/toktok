package X;

import Y.ARunnableS18S0300000_7;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GW3 implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ C41641GVx LIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
    }

    public GW3(C41641GVx c41641GVx) {
        this.LIZ = c41641GVx;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        C41641GVx c41641GVx = this.LIZ;
        ImageView imageView = c41641GVx.LJLJL;
        if (imageView != null) {
            imageView.post(new ARunnableS18S0300000_7(imageView, bitmap, c41641GVx, 16));
        }
    }
}
