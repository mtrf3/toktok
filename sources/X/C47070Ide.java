package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.Ide, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47070Ide implements InterfaceC47098Ie6 {
    public IY1 LIZ;
    public final /* synthetic */ SimVideoUrlModel LIZIZ;
    public final /* synthetic */ PreloadSessionManager.PreloadSession LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ AbstractC46738IVy LJI;
    public final /* synthetic */ EnginePreloader LJII;

    public final String[] LIZ() {
        String[] strArr;
        int i;
        if (this.LIZ == null) {
            int averageSpeedInKBps = this.LJII.LJIJJLI.getSpeedManager().getAverageSpeedInKBps();
            if (averageSpeedInKBps <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (i = EnginePreloader.LJJIIZ) > 0) {
                averageSpeedInKBps = i;
            }
            EnginePreloader.LJJIIZ = averageSpeedInKBps;
            this.LIZ = this.LJII.LJIJJLI.createVideoUrlProcessor().LIZ(this.LIZIZ, IXN.LIZJ.getPlayerType());
            if (this.LIZJ != null && (this.LJII.cacheSize(this.LIZIZ) <= 0 || this.LIZLLL)) {
                this.LIZJ.speed = averageSpeedInKBps;
            }
        }
        IY1 iy1 = this.LIZ;
        if (iy1 != null && (strArr = iy1.LIZ) != null && strArr.length > 0 && !TextUtils.isEmpty(this.LIZIZ.getSourceId())) {
            C46664ITc.LJIJ.LJIJJ(this.LIZIZ.getSourceId(), this.LIZ.LIZLLL);
        }
        IY1 iy12 = this.LIZ;
        if (iy12 != null) {
            return iy12.LIZ;
        }
        return null;
    }

    public C47070Ide(EnginePreloader enginePreloader, SimVideoUrlModel simVideoUrlModel, PreloadSessionManager.PreloadSession preloadSession, boolean z, int i, String str, AbstractC46738IVy abstractC46738IVy) {
        this.LJII = enginePreloader;
        this.LIZIZ = simVideoUrlModel;
        this.LIZJ = preloadSession;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = abstractC46738IVy;
    }
}
