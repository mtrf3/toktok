package X;

import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.9xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC253709xW {
    void fetchLoginHistoryState(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    String getLatestLoginMethodName();

    boolean getSaveLoginStatus();

    boolean isCurrentMethodAvaliable();

    boolean isOneKeyLoginExperimentEnabled();

    boolean isTrustedEnvLoginFreshInstallEnable();

    void updateAllowOneKeyLoginInfo(boolean z, boolean z2);

    void updateLoginHistoryState(int i, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    void updateMethodInfo(String str, Object... objArr);
}
