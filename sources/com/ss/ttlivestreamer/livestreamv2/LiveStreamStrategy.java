package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.strategy.LiveStreamBaseStrategy;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class LiveStreamStrategy extends LiveStreamBaseStrategy {
    public final WeakReference<TEBundle> mEncodeStreamOpt;
    public LiveStreamBuilder mLiveStreamBuilder;
    public boolean mReleased;
    public final TEBundle mSettings;
    public final WeakReference<TEBundle> mTransportOpt;

    @Override // com.ss.ttlivestreamer.core.strategy.LiveStreamBaseStrategy, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mReleased = true;
        this.mSettings.release();
        super.release();
    }

    public void setLiveStreamBuilder(LiveStreamBuilder liveStreamBuilder) {
        this.mLiveStreamBuilder = liveStreamBuilder;
    }

    public LiveStreamStrategy(TEBundle tEBundle, TEBundle tEBundle2, LiveStreamBaseStrategy.IStrategyNotify iStrategyNotify) {
        super(iStrategyNotify);
        this.mEncodeStreamOpt = new WeakReference<>(tEBundle);
        this.mTransportOpt = new WeakReference<>(tEBundle2);
        this.mSettings = new TEBundle();
    }

    @Override // com.ss.ttlivestreamer.core.strategy.LiveStreamBaseStrategy, com.ss.ttlivestreamer.core.strategy.LiveAbstractStrategy
    public void onInfo(int i, int i2, int i3) {
        TEBundle tEBundle;
        TEBundle tEBundle2;
        TEBundle tEBundle3;
        if (!this.mReleased && i == 1 && i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        this.mSettings.setLong("settings_log_interval", 10L);
                        this.mSettings.setBool("settings_auto_brighten", false);
                        AVLog.disableLogFile(true);
                        AVLog.disableLogIODevice(true);
                        AVLog.disableKibanaLogs(true);
                        WeakReference<TEBundle> weakReference = this.mEncodeStreamOpt;
                        if (weakReference != null && (tEBundle3 = weakReference.get()) != null) {
                            tEBundle3.setBool("estream_psnr_enable", false);
                            tEBundle3.setBool("estream_siti_enable", false);
                            tEBundle3.setBool("estream_transport_delay_enable", false);
                        }
                    }
                } else {
                    this.mSettings.setLong("settings_log_interval", 5L);
                    this.mSettings.setBool("settings_auto_brighten", false);
                    AVLog.disableLogFile(true);
                    AVLog.disableLogIODevice(true);
                    AVLog.disableKibanaLogs(false);
                    WeakReference<TEBundle> weakReference2 = this.mEncodeStreamOpt;
                    if (weakReference2 != null && (tEBundle2 = weakReference2.get()) != null) {
                        tEBundle2.setBool("estream_psnr_enable", false);
                        tEBundle2.setBool("estream_siti_enable", false);
                        tEBundle2.setBool("estream_transport_delay_enable", false);
                    }
                }
            } else {
                AVLog.disableLogFile(false);
                AVLog.disableLogIODevice(false);
                AVLog.disableKibanaLogs(false);
                this.mSettings.setLong("settings_log_interval", 5L);
                this.mSettings.setBool("settings_auto_brighten", true);
                WeakReference<TEBundle> weakReference3 = this.mEncodeStreamOpt;
                if (weakReference3 != null && this.mLiveStreamBuilder != null && (tEBundle = weakReference3.get()) != null) {
                    tEBundle.setBool("estream_psnr_enable", this.mLiveStreamBuilder.isEnablePSNR());
                    tEBundle.setBool("estream_siti_enable", this.mLiveStreamBuilder.getPushBase().enableSiti);
                    tEBundle.setBool("estream_transport_delay_enable", this.mLiveStreamBuilder.getPushBase().enableRenderStallStats);
                }
            }
            LiveStreamBaseStrategy.IStrategyNotify iStrategyNotify = this.mIStrategyNotify;
            if (iStrategyNotify != null) {
                iStrategyNotify.onLiveOptionChanged(this.mEncodeStreamOpt.get(), this.mTransportOpt.get(), this.mSettings);
            }
        }
    }
}
