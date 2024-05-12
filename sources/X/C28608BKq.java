package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BKq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28608BKq extends AbstractC28221B5t implements InterfaceC28606BKo {
    public final EnterRoomConfig LJLILLLLZI;
    public boolean LJLJI;
    public final List<EnterRoomConfig> LJLJJI;
    public final InterfaceC28610BKs LJLJJL;
    public final C28609BKr LJLJJLL;

    @Override // X.AbstractC28221B5t, X.InterfaceC28220B5s
    public final Room LJIIIIZZ(int i) {
        return null;
    }

    @Override // X.InterfaceC28606BKo
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIJ(InterfaceC28262B7i<Room> interfaceC28262B7i) {
    }

    @Override // X.AbstractC28221B5t
    public final String LJIIL(int i, long j) {
        return i == 2 ? "from outerSource." : "";
    }

    @Override // X.AbstractC28221B5t
    public final List<Room> LJIILJJIL() {
        return new ArrayList();
    }

    @Override // X.AbstractC28221B5t
    public final boolean LJIILL() {
        InterfaceC28610BKs interfaceC28610BKs = this.LJLJJL;
        if (interfaceC28610BKs == null || !interfaceC28610BKs.hasMore()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC28220B5s
    public final int size() {
        return ((ArrayList) this.LJLJJI).size();
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJ() {
        super.LJIJ();
        InterfaceC28610BKs interfaceC28610BKs = this.LJLJJL;
        if (interfaceC28610BKs != null) {
            interfaceC28610BKs.release();
        }
        ((ArrayList) this.LJLJJI).clear();
    }

    @Override // X.AbstractC28221B5t
    public final boolean LJIILLIIL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC28220B5s
    public final EnterRoomConfig LIZLLL(int i) {
        return (EnterRoomConfig) ListProtector.get(this.LJLJJI, i);
    }

    @Override // X.InterfaceC28220B5s
    public final int LJ(EnterRoomConfig enterRoomConfig) {
        long j = enterRoomConfig.mRoomsData.roomId;
        int size = ((ArrayList) this.LJLJJI).size();
        for (int i = 0; i < size; i++) {
            if (((EnterRoomConfig) ListProtector.get(this.LJLJJI, i)).mRoomsData.roomId == j) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC28221B5t
    public final List LJIILIIL(int i) {
        EnterRoomConfig.RoomsData roomsData;
        List<EnterRoomConfig> list = this.LJLJJI;
        if (list != null && !C79004UzY.LJJIFFI(list) && ((ArrayList) this.LJLJJI).size() > i) {
            ArrayList arrayList = new ArrayList();
            int i2 = 6;
            while (i < ((ArrayList) this.LJLJJI).size() && i2 > 0) {
                EnterRoomConfig enterRoomConfig = (EnterRoomConfig) ListProtector.get(this.LJLJJI, i);
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    arrayList.add(Long.valueOf(roomsData.roomId));
                }
                i2--;
                i++;
            }
            return arrayList;
        }
        return null;
    }

    @Override // X.AbstractC28221B5t
    public final void LJIIZILJ(int i) {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        InterfaceC28610BKs interfaceC28610BKs = this.LJLJJL;
        if (interfaceC28610BKs != null) {
            interfaceC28610BKs.LIZLLL(((ArrayList) this.LJLJJI).size() + i, this.LJLJJLL);
        }
    }

    @Override // X.AbstractC28221B5t
    public final void LJIJI(long j) {
        InterfaceC28610BKs interfaceC28610BKs = this.LJLJJL;
        if (interfaceC28610BKs != null) {
            interfaceC28610BKs.LIZ(j);
        }
        for (EnterRoomConfig enterRoomConfig : this.LJLJJI) {
            if (enterRoomConfig.mRoomsData.roomId == j) {
                ((ArrayList) this.LJLJJI).remove(enterRoomConfig);
                LJIIJJI();
                return;
            }
        }
    }

    public C28608BKq(EnterRoomConfig enterRoomConfig, InterfaceC28610BKs component) {
        o.LJIIIZ(component, "component");
        this.LJLILLLLZI = enterRoomConfig;
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = arrayList;
        this.LJLJJLL = new C28609BKr(this);
        this.LJLJJL = component;
        arrayList.clear();
        List<EnterRoomConfig> LIZIZ = component.LIZIZ();
        if (LIZIZ != null) {
            for (EnterRoomConfig enterRoomConfig2 : LIZIZ) {
                long j = enterRoomConfig2.mRoomsData.roomId;
                EnterRoomConfig enterRoomConfig3 = this.LJLILLLLZI;
                if (j == enterRoomConfig3.mRoomsData.roomId) {
                    ((ArrayList) this.LJLJJI).add(enterRoomConfig3);
                } else {
                    ((ArrayList) this.LJLJJI).add(enterRoomConfig2);
                }
            }
        }
    }
}
