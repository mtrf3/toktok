package X;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.AqS60S0201000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P34 {
    public static Intent LIZIZ(MediaProjectionManager mediaProjectionManager, C78862UxG c78862UxG) {
        OHW LIZ = LIZ(102100, c78862UxG, "screenRecord_createScreenCaptureIntent");
        C78929UyL.LIZIZ(LIZ, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent()Landroid/content/Intent;", null);
        Object LIZ2 = C39207Fa7.LIZ(LIZ, new AqS177S0100000_11(mediaProjectionManager, 44));
        o.LJFF(LIZ2, "BaseAuthEntry.checkAndCa…ureIntent()\n            }");
        return (Intent) LIZ2;
    }

    public static OHW LIZ(int i, Cert cert, String str) {
        return new OHW(cert, str, new String[]{"screenRecord"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static MediaProjection LIZJ(MediaProjectionManager getMediaProjection, int i, Intent resultData, Cert cert) {
        o.LJIIJ(getMediaProjection, "$this$getMediaProjection");
        o.LJIIJ(resultData, "resultData");
        OHW LIZ = LIZ(102101, cert, "screenRecord_getMediaProjection");
        C78929UyL.LIZIZ(LIZ, "android/media/projection/MediaProjectionManager", "getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;", C113554cx.LJJL(new OSZ("resultCode", Integer.valueOf(i)), new OSZ("resultData", resultData)));
        return (MediaProjection) C39207Fa7.LIZ(LIZ, new AqS60S0201000_11(getMediaProjection, i, resultData, 1));
    }
}
