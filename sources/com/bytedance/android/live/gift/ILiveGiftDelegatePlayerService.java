package com.bytedance.android.live.gift;

import X.InterfaceC06390Mx;
import X.InterfaceC15840jk;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public interface ILiveGiftDelegatePlayerService extends InterfaceC06390Mx {
    Object buildDelegateGiftPlayListener(InterfaceC15840jk interfaceC15840jk);

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
