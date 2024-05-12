package X;

import Y.ARunnableS18S0300000_7;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GW7 implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ GW6 LIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
    }

    public GW7(GW6 gw6) {
        this.LIZ = gw6;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        GW6 gw6 = this.LIZ;
        ImageView imageView = gw6.LJLJJL;
        if (imageView != null) {
            imageView.post(new ARunnableS18S0300000_7(imageView, bitmap, gw6, 1));
        }
    }
}
