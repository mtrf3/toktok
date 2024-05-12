package com.bytedance.apm.agent.instrumentation.io;

/* loaded from: classes.dex */
public interface StreamCompleteListener {
    void streamComplete(StreamCompleteEvent streamCompleteEvent);

    void streamError(StreamCompleteEvent streamCompleteEvent);
}
