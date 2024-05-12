package X;

import com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleImageFeedViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.8Y9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Y9 extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, C2MA> {
    public static final C8Y9 LJLIL = new C8Y9();

    public C8Y9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C2MA invoke(C222588oQ c222588oQ) {
        C222588oQ videoViewHolderProducerParams = c222588oQ;
        o.LJIIIZ(videoViewHolderProducerParams, "videoViewHolderProducerParams");
        InterfaceC212878Xb<?, ?> interfaceC212878Xb = videoViewHolderProducerParams.LJIILLIIL.get(28);
        o.LJII(interfaceC212878Xb, "null cannot be cast to non-null type com.bytedance.tiktok.proxy.list.IProxyer<com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleImageFeedViewHolder, com.ss.android.ugc.aweme.models.NowImageItem>");
        return new NowSingleImageFeedViewHolder(videoViewHolderProducerParams, interfaceC212878Xb);
    }
}
