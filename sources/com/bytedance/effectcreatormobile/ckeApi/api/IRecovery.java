package com.bytedance.effectcreatormobile.ckeapi.api;

import X.C94273aeL;
import X.EnumC93936aYu;
import X.EnumC93946aZ4;
import X.InterfaceC70352pT;
import android.os.Bundle;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IRecovery extends IService {
    String getCachedDraftPath();

    EnumC93936aYu getEditMode();

    String getModelPictureId();

    Integer getProjectCreateFromIndex();

    InterfaceC70352pT<EnumC93946aZ4> getRecoveryEvent();

    C94273aeL getTemplateInfo();

    void onRestore(Bundle bundle);

    void onSaveState(Bundle bundle);
}
