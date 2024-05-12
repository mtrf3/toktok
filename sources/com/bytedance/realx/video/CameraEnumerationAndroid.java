package com.bytedance.realx.video;

import X.X1D;
import android.graphics.ImageFormat;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes33.dex */
public class CameraEnumerationAndroid {
    public static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, LiveTryModeCountDownThresholdSetting.DEFAULT), new Size(240, 160), new Size(320, 240), new Size(LiveChatShowDelayForHotLiveSetting.DEFAULT, 240), new Size(480, 320), new Size(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 360), new Size(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), new Size(1024, 576), new Size(1024, 600), new Size(1280, 720), new Size(1280, 1024), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)));

    /* loaded from: classes33.dex */
    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        /* loaded from: classes33.dex */
        public static class FramerateRange {
            public int max;
            public int min;

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[");
                LIZ.append(this.min / 1000.0f);
                LIZ.append(":");
                LIZ.append(this.max / 1000.0f);
                LIZ.append("]");
                return X1D.LIZIZ(LIZ);
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min != framerateRange.min || this.max != framerateRange.max) {
                    return false;
                }
                return true;
            }

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.width);
            LIZ.append("x");
            LIZ.append(this.height);
            LIZ.append("@");
            LIZ.append(this.framerate);
            return X1D.LIZIZ(LIZ);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width != captureFormat.width || this.height != captureFormat.height || !this.framerate.equals(captureFormat.framerate)) {
                return false;
            }
            return true;
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }
    }

    /* loaded from: classes33.dex */
    public static abstract class ClosestComparator<T> implements Comparator<T> {
        public abstract int diff(T t);

        public ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: com.bytedance.realx.video.CameraEnumerationAndroid.1
            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                if (i2 < i3) {
                    return i2 * i4;
                }
                return ((i2 - i3) * i5) + (i4 * i3);
            }

            @Override // com.bytedance.realx.video.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(Math.abs((i * 1000) - framerateRange.min), 5000, 1, 3) + progressivePenalty(Math.abs((i * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: com.bytedance.realx.video.CameraEnumerationAndroid.2
            @Override // com.bytedance.realx.video.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i - size.width) + Math.abs(i2 - size.height);
            }
        });
    }

    public static Size getUpClosestSupportedSize(List<Size> list, int i, int i2) {
        int abs;
        new Size(0, 0);
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Size size = (Size) ListProtector.get(list, i4);
            int i5 = size.width;
            if (i5 >= i && (abs = Math.abs(i - i5) + Math.abs(i2 - size.height)) <= i3) {
                i3 = abs;
            }
        }
        return getClosestSupportedSize(list, i, i2);
    }
}
