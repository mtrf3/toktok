package X;

import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;

/* renamed from: X.HVy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44190HVy implements ModelEventListener {
    public final /* synthetic */ C79156V4u LIZ;

    public C44190HVy(C79156V4u c79156V4u) {
        this.LIZ = c79156V4u;
    }

    @Override // com.ss.android.ugc.effectmanager.ModelEventListener
    public final void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
        this.LIZ.startDownloadEffectModelAlog(effect, modelInfo, C44172HVg.LIZIZ());
    }

    @Override // com.ss.android.ugc.effectmanager.ModelEventListener
    public final void onModelNotFound(Effect effect, Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onModelNotFound");
        LIZ.append(android.util.Log.getStackTraceString(exc));
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("errorDesc", android.util.Log.getStackTraceString(exc));
        c6bk.LIZ.put("zip_model", 0);
        C43882HKc.LJ("model_not_found_rate", 1, c6bk.LJ());
    }

    @Override // com.ss.android.ugc.effectmanager.ModelEventListener
    public final void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onModelDownloadError ");
        LIZ.append(effect.getName());
        LIZ.append(" requirements ");
        LIZ.append(modelInfo.getName());
        H7B.LIZJ(X1D.LIZIZ(LIZ));
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("errorDesc", android.util.Log.getStackTraceString(exc));
        c6bk.LIZ.put("zip_model", 0);
        C43882HKc.LJ("service_model_download_error_rate", 1, c6bk.LJ());
        this.LIZ.endDownloadEffectModelAlog(effect, modelInfo, -1L, -1, exc, C44172HVg.LIZIZ());
    }

    @Override // com.ss.android.ugc.effectmanager.ModelEventListener
    public final void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onModelDownloadSuccess ");
        LIZ.append(effect.getName());
        LIZ.append(" requirements ");
        LIZ.append(modelInfo.getName());
        H7B.LIZ(X1D.LIZIZ(LIZ));
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", Long.valueOf(j));
        C43882HKc.LJ("model_download_time", 0, c6bk.LJ());
        C6BK c6bk2 = new C6BK();
        c6bk2.LIZ.put("zipModel", 0);
        C43882HKc.LJ("service_model_download_error_rate", 0, c6bk2.LJ());
        this.LIZ.endDownloadEffectModelAlog(effect, modelInfo, j, 0, null, C44172HVg.LIZIZ());
    }

    @Override // com.ss.android.ugc.effectmanager.ModelEventListener
    public final void onFetchModelList(boolean z, String str, long j, String str2) {
        this.LIZ.reportModelListAlog(z, str, j, str2);
    }
}
