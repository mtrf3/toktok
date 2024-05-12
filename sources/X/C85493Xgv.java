package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xgv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85493Xgv {
    public final View LIZ;
    public final InterfaceC85498Xh0 LIZIZ;
    public VideoViewComponent LIZJ;
    public C62846OlW LIZLLL;
    public C24060x0 LJ;
    public final C56462Jm LJFF = new C56462Jm();
    public boolean LJI;
    public Aweme LJII;
    public boolean LJIIIIZZ;

    public final void LIZ() {
        this.LJI = false;
        int i = this.LJFF.LIZ;
        if (i != 1 && i != 2 && i != 4) {
            return;
        }
        C24060x0 c24060x0 = this.LJ;
        if (c24060x0 != null) {
            ((VideoViewComponent) c24060x0.LIZ).pause();
            this.LJFF.LIZ = 3;
        } else {
            o.LJIJI("mPlayVideoHelper");
            throw null;
        }
    }

    public final void LIZIZ() {
        this.LJI = false;
        int i = this.LJFF.LIZ;
        if (i != 0) {
            if (i != 3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("resume else ");
                LIZ.append(this.LJFF.LIZ);
                C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
                return;
            }
            C24060x0 c24060x0 = this.LJ;
            if (c24060x0 != null) {
                if (c24060x0.LIZJ != null) {
                    ((VideoViewComponent) c24060x0.LIZ).LIZ((OnUIPlayListener) c24060x0.LIZIZ);
                    VideoViewComponent videoViewComponent = (VideoViewComponent) c24060x0.LIZ;
                    Aweme aweme = (Aweme) c24060x0.LIZJ;
                    o.LJI(aweme);
                    videoViewComponent.LJIIL(aweme.getVideo());
                }
                this.LJFF.LIZ = 4;
                return;
            }
            o.LJIJI("mPlayVideoHelper");
            throw null;
        }
        LIZJ();
    }

    public final void LIZJ() {
        VideoViewComponent videoViewComponent = this.LIZJ;
        if (videoViewComponent != null) {
            if (!videoViewComponent.LJLJI.d4()) {
                this.LJI = true;
                return;
            }
            int i = this.LJFF.LIZ;
            if (i != 0) {
                if (i != 3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("start else ");
                    LIZ.append(this.LJFF.LIZ);
                    C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
                    return;
                }
                LIZIZ();
                return;
            }
            C24060x0 c24060x0 = this.LJ;
            if (c24060x0 != null) {
                if (c24060x0.LIZJ != null) {
                    ((VideoViewComponent) c24060x0.LIZ).LIZ((OnUIPlayListener) c24060x0.LIZIZ);
                    VideoViewComponent videoViewComponent2 = (VideoViewComponent) c24060x0.LIZ;
                    Aweme aweme = (Aweme) c24060x0.LIZJ;
                    o.LJI(aweme);
                    Video video = aweme.getVideo();
                    FFL.LJIIIZ().getClass();
                    videoViewComponent2.LJII(video, FFL.LJIIJ(31744, 0, "decoder_type", true));
                    C46757IWr c46757IWr = ((VideoViewComponent) c24060x0.LIZ).LJLILLLLZI;
                    if (c46757IWr != null) {
                        c46757IWr.LJJJLIIL();
                    }
                }
                this.LJI = false;
                this.LJFF.LIZ = 2;
                return;
            }
            o.LJIJI("mPlayVideoHelper");
            throw null;
        }
        o.LJIJI("mVideoView");
        throw null;
    }

    public C85493Xgv(View view, WelcomeVideoWidget welcomeVideoWidget, boolean z) {
        this.LIZ = view;
        this.LIZIZ = welcomeVideoWidget;
        C85494Xgw c85494Xgw = new C85494Xgw(this, z);
        VideoViewComponent videoViewComponent = new VideoViewComponent(0);
        this.LIZJ = videoViewComponent;
        videoViewComponent.LIZIZ((ViewGroup) view);
        VideoViewComponent videoViewComponent2 = this.LIZJ;
        if (videoViewComponent2 != null) {
            videoViewComponent2.LJLJI.N7(new C85496Xgy(this));
            VideoViewComponent videoViewComponent3 = this.LIZJ;
            if (videoViewComponent3 != null) {
                this.LJ = new C24060x0(videoViewComponent3, c85494Xgw);
                View findViewById = view.findViewById(R.id.cover);
                o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.cover)");
                this.LIZLLL = (C62846OlW) findViewById;
                view.setTag(this);
                return;
            }
            o.LJIJI("mVideoView");
            throw null;
        }
        o.LJIJI("mVideoView");
        throw null;
    }
}
