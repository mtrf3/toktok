package com.ss.videoarch.strategy.strategy.mpdPreload;

import X.C79324VBg;
import X.C79326VBi;
import android.content.Context;
import com.ss.videoarch.strategy.strategy.networkStrategy.SettingsManager;

/* loaded from: classes15.dex */
public class MpdPreloadManager {
    public Context mContext;
    public Boolean mInitialized;

    private native void nativeInit();

    public static synchronized MpdPreloadManager getInstance() {
        MpdPreloadManager mpdPreloadManager;
        synchronized (MpdPreloadManager.class) {
            mpdPreloadManager = C79324VBg.LIZ;
        }
        return mpdPreloadManager;
    }

    private void loadNative() {
        if (this.mInitialized.booleanValue() || !C79326VBi.LIZ()) {
            return;
        }
        SettingsManager.getInstance();
        nativeInit();
        this.mInitialized = Boolean.TRUE;
    }

    public MpdPreloadManager() {
        this.mInitialized = Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (android.text.TextUtils.equals(r11, "auto") != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String GetPreloadInfo(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.strategy.mpdPreload.MpdPreloadManager.GetPreloadInfo(java.lang.String):java.lang.String");
    }

    public synchronized void init(Context context) {
        if (this.mContext != context) {
            this.mContext = context;
        }
        loadNative();
    }
}
