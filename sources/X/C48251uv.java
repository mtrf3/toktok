package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.1uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48251uv extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C48251uv LJLIL = new C48251uv();

    public C48251uv() {
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