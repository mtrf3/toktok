package com.ss.ttlivestreamer.core.codec;

import X.AnonymousClass030;
import X.AnonymousClass036;
import X.C08380Uo;
import X.X1D;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public abstract class HardwareVideoEncodeRoi {
    public String TAG = "HardwareVideoEncodeRoi";
    public double mRoiBitrateRatio;
    public int mRoiOn;
    public int mRoiQP;
    public boolean mStretchRoi;

    public abstract void configureRoi(MediaFormat mediaFormat);

    public abstract void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i);

    public double getRoiSettingBitrateRatio() {
        int i = this.mRoiOn;
        if (i == 1 || i == 0) {
            return this.mRoiBitrateRatio;
        }
        return -1.0d;
    }

    /* loaded from: classes12.dex */
    public static class HisiRoi extends HardwareVideoEncodeRoi {
        public Bundle mBundle;

        public HisiRoi(TEBundle tEBundle) {
            super(tEBundle);
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi
        public void configureRoi(MediaFormat mediaFormat) {
            if (this.mRoiOn != 1) {
                return;
            }
            mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-vendor-configure", 1);
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi
        public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
            if (!super.checkSupportRoi(mediaCodec, tEBundle)) {
                return false;
            }
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            if (!outputFormat.containsKey("vendor.hisi.hisi-ext-codec-roi-supported") || outputFormat.getInteger("vendor.hisi.hisi-ext-codec-roi-supported") != 1) {
                this.mRoiOn = -101;
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    bundle.setInt("roi_on", this.mRoiOn);
                    tEBundle.setBundle("roi_settings", bundle);
                }
            }
            if (this.mRoiOn != 1) {
                return false;
            }
            return true;
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi
        public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i) {
            int[] stretchedRoi;
            if (this.mRoiOn != 1 || mediaCodec == null || videoFrame == null || videoFrame.getBuffer() == null) {
                return;
            }
            if (this.mBundle == null) {
                Bundle bundle = new Bundle();
                this.mBundle = bundle;
                bundle.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp-mode", 0);
                this.mBundle.putInt("vendor.hisi.hisi-ext-codec-roi-0-qp", this.mRoiQP);
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            RoiInfo rOIInfo = buffer.getROIInfo();
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (rOIInfo == null) {
                this.mBundle.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", 0L);
                mediaCodec.setParameters(this.mBundle);
                return;
            }
            int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
            int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
            int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
            int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
            if (this.mStretchRoi && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                centerPosX = stretchedRoi[0];
                centerPosY = stretchedRoi[1];
                roiWidth = stretchedRoi[2];
                roiHeight = stretchedRoi[3];
            }
            int min = Math.min(Math.max(0, centerPosX), width - 1);
            int min2 = Math.min(Math.max(0, centerPosY), height - 1);
            int min3 = Math.min(roiWidth - min, width - min);
            int min4 = Math.min(roiHeight - min2, height - min2);
            int i2 = width * height;
            if (min3 * min4 > i2 / 5) {
                double d = i2;
                double d2 = min3;
                double d3 = min4;
                double d4 = d / ((5.0d * d2) * d3);
                int sqrt = (int) (d2 * Math.sqrt(d4));
                int sqrt2 = (int) (Math.sqrt(d4) * d3);
                min = AnonymousClass030.LIZJ(min3, sqrt, 2, min);
                min2 = AnonymousClass030.LIZJ(min4, sqrt2, 2, min2);
                min4 = sqrt2;
                min3 = sqrt;
            }
            this.mBundle.putLong("vendor.hisi.hisi-ext-codec-roi-0-params", min | (min2 << 16) | (min3 << 32) | (min4 << 48));
            mediaCodec.setParameters(this.mBundle);
        }
    }

    /* loaded from: classes12.dex */
    public static class QcomRoi extends HardwareVideoEncodeRoi {
        public Bundle mBundle;

        public QcomRoi(TEBundle tEBundle) {
            super(tEBundle);
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi
        public void configureRoi(MediaFormat mediaFormat) {
            if (this.mRoiOn != 1) {
                return;
            }
            mediaFormat.setInteger("bitrate-mode", 1);
            DebugLogUtils.isEnableDebugLog();
            mediaFormat.setString("vendor.qti-ext-extradata-enable.types", "roiinfo");
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi
        public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
            boolean z;
            boolean z2;
            if (!super.checkSupportRoi(mediaCodec, tEBundle)) {
                return false;
            }
            MediaFormat outputFormat = mediaCodec.getOutputFormat();
            if ((outputFormat.containsKey("vendor.qti-ext-enc-roiinfo-rect-mode.enable") && outputFormat.getInteger("vendor.qti-ext-enc-roiinfo-rect-mode.enable") == 0) || (outputFormat.containsKey("roi-on") && outputFormat.getInteger("roi-on") == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (outputFormat.getString("vendor.qti-ext-extradata-enable.types") != null && outputFormat.getString("vendor.qti-ext-extradata-enable.types").equals("roiinfo")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || !z2) {
                String str = this.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Roi unsupported: ");
                LIZ.append(outputFormat);
                AVLog.logKibana(5, str, X1D.LIZIZ(LIZ), null);
                this.mRoiOn = -101;
                TEBundle bundle = tEBundle.getBundle("roi_settings");
                if (bundle != null) {
                    bundle.setInt("roi_on", this.mRoiOn);
                    tEBundle.setBundle("roi_settings", bundle);
                }
            }
            if (this.mRoiOn != 1) {
                return false;
            }
            return true;
        }

        @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncodeRoi
        public void encodeWithRoi(MediaCodec mediaCodec, VideoFrame videoFrame, int i) {
            int[] stretchedRoi;
            if (this.mRoiOn != 1 || mediaCodec == null || videoFrame == null || videoFrame.getBuffer() == null) {
                return;
            }
            if (this.mBundle == null) {
                Bundle bundle = new Bundle();
                this.mBundle = bundle;
                bundle.putString("vendor.qti-ext-enc-roiinfo.type", "rect");
            }
            this.mBundle.putLong("vendor.qti-ext-enc-roiinfo.timestamp", videoFrame.getTimestampNs() / 1000);
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            RoiInfo rOIInfo = buffer.getROIInfo();
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            String str = "0,0-0,0=-6;";
            if (rOIInfo == null) {
                this.mBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", "0,0-0,0=-6;");
                mediaCodec.setParameters(this.mBundle);
                return;
            }
            int centerPosX = rOIInfo.getCenterPosX() - (rOIInfo.getRoiWidth() / 2);
            int roiWidth = rOIInfo.getRoiWidth() + centerPosX;
            int centerPosY = rOIInfo.getCenterPosY() - (rOIInfo.getRoiHeight() / 2);
            int roiHeight = rOIInfo.getRoiHeight() + centerPosY;
            if (this.mStretchRoi && (stretchedRoi = rOIInfo.getStretchedRoi()) != null && stretchedRoi.length >= 4) {
                centerPosX = stretchedRoi[0];
                centerPosY = stretchedRoi[1];
                roiWidth = stretchedRoi[2];
                roiHeight = stretchedRoi[3];
            }
            if (AnonymousClass036.LIZIZ(centerPosX, roiWidth, centerPosY, roiHeight) > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(Math.max(0, centerPosY));
                LIZ.append(",");
                LIZ.append(Math.max(0, centerPosX));
                LIZ.append("-");
                LIZ.append(Math.min(height - 1, roiHeight));
                LIZ.append(",");
                LIZ.append(Math.min(width - 1, roiWidth));
                LIZ.append("=");
                str = C08380Uo.LIZ(LIZ, this.mRoiQP, ";", LIZ);
            }
            this.mBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", str);
            mediaCodec.setParameters(this.mBundle);
        }
    }

    public HardwareVideoEncodeRoi(TEBundle tEBundle) {
        this.mRoiQP = -6;
        this.mRoiBitrateRatio = -1.0d;
        this.mRoiOn = tEBundle.getInt("roi_on");
        boolean bool = tEBundle.getBool("video_lossless_encode");
        if (this.mRoiOn == 1 && bool) {
            this.mRoiOn = -103;
            tEBundle.setInt("roi_on", -103);
        }
        if (tEBundle.contains("roi_qp") && tEBundle.getInt("roi_qp") != -100) {
            this.mRoiQP = tEBundle.getInt("roi_qp");
        }
        if (tEBundle.contains("roi_bitrate_ratio")) {
            this.mRoiBitrateRatio = tEBundle.getDouble("roi_bitrate_ratio");
        }
        if (tEBundle.contains("roi_stretch")) {
            this.mStretchRoi = tEBundle.getBool("roi_stretch");
        }
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("roi enabled: ");
        LIZ.append(this.mRoiOn);
        LIZ.append(", roi qp: ");
        LIZ.append(this.mRoiQP);
        LIZ.append(", bitrate ratio: ");
        LIZ.append(this.mRoiBitrateRatio);
        LIZ.append(", stretch roi: ");
        LIZ.append(this.mStretchRoi);
        AVLog.ioi(str, X1D.LIZIZ(LIZ));
    }

    public static double getRoiSettingBitrateRatio(TEBundle tEBundle) {
        TEBundle bundle = tEBundle.getBundle("roi_settings");
        if (bundle == null || !bundle.contains("roi_bitrate_ratio")) {
            return -1.0d;
        }
        int i = bundle.getInt("roi_on");
        if (i != 1 && i != 0) {
            return -1.0d;
        }
        return bundle.getDouble("roi_bitrate_ratio");
    }

    public static HardwareVideoEncodeRoi createRoiProcessor(String str, TEBundle tEBundle) {
        HardwareVideoEncodeRoi hardwareVideoEncodeRoi;
        TEBundle bundle = tEBundle.getBundle("roi_settings");
        if (bundle == null || bundle.getInt("roi_on") != 1) {
            return null;
        }
        if (str.startsWith("OMX.qcom.")) {
            hardwareVideoEncodeRoi = new QcomRoi(bundle);
        } else if (str.startsWith("OMX.hisi.")) {
            hardwareVideoEncodeRoi = new HisiRoi(bundle);
        } else {
            bundle.setInt("roi_on", -102);
            hardwareVideoEncodeRoi = null;
        }
        if (bundle.getInt("roi_on") != 1) {
            tEBundle.setBundle("roi_settings", bundle);
            return null;
        }
        return hardwareVideoEncodeRoi;
    }

    public boolean checkSupportRoi(MediaCodec mediaCodec, TEBundle tEBundle) {
        if (this.mRoiOn == 1) {
            return true;
        }
        return false;
    }
}
