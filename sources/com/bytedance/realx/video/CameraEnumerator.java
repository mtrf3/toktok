package com.bytedance.realx.video;

import com.bytedance.realx.video.CameraEnumerationAndroid;
import com.bytedance.realx.video.CameraVideoCapturer;
import java.util.List;

/* loaded from: classes33.dex */
public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    int getDeviceOrientation(String str);

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
