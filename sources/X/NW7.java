package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class NW7 implements LNI {
    public final /* synthetic */ SlideAdWebPreloadAssem LJLIL;

    public NW7(SlideAdWebPreloadAssem slideAdWebPreloadAssem) {
        this.LJLIL = slideAdWebPreloadAssem;
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        Aweme aweme2;
        ((LinkedHashMap) this.LJLIL.LJLLI).clear();
        SlideAdWebPreloadAssem slideAdWebPreloadAssem = this.LJLIL;
        slideAdWebPreloadAssem.LJLJJLL = aweme;
        if (!NNA.LIZ(slideAdWebPreloadAssem.getContext(), aweme) || (aweme2 = slideAdWebPreloadAssem.LJLJJLL) == null || !aweme2.isAd()) {
            return;
        }
        slideAdWebPreloadAssem.LJLJL = System.currentTimeMillis();
        ((LinkedHashMap) NNA.LIZ).clear();
        NW8 nw8 = new NW8(AdSceneServiceImpl.LJII(), slideAdWebPreloadAssem);
        slideAdWebPreloadAssem.getClass();
        slideAdWebPreloadAssem.G10(nw8);
    }
}
