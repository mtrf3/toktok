package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.photo.FeedUserPhotoReplyViewHolder;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import kotlin.jvm.internal.o;

/* renamed from: X.LlS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55198LlS extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, C2MA> {
    public static final C55198LlS LJLIL = new C55198LlS();

    public C55198LlS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C2MA invoke(C222588oQ it) {
        o.LJIIIZ(it, "it");
        FeedUserPhotoReplyViewHolder LJIIIIZZ = IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LJIIIIZZ(it);
        o.LJII(LJIIIIZZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
        return LJIIIIZZ;
    }
}
