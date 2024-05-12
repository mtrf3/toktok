package com.byted.cast.capture.video.camera;

import X.C16880lQ;
import android.hardware.Camera;
import java.util.Iterator;

/* loaded from: classes29.dex */
public class CameraUtils {
    public static final String TAG = C16880lQ.LJLLJ(CameraUtils.class);

    public static int chooseFixedPreviewFps(Camera.Parameters parameters, int i) {
        for (int[] iArr : parameters.getSupportedPreviewFpsRange()) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (i2 == i3 && i2 == i) {
                parameters.setPreviewFpsRange(i2, i3);
                return iArr[0];
            }
        }
        int[] iArr2 = new int[2];
        parameters.getPreviewFpsRange(iArr2);
        int i4 = iArr2[0];
        int i5 = iArr2[1];
        if (i4 == i5) {
            return i4;
        }
        return i5 / 2;
    }

    public static void choosePreviewSize(Camera.Parameters parameters, int i, int i2) {
        Camera.Size preferredPreviewSizeForVideo = parameters.getPreferredPreviewSizeForVideo();
        Iterator<Camera.Size> it = parameters.getSupportedPreviewSizes().iterator();
        while (it.hasNext()) {
            it.next();
        }
        for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
            if (size.width == i && size.height == i2) {
                parameters.setPreviewSize(i, i2);
                return;
            }
        }
        if (preferredPreviewSizeForVideo != null) {
            parameters.setPreviewSize(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
        }
    }
}
