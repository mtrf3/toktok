package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.e1;

/* renamed from: X.IFd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46301IFd implements IVF {
    @Override // X.IVF
    public final boolean LIZ(SimVideoUrlModel simVideoUrlModel) {
        boolean LIZ;
        if (C44432HcC.LJLJI) {
            LIZ = ((Boolean) C35704Dzo.LJIJI.getValue()).booleanValue();
        } else {
            LIZ = e1.LIZ(31744, "enable_force_close_self_publish_video_sr", true, false);
        }
        if (LIZ) {
            if (!TextUtils.isEmpty(LocalVideoPlayerManager.LIZLLL().LIZIZ(C51029K0z.LJJJJZ(simVideoUrlModel)))) {
                return true;
            }
        }
        if (!C46280IEi.LIZJ || System.currentTimeMillis() - SimKitCommonConfig.COLD_BOOT_TIME_POINT > 10000) {
            return false;
        }
        return true;
    }

    @Override // X.IVF
    public final boolean LIZIZ(String str) {
        IAwemeService LIZ;
        Aweme i6;
        if (TextUtils.isEmpty(str) || (LIZ = AwemeService.LIZ()) == null || (i6 = LIZ.i6(str)) == null) {
            return false;
        }
        return i6.isAd();
    }
}
