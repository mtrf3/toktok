package X;

import com.ss.android.ugc.aweme.sec.DmtSec;

/* renamed from: X.QNl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66901QNl implements InterfaceC63764P0u {
    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        C66895QNf msManager = DmtSec.INSTANCE.getMsManager();
        if (msManager != null) {
            msManager.LJFF(2);
        }
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        C66895QNf msManager = DmtSec.INSTANCE.getMsManager();
        if (msManager != null) {
            msManager.LJFF(1);
        }
    }
}
