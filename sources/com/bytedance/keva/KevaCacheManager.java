package com.bytedance.keva;

import X.AnonymousClass155;
import X.AnonymousClass156;
import X.C16880lQ;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes16.dex */
public final class KevaCacheManager {
    public static boolean IS_LOW_MEMORY;
    public static KevaCacheManager kevaCacheManagerInstance;
    public Thread delayTimeClearCacheThread;
    public Long lastClearTime;
    public final int mCacheClearExpirationTime;
    public AnonymousClass155 mICleanCacheMessage;
    public final int mIntervalMillisTime;
    public final boolean mIsNeedReleaseNativeMemory;
    public final boolean mIsOpenReleaseJavaMemory;
    public static final AtomicBoolean mStartClear = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue<AnonymousClass156> kevaImplListener = new ConcurrentLinkedQueue<>();

    public void setICleanCacheMessage(AnonymousClass155 anonymousClass155) {
    }

    public void startDelayClearCache() {
        if (this.mIsOpenReleaseJavaMemory && this.delayTimeClearCacheThread == null) {
            this.lastClearTime = Long.valueOf(System.currentTimeMillis());
            PthreadThread pthreadThread = new PthreadThread() { // from class: com.bytedance.keva.KevaCacheManager.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    com_bytedance_keva_KevaCacheManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_keva_KevaCacheManager$1__run$___twin___() {
                    while (true) {
                        long currentTimeMillis = System.currentTimeMillis();
                        AtomicBoolean atomicBoolean = KevaCacheManager.mStartClear;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            long longValue = currentTimeMillis - KevaCacheManager.this.lastClearTime.longValue();
                            KevaCacheManager kevaCacheManager = KevaCacheManager.this;
                            if (longValue > kevaCacheManager.mIntervalMillisTime) {
                                KevaCacheManager.IS_LOW_MEMORY = false;
                                kevaCacheManager.cleanCache(kevaCacheManager.mCacheClearExpirationTime, kevaCacheManager.mIsNeedReleaseNativeMemory);
                                atomicBoolean.set(false);
                                return;
                            }
                            atomicBoolean.set(false);
                        }
                        try {
                            Thread.sleep(KevaCacheManager.this.mIntervalMillisTime);
                        } catch (InterruptedException unused) {
                        }
                    }
                }

                public static void com_bytedance_keva_KevaCacheManager$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_bytedance_keva_KevaCacheManager$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
            this.delayTimeClearCacheThread = pthreadThread;
            pthreadThread.start();
        }
    }

    public static KevaCacheManager getInstance() {
        return kevaCacheManagerInstance;
    }

    private void InitLowMemoryListener(Context context) {
        if (!this.mIsOpenReleaseJavaMemory) {
            return;
        }
        if (context instanceof Activity) {
            context = C16880lQ.LLLLL(context);
        } else if (!(context instanceof Application)) {
            return;
        }
        ((Application) context).registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.bytedance.keva.KevaCacheManager.2
            public final Runnable realTimeClearCacheThread = new Runnable() { // from class: com.bytedance.keva.KevaCacheManager.2.1
                public void com_bytedance_keva_KevaCacheManager$2$1__run$___twin___() {
                    KevaCacheManager.IS_LOW_MEMORY = true;
                    KevaCacheManager kevaCacheManager = KevaCacheManager.getInstance();
                    if (kevaCacheManager != null) {
                        kevaCacheManager.cleanCache(10000, false);
                    }
                    KevaCacheManager.mStartClear.set(false);
                }

                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_keva_KevaCacheManager$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public static void com_bytedance_keva_KevaCacheManager$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_bytedance_keva_KevaCacheManager$2$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                if (KevaCacheManager.mStartClear.compareAndSet(false, true)) {
                    new PthreadThread(this.realTimeClearCacheThread, "KevaCacheManager$2").start();
                }
            }
        });
    }

    public static void registerClearListener(AnonymousClass156 anonymousClass156) {
        kevaImplListener.add(anonymousClass156);
    }

    public void cleanCache(int i, boolean z) {
        Iterator<AnonymousClass156> it = kevaImplListener.iterator();
        while (it.hasNext()) {
            AnonymousClass156 next = it.next();
            next.getRepoName();
            next.clearCache(i, z);
        }
    }

    public KevaCacheManager(boolean z, int i, int i2, boolean z2) {
        this.mIntervalMillisTime = i;
        this.mCacheClearExpirationTime = i2;
        this.mIsNeedReleaseNativeMemory = z2;
        this.mIsOpenReleaseJavaMemory = z;
    }

    public KevaCacheManager(Context context, boolean z, int i, int i2, boolean z2) {
        this(z, i, i2, z2);
        InitLowMemoryListener(context);
        kevaCacheManagerInstance = this;
    }

    public static KevaCacheManager init(Context context, boolean z, int i, int i2, boolean z2) {
        KevaCacheManager kevaCacheManager = kevaCacheManagerInstance;
        if (kevaCacheManager != null) {
            return kevaCacheManager;
        }
        return new KevaCacheManager(context, z, i, i2, z2);
    }
}
