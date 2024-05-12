package X;

import com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleVideoFeedViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.8YA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YA extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, C2MA> {
    public static final C8YA LJLIL = new C8YA();

    public C8YA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C2MA invoke(C222588oQ c222588oQ) {
        C222588oQ videoViewHolderProducerParams = c222588oQ;
        o.LJIIIZ(videoViewHolderProducerParams, "videoViewHolderProducerParams");
        InterfaceC212878Xb<?, ?> interfaceC212878Xb = videoViewHolderProducerParams.LJIILLIIL.get(29);
        o.LJII(interfaceC212878Xb, "null cannot be cast to non-null type com.bytedance.tiktok.proxy.list.IProxyer<com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleVideoFeedViewHolder, com.ss.android.ugc.aweme.models.NowVideoItem>");
        return new NowSingleVideoFeedViewHolder(videoViewHolderProducerParams, interfaceC212878Xb);
    }
}
