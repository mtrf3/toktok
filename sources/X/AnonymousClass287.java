package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.287, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass287 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final AnonymousClass287 LJLIL = new AnonymousClass287();

    public AnonymousClass287() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}