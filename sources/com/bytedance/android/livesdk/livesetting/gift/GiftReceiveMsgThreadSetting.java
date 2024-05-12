package com.bytedance.android.livesdk.livesetting.gift;

import X.C39202Fa2;
import X.InterfaceC65784Pro;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_receive_msg_thread_setting")
/* loaded from: classes6.dex */
public final class GiftReceiveMsgThreadSetting {

    @Group(isDefault = true, value = "main thread")
    public static final int DEFAULT = 0;
    public static final boolean multiThread;
    public static final GiftReceiveMsgThreadSetting INSTANCE = new GiftReceiveMsgThreadSetting();

    @Group("worker thread")
    public static final int workerThread = 1;

    static {
        boolean z = true;
        if (SettingsManager.INSTANCE.getIntValue(GiftReceiveMsgThreadSetting.class) != 1) {
            z = false;
        }
        multiThread = z;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getMultiThread() {
        return multiThread;
    }

    public final int getWorkerThread() {
        return workerThread;
    }

    public final void postToThread(Runnable block) {
        o.LJIIIZ(block, "block");
        if (multiThread) {
            C39202Fa2 c39202Fa2 = C39202Fa2.LIZ;
            Handler handler = C39202Fa2.LIZLLL;
            if (handler == null) {
                HandlerThread handlerThread = C39202Fa2.LIZJ;
                if (handlerThread == null) {
                    synchronized (c39202Fa2) {
                        handlerThread = new HandlerThread("Common_Handler_Thread");
                        C39202Fa2.LIZJ = handlerThread;
                        handlerThread.start();
                    }
                }
                handler = new Handler(handlerThread.getLooper());
                C39202Fa2.LIZLLL = handler;
            }
            handler.post(block);
            return;
        }
        block.run();
    }

    public final <R> R syncBlock(Object lock, InterfaceC65784Pro<? extends R> block) {
        R invoke;
        o.LJIIIZ(lock, "lock");
        o.LJIIIZ(block, "block");
        if (getMultiThread()) {
            synchronized (lock) {
                invoke = block.invoke();
            }
            return invoke;
        }
        return block.invoke();
    }
}
