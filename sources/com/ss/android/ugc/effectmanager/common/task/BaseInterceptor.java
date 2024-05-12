package com.ss.android.ugc.effectmanager.common.task;

/* loaded from: classes16.dex */
public abstract class BaseInterceptor {
    public boolean isEnabled;

    public abstract boolean intercept(ITask iTask);

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void enable(boolean z) {
        this.isEnabled = z;
    }
}
