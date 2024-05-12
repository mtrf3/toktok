package com.bytedance.effectcreatormobile.draft.pipeline;

import X.C76800UCe;
import X.C94034aaU;
import X.C94341afR;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DefaultEffectPipeline implements IEffectCreatePipeline {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public boolean onInterceptExport(Intent intent) {
        o.LJIIIZ(intent, "intent");
        return false;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public C94341afR getConfig() {
        return new C94341afR();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public void onExportEffectBefore(Intent intent, CKEDraftInfo cKEDraftInfo) {
        o.LJIIIZ(intent, "intent");
        C94034aaU.LIZ("CKE-editor", "onExportEffectBefore ");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public void onExportEffectFailed(Intent intent, String exportPath, String errorMsg) {
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(exportPath, "exportPath");
        o.LJIIIZ(errorMsg, "errorMsg");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onExportEffectFailed ");
        LIZ.append(errorMsg);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public boolean onExportWhenExit(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData packData) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(packData, "packData");
        C94034aaU.LIZ("CKE-editor", "onExportWhenExit");
        return true;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline
    public void onExportEffectSuccess(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> onBackToMainFragment) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(effectPackageData, "effectPackageData");
        o.LJIIIZ(onBackToMainFragment, "onBackToMainFragment");
        C94034aaU.LIZ("CKE-editor", "onExportEffectFailed ");
    }
}
