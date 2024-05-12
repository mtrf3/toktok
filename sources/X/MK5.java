package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;

/* loaded from: classes10.dex */
public final class MK5 implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ AwemeDraft LIZ;
    public final /* synthetic */ MFS LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        MFS mfs = this.LIZIZ;
        AwemeDraft awemeDraft = this.LIZ;
        final SmartImageView smartImageView = mfs.LJLILLLLZI;
        if (awemeDraft == null) {
            return;
        }
        AVExternalServiceImpl.LIZ().abilityService().infoService().videoCover(awemeDraft, new IAVInfoService.IGetInfoCallback() { // from class: X.MK6
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final void finish(Object obj) {
                SmartImageView smartImageView2 = SmartImageView.this;
                Bitmap bitmap = (Bitmap) obj;
                if (smartImageView2 != null && bitmap != null) {
                    smartImageView2.setImageBitmap(bitmap);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        this.LIZIZ.LJLILLLLZI.setImageBitmap(bitmap);
    }

    public MK5(MFS mfs, AwemeDraft awemeDraft) {
        this.LIZIZ = mfs;
        this.LIZ = awemeDraft;
    }
}
