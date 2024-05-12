package com.ss.android.ugc.aweme.ml.ab;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* loaded from: classes9.dex */
public final class SmartHARExperiment {
    public static boolean LIZ;
    public static SmartHarModel LIZIZ;

    /* loaded from: classes9.dex */
    public static final class SmartHarModel {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("ml_sdk_url")
        public String mlSdkPackageUrl;

        @InterfaceC65349Pkn("opt_sensor_register")
        public boolean optSensorRegister;

        @InterfaceC65349Pkn("use_smooth")
        public boolean useSmooth;

        @InterfaceC65349Pkn("skip_count")
        public int skipCount = 4;

        @InterfaceC65349Pkn("run_delay")
        public int runDelay = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

        @InterfaceC65349Pkn("run_time_gap")
        public int runTimeGap = 5000;

        @InterfaceC65349Pkn("run_feed_gap")
        public int runFeedGap = 1;

        @InterfaceC65349Pkn("run_continues_gap")
        public int runContinuesGapMs = -1;

        @InterfaceC65349Pkn("run_mode")
        public int runMode = 1;

        @InterfaceC65349Pkn("report_track_rate")
        public float reportTrackRate = 1.0f;

        public String toString() {
            return super.toString();
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final String getMlSdkPackageUrl() {
            return this.mlSdkPackageUrl;
        }

        public final boolean getOptSensorRegister() {
            return this.optSensorRegister;
        }

        public final float getReportTrackRate() {
            return this.reportTrackRate;
        }

        public final int getRunContinuesGapMs() {
            return this.runContinuesGapMs;
        }

        public final int getRunDelay() {
            return this.runDelay;
        }

        public final int getRunFeedGap() {
            return this.runFeedGap;
        }

        public final int getRunMode() {
            return this.runMode;
        }

        public final int getRunTimeGap() {
            return this.runTimeGap;
        }

        public final int getSkipCount() {
            return this.skipCount;
        }

        public final boolean getUseSmooth() {
            return this.useSmooth;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setMlSdkPackageUrl(String str) {
            this.mlSdkPackageUrl = str;
        }

        public final void setOptSensorRegister(boolean z) {
            this.optSensorRegister = z;
        }

        public final void setReportTrackRate(float f) {
            this.reportTrackRate = f;
        }

        public final void setRunContinuesGapMs(int i) {
            this.runContinuesGapMs = i;
        }

        public final void setRunDelay(int i) {
            this.runDelay = i;
        }

        public final void setRunFeedGap(int i) {
            this.runFeedGap = i;
        }

        public final void setRunMode(int i) {
            this.runMode = i;
        }

        public final void setRunTimeGap(int i) {
            this.runTimeGap = i;
        }

        public final void setSkipCount(int i) {
            this.skipCount = i;
        }

        public final void setUseSmooth(boolean z) {
            this.useSmooth = z;
        }
    }
}
