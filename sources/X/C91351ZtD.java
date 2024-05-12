package X;

import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;

/* renamed from: X.ZtD, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91351ZtD implements InterfaceC63764P0u {
    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        ExpiredPlayableManager.INSTANCE.configResetActionTrigger();
    }
}
