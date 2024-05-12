package com.ss.android.ugc.aweme.ml.api;

import X.FQH;
import X.FQO;
import X.InterfaceC38870FNi;
import X.J5S;
import X.J6L;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SmartOHRServiceDefault implements SmartOHRService, FQH {
    public final InterfaceC38870FNi lastPredictResult;
    public final FQO lastPredictTouchArea;
    public final J5S lastSlideSpeedFeature;

    @Override // X.FQH
    public void feedMotionEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
    }

    public FQO getLastPredictTouchArea() {
        return null;
    }

    @Override // X.FQH
    public void initialize() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public boolean registerOHRServiceObserver(J6L observer) {
        o.LJIIIZ(observer, "observer");
        return false;
    }

    @Override // X.FQH
    public void shutdown() {
    }

    @Override // X.FQH
    public void startup() {
    }

    public void unregisterOHRServiceObserver(J6L observer) {
        o.LJIIIZ(observer, "observer");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public InterfaceC38870FNi getLastPredictResult() {
        return this.lastPredictResult;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public J5S getLastSlideSpeedFeature() {
        return this.lastSlideSpeedFeature;
    }
}
