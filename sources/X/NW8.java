package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem;

/* loaded from: classes11.dex */
public final class NW8 implements NW9 {
    public final /* synthetic */ IAdSceneService LIZ;
    public final /* synthetic */ SlideAdWebPreloadAssem LIZIZ;

    @Override // X.NW9
    public final void LLILLIZIL(float f) {
        IAdSceneService iAdSceneService = this.LIZ;
        if (iAdSceneService != null && NNA.LIZLLL) {
            NT2 LIZJ = iAdSceneService.LIZJ();
            SlideAdWebPreloadAssem slideAdWebPreloadAssem = this.LIZIZ;
            if (LIZJ.LJJJI(slideAdWebPreloadAssem.LJLJJLL, C212428Vi.LIZ(slideAdWebPreloadAssem), f)) {
                NNA.LIZLLL = false;
            }
        }
    }

    public NW8(IAdSceneService iAdSceneService, SlideAdWebPreloadAssem slideAdWebPreloadAssem) {
        this.LIZ = iAdSceneService;
        this.LIZIZ = slideAdWebPreloadAssem;
    }
}
