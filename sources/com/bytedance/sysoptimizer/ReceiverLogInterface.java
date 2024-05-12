package com.bytedance.sysoptimizer;

/* loaded from: classes11.dex */
public interface ReceiverLogInterface {
    boolean enable();

    void onRegister(String str);

    void onUnRegister(String str);
}
