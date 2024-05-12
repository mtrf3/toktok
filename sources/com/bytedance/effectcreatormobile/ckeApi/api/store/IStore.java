package com.bytedance.effectcreatormobile.ckeapi.api.store;

import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IStore extends IService {
    void addNotShowAnymore();

    long geUpdatetDraftDiffTime();

    String getDraftCache(String str);

    String getMainDraft();

    void markMakeupChangeModel();

    void markSplitScreenDialogShown();

    boolean matchSDKVersion4MainDraft();

    void saveDraftCache(String str, String str2);

    void saveMainDraft(String str);

    void setToolTipsDone();

    boolean shouldShowSplitScreenDialog();

    boolean shouldShowToolTips();

    boolean shouldShowVisibilityDialog();

    boolean showMakeupChangeModel();

    void updateDraftTime();

    void updateSDKVersion4MainDraft();
}
