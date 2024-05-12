package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.289, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass289 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final AnonymousClass289 LJLIL = new AnonymousClass289();

    public AnonymousClass289() {
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
