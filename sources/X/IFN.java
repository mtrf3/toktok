package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;

/* loaded from: classes9.dex */
public final class IFN implements Runnable {
    public final /* synthetic */ TabletPlaybackSpeedComponent LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    public IFN(TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent, Aweme aweme, float f) {
        this.LJLIL = tabletPlaybackSpeedComponent;
        this.LJLILLLLZI = aweme;
        this.LJLJI = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL.v3(this.LJLILLLLZI)) {
                TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent = this.LJLIL;
                float f = this.LJLJI;
                tabletPlaybackSpeedComponent.getClass();
                C2U8.LIZ(new C2IY(f, "homepage_hot", false));
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
