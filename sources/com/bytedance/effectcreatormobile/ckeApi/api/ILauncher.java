package com.bytedance.effectcreatormobile.ckeapi.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.ICKDraftManager;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface ILauncher extends IService {
    ICKDraftManager initDraft(Context context, String str);

    void openNewProject(Activity activity, Intent intent, int i, boolean z);

    void openNewProject(Activity activity, Intent intent, CKEDraftInfo cKEDraftInfo, int i, boolean z, int i2);

    void openTemplate(Activity activity, Intent intent, String str, int i, boolean z, String str2);

    void restoreDraft(Context context, Intent intent, String str);
}
