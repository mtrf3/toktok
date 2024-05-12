package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;

/* loaded from: classes8.dex */
public final class HN2 implements InterfaceC134045Nw {
    public final /* synthetic */ IAVProcessService.IConvertImageToVideoCallback LIZ;
    public final /* synthetic */ C43957HMz LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        this.LIZ.onSuccess(this.LIZJ);
        C43957HMz c43957HMz = this.LIZIZ;
        C133765Mu c133765Mu = c43957HMz.LIZ;
        if (c133765Mu != null) {
            c133765Mu.destroy();
            c43957HMz.LIZ = null;
        }
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        this.LIZ.onProgress(f);
    }

    public HN2(IAVProcessService.IConvertImageToVideoCallback iConvertImageToVideoCallback, C43957HMz c43957HMz, String str) {
        this.LIZ = iConvertImageToVideoCallback;
        this.LIZIZ = c43957HMz;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        this.LIZ.onFailure();
        C43957HMz c43957HMz = this.LIZIZ;
        C133765Mu c133765Mu = c43957HMz.LIZ;
        if (c133765Mu != null) {
            c133765Mu.destroy();
            c43957HMz.LIZ = null;
        }
    }
}
