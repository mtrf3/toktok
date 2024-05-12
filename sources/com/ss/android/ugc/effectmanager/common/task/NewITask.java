package com.ss.android.ugc.effectmanager.common.task;

/* loaded from: classes16.dex */
public interface NewITask<T> {
    void cancel();

    void execute(IEffectPlatformBaseListener<T> iEffectPlatformBaseListener);

    String getId();
}
