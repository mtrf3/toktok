package com.bytedance.apm.agent.helper;

import com.bytedance.apm.agent.tracing.Trace;

/* loaded from: classes.dex */
public class TraceDebug {
    public static OnLogListener mOnLogListener;

    /* loaded from: classes.dex */
    public interface OnLogListener {
        void log(String str, long j);
    }

    public static OnLogListener getLogListener() {
        return mOnLogListener;
    }

    public static void setLogListener(OnLogListener onLogListener) {
        mOnLogListener = onLogListener;
    }

    public static void notifyLogListener(Trace trace, long j) {
        OnLogListener onLogListener = mOnLogListener;
        if (onLogListener != null) {
            onLogListener.log(trace.methodName, j);
        }
    }
}
