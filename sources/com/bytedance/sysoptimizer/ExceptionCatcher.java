package com.bytedance.sysoptimizer;

/* loaded from: classes7.dex */
public interface ExceptionCatcher {
    boolean analysis(Throwable th);

    boolean registerCondition();
}
