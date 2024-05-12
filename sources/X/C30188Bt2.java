package X;

import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdk.broadcast.obs.OBSBroadcastInteractionFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Bt2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30188Bt2 implements InterfaceC30221BtZ {
    public final /* synthetic */ OBSBroadcastInteractionFragment LIZ;

    public C30188Bt2(OBSBroadcastInteractionFragment oBSBroadcastInteractionFragment) {
        this.LIZ = oBSBroadcastInteractionFragment;
    }

    @Override // X.InterfaceC30221BtZ
    public final void LIZ(EnumC30220BtY enumC30220BtY) {
        int i;
        if (enumC30220BtY == null) {
            i = -1;
        } else {
            i = C30217BtV.LIZ[enumC30220BtY.ordinal()];
        }
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 2;
            }
        } else {
            i2 = 3;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("observe networkStatus changed. status=");
            LIZ.append(enumC30220BtY);
            C0NB.LJIIIZ("OBSBroadcastInteractionFragment", X1D.LIZIZ(LIZ));
        }
        DataChannel dataChannel = this.LIZ.LJLJI;
        if (dataChannel != null) {
            dataChannel.rv0(NetworkStatus.class, Integer.valueOf(i2));
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }
}
