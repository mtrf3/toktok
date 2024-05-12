package X;

import Y.ACallableS79S0101000_7;
import Y.ACallableS84S0200000_7;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gau, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41804Gau implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ AwemeDraft LIZ;
    public final /* synthetic */ IEffectService.OnVideoCoverCallback LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        C10K.LIZIZ(new ACallableS79S0101000_7(i, this.LIZIZ, 3), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        C10K.LIZIZ(new ACallableS84S0200000_7(this.LIZIZ, OUP.LJJIJL(bitmap, this.LIZ.LJJJJI.coverPublishModel), 8), C10K.LJIIIIZZ, null);
    }

    public C41804Gau(AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.LIZ = awemeDraft;
        this.LIZIZ = onVideoCoverCallback;
    }
}
