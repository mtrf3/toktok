package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B5t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC28221B5t implements InterfaceC28220B5s {
    public final java.util.Set<InterfaceC28209B5h> LJLIL = new HashSet();

    @Override // X.InterfaceC28220B5s
    public /* synthetic */ void LJII(Room room) {
    }

    @Override // X.InterfaceC28220B5s
    public abstract Room LJIIIIZZ(int i);

    public abstract void LJIIJ(InterfaceC28262B7i<Room> interfaceC28262B7i);

    public String LJIIL(int i, long j) {
        return "";
    }

    public abstract List<Room> LJIILJJIL();

    public boolean LJIILL() {
        return false;
    }

    public boolean LJIILLIIL() {
        return false;
    }

    public abstract void LJIIZILJ(int i);

    public abstract void LJIJI(long j);

    public final void LJIIJJI() {
        C0NB.LJIIIZ("removeAndSwipeItem", "notifyDataSetChanged");
        Iterator it = ((HashSet) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC28209B5h) it.next()).LIZ();
        }
    }

    public void LJIJ() {
        ((HashSet) this.LJLIL).clear();
    }

    public List LJIILIIL(int i) {
        List<Room> LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && !C79004UzY.LJJIFFI(LJIILJJIL) && LJIILJJIL.size() > i) {
            ArrayList arrayList = new ArrayList();
            int i2 = 6;
            while (i < LJIILJJIL.size() && i2 > 0) {
                Room room = (Room) ListProtector.get(LJIILJJIL, i);
                if (room != null) {
                    arrayList.add(Long.valueOf(room.getId()));
                }
                i2--;
                i++;
            }
            return arrayList;
        }
        return null;
    }
}
