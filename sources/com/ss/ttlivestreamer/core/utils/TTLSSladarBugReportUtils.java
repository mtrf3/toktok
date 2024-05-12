package com.ss.ttlivestreamer.core.utils;

import X.C03090Af;
import X.X1D;
import android.text.TextUtils;
import defpackage.i0;
import java.util.Map;

/* loaded from: classes6.dex */
public class TTLSSladarBugReportUtils {
    public BugReportListener listener;

    /* loaded from: classes6.dex */
    public interface BugReportListener {
        void report(Throwable th, String str, Map<String, String> map);
    }

    /* loaded from: classes6.dex */
    public static class Instance {
        public static final TTLSSladarBugReportUtils instance = new TTLSSladarBugReportUtils();
    }

    public TTLSSladarBugReportUtils() {
    }

    public static TTLSSladarBugReportUtils getInstance() {
        return Instance.instance;
    }

    public void registerReportListener(BugReportListener bugReportListener) {
        this.listener = bugReportListener;
    }

    private String getMessage(Throwable th, String str) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            return C03090Af.LIZJ(LIZ, "ttls_exception__", th, LIZ);
        }
        return i0.LJFF("ttls_exception__", str);
    }

    public void report(Throwable th, String str) {
        report(th, str, null);
    }

    public void report(Throwable th, String str, Map<String, String> map) {
        if (th == null) {
            return;
        }
        DebugLogUtils.isEnableDebugLog();
        BugReportListener bugReportListener = this.listener;
        if (bugReportListener != null) {
            bugReportListener.report(th, getMessage(th, str), map);
        }
    }
}
