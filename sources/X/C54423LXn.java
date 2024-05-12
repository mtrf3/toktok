package X;

import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceProviderImpl;
import com.ss.android.ugc.aweme.service.IFeedSkylightService;
import com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider;

/* renamed from: X.LXn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54423LXn implements IFeedSkylightServiceProvider {
    public static final C54423LXn LIZIZ = new C54423LXn();
    public final /* synthetic */ IFeedSkylightServiceProvider LIZ;

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final IFeedSkylightService LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC54430LXu LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C54423LXn() {
        IFeedSkylightServiceProvider iFeedSkylightServiceProvider;
        Object LIZ = C58096Mr6.LIZ(IFeedSkylightServiceProvider.class, false);
        if (LIZ != null) {
            iFeedSkylightServiceProvider = (IFeedSkylightServiceProvider) LIZ;
        } else {
            if (C58096Mr6.LLJJ == null) {
                synchronized (IFeedSkylightServiceProvider.class) {
                    if (C58096Mr6.LLJJ == null) {
                        C58096Mr6.LLJJ = new FeedSkylightServiceProviderImpl();
                    }
                }
            }
            iFeedSkylightServiceProvider = C58096Mr6.LLJJ;
        }
        this.LIZ = iFeedSkylightServiceProvider;
    }
}
