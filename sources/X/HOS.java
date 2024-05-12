package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;

/* loaded from: classes8.dex */
public final class HOS implements YO1 {
    public final /* synthetic */ IAVTransformService.ITransformProgress LIZ;

    public HOS(IAVTransformService.ITransformProgress iTransformProgress) {
        this.LIZ = iTransformProgress;
    }

    @Override // X.YO1
    public final void onProgressChanged(int i) {
        IAVTransformService.ITransformProgress iTransformProgress = this.LIZ;
        if (iTransformProgress != null) {
            iTransformProgress.update(i);
        }
    }
}
