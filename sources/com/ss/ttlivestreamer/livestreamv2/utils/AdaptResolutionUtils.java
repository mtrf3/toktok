package com.ss.ttlivestreamer.livestreamv2.utils;

import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class AdaptResolutionUtils {
    public int adaptedQuirks;
    public VideoCapturer capture;
    public int framePerSecond;
    public int lastCaptureHeight;
    public int lastCaptureWidth;
    public int lastHeight;
    public int lastResultHeight;
    public int lastResultWidth;
    public int lastWidth;
    public TEBundle params;

    public void reset() {
        this.lastResultWidth = 0;
        this.lastResultHeight = 0;
        this.lastWidth = 0;
        this.lastHeight = 0;
        this.lastCaptureWidth = 0;
        this.lastCaptureHeight = 0;
    }

    public void initAdaptFormatParams(int i, VideoCapturer videoCapturer, int i2, TEBundle tEBundle) {
        this.adaptedQuirks = i;
        this.capture = videoCapturer;
        this.framePerSecond = i2;
        this.params = tEBundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x0093, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000d, B:8:0x0015, B:10:0x0019, B:12:0x001d, B:14:0x0021, B:19:0x0027, B:21:0x0033, B:23:0x0042, B:24:0x0046, B:26:0x004c, B:28:0x0050, B:31:0x0056, B:33:0x005a, B:35:0x005e, B:37:0x0075, B:39:0x007b, B:41:0x0081), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void refreshAdaptFormat(int r8, int r9, int r10, int r11, com.ss.ttlivestreamer.livestreamv2.LiveStreamGpuTurboWrapper r12, boolean r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r12.isGpuTurboEnabled()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto La
            if (r13 != 0) goto L27
            goto Ld
        La:
            if (r13 != 0) goto L27
            goto L15
        Ld:
            int r8 = r12.getDownSamplingWidth()     // Catch: java.lang.Throwable -> L93
            int r9 = r12.getDownSamplingHeight()     // Catch: java.lang.Throwable -> L93
        L15:
            int r0 = r7.lastWidth     // Catch: java.lang.Throwable -> L93
            if (r0 != r8) goto L27
            int r0 = r7.lastHeight     // Catch: java.lang.Throwable -> L93
            if (r0 != r9) goto L27
            int r0 = r7.lastCaptureWidth     // Catch: java.lang.Throwable -> L93
            if (r0 != r10) goto L27
            int r0 = r7.lastCaptureHeight     // Catch: java.lang.Throwable -> L93
            if (r0 != r11) goto L27
            monitor-exit(r7)
            return
        L27:
            r7.lastWidth = r8     // Catch: java.lang.Throwable -> L93
            r7.lastHeight = r9     // Catch: java.lang.Throwable -> L93
            r7.lastCaptureWidth = r10     // Catch: java.lang.Throwable -> L93
            r7.lastCaptureHeight = r11     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.capture.video.VideoCapturer r0 = r7.capture     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L91
            r0 = 2
            int[] r5 = new int[r0]     // Catch: java.lang.Throwable -> L93
            r3 = 0
            r5[r3] = r3     // Catch: java.lang.Throwable -> L93
            r6 = 1
            r5[r6] = r3     // Catch: java.lang.Throwable -> L93
            int r0 = r7.adaptedQuirks     // Catch: java.lang.Throwable -> L93
            r0 = r0 & 1
            if (r0 == 0) goto L46
            r5[r3] = r8     // Catch: java.lang.Throwable -> L93
            r5[r6] = r9     // Catch: java.lang.Throwable -> L93
        L46:
            boolean r0 = com.ss.ttlivestreamer.core.utils.MiscUtils.chooseBestResolution(r10, r11, r8, r9, r5)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L73
            r2 = r5[r3]     // Catch: java.lang.Throwable -> L93
            if (r2 <= r6) goto L73
            r1 = r5[r6]     // Catch: java.lang.Throwable -> L93
            if (r1 <= r6) goto L73
            if (r13 != 0) goto L5e
            int r0 = r7.lastResultHeight     // Catch: java.lang.Throwable -> L93
            if (r0 != r1) goto L5e
            int r0 = r7.lastResultWidth     // Catch: java.lang.Throwable -> L93
            if (r0 == r2) goto L91
        L5e:
            r7.lastResultWidth = r2     // Catch: java.lang.Throwable -> L93
            r7.lastResultHeight = r1     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.utils.DebugLogUtils.isEnableDebugLog()     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.capture.video.VideoCapturer r4 = r7.capture     // Catch: java.lang.Throwable -> L93
            r3 = r5[r3]     // Catch: java.lang.Throwable -> L93
            r2 = r5[r6]     // Catch: java.lang.Throwable -> L93
            int r1 = r7.framePerSecond     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.utils.TEBundle r0 = r7.params     // Catch: java.lang.Throwable -> L93
            r4.adaptOutputFormat(r3, r2, r1, r0)     // Catch: java.lang.Throwable -> L93
            goto L91
        L73:
            if (r13 != 0) goto L81
            int r1 = r7.lastResultHeight     // Catch: java.lang.Throwable -> L93
            r0 = r5[r6]     // Catch: java.lang.Throwable -> L93
            if (r1 != r0) goto L81
            int r1 = r7.lastResultWidth     // Catch: java.lang.Throwable -> L93
            r0 = r5[r3]     // Catch: java.lang.Throwable -> L93
            if (r1 == r0) goto L91
        L81:
            r7.lastResultWidth = r8     // Catch: java.lang.Throwable -> L93
            r7.lastResultHeight = r9     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.utils.DebugLogUtils.isEnableDebugLog()     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.capture.video.VideoCapturer r2 = r7.capture     // Catch: java.lang.Throwable -> L93
            int r1 = r7.framePerSecond     // Catch: java.lang.Throwable -> L93
            com.ss.ttlivestreamer.core.utils.TEBundle r0 = r7.params     // Catch: java.lang.Throwable -> L93
            r2.adaptOutputFormat(r8, r9, r1, r0)     // Catch: java.lang.Throwable -> L93
        L91:
            monitor-exit(r7)
            return
        L93:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.utils.AdaptResolutionUtils.refreshAdaptFormat(int, int, int, int, com.ss.ttlivestreamer.livestreamv2.LiveStreamGpuTurboWrapper, boolean):void");
    }
}
