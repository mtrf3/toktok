package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class P3R {
    public static final List<P3S> LIZ = new ArrayList();
    public static final List<P3S> LIZIZ = new ArrayList();
    public static boolean LIZJ = false;
    public static final List<P3S> LIZLLL = Arrays.asList(new P3S(320, 240), new P3S(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 480), new P3S(1280, 720));

    public static P3S LIZ(P3S p3s, boolean z) {
        if (z) {
            return new P3S(p3s.LIZIZ, p3s.LIZ);
        }
        return new P3S(p3s.LIZ, p3s.LIZIZ);
    }

    public static void LIZIZ(CameraManager cameraManager, int i, List<P3S> list) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(i);
        for (Size size : ((StreamConfigurationMap) cameraManager.getCameraCharacteristics(X1D.LIZIZ(LIZ2)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)) {
            ((ArrayList) list).add(new P3S(size.getWidth(), size.getHeight()));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("cameraid:");
            LIZ3.append(i);
            LIZ3.append(", Width: ");
            LIZ3.append(size.getWidth());
            LIZ3.append(", Height: ");
            LIZ3.append(size.getHeight());
            AVLog.e("CameraResolution", X1D.LIZIZ(LIZ3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [X.P3S] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.String] */
    public static P3S LIZJ(Context context, int i, int i2, boolean z) {
        boolean z2;
        int i3;
        int i4;
        P3S p3s;
        ?? r14;
        P3S p3s2;
        P3S p3s3;
        List<P3S> list;
        int i5;
        int i6;
        if (!LIZJ) {
            synchronized (P3R.class) {
                if (!LIZJ) {
                    CameraManager cameraManager = (CameraManager) C16880lQ.LLILL(context, "camera");
                    try {
                        LIZIZ(cameraManager, 0, LIZ);
                        LIZIZ(cameraManager, 1, LIZIZ);
                        LIZJ = true;
                    } catch (Exception e) {
                        LIZJ = false;
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        if (i < i2) {
            z2 = true;
            int i7 = i ^ i2;
            i4 = i2 ^ i7;
            i3 = i7 ^ i4;
        } else {
            z2 = false;
            i3 = i;
            i4 = i2;
        }
        if (i3 <= 1280 && i4 <= 720) {
            if (z2) {
                p3s = new P3S(720, 1280);
            } else {
                p3s = new P3S(1280, 720);
            }
        } else if (z2) {
            p3s = new P3S(1080, 1920);
        } else {
            p3s = new P3S(1920, 1080);
        }
        int i8 = 2;
        P3S p3s4 = null;
        if (i3 == 1920 && i4 == 1088) {
            p3s = new P3S(1920, 1080);
            p3s3 = null;
            p3s2 = null;
            i6 = i;
            i5 = i2;
        } else {
            if (z) {
                r14 = LIZ;
            } else {
                r14 = LIZIZ;
            }
            int size = r14.size() - 1;
            P3S p3s5 = null;
            p3s2 = null;
            ?? r15 = i2;
            while (size >= 0) {
                P3S p3s6 = (P3S) ListProtector.get(r14, size);
                int i9 = p3s6.LIZ;
                int i10 = p3s6.LIZIZ;
                if (i9 < i10) {
                    r15 = "camera list invalid. temp=[%d,%d], why?";
                    Object[] objArr = new Object[i8];
                    objArr[0] = Integer.valueOf(i9);
                    objArr[1] = Integer.valueOf(p3s6.LIZIZ);
                    AVLog.iow("CameraUtils", C16880lQ.LLLZ("camera list invalid. temp=[%d,%d], why?", objArr));
                } else if (i9 >= i3 && i10 >= i4) {
                    if (i9 == i3 || i10 == i4) {
                        p3s2 = LIZ(p3s6, z2);
                    }
                    if (p3s4 == null && (list = LIZLLL) != null && !list.isEmpty()) {
                        int i11 = 0;
                        r15 = r15;
                        while (true) {
                            if (i11 >= list.size()) {
                                break;
                            }
                            r15 = (P3S) ListProtector.get(list, i11);
                            if (p3s6.LIZ == r15.LIZ && p3s6.LIZIZ == r15.LIZIZ) {
                                p3s4 = LIZ(p3s6, z2);
                                break;
                            }
                            i11++;
                            r15 = r15;
                        }
                    }
                    if (p3s5 == null) {
                        p3s5 = LIZ(p3s6, z2);
                    }
                }
                size--;
                i8 = 2;
                r15 = r15;
            }
            p3s3 = p3s4;
            p3s4 = p3s5;
            i6 = r14;
            i5 = r15;
        }
        P3T p3t = new P3T();
        p3t.LIZ = p3s;
        p3t.LIZIZ = p3s4;
        p3t.LIZJ = p3s3;
        p3t.LIZLLL = p3s2;
        int max = Math.max(i6, i5);
        int min = Math.min(i6, i5);
        P3S p3s7 = p3t.LIZJ;
        if (p3s7 == null || p3s7.LIZ / max >= i8 || p3s7.LIZIZ / min >= i8) {
            return new P3S(1280, 720);
        }
        return p3s7;
    }
}
