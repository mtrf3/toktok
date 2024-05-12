package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Collections;
import java.util.List;

/* renamed from: X.B5u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28222B5u extends AbstractC28221B5t {
    public final EnterRoomConfig LJLILLLLZI;

    @Override // X.InterfaceC28220B5s
    public final int LJ(EnterRoomConfig enterRoomConfig) {
        return 0;
    }

    @Override // X.AbstractC28221B5t, X.InterfaceC28220B5s
    public final Room LJIIIIZZ(int i) {
        return null;
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIJ(InterfaceC28262B7i<Room> interfaceC28262B7i) {
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIZILJ(int i) {
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJI(long j) {
    }

    @Override // X.InterfaceC28220B5s
    public final int size() {
        return 1;
    }

    @Override // X.AbstractC28221B5t
    public final List<Room> LJIILJJIL() {
        return Collections.EMPTY_LIST;
    }

    public C28222B5u(EnterRoomConfig enterRoomConfig) {
        this.LJLILLLLZI = enterRoomConfig;
    }

    @Override // X.InterfaceC28220B5s
    public final EnterRoomConfig LIZLLL(int i) {
        EnterRoomConfig enterRoomConfig = this.LJLILLLLZI;
        enterRoomConfig.mRoomsData.enterRoomScene = "outside_normal_click";
        return enterRoomConfig;
    }
}
