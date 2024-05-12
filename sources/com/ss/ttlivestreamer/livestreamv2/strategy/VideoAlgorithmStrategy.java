package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C16880lQ;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.strategy.PerfAwareFpsStrategy;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes12.dex */
public class VideoAlgorithmStrategy implements PerfAwareFpsStrategy.PerfObserver {
    public static final String TAG = C16880lQ.LJLLJ(VideoAlgorithmStrategy.class);
    public WeakReference<FilterManager> mFilterManager;
    public WeakReference<LiveStream> mLiveStreamWeak;
    public PushBase mPushBase;

    public VideoAlgorithmStrategy(LiveStream liveStream) {
        if (liveStream.getLiveStreamBuilder().getSdkSetting().switchParams.getPerfAwareSwitch()) {
            this.mLiveStreamWeak = new WeakReference<>(liveStream);
            this.mPushBase = liveStream.getLiveStreamBuilder().getPushBase();
            IFilterManager videoFilterMgr = liveStream.getVideoFilterMgr();
            this.mFilterManager = new WeakReference<>(videoFilterMgr instanceof FilterManager ? videoFilterMgr : null);
            return;
        }
        AVLog.iow(TAG, "perfAwareSwitch is off.");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.strategy.PerfAwareFpsStrategy.PerfObserver
    public void checkSummaries(List<PerfAwareFpsStrategy.FpsWndSummary> list) {
        LiveStream liveStream;
        int size;
        int i;
        WeakReference<LiveStream> weakReference = this.mLiveStreamWeak;
        FilterManager filterManager = null;
        if (weakReference != null) {
            liveStream = weakReference.get();
        } else {
            liveStream = null;
        }
        WeakReference<FilterManager> weakReference2 = this.mFilterManager;
        if (weakReference2 != null) {
            filterManager = weakReference2.get();
        }
        if (liveStream == null || filterManager == null || (size = list.size()) < 3) {
            return;
        }
        int i2 = ((PerfAwareFpsStrategy.FpsWndSummary) ListProtector.get(list, size - 1)).totalCount;
        double d = (r2.minus1FpsCount * 1.0d) / i2;
        double d2 = (r2.minus3FpsCount * 1.0d) / i2;
        double[] dArr = {0.1d, 0.3d, 0.6d};
        double d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d5 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d6 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i3 = 0;
        do {
            double d7 = ((PerfAwareFpsStrategy.FpsWndSummary) ListProtector.get(list, (size - 3) + i3)).avgPreviewFps;
            double d8 = dArr[i3];
            d6 = (d7 * d8) + d6;
            d3 += r11.minus1FpsCount * d8;
            d5 = (r11.minus3FpsCount * d8) + d5;
            d4 += r11.totalCount * d8;
            i3++;
        } while (i3 < 3);
        double d9 = d3 / d4;
        double d10 = d5 / d4;
        if (d > 0.9d || d9 > 0.7d || d6 < this.mPushBase.fps - 0.7d) {
            i = -1;
        } else {
            i = 0;
        }
        if (d2 > 0.9d || d10 > 0.7d || d6 < this.mPushBase.fps - 2) {
            i = -2;
        } else if (i >= 0) {
            if (size < 10) {
                return;
            }
            for (int i4 = size - 1; i4 >= size - 10 && i4 >= 0; i4--) {
                if (((PerfAwareFpsStrategy.FpsWndSummary) ListProtector.get(list, i4)).avgPreviewFps + 0.2d < this.mPushBase.fps) {
                    return;
                }
            }
            filterManager.onFpsPerformanceLevel(1);
            return;
        }
        filterManager.onFpsPerformanceLevel(i);
    }
}
