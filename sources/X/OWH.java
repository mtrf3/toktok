package X;

import android.content.Context;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class OWH extends WallpaperService.Engine {
    public final OWI LIZ;
    public final /* synthetic */ AmeLiveWallpaper LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OWH(AmeLiveWallpaper ameLiveWallpaper) {
        super(ameLiveWallpaper);
        this.LIZIZ = ameLiveWallpaper;
        Context applicationContext = ameLiveWallpaper.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        this.LIZ = new OWI(applicationContext, ameLiveWallpaper);
        C62016OVo.LIZ().storeBoolean("keva_key_last_engine_is_tt_player", true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new WallpaperEngine = ");
        LIZ.append(OWI.class.getName());
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
        super.onSurfaceCreated(surfaceHolder);
        this.LIZIZ.LIZ();
        LiveWallPaperBean liveWallPaperBean = this.LIZIZ.LJLIL;
        if (liveWallPaperBean == null) {
            return;
        }
        if (!C39579Fg7.LIZIZ(liveWallPaperBean.getVideoPath())) {
            Context applicationContext = this.LIZIZ.getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(applicationContext, "//livewallpaper");
            buildRoute.addFlags(268435456);
            buildRoute.open();
            return;
        }
        OWI owi = this.LIZ;
        LiveWallPaperBean liveWallPaperBean2 = this.LIZIZ.LJLIL;
        owi.LJ = liveWallPaperBean2;
        String videoPath = liveWallPaperBean2.getVideoPath();
        this.LIZIZ.LJLIL.getWidth();
        this.LIZIZ.LJLIL.getHeight();
        owi.LIZJ(surfaceHolder, videoPath);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.onSurfaceDestroyed(surfaceHolder);
        OWI owi = this.LIZ;
        TTVideoEngine tTVideoEngine = owi.LIZJ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
            owi.LIZJ = null;
        }
        owi.LIZLLL = null;
        this.LIZIZ.LJLILLLLZI.remove(this);
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onVisibilityChanged(boolean z) {
        super.onVisibilityChanged(z);
        OWI owi = this.LIZ;
        owi.LJFF = z;
        if (z) {
            owi.LIZLLL();
            return;
        }
        TTVideoEngine tTVideoEngine = owi.LIZJ;
        if (tTVideoEngine == null) {
            return;
        }
        tTVideoEngine.LJJL();
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LIZ.LIZLLL = surfaceHolder;
    }

    @Override // android.service.wallpaper.WallpaperService.Engine
    public final Bundle onCommand(String commondAction, int i, int i2, int i3, Bundle bundle, boolean z) {
        boolean z2;
        OWI owi;
        LiveWallPaperBean liveWallPaperBean;
        o.LJIIIZ(commondAction, "commondAction");
        if (!o.LJ("android.wallpaper.tap", commondAction)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - OWL.LIZ <= 300) {
            int i4 = i - OWL.LIZIZ;
            int i5 = i2 - OWL.LIZJ;
            if ((i5 * i5) + (i4 * i4) < 10000) {
                z2 = true;
                OWL.LIZ = currentTimeMillis;
                OWL.LIZIZ = i;
                OWL.LIZJ = i2;
                if (z2 || !C62016OVo.LIZ().getBoolean("keva_key_enable_double_tap_pause_video", false) || (owi = this.LIZ) == null || (liveWallPaperBean = owi.LJ) == null) {
                    return null;
                }
                liveWallPaperBean.setForceToPause(!liveWallPaperBean.isForceToPause());
                if (owi.LJ.isForceToPause()) {
                    TTVideoEngine tTVideoEngine = owi.LIZJ;
                    if (tTVideoEngine != null) {
                        tTVideoEngine.LJJL();
                    }
                } else {
                    owi.LIZLLL();
                }
                boolean isForceToPause = owi.LJ.isForceToPause();
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(!isForceToPause ? 1 : 0, "action");
                FMX.LJIIL("double_tap_wallpaper", c188727au.LIZ);
                return null;
            }
        }
        z2 = false;
        OWL.LIZ = currentTimeMillis;
        OWL.LIZIZ = i;
        OWL.LIZJ = i2;
        return z2 ? null : null;
    }
}
