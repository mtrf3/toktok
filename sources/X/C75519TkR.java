package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPauseLiveAnchorEnableSetting;

/* renamed from: X.TkR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75519TkR implements InterfaceC78493UrJ {
    public final /* synthetic */ C75518TkQ LJLIL;

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        C75518TkQ c75518TkQ = this.LJLIL;
        c75518TkQ.LIZJ = true;
        if (MultiHostPauseLiveAnchorEnableSetting.INSTANCE.isEnable() && c75518TkQ.LIZJ()) {
            c75518TkQ.LJ = SystemClock.elapsedRealtime();
            c75518TkQ.LIZLLL(2);
            c75518TkQ.LIZ(true);
        }
    }

    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
        C75518TkQ c75518TkQ = this.LJLIL;
        c75518TkQ.LIZJ = false;
        if (MultiHostPauseLiveAnchorEnableSetting.INSTANCE.isEnable() && c75518TkQ.LIZJ()) {
            c75518TkQ.LIZLLL(1);
            c75518TkQ.LIZ(false);
        }
    }

    public C75519TkR(C75518TkQ c75518TkQ) {
        this.LJLIL = c75518TkQ;
    }
}
