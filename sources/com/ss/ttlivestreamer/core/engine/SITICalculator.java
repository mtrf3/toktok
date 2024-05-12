package com.ss.ttlivestreamer.core.engine;

import android.os.Handler;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class SITICalculator extends NativeObject {
    public int mCurCplxCategory = -1;
    public boolean mEnabled = true;
    public ISITIEventObserver mISITIEventObserver;
    public final Handler mWorkHandler;

    /* loaded from: classes12.dex */
    public interface ISITIEventObserver {
        void onBitrateChanged(int i, String str);
    }

    private native void nativeCreate(int i, int i2, int i3);

    private native void nativeEnable(boolean z);

    private native String nativeGetPerformance();

    private native void nativeSetParameters(TEBundle tEBundle);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mWorkHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.SITICalculator.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_SITICalculator$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_SITICalculator$2__run$___twin___() {
                SITICalculator.super.release();
            }

            public static void com_ss_ttlivestreamer_core_engine_SITICalculator$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_engine_SITICalculator$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public boolean isValid() {
        if (this.mNativeObj != 0) {
            return true;
        }
        return false;
    }

    public String GetPerformance() {
        return nativeGetPerformance();
    }

    public int getCurPlxCategory() {
        return this.mCurCplxCategory;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void enable(boolean z) {
        this.mEnabled = z;
        nativeEnable(z);
    }

    public void setParameters(TEBundle tEBundle) {
        nativeSetParameters(tEBundle);
    }

    public void setSITIEventObserver(ISITIEventObserver iSITIEventObserver) {
        this.mISITIEventObserver = iSITIEventObserver;
    }

    public void onStrategyCalculated(final int i, final String str) {
        this.mCurCplxCategory = i;
        this.mWorkHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.SITICalculator.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_engine_SITICalculator$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_engine_SITICalculator$1__run$___twin___() {
                ISITIEventObserver iSITIEventObserver = SITICalculator.this.mISITIEventObserver;
                if (iSITIEventObserver != null) {
                    iSITIEventObserver.onBitrateChanged(i, str);
                }
            }

            public static void com_ss_ttlivestreamer_core_engine_SITICalculator$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_engine_SITICalculator$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public SITICalculator(Handler handler, int i, int i2) {
        nativeCreate(1, i, i2);
        this.mWorkHandler = handler;
    }
}
