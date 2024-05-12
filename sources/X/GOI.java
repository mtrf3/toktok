package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GOI implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ C41413GNd LIZ;
    public final /* synthetic */ GOH LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostedDraftEntranceViewHolder :onGetVideoCoverFailed: errorCode = ");
        LIZ.append(i);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostedDraftEntranceViewHolder : bindDraftCover -> creationId = ");
        LIZ.append(this.LIZ.LJ);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        H7B.LIZ("PostedDraftEntranceViewHolder : onGetVideoCoverSuccess: ");
        this.LIZIZ.LJLJJI.setImageBitmap(bitmap);
    }

    public GOI(C41413GNd c41413GNd, GOH goh) {
        this.LIZ = c41413GNd;
        this.LIZIZ = goh;
    }
}
