package X;

import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BhY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29476BhY implements InterfaceC29493Bhp {
    public final /* synthetic */ LiveProfileDialog LJLIL;

    @Override // X.InterfaceC29493Bhp
    public final void LIZIZ(boolean z) {
    }

    public C29476BhY(LiveProfileDialog liveProfileDialog) {
        this.LJLIL = liveProfileDialog;
    }

    @Override // X.InterfaceC29493Bhp
    public final void LIZ(C45631qh scrollView, int i) {
        int i2;
        Integer num;
        o.LJIIIZ(scrollView, "scrollView");
        LiveProfileDialog liveProfileDialog = this.LJLIL;
        C47061t0 c47061t0 = liveProfileDialog.LJLLL;
        if (c47061t0 != null) {
            float f = 1;
            DataChannel dataChannel = liveProfileDialog.dataChannel;
            if (dataChannel != null && (num = (Integer) dataChannel.kv0(C28416BDg.class)) != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            c47061t0.setAlpha(f - (C15380j0.LJIJ(i - i2) / 36));
            if (c47061t0.getAlpha() > 0.0f) {
                C29306Beo.LJJLJLI(c47061t0);
                return;
            } else {
                C29306Beo.LJI(c47061t0);
                return;
            }
        }
        o.LJIJI("bgCardSolid");
        throw null;
    }
}
