package X;

import com.ss.android.ugc.aweme.services.ExternalService;
import kotlin.jvm.internal.o;

/* renamed from: X.LkG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55124LkG extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, C2MA> {
    public static final C55124LkG LJLIL = new C55124LkG();

    public C55124LkG() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.2MA] */
    @Override // X.InterfaceC88472Yns
    public final C2MA invoke(C222588oQ c222588oQ) {
        C222588oQ it = c222588oQ;
        o.LJIIIZ(it, "it");
        ?? effectRecommendCardViewHolder = ExternalService.INSTANCE.effectCardService().getEffectRecommendCardViewHolder(it.LIZ, it.LIZJ);
        o.LJII(effectRecommendCardViewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
        return effectRecommendCardViewHolder;
    }
}
