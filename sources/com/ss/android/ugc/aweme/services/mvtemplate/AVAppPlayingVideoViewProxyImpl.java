package com.ss.android.ugc.aweme.services.mvtemplate;

import X.IFV;
import X.InterfaceC47391Iip;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class AVAppPlayingVideoViewProxyImpl implements InterfaceC47391Iip {
    @Override // X.InterfaceC47391Iip
    public void release() {
        VideoViewComponent videoViewComponent;
        WeakReference<VideoViewComponent> weakReference = IFV.LIZ.LJLIL;
        if (weakReference != null && (videoViewComponent = weakReference.get()) != null) {
            videoViewComponent.LJIIIZ();
        }
    }
}
