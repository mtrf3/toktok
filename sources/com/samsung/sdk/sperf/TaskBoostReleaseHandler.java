package com.samsung.sdk.sperf;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes12.dex */
public class TaskBoostReleaseHandler extends Handler implements Runnable {
    public SPerfManager sPerfManager;
    public int type;

    public TaskBoostReleaseHandler(Context context, SPerfManager sPerfManager, int i) {
        super(context.getMainLooper());
        this.sPerfManager = sPerfManager;
        this.type = i;
    }

    public void com_samsung_sdk_sperf_TaskBoostReleaseHandler__run$___twin___() {
        this.sPerfManager.stopBoost(this.type, PerformanceManager.getPid());
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 15067) {
            return;
        }
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        com_samsung_sdk_sperf_TaskBoostReleaseHandler_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void startBoostTimeout(int i) {
        removeMessages(15067);
        sendEmptyMessageDelayed(15067, i);
    }

    public static void com_samsung_sdk_sperf_TaskBoostReleaseHandler_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(TaskBoostReleaseHandler taskBoostReleaseHandler) {
        boolean LIZ;
        try {
            taskBoostReleaseHandler.com_samsung_sdk_sperf_TaskBoostReleaseHandler__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }
}
