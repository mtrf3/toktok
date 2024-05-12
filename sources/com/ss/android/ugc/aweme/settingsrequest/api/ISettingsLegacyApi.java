package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C100023wE;
import X.EE1;
import X.InterfaceC37286EkE;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.List;

/* loaded from: classes17.dex */
public interface ISettingsLegacyApi {
    List<InterfaceC37286EkE> LIZ();

    C100023wE LIZIZ();

    PopupSetting LIZJ(String str);

    int LIZLLL();

    void LJ(WeakHandler weakHandler, int i, int i2);

    EE1 getRegisterStorageTask();

    void preloadPushSettingsManager();

    boolean shouldUseRecyclerPartialUpdate();
}
