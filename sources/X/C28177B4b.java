package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.B4b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28177B4b extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28177B4b LJLIL = new C28177B4b();

    public C28177B4b() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        long j;
        long j2;
        boolean z;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = -1;
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j2 = LIZIZ.getCurrentUserId();
        } else {
            j2 = -2;
        }
        if (j == j2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
