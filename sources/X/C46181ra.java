package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.1ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46181ra extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C46181ra LJLIL = new C46181ra();

    public C46181ra() {
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
