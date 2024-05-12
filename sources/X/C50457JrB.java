package X;

import com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.JrB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50457JrB extends AbstractC65781Prl implements InterfaceC65784Pro<RecommendInfoConfig> {
    public static final C50457JrB LJLIL = new C50457JrB();

    public C50457JrB() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final RecommendInfoConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RecommendInfoConfig recommendInfoConfig = C50454Jr8.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "search_recommend_info_config", 31744, RecommendInfoConfig.class, recommendInfoConfig);
        if (LJIJ != 0) {
            recommendInfoConfig = LJIJ;
        }
        o.LJIIIIZZ(recommendInfoConfig, "ABManager.getInstance().…ig::class.java) ?: CONFIG");
        return recommendInfoConfig;
    }
}
