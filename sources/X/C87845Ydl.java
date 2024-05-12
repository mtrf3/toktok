package X;

import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestBeInvitedDialogVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS182S0100000_16;

/* renamed from: X.Ydl, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87845Ydl extends AbstractC09790Zz {
    public C87845Ydl() {
        super(0);
    }

    @Override // X.AbstractC09790Zz
    public final void LIZIZ() {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            dataChannel.nv0(LinkInRoomGuestBeInvitedDialogVisibilityChannel.class, this, new AqS182S0100000_16(this, 31));
        }
    }
}
