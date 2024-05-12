package X;

import com.ss.android.ugc.aweme.search.performance.core.config.FirstVideoAutoPlayConfig;

/* loaded from: classes9.dex */
public final class IOR extends AbstractC65781Prl implements InterfaceC65784Pro<FirstVideoAutoPlayConfig> {
    public static final IOR LJLIL = new IOR();

    public IOR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.search.performance.core.config.FirstVideoAutoPlayConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FirstVideoAutoPlayConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        FirstVideoAutoPlayConfig firstVideoAutoPlayConfig = IOQ.LJLJLLL;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "search_result_page_first_video_auto_play_opt", 31744, FirstVideoAutoPlayConfig.class, firstVideoAutoPlayConfig);
        if (LJIJ == 0) {
            IOQ.LJLJLJ.getClass();
            return firstVideoAutoPlayConfig;
        }
        return LJIJ;
    }
}
