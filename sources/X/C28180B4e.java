package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.B4e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28180B4e extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C28180B4e LJLIL = new C28180B4e();

    public C28180B4e() {
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
