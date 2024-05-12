package X;

import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.EcUgFeedEcCardService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lkv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55165Lkv extends AbstractC65781Prl implements InterfaceC65784Pro<List<C2313796f>> {
    public static final C55165Lkv LJLIL = new C55165Lkv();

    public C55165Lkv() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final List<C2313796f> invoke() {
        LiveOuterService.LJJJLL().LJJJI().getClass();
        C55217Lll c55217Lll = C55217Lll.LJ;
        o.LJII(c55217Lll, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.FeedTypeConfig");
        LiveOuterService.LJJJLL().LJJJJLI().getClass();
        C55208Llc c55208Llc = C55208Llc.LJ;
        o.LJII(c55208Llc, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.FeedTypeConfig");
        List<C2313796f> LJJIJIL = C47261Igj.LJJIJIL(c55217Lll, c55208Llc, C55139LkV.LJ, C55179Ll9.LJ, C55180LlA.LJ, C55163Lkt.LJ, C55160Lkq.LJ, C55169Lkz.LJ, C55186LlG.LJ, C55187LlH.LJ, C55194LlO.LJ, C55130LkM.LJ, C55188LlI.LJ, C55132LkO.LJ, C55174Ll4.LJ, C55157Lkn.LJ, C55193LlN.LJ, C55196LlQ.LJ, C55154Lkk.LJ, C55168Lky.LJ, C55125LkH.LJ, C55201LlV.LJ);
        List<Object> LIZ = C8YL.LIZIZ.LIZ();
        o.LJII(LIZ, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.adapter.FeedTypeConfig>");
        LJJIJIL.addAll(LIZ);
        for (Object obj : EcUgFeedEcCardService.LIZJ().LIZIZ()) {
            if ((obj instanceof C2313796f) && obj != null) {
                LJJIJIL.add(obj);
            }
        }
        return LJJIJIL;
    }
}
