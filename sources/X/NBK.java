package X;

import android.graphics.PointF;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBK implements NCA {
    public final /* synthetic */ NBH LIZ;

    @Override // X.NCA
    public final NBS LJI() {
        return null;
    }

    @Override // X.NCA
    public final boolean LJIIL(String slotID, NC9 nc9) {
        o.LJIIIZ(slotID, "slotID");
        return true;
    }

    @Override // X.NCA
    public final NDG LIZLLL() {
        double d;
        View view = this.LIZ.LJLJJI;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (view != null) {
            d = view.getWidth();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        View view2 = this.LIZ.LJLJJI;
        if (view2 != null) {
            d2 = view2.getHeight();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getDisplayInfo  width= ");
        LIZ.append(d);
        LIZ.append(" height= ");
        LIZ.append(d2);
        LIZ.append(" width= ");
        LIZ.append(d);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        double d3 = 2;
        return new NDG(new C58958NBy(d, d2), new PointF((float) (d / d3), (float) (d2 / d3)));
    }

    public NBK(NBH nbh) {
        this.LIZ = nbh;
    }

    @Override // X.NCA
    public final C58958NBy LJII(String slotID) {
        o.LJIIIZ(slotID, "slotID");
        return new C58958NBy(-1.0d, -1.0d);
    }

    @Override // X.NCA
    public final void LJIIJ(AbstractC58948NBo event, NC9 nc9) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(event, "event");
        if (o.LJ(event, NBL.LIZ)) {
            NIW LJII = C58827N6x.LIZIZ.LJII();
            Aweme aweme = this.LIZ.LJLJI;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            LJII.LIZJ(awemeRawAd);
        }
    }

    @Override // X.NCA
    public final boolean LJ(Runnable runnable, int i, String token) {
        o.LJIIIZ(token, "token");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerPlayProgressObserver  progress= ");
        LIZ.append(i);
        LIZ.append(" videoDuration= ");
        LIZ.append(this.LIZ.LJLL);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        Long l = this.LIZ.LJLL;
        if (l == null) {
            return false;
        }
        l.longValue();
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LIZ.LJLJLLL;
        if (iVideoPlayTaskManager != null) {
            N68 n68 = new N68(token);
            n68.LIZIZ(this.LIZ.LJLL.longValue());
            n68.LIZJ = i;
            n68.LIZLLL = runnable;
            n68.LJ = false;
            iVideoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
        IVideoPlayTaskManager iVideoPlayTaskManager2 = this.LIZ.LJLJLLL;
        if (iVideoPlayTaskManager2 != null) {
            iVideoPlayTaskManager2.LJLIIL();
            return true;
        }
        return true;
    }
}
