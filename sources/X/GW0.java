package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GW0 implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ AwemeDraft LIZ;
    public final /* synthetic */ C41642GVy LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        if (C78685UuP.LJJJZ(this.LIZ.LIZ.paidContentModel.getCollectionId())) {
            this.LIZIZ.LJLJJL.LIZIZ(bitmap, C7MY.LIZIZ(48), C7MY.LIZIZ(48), C32151Nz.LJIIZILJ(2), true);
        } else {
            this.LIZIZ.LJLJJL.LIZIZ(bitmap, C7MY.LIZIZ(46), C7MY.LIZIZ(61), C32151Nz.LJIIZILJ(4), false);
        }
    }

    public GW0(AwemeDraft awemeDraft, C41642GVy c41642GVy) {
        this.LIZ = awemeDraft;
        this.LIZIZ = c41642GVy;
    }
}
