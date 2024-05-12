package X;

import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor;

/* renamed from: X.X8u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84356X8u implements InterfaceC63764P0u {
    public final /* synthetic */ AccessibilityEventTrackingMonitor LJLIL;

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        this.LJLIL.trackSettingEnd();
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        this.LJLIL.isAppForeground = true;
    }

    public C84356X8u(AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor) {
        this.LJLIL = accessibilityEventTrackingMonitor;
    }
}
