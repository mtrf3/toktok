package X;

import com.ss.android.videoshop.controller.RefactorVideoController;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes16.dex */
public final class YSO implements InterfaceC48221IwD {
    public final YSS LIZ;
    public final YTJ LIZIZ;
    public final RefactorVideoController LIZJ;

    @Override // X.InterfaceC48221IwD
    public final int getCurrentPosition() {
        return this.LIZJ.getCurrentPosition();
    }

    @Override // X.InterfaceC48221IwD
    public final C47160If6 getCurrentVideoInfo() {
        return this.LIZJ.getCurrentVideoInfo();
    }

    @Override // X.InterfaceC48221IwD
    public final int getDuration() {
        TTVideoEngine tTVideoEngine;
        YSS yss = this.LIZ;
        if (yss == null || (tTVideoEngine = yss.LIZ) == null) {
            return 0;
        }
        return tTVideoEngine.LJIL();
    }

    @Override // X.InterfaceC48221IwD
    public final C46886Iag getPlaybackParams() {
        return this.LIZJ.getPlaybackParams();
    }

    @Override // X.InterfaceC48221IwD
    public final EnumC47176IfM getResolution() {
        return this.LIZJ.getResolution();
    }

    @Override // X.InterfaceC48221IwD
    public final boolean isLoop() {
        YSS yss = this.LIZ;
        if (yss != null && yss.LIZ()) {
            return true;
        }
        return false;
    }

    public YSO(YTJ ytj, RefactorVideoController refactorVideoController) {
        this.LIZIZ = ytj;
        this.LIZJ = refactorVideoController;
        refactorVideoController.getVideoPlayStatusQuery();
        this.LIZ = refactorVideoController.getVideoInfoQuery();
    }
}
