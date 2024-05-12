package X;

import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Thv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75363Thv implements InterfaceC75372Ti4 {
    public final /* synthetic */ C75358Thq LIZ;

    @Override // X.InterfaceC75372Ti4
    public final void LIZ() {
        C0NB.LJIIIZ("MultiGuestV3AnchorMask", "onPlayFinished");
        DataChannel mDataChannel = this.LIZ.getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.pv0(MultiGuestAdStopEvent.class);
        }
        this.LIZ.LJIIL();
    }

    public C75363Thv(C75358Thq c75358Thq) {
        this.LIZ = c75358Thq;
    }

    @Override // X.InterfaceC75372Ti4
    public final void LIZJ(String str) {
        FP1.LJFF("onPlayFailed error:", str, "MultiGuestV3AnchorMask");
        DataChannel mDataChannel = this.LIZ.getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.pv0(MultiGuestAdStopEvent.class);
        }
        this.LIZ.LJIIL();
    }
}
