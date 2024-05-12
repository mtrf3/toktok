package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C16880lQ;
import X.C1EU;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.strategy.PerfAwareFpsStrategy;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class FpsLevelStrategy implements PerfAwareFpsStrategy.PerfObserver {
    public static final String TAG = C16880lQ.LJLLJ(FpsLevelStrategy.class);
    public int mFpsUpperLimit;
    public final WeakReference<LiveStream> mLiveStreamWeak;
    public final PushBase mPushBase;
    public final int mFpsLowerLimit = 15;
    public final StringBuilder mSB = new StringBuilder();

    private void downgradeFps() {
        int i = this.mPushBase.fps;
        int i2 = ((i - 1) / 5) * 5;
        if (i2 >= i) {
            return;
        }
        int max = Math.max(i2, 15);
        this.mSB.setLength(0);
        C1EU.LIZJ(this.mSB, "downgrade fps: ", i, " -> ", max);
        AVLog.iow(TAG, this.mSB.toString());
        adjustFps(i, max, "performance");
    }

    private int getFallbackFps() {
        LiveStream liveStream;
        LiveStreamBuilder liveStreamBuilder;
        JSONObject jSONObject = this.mPushBase.fallbackFpsMap;
        if (jSONObject == null || (liveStream = getLiveStream()) == null || (liveStreamBuilder = liveStream.getLiveStreamBuilder()) == null) {
            return 15;
        }
        int videoHeight = liveStreamBuilder.getVideoHeight() * liveStreamBuilder.getVideoWidth();
        int[] iArr = {2073600, 921600, 518400, 414720};
        String[] strArr = {"1080P", "720P", "540P", "480P"};
        int i = 0;
        while (videoHeight < (iArr[i] * 9) / 10) {
            i++;
            if (i >= 4) {
                return 15;
            }
        }
        int optInt = jSONObject.optInt(strArr[i]);
        if (optInt <= 0) {
            return 15;
        }
        return optInt;
    }

    private LiveStream getLiveStream() {
        WeakReference<LiveStream> weakReference = this.mLiveStreamWeak;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void upgradeFps() {
        int i = this.mPushBase.fps;
        int i2 = ((i / 5) + 1) * 5;
        if (i2 <= i) {
            return;
        }
        int min = Math.min(i2, this.mFpsUpperLimit);
        this.mSB.setLength(0);
        C1EU.LIZJ(this.mSB, "upgrade fps: ", min, " -> ", min);
        AVLog.iow(TAG, this.mSB.toString());
        adjustFps(i, min, "performance");
    }

    public FpsLevelStrategy(LiveStream liveStream) {
        this.mLiveStreamWeak = new WeakReference<>(liveStream);
        PushBase pushBase = liveStream.getLiveStreamBuilder().getPushBase();
        this.mPushBase = pushBase;
        this.mFpsUpperLimit = pushBase.fps;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.strategy.PerfAwareFpsStrategy.PerfObserver
    public void checkSummaries(List<PerfAwareFpsStrategy.FpsWndSummary> list) {
        if (!this.mPushBase.liveFallbackFps) {
            return;
        }
        int size = list.size();
        LiveStream liveStream = getLiveStream();
        int i = this.mPushBase.fps;
        if (liveStream != null && size >= 3) {
            if (i > 15) {
                double[] dArr = {0.1d, 0.3d, 0.6d};
                double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                int i2 = 0;
                do {
                    double d5 = ((PerfAwareFpsStrategy.FpsWndSummary) ListProtector.get(list, (size - 3) + i2)).avgPreviewFps;
                    double d6 = dArr[i2];
                    d4 += d5 * d6;
                    d += r11.minus1FpsCount * d6;
                    d3 += r11.minus3FpsCount * d6;
                    d2 += r11.totalCount * d6;
                    i2++;
                } while (i2 < 3);
                double d7 = d3 / d2;
                this.mSB.setLength(0);
                StringBuilder sb = this.mSB;
                sb.append("Summaries of last 3 minutes: weightedAvgPreviewFps ");
                sb.append(about(d4, 2));
                sb.append(", minus1FpsRatio ");
                sb.append(about(d / d2, 2));
                sb.append(", minus3FpsRatio ");
                sb.append(about(d7, 2));
                AVLog.iod(TAG, this.mSB.toString());
                if (d4 < i - 2 || d7 > 0.5d) {
                    downgradeFps();
                    return;
                }
            } else if (liveStream == null) {
                return;
            }
            if (size >= 10 && i < this.mFpsUpperLimit) {
                for (int i3 = size - 1; i3 >= size - 10 && i3 >= 0; i3--) {
                    if (((PerfAwareFpsStrategy.FpsWndSummary) ListProtector.get(list, i3)).avgPreviewFps + 0.2d < i) {
                        return;
                    }
                }
                upgradeFps();
            }
        }
    }

    public int switchFpsFallback(boolean z) {
        int i;
        int i2 = -1;
        if (getLiveStream() != null && this.mPushBase.interactFallbackFps) {
            this.mSB.setLength(0);
            StringBuilder sb = this.mSB;
            sb.append("fallback: ");
            sb.append(z);
            sb.append(", fps: ");
            int i3 = this.mPushBase.fps;
            if (z) {
                i = getFallbackFps();
                if (i3 > i) {
                    StringBuilder sb2 = this.mSB;
                    sb2.append(i3);
                    sb2.append(" -> ");
                    sb2.append(i);
                    adjustFps(i3, i, "checkFpsFallback");
                    i2 = i;
                }
                AVLog.iow(TAG, this.mSB.toString());
            } else {
                if (i3 != this.mFpsUpperLimit) {
                    StringBuilder sb3 = this.mSB;
                    sb3.append(i3);
                    sb3.append(" -> ");
                    sb3.append(this.mFpsUpperLimit);
                    adjustFps(i3, this.mFpsUpperLimit, "checkFpsFallback");
                    i = this.mFpsUpperLimit;
                    i2 = i;
                }
                AVLog.iow(TAG, this.mSB.toString());
            }
        }
        return i2;
    }

    public void updateFpsUpperLimit(int i) {
        if (i != this.mFpsUpperLimit) {
            this.mFpsUpperLimit = i;
        }
    }

    private double about(double d, int i) {
        int i2 = 1;
        while (true) {
            int i3 = i - 1;
            if (i > 0) {
                i2 *= 10;
                i = i3;
            } else {
                return (Math.round(d * r4) * 1.0d) / i2;
            }
        }
    }

    private void adjustFps(int i, int i2, String str) {
        LiveStream liveStream = getLiveStream();
        if (liveStream != null) {
            TEBundle tEBundle = new TEBundle();
            tEBundle.setInt("fps", i2);
            if (liveStream.getLiveStreamBuilder().isNetFpsAdaptiveEnable()) {
                tEBundle.setInt("maxFps", i2);
            }
            tEBundle.setString("from", str);
            liveStream.updateSdkParams(tEBundle);
            liveStream.reportFpsAdjust(i, i2, str);
            tEBundle.release();
        }
    }
}
