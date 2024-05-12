package com.bytedance.effectcreatormobile.ckeapi.api.draft;

import android.content.Context;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

/* loaded from: classes34.dex */
public interface ICKDraftManager extends IService {
    int deleteAllDreft();

    int deleteDraft(String str);

    CKEDraftInfo getDraftByDraftId(String str);

    CKEDraftInfo getDraftInfoByPath(String str);

    List<CKEDraftInfo> getDraftList();

    String[] getDraftRequiredModelNames(String str);

    void initDraft(Context context, String str);

    CKEDraftInfo initOneDraftWithPath(String str);

    int saveOneDraft(CKEDraftInfo cKEDraftInfo, boolean z, boolean z2);

    void updateDraftInfo(CKEDraftInfo cKEDraftInfo);
}
