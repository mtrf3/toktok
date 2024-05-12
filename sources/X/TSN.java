package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes14.dex */
public final class TSN extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final TSN LJLIL = new TSN();

    public TSN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return Long.valueOf(room.getOwnerUserId());
        }
        return null;
    }
}
