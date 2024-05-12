package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C16880lQ;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes12.dex */
public class PerfAwareFpsStrategy {
    public static final String TAG = C16880lQ.LJLLJ(PerfAwareFpsStrategy.class);
    public Runnable mGetReportRunnable;
    public int mLastMetaFps;
    public final WeakReference<LiveStream> mLiveStreamWeak;
    public final PushBase mPushBase;
    public final Handler mWorkThreadHandler;
    public final ArrayList<Double> mPreviewFpsList = new ArrayList<>();
    public final ArrayList<FpsWndSummary> mSummaryList = new ArrayList<>();
    public final ArrayList<PerfObserver> mObservers = new ArrayList<>();
    public final int mInterval = 3;
    public final int mMaxWndSize = 10;
    public final StringBuilder mSB = new StringBuilder();

    /* loaded from: classes12.dex */
    public static class FpsWndSummary {
        public double avgPreviewFps;
        public int minus1FpsCount;
        public int minus3FpsCount;
        public int totalCount;
    }

    /* loaded from: classes12.dex */
    public interface PerfObserver {
        void checkSummaries(List<FpsWndSummary> list);
    }

    public static /* synthetic */ void LIZ(PerfAwareFpsStrategy perfAwareFpsStrategy) {
        perfAwareFpsStrategy.lambda$new$0();
    }

    private void clearLists() {
        this.mPreviewFpsList.clear();
        this.mSummaryList.clear();
    }

    private LiveStream getLiveStream() {
        WeakReference<LiveStream> weakReference = this.mLiveStreamWeak;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private int getMetaVideoFrameRate() {
        return this.mPushBase.fps;
    }

    public void release() {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mGetReportRunnable);
        }
    }

    private void getPreviewFpsOnce() {
        int metaVideoFrameRate = getMetaVideoFrameRate();
        if (metaVideoFrameRate != this.mLastMetaFps) {
            clearLists();
            this.mLastMetaFps = metaVideoFrameRate;
        }
        LiveStream liveStream = getLiveStream();
        if (liveStream != null) {
            handlePreviewFps(liveStream.getStaticsInfoWithKey("vsourc_deliver_fps"));
        }
    }

    public /* synthetic */ void lambda$new$0() {
        if (getLiveStream() == null) {
            return;
        }
        if (this.mObservers.size() > 0) {
            getPreviewFpsOnce();
        } else {
            clearLists();
        }
        this.mWorkThreadHandler.postDelayed(this.mGetReportRunnable, 3000L);
    }

    private void checkSummaries(FpsWndSummary fpsWndSummary) {
        this.mSummaryList.add(fpsWndSummary);
        while (this.mSummaryList.size() > 10) {
            ListProtector.remove(this.mSummaryList, 0);
        }
        synchronized (this.mObservers) {
            Iterator<PerfObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                it.next().checkSummaries(this.mSummaryList);
            }
        }
    }

    private void handlePreviewFps(double d) {
        this.mPreviewFpsList.add(Double.valueOf(d));
        if (getLiveStream() != null && this.mPreviewFpsList.size() >= 20) {
            FpsWndSummary fpsWndSummary = new FpsWndSummary();
            fpsWndSummary.totalCount = this.mPreviewFpsList.size();
            this.mSB.setLength(0);
            this.mSB.append("fps of last 1 minute: ");
            Iterator<Double> it = this.mPreviewFpsList.iterator();
            double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            while (it.hasNext()) {
                Double next = it.next();
                StringBuilder sb = this.mSB;
                sb.append(Math.round(next.doubleValue()));
                sb.append(' ');
                d2 += next.doubleValue();
                int metaVideoFrameRate = getMetaVideoFrameRate();
                if (next.doubleValue() < metaVideoFrameRate - 1) {
                    fpsWndSummary.minus1FpsCount++;
                }
                if (next.doubleValue() < metaVideoFrameRate - 3) {
                    fpsWndSummary.minus3FpsCount++;
                }
            }
            fpsWndSummary.avgPreviewFps = d2 / this.mPreviewFpsList.size();
            StringBuilder sb2 = this.mSB;
            sb2.append(". Summary: average ");
            sb2.append(C16880lQ.LLLZI(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(fpsWndSummary.avgPreviewFps)}));
            sb2.append(", minus_1_count/total ");
            sb2.append(fpsWndSummary.minus1FpsCount);
            sb2.append('/');
            sb2.append(fpsWndSummary.totalCount);
            sb2.append(", minus_3_count/total ");
            sb2.append(fpsWndSummary.minus3FpsCount);
            sb2.append('/');
            sb2.append(fpsWndSummary.totalCount);
            AVLog.iod(TAG, this.mSB.toString());
            this.mPreviewFpsList.clear();
            checkSummaries(fpsWndSummary);
        }
    }

    public void addPerfObserver(PerfObserver perfObserver) {
        synchronized (this.mObservers) {
            Iterator<PerfObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                if (it.next() == perfObserver) {
                    return;
                }
            }
            this.mObservers.add(perfObserver);
        }
    }

    public void removePerfObserver(PerfObserver perfObserver) {
        synchronized (this.mObservers) {
            Iterator<PerfObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                PerfObserver next = it.next();
                if (next == perfObserver) {
                    this.mObservers.remove(next);
                    return;
                }
            }
        }
    }

    public PerfAwareFpsStrategy(LiveStream liveStream, Handler handler) {
        this.mLiveStreamWeak = new WeakReference<>(liveStream);
        this.mPushBase = liveStream.getLiveStreamBuilder().getPushBase();
        this.mWorkThreadHandler = handler;
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(5, this, 6);
        this.mGetReportRunnable = iDRunnableS6S0101000;
        handler.postDelayed(iDRunnableS6S0101000, 10000L);
    }
}
