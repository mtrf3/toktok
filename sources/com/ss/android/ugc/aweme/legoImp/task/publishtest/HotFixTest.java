package com.ss.android.ugc.aweme.legoImp.task.publishtest;

/* loaded from: classes7.dex */
public class HotFixTest {
    public static boolean sUploadLog;

    public static String getConfigJson() {
        isUploadLog();
        return "";
    }

    public static void init() {
        if (isUploadLog()) {
            HotFixTestHelper.uploadLog();
        }
    }

    public static boolean isUploadLog() {
        return sUploadLog;
    }
}
