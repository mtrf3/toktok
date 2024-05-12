package com.bytedance.android.livesdk.player;

import X.C15880jo;
import X.InterfaceC15840jk;
import X.VY2;
import X.Z9O;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService;

/* loaded from: classes17.dex */
public class LiveGiftDelegatePlayerService implements ILiveGiftDelegatePlayerService {
    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C15880jo.LIZ(this);
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final Object buildDelegateGiftPlayListener(InterfaceC15840jk interfaceC15840jk) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            return LIZ.buildDelegateGiftPlayListener(new Z9O(interfaceC15840jk));
        }
        return null;
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void clearMasks(Object obj) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.clearMasks(obj);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final View getAlphaView(Object obj) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            return LIZ.getAlphaView(obj);
        }
        return null;
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void stop(Object obj) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.stop(obj);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void tryCancel(Object obj) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.tryCancel(obj);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setAutoReleaseParam(Object obj, boolean z) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.setAutoReleaseParam(obj, z);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setMute(Object obj, boolean z) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.setMute(obj, z);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void setTransparentType(Object obj, int i) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.setTransparentType(obj, i);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void releasePlayer(Object obj, Object obj2, ViewGroup viewGroup) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.releasePlayer(obj, obj2, viewGroup);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final void start(Object obj, String str, long j) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            LIZ.start(obj, str, j);
        }
    }

    @Override // com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService
    public final Object createLiveGiftPlayController(Context context, LifecycleOwner lifecycleOwner, Object obj, ViewGroup viewGroup) {
        ILiveGiftPlayerService LIZ = VY2.LIZ();
        if (LIZ != null) {
            return LIZ.createLiveGiftPlayController(context, lifecycleOwner, obj, viewGroup);
        }
        return null;
    }
}
