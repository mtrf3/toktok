package com.bytedance.effectcreatormobile.ckeapi.api;

import X.C76800UCe;
import X.C94341afR;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IEffectCreatePipeline extends IService {
    C94341afR getConfig();

    void onExportEffectBefore(Intent intent, CKEDraftInfo cKEDraftInfo);

    void onExportEffectFailed(Intent intent, String str, String str2);

    void onExportEffectSuccess(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    boolean onExportWhenExit(Activity activity, CKEDraftInfo cKEDraftInfo, EffectPackageData effectPackageData);

    boolean onInterceptExport(Intent intent);
}
