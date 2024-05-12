package X;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaMetadataRetriever;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OGI implements PPT {
    public final /* synthetic */ Context LIZ;

    @Override // X.PPT
    public final String getLocale() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Locale.getDefault().getLanguage());
            LIZ.append('-');
            C39567Ffv c39567Ffv = C39399FdD.LIZIZ;
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            c39567Ffv.getClass();
            LIZ.append(C39567Ffv.LIZIZ(locale));
            return X1D.LIZIZ(LIZ);
        } catch (Q0C unused) {
            return "";
        }
    }

    public OGI(Context context) {
        this.LIZ = context;
    }

    @Override // X.PPT
    public final void LIZJ(ClipData clip) {
        o.LJIIIZ(clip, "clip");
        try {
            Object LLIZ = C16880lQ.LLIZ("clipboard", (Application) this.LIZ);
            o.LJII(LLIZ, "null cannot be cast to non-null type android.content.ClipboardManager");
            OHS ohs = C252609vk.LIZ;
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476395008, "bpea-lynx_proxy_setPrimaryClip");
            ohs.getClass();
            OHS.LIZIZ((ClipboardManager) LLIZ, clip, LJJIIJ);
        } catch (Q0C e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.PPT
    public final String LIZLLL(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return mediaMetadataRetriever.extractMetadata(9);
        } catch (Q0C unused) {
            return "";
        }
    }

    @Override // X.PPT
    public final Camera openCamera(int i) {
        try {
            return C62006OVe.LIZ(i, C78857UxB.LJJIIJ(1476395008, "bpea-lynx_proxy_openCamera"));
        } catch (Q0C unused) {
            return null;
        }
    }

    @Override // X.PPT
    public final void releaseCamera(Camera camera) {
        if (camera != null) {
            try {
                C62006OVe.LIZIZ(camera, C78857UxB.LJJIIJ(1476395008, "bpea-lynx_proxy_releaseCamera"));
            } catch (Q0C e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.PPT
    public final void LIZ(SensorManager sensorManager, SensorEventListener sensorEventListener) {
        if (sensorEventListener != null && sensorManager != null) {
            try {
                C39187FZn c39187FZn = C39188FZo.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476395008, "bpea-lynx_proxy_unregisterSensorListener");
                c39187FZn.getClass();
                C39187FZn.LIZLLL(sensorManager, sensorEventListener, LJJIIJ);
            } catch (Q0C e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // X.PPT
    public final boolean LJ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        if (sensorManager != null) {
            try {
                C39187FZn c39187FZn = C39188FZo.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476395008, "bpea-lynx_proxy_registerSensorListener");
                c39187FZn.getClass();
                if (C39187FZn.LIZJ(sensorManager, sensorEventListener, sensor, i, LJJIIJ)) {
                    return true;
                }
            } catch (Q0C unused) {
            }
        }
        return false;
    }
}
