package com.ss.android.ugc.aweme.tag.service;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import java.util.List;

/* loaded from: classes4.dex */
public interface ITagService {
    void LIZ();

    int LIZIZ();

    void LIZJ(ActivityC45651qj activityC45651qj, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void LIZLLL(ActivityC45651qj activityC45651qj, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, InterfaceC88473Ynt<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt);

    void LJ(ActivityC45651qj activityC45651qj, Aweme aweme, String str, String str2);

    void LJFF(Context context, String str, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback);

    LiveData LJI(LifecycleRegistry lifecycleRegistry);
}
