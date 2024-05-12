package X;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.mediacommon.IMediaRecorder;
import com.byted.cast.mediacommon.IMediaRecorderCallback;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;

/* renamed from: X.ZaH, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class C90177ZaH {
    public static void LIZ(IMediaRecorder iMediaRecorder, IMediaRecorderCallback iMediaRecorderCallback) {
    }

    public static void LIZIZ(IMediaRecorder iMediaRecorder, Surface surface, MediaSetting.FILL_TYPE fill_type, boolean z) {
    }

    public static void LIZJ(IMediaRecorder iMediaRecorder, MediaSetting.FILL_TYPE fill_type) {
    }

    public static void LIZLLL(IMediaRecorder iMediaRecorder, boolean z) {
    }

    public static void LJ(IMediaRecorder iMediaRecorder, boolean z) {
    }

    public static Surface LJFF(IMediaRecorder iMediaRecorder) {
        return null;
    }

    public static boolean LJI(IMediaRecorder iMediaRecorder, String str) {
        return false;
    }

    public static void LJII(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIIIIZZ(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIIIZ(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIIJ(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIIJJI(IMediaRecorder iMediaRecorder, IMediaRecorderCallback iMediaRecorderCallback) {
    }

    public static void LJIIL(IMediaRecorder iMediaRecorder, Surface surface) {
    }

    public static void LJIILIIL(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIILJJIL(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIILL(IMediaRecorder iMediaRecorder) {
    }

    public static void LJIILLIIL(IMediaRecorder iMediaRecorder, Object obj) {
    }

    public static void LJIIZILJ(IMediaRecorder iMediaRecorder, boolean z) {
    }

    public static void LJIJ(IMediaRecorder iMediaRecorder, int i) {
    }

    public static void LJIJI(IMediaRecorder iMediaRecorder, int i) {
    }

    public static void LJIJJ(IMediaRecorder iMediaRecorder, Object obj) {
    }

    public static void LJIJJLI(IMediaRecorder iMediaRecorder, int i) {
    }

    public static void LJIL(IMediaRecorder iMediaRecorder, MediaSetting.VIDEO_SOURCE_TYPE video_source_type) {
    }

    public static void LJJ(IMediaRecorder iMediaRecorder, int i, int i2, int i3, int i4) {
    }

    public static void LJJI(IMediaRecorder iMediaRecorder, boolean z) {
    }

    public static void LJJIFFI(IMediaRecorder iMediaRecorder, ISurfaceListener iSurfaceListener) {
    }

    public static void LJJII(IMediaRecorder iMediaRecorder, MediaProjection mediaProjection) {
    }

    public static void LJJIII(IMediaRecorder iMediaRecorder, Surface surface) {
    }

    public static void LJJIIJ(IMediaRecorder iMediaRecorder, boolean z) {
    }

    public static void LJJIIJZLJL(IMediaRecorder iMediaRecorder, boolean z) {
    }

    public static void LJJIIZ(IMediaRecorder iMediaRecorder, MediaSetting.VCODEC_ID vcodec_id) {
    }

    public static void LJJIIZI(IMediaRecorder iMediaRecorder, int i) {
    }

    public static void LJJIJ(IMediaRecorder iMediaRecorder, String str) {
    }

    public static void LJJIJIIJI(IMediaRecorder iMediaRecorder, int i, int i2) {
    }

    public static boolean LJJIJIIJIL(IMediaRecorder iMediaRecorder) {
        return true;
    }

    public static void LJJIJIL(IMediaRecorder iMediaRecorder, String str) {
    }

    public static void LJJIJL(IMediaRecorder iMediaRecorder) {
    }

    public static void LJJIJLIJ(IMediaRecorder iMediaRecorder) {
    }

    public static void LJJIL(IMediaRecorder iMediaRecorder, String str) {
    }

    public static String LJJJI() {
        return "3.10.2.3.overseas-tt";
    }

    public static void LJJIZ(CastLogger castLogger) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addLoggerCallback: ");
        LIZ.append(castLogger);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        Logger.addLogger(castLogger);
    }

    public static void LJJJ(CastMonitor castMonitor) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addMonitorCallback: ");
        LIZ.append(castMonitor);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        MediaMonitor.addMonitor(castMonitor);
    }

    public static void LJJJIL(CastLogger castLogger) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeLoggerCallback: ");
        LIZ.append(castLogger);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        Logger.removeLogger(castLogger);
    }

    public static void LJJJJ(CastMonitor castMonitor) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeMonitorCallback: ");
        LIZ.append(castMonitor);
        Logger.i("ByteMediaRecorder", X1D.LIZIZ(LIZ));
        MediaMonitor.removeMonitor(castMonitor);
    }

    public static void LJJJJI(int i) {
        Logger.setLogLevel(i);
    }

    public static void LJJJJIZL(ILogger iLogger) {
        Logger.setLogger(iLogger);
    }
}
