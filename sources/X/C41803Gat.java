package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.Gat, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41803Gat implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ IEffectService.OnVideoCoverCallback LIZ;
    public final /* synthetic */ AwemeDraft LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        C41802Gas.LJIIIZ(this.LIZIZ, this.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        this.LIZ.onGetVideoCoverSuccess(bitmap);
    }

    public C41803Gat(AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.LIZ = onVideoCoverCallback;
        this.LIZIZ = awemeDraft;
    }
}
