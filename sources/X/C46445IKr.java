package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SecondVideoPreloadConfig;

/* renamed from: X.IKr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46445IKr extends AbstractC65781Prl implements InterfaceC65784Pro<SecondVideoPreloadConfig> {
    public static final C46445IKr LJLIL = new C46445IKr();

    public C46445IKr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.search.performance.core.config.SecondVideoPreloadConfig] */
    @Override // X.InterfaceC65784Pro
    public final SecondVideoPreloadConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SecondVideoPreloadConfig secondVideoPreloadConfig = C46444IKq.LJLJLLL;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "search_result_page_second_video_preload_opt", 31744, SecondVideoPreloadConfig.class, secondVideoPreloadConfig);
        if (LJIJ == 0) {
            C46444IKq.LJLJLJ.getClass();
            return secondVideoPreloadConfig;
        }
        return LJIJ;
    }
}
