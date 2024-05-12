package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.FullEpisodeRouterServiceImpl;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class JIP implements IFullEpisodeRouterService {
    public static final JIP LIZIZ = new JIP();
    public final /* synthetic */ IFullEpisodeRouterService LIZ;

    @Override // com.ss.android.ugc.aweme.audiomode.fullepisodev2.service.IFullEpisodeRouterService
    public final void LIZ(Context context, Aweme aweme, String str) {
        this.LIZ.LIZ(context, aweme, str);
    }

    public JIP() {
        IFullEpisodeRouterService iFullEpisodeRouterService;
        Object LIZ = C58096Mr6.LIZ(IFullEpisodeRouterService.class, false);
        if (LIZ != null) {
            iFullEpisodeRouterService = (IFullEpisodeRouterService) LIZ;
        } else {
            if (C58096Mr6.LLILZIL == null) {
                synchronized (IFullEpisodeRouterService.class) {
                    if (C58096Mr6.LLILZIL == null) {
                        C58096Mr6.LLILZIL = new FullEpisodeRouterServiceImpl();
                    }
                }
            }
            iFullEpisodeRouterService = C58096Mr6.LLILZIL;
        }
        this.LIZ = iFullEpisodeRouterService;
    }
}
