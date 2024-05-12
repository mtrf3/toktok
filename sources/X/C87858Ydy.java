package X;

import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestJoinOrLeaveEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ydy, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87858Ydy extends AbstractC09790Zz {
    public C87858Ydy() {
        super(0);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(LinkInRoomGuestJoinOrLeaveEvent.class, this, new AqS182S0100000_16(this, 27));
        }
    }
}
