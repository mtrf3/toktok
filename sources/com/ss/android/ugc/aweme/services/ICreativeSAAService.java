package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.WM7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes8.dex */
public interface ICreativeSAAService {
    Lifecycle activityGetLifecycleSafely(ActivityC45651qj activityC45651qj);

    void finishActivitySafely(Activity activity);

    void finishCurrentPage(Activity activity);

    void finishSAAActivitySafely(Activity activity);

    InterfaceC45540Hu4 getAVListenableActivityRegistry(Activity activity);

    WM7 getCurrentScene(Activity activity);

    LifecycleOwner getTargetLifecycleOwner(Activity activity);

    void invokeMethodsSafely(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    boolean isSAAActivity(Activity activity);

    void openPublishPage(Context context, Intent intent);

    void setResult(Activity activity, int i, Intent intent);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void setResult$default(ICreativeSAAService iCreativeSAAService, Activity activity, int i, Intent intent, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    intent = null;
                }
                iCreativeSAAService.setResult(activity, i, intent);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setResult");
        }
    }
}
