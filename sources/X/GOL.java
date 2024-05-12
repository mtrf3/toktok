package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GOL implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ NewDraftViewHolder LIZ;
    public final /* synthetic */ C41425GNp LIZIZ;
    public final /* synthetic */ AwemeDraft LIZJ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLJI);
        LIZ.append(" :onGetVideoCoverFailed: errorCode = ");
        LIZ.append(i);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLJI);
        LIZ.append(" : bindDraftCover -> creationId = ");
        LIZ.append(this.LIZIZ.LJ);
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LIZ.LJLJI);
        LIZ2.append(" : onGetVideoCoverSuccess: ");
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        if (!bitmap.isRecycled()) {
            W5G w5g = this.LIZ.LJLLL;
            if (w5g != null) {
                if (w5g.getTag() != null) {
                    W5G w5g2 = this.LIZ.LJLLL;
                    if (w5g2 != null) {
                        if (!o.LJ(w5g2.getTag(), this.LIZJ.LIZJ())) {
                            return;
                        }
                        NewDraftViewHolder newDraftViewHolder = this.LIZ;
                        W5G w5g3 = newDraftViewHolder.LJLLL;
                        if (w5g3 != null) {
                            newDraftViewHolder.getClass();
                            if (!bitmap.isRecycled()) {
                                w5g3.setImageBitmap(bitmap);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("mCover");
                        throw null;
                    }
                    o.LJIJI("mCover");
                    throw null;
                }
                return;
            }
            o.LJIJI("mCover");
            throw null;
        }
    }

    public GOL(NewDraftViewHolder newDraftViewHolder, C41425GNp c41425GNp, AwemeDraft awemeDraft) {
        this.LIZ = newDraftViewHolder;
        this.LIZIZ = c41425GNp;
        this.LIZJ = awemeDraft;
    }
}
