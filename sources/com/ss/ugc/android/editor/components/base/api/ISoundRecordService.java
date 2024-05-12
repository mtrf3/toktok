package com.ss.ugc.android.editor.components.base.api;

import X.ActivityC45651qj;
import X.AnonymousClass514;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import androidx.fragment.app.Fragment;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

/* loaded from: classes2.dex */
public interface ISoundRecordService extends IService {
    void recordStateChanged(ActivityC45651qj activityC45651qj, InterfaceC88472Yns<? super AnonymousClass514, C76800UCe> interfaceC88472Yns);

    void recordWavePointsChanged(ActivityC45651qj activityC45651qj, InterfaceC88472Yns<? super List<Float>, C76800UCe> interfaceC88472Yns);

    Fragment showAudioRecordFragment();
}
