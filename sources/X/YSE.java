package X;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.videoshop.context.VideoContext;

/* loaded from: classes16.dex */
public interface YSE {
    void onAudioFocusGain(VideoContext videoContext, boolean z);

    void onAudioFocusLoss(VideoContext videoContext, boolean z);

    boolean onBackPressedWhenFullScreen(VideoContext videoContext);

    void onFullScreen(boolean z, int i, boolean z2);

    boolean onInterceptFullScreen(boolean z, int i, boolean z2);

    void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    void onLifeCycleOnPause(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    void onLifeCycleOnResume(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    void onLifeCycleOnStart(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    void onLifeCycleOnStop(LifecycleOwner lifecycleOwner, VideoContext videoContext);

    void onNetWorkChanged(EnumC48190Ivi enumC48190Ivi, VideoContext videoContext, Context context, Intent intent);

    void onScreenOff(VideoContext videoContext);

    void onScreenUserPresent(VideoContext videoContext);
}
