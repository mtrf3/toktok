package com.bytedance.bdlocation.utils.background;

import com.bytedance.bdlocation.utils.background.ActivityLifecycleUtil;

/* loaded from: classes12.dex */
public class DefaultBackgroundProvider extends BackgroundProvider implements ActivityLifecycleUtil.ActivityNotification {
    @Override // com.bytedance.bdlocation.utils.background.ActivityLifecycleUtil.ActivityNotification
    public void onAppBackgroundNotify(boolean z) {
        onAppBackgroundSwitch(z);
    }
}
