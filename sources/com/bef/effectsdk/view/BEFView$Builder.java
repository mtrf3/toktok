package com.bef.effectsdk.view;

import X.C1FM;
import android.content.Context;
import android.util.AttributeSet;
import com.bef.effectsdk.ResourceFinder;

/* loaded from: classes.dex */
public final class BEFView$Builder {
    public Params mParams = new Params();

    public static BEFView$Builder obtain() {
        BEFView$Builder bEFView$Builder = new BEFView$Builder();
        Params params = bEFView$Builder.mParams;
        params.mRenderWidth = 720;
        params.mRenderHeight = 1280;
        params.mFPS = 30.0d;
        params.mFitMode = BEFView$FitMode.FILL_SCREEN;
        params.mResourceFinder = null;
        params.mSceneKey = BEFView$BEFViewSceneKey.SHOOT;
        params.mNeglectTouchEvent = false;
        params.mKeepStatusAtPause = false;
        return bEFView$Builder;
    }

    /* loaded from: classes.dex */
    public class Params {
        public double mFPS;
        public BEFView$FitMode mFitMode;
        public boolean mKeepStatusAtPause;
        public boolean mNeglectTouchEvent;
        public int mRenderHeight;
        public int mRenderWidth;
        public ResourceFinder mResourceFinder;
        public BEFView$BEFViewSceneKey mSceneKey;

        public Params() {
        }
    }

    public C1FM build(Context context) {
        C1FM c1fm = new C1FM(context);
        c1fm.setParams(this.mParams);
        return c1fm;
    }

    public BEFView$Builder setFPS(double d) {
        this.mParams.mFPS = d;
        return this;
    }

    public BEFView$Builder setFitMode(BEFView$FitMode bEFView$FitMode) {
        this.mParams.mFitMode = bEFView$FitMode;
        return this;
    }

    public BEFView$Builder setKeepStatusAtPause(boolean z) {
        this.mParams.mKeepStatusAtPause = z;
        return this;
    }

    public BEFView$Builder setNeglectTouchEvent(boolean z) {
        this.mParams.mNeglectTouchEvent = z;
        return this;
    }

    public BEFView$Builder setResourceFinder(ResourceFinder resourceFinder) {
        this.mParams.mResourceFinder = resourceFinder;
        return this;
    }

    public BEFView$Builder setSceneKey(BEFView$BEFViewSceneKey bEFView$BEFViewSceneKey) {
        this.mParams.mSceneKey = bEFView$BEFViewSceneKey;
        return this;
    }

    public C1FM build(Context context, AttributeSet attributeSet) {
        C1FM c1fm = new C1FM(context, attributeSet);
        c1fm.setParams(this.mParams);
        return c1fm;
    }

    public BEFView$Builder setRenderSize(int i, int i2) {
        Params params = this.mParams;
        params.mRenderWidth = i;
        params.mRenderHeight = i2;
        return this;
    }
}
