package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class LiveStreamOption {
    public TEBundle mOpt;

    public synchronized void release() {
        TEBundle tEBundle = this.mOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mOpt = null;
        }
    }

    public void finalize() {
        release();
    }

    public TEBundle getOpt() {
        return this.mOpt;
    }

    public LiveStreamOption(TEBundle tEBundle) {
        this.mOpt = tEBundle;
    }
}
