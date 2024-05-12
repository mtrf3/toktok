package com.ss.ttlivestreamer.core.strategy;

import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class LiveStreamBaseStrategy extends LiveAbstractStrategy {
    public IStrategyNotify mIStrategyNotify;

    /* loaded from: classes12.dex */
    public interface IStrategyNotify {
        void onLiveOptionChanged(TEBundle tEBundle, TEBundle tEBundle2, TEBundle tEBundle3);
    }

    @Override // com.ss.ttlivestreamer.core.strategy.LiveAbstractStrategy
    public void onInfo(int i, int i2, int i3) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    public LiveStreamBaseStrategy(IStrategyNotify iStrategyNotify) {
        this.mIStrategyNotify = iStrategyNotify;
    }
}
