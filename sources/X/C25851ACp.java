package X;

import com.ss.android.ugc.aweme.cell.ButtonCell;
import com.ss.android.ugc.aweme.cell.ComposableCell;
import com.ss.android.ugc.aweme.cell.DisclosureCell;
import com.ss.android.ugc.aweme.cell.DividerCell;
import com.ss.android.ugc.aweme.cell.ExposeCell;
import com.ss.android.ugc.aweme.cell.LabelCell;
import com.ss.android.ugc.aweme.cell.RadioCell;
import com.ss.android.ugc.aweme.cell.SwitchCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ACp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C25851ACp {
    public final SYL LIZ;
    public final List<AG6<?>> LIZIZ;

    public final List<AG6<?>> LIZIZ() {
        return ORZ.LLJI(this.LIZIZ);
    }

    public final void LIZLLL() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            AG6 ag6 = (AG6) it.next();
            if ((ag6 instanceof AEG) && ((AEB) ag6.LJFF()).LJLJL) {
                Iterator it2 = ORZ.LLIILII(((ArrayList) this.LIZIZ).subList(0, i)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (((AG6) obj3).LJFF().LIZIZ()) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                AG8 ag8 = (AG6) obj3;
                if (ag8 != null && (ag8 instanceof InterfaceC25852ACq)) {
                    ((InterfaceC25852ACq) ag8).LIZJ(null, Boolean.TRUE);
                }
                ArrayList arrayList = (ArrayList) this.LIZIZ;
                Iterator it3 = arrayList.subList(i2, arrayList.size()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (((AG6) obj4).LJFF().LIZIZ()) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                AG8 ag82 = (AG6) obj4;
                if (ag82 != null && (ag82 instanceof InterfaceC25852ACq)) {
                    ((InterfaceC25852ACq) ag82).LIZJ(Boolean.TRUE, null);
                }
            }
            i = i2;
        }
        Iterator it4 = ((ArrayList) this.LIZIZ).iterator();
        while (true) {
            if (it4.hasNext()) {
                obj = it4.next();
                AG6 ag62 = (AG6) obj;
                if (ag62.LJFF().LIZIZ() && !(ag62 instanceof AEG) && (ag62 instanceof InterfaceC25852ACq)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AG8 ag83 = (AG6) obj;
        if (ag83 != null && (ag83 instanceof InterfaceC25852ACq)) {
            ((InterfaceC25852ACq) ag83).LIZJ(Boolean.TRUE, null);
        }
        Iterator it5 = ORZ.LLIILII(this.LIZIZ).iterator();
        while (true) {
            if (it5.hasNext()) {
                obj2 = it5.next();
                AG6 ag63 = (AG6) obj2;
                if (ag63.LJFF().LIZIZ() && !(ag63 instanceof AEG) && (ag63 instanceof InterfaceC25852ACq)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        AG8 ag84 = (AG6) obj2;
        if (ag84 != null && (ag84 instanceof InterfaceC25852ACq)) {
            ((InterfaceC25852ACq) ag84).LIZJ(null, Boolean.TRUE);
        }
    }

    public C25851ACp(SYL list) {
        o.LJIIIZ(list, "list");
        this.LIZ = list;
        this.LIZIZ = new ArrayList();
        list.LLLF.LJZL(DividerCell.class, SwitchCell.class, ButtonCell.class, RadioCell.class, LabelCell.class, ExposeCell.class, DisclosureCell.class, ComposableCell.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(AG6<?> unit) {
        o.LJIIIZ(unit, "unit");
        List<AG6<?>> list = this.LIZIZ;
        C72808Sho<InterfaceC57784Mm4> state = this.LIZ.getState();
        o.LJIIIIZZ(state, "list.state");
        unit.LJLILLLLZI = state;
        ((ArrayList) list).add(unit);
        this.LIZ.getState().LIZJ(unit.LJI());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(List<? extends AG6<?>> _units) {
        o.LJIIIZ(_units, "_units");
        ((ArrayList) this.LIZIZ).removeAll(_units);
        Iterator<? extends AG6<?>> it = _units.iterator();
        while (it.hasNext()) {
            this.LIZ.getState().LJIIL(it.next().LJFF());
        }
    }
}
