package com.ss.ugc.android.editor.components.base.api;

import X.ActivityC45651qj;
import X.C50J;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.scene.navigation.NavigationScene;

/* loaded from: classes3.dex */
public interface IVideoCropService extends IService {
    void processCropResult(ActivityC45651qj activityC45651qj, Intent intent);

    void startCrop(ActivityC45651qj activityC45651qj, NLETrackSlot nLETrackSlot);

    void startCrop(NavigationScene navigationScene, ActivityC45651qj activityC45651qj, NLETrackSlot nLETrackSlot, InterfaceC88472Yns<? super C50J, C76800UCe> interfaceC88472Yns);
}
