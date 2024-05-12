package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import kotlin.jvm.internal.o;

/* renamed from: X.HAy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43644HAy implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ IAVInfoService.IGetInfoCallback<Bitmap> LIZ;

    public C43644HAy(IAVInfoService.IGetInfoCallback<Bitmap> iGetInfoCallback) {
        this.LIZ = iGetInfoCallback;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        IAVInfoService.IGetInfoCallback<Bitmap> iGetInfoCallback = this.LIZ;
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        IAVInfoService.IGetInfoCallback<Bitmap> iGetInfoCallback = this.LIZ;
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(bitmap);
        }
    }
}
