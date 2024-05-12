package X;

import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BtX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30219BtX implements InterfaceC30221BtZ {
    public final /* synthetic */ VideoBroadcastInteractionFragment LIZ;

    public C30219BtX(VideoBroadcastInteractionFragment videoBroadcastInteractionFragment) {
        this.LIZ = videoBroadcastInteractionFragment;
    }

    @Override // X.InterfaceC30221BtZ
    public final void LIZ(EnumC30220BtY enumC30220BtY) {
        int i;
        if (enumC30220BtY == null) {
            i = -1;
        } else {
            i = C30218BtW.LIZ[enumC30220BtY.ordinal()];
        }
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 2;
            }
        } else {
            i2 = 3;
        }
        DataChannel dataChannel = this.LIZ.LJZ;
        if (dataChannel != null) {
            dataChannel.rv0(NetworkStatus.class, Integer.valueOf(i2));
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }
}
