package com.ss.android.ugc.aweme.services.mvtemplate;

import X.InterfaceC46795IYd;
import X.InterfaceC46800IYi;
import X.InterfaceC47196Ifg;
import X.InterfaceC47391Iip;

/* loaded from: classes9.dex */
public final class MvTemplateDependentsImpl implements InterfaceC47196Ifg {
    public final AVVideoViewComponentFactoryImpl avVideoViewComponentFactory = new AVVideoViewComponentFactoryImpl();
    public final AVAppPlayingVideoViewProxyImpl avAppPlayingVideoViewProxy = new AVAppPlayingVideoViewProxyImpl();
    public final KeepSurfaceTextureViewFactoryImpl keepSurfaceTextureViewFactory = new KeepSurfaceTextureViewFactoryImpl();

    @Override // X.InterfaceC47196Ifg
    public InterfaceC47391Iip getAVAppPlayingVideoViewProxy() {
        return this.avAppPlayingVideoViewProxy;
    }

    @Override // X.InterfaceC47196Ifg
    public InterfaceC46800IYi getAVVideoViewComponentFactory() {
        return this.avVideoViewComponentFactory;
    }

    @Override // X.InterfaceC47196Ifg
    public InterfaceC46795IYd getKeepSurfaceTextureViewFactory() {
        return this.keepSurfaceTextureViewFactory;
    }
}
