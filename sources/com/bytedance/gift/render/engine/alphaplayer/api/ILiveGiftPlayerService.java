package com.bytedance.gift.render.engine.alphaplayer.api;

import X.InterfaceC06390Mx;
import X.VXD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes17.dex */
public interface ILiveGiftPlayerService extends InterfaceC06390Mx {
    Object buildDelegateGiftPlayListener(VXD vxd);

    void clearMasks(Object obj);

    Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup);

    View getAlphaView(Object obj);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup);

    void setAutoReleaseParam(Object obj, boolean z);

    void setMute(Object obj, boolean z);

    void setTransparentType(Object obj, int i);

    void start(Object obj, String str, long j);

    void stop(Object obj);

    void tryCancel(Object obj);
}
