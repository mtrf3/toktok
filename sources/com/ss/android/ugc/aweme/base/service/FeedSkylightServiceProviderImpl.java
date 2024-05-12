package com.ss.android.ugc.aweme.base.service;

import X.C221108m2;
import X.C54429LXt;
import X.C54431LXv;
import X.C62822Ol8;
import X.InterfaceC54430LXu;
import com.ss.android.ugc.aweme.service.IFeedSkylightService;
import com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider;

/* loaded from: classes10.dex */
public final class FeedSkylightServiceProviderImpl implements IFeedSkylightServiceProvider {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C54431LXv.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C54429LXt.LJLIL);

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final IFeedSkylightService LIZ() {
        return (IFeedSkylightService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC54430LXu LIZIZ() {
        return (InterfaceC54430LXu) this.LIZ.getValue();
    }
}
