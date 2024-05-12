package X;

import Y.AObserverS71S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8PV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PV {
    public static final int LJIIJ = Math.abs(UUID.randomUUID().hashCode()) | 33554432;
    public ViewGroup LIZ;
    public C8PX LIZIZ;
    public java.util.Set<String> LIZJ;
    public int LJII;
    public C8PW<PriorityProtocol> LJIIIIZZ;
    public int LIZLLL = LJIIJ;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C8PY.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C8PZ.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C210788Pa.LJLIL);
    public final AObserverS71S0100000_3 LJIIIZ = new AObserverS71S0100000_3(this, 71);

    public final ViewGroup LJ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("container");
        throw null;
    }

    public final C8PX LJFF() {
        C8PX c8px = this.LIZIZ;
        if (c8px != null) {
            return c8px;
        }
        o.LJIJI("context");
        throw null;
    }

    public final MutableLiveData<C8PW<PriorityProtocol>> LJII() {
        return (MutableLiveData) this.LJFF.getValue();
    }

    public final ConcurrentHashMap<String, C8PW<PriorityProtocol>> LJIIIIZZ() {
        return (ConcurrentHashMap) this.LJ.getValue();
    }

    public final void LJIIJ() {
        C8PW<PriorityProtocol> c8pw = this.LJIIIIZZ;
        if (c8pw != null) {
            if (o.LJ(c8pw.LIZJ, Boolean.TRUE)) {
                c8pw.LIZ().removeObserver(this.LJIIIZ);
                c8pw.LIZ().observe(LJFF().getLifecycleOwner(), this.LJIIIZ);
                return;
            } else {
                LJIILL();
                return;
            }
        }
        if (this.LJII != 1) {
            return;
        }
        LJ().removeAllViews();
        if (!LJIIIIZZ().isEmpty()) {
            return;
        }
        if (this.LJII <= 2) {
            this.LJII = 2;
        }
        LJFF().LIZ(null);
    }

    public final void LJIIJJI() {
        PriorityProtocol priorityProtocol;
        if (this.LJIIIIZZ != null && this.LJII >= 2) {
            C8PX LJFF = LJFF();
            C8PW<PriorityProtocol> c8pw = this.LJIIIIZZ;
            if (c8pw != null) {
                priorityProtocol = c8pw.LIZ;
            } else {
                priorityProtocol = null;
            }
            LJFF.LIZ(priorityProtocol);
            return;
        }
        this.LJII = 0;
        LIZJ();
    }

    public final void LJIILL() {
        Object obj;
        C8PW<PriorityProtocol> c8pw = this.LJIIIIZZ;
        if (c8pw == null) {
            return;
        }
        if (this.LJII <= 2) {
            this.LJII = 2;
        }
        ViewGroup LJ = LJ();
        if (LJ.getChildCount() == 1) {
            View childAt = LJ.getChildAt(0);
            if (childAt != null) {
                obj = childAt.getTag(this.LIZLLL);
            } else {
                obj = null;
            }
            if (o.LJ(obj, c8pw.LIZ.y2())) {
                c8pw.LIZIZ.invoke(c8pw.LIZ);
                LJFF().LIZ(c8pw.LIZ);
                return;
            }
        }
        LJ().removeAllViews();
        View m8 = c8pw.LIZ.m8();
        LJ().addView(m8);
        m8.setTag(this.LIZLLL, c8pw.LIZ.y2());
        c8pw.LIZIZ.invoke(c8pw.LIZ);
        LJFF().LIZ(c8pw.LIZ);
        J8V.LJIILJJIL((MutableLiveData) this.LJI.getValue(), c8pw.LIZ);
    }

    public final void LIZJ() {
        C8PW<PriorityProtocol> c8pw = null;
        PriorityProtocol priorityProtocol = null;
        c8pw = null;
        if (LJIIIIZZ().isEmpty()) {
            LJFF().LIZ(null);
            return;
        }
        if (this.LJII >= 2) {
            C8PX LJFF = LJFF();
            C8PW<PriorityProtocol> c8pw2 = this.LJIIIIZZ;
            if (c8pw2 != null) {
                priorityProtocol = c8pw2.LIZ;
            }
            LJFF.LIZ(priorityProtocol);
            return;
        }
        java.util.Set<String> set = this.LIZJ;
        if (set != null) {
            Iterator<String> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8PW<PriorityProtocol> c8pw3 = LJIIIIZZ().get(it.next());
                if (c8pw3 != null && !o.LJ(c8pw3.LIZ().getValue(), Boolean.FALSE)) {
                    c8pw = c8pw3;
                    break;
                }
            }
        }
        if (o.LJ(c8pw, this.LJIIIIZZ) && this.LJII == 1) {
            return;
        }
        if (this.LJII <= 1) {
            this.LJII = 1;
        }
        if (c8pw != null) {
            LIZIZ(c8pw);
        } else {
            LJIILJJIL(c8pw);
        }
        LJIIJ();
    }

    public final List<String> LIZLLL() {
        ConcurrentHashMap<String, C8PW<PriorityProtocol>> LJIIIIZZ = LJIIIIZZ();
        ArrayList arrayList = new ArrayList(LJIIIIZZ.size());
        Iterator<Map.Entry<String, C8PW<PriorityProtocol>>> it = LJIIIIZZ.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().LIZ.y2());
        }
        return arrayList;
    }

    public final String LJI() {
        PriorityProtocol priorityProtocol;
        String str;
        PriorityProtocol priorityProtocol2;
        PriorityProtocol priorityProtocol3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCurrentTargetPriorityTag() target: ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append("; priority: ");
        C8PW<PriorityProtocol> c8pw = this.LJIIIIZZ;
        if (c8pw != null) {
            priorityProtocol = c8pw.LIZ;
        } else {
            priorityProtocol = null;
        }
        LIZ.append(priorityProtocol);
        LIZ.append("; getPriorityTag: ");
        C8PW<PriorityProtocol> c8pw2 = this.LJIIIIZZ;
        if (c8pw2 != null && (priorityProtocol3 = c8pw2.LIZ) != null) {
            str = priorityProtocol3.y2();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C8PW<PriorityProtocol> c8pw3 = this.LJIIIIZZ;
        if (c8pw3 == null || (priorityProtocol2 = c8pw3.LIZ) == null) {
            return null;
        }
        return priorityProtocol2.y2();
    }

    public static void LJIILIIL(C8PV c8pv) {
        c8pv.LJIILJJIL(null);
        c8pv.LJII = 0;
        MutableLiveData<C8PW<PriorityProtocol>> LJII = c8pv.LJII();
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            LJII.setValue(null);
        } else {
            LJII.postValue(null);
        }
        c8pv.LJIIIIZZ().clear();
        ((LiveData) c8pv.LJI.getValue()).setValue(null);
    }

    public final boolean LIZIZ(C8PW<PriorityProtocol> c8pw) {
        C8PW<PriorityProtocol> c8pw2 = this.LJIIIIZZ;
        if (c8pw2 != null && !o.LJ(c8pw2.LIZ().getValue(), Boolean.FALSE)) {
            String y2 = c8pw.LIZ.y2();
            String y22 = c8pw2.LIZ.y2();
            java.util.Set<String> set = this.LIZJ;
            if (set == null || ORZ.LJLZ(y2, set) >= ORZ.LJLZ(y22, set)) {
                return false;
            }
        }
        LJIILJJIL(c8pw);
        return true;
    }

    public final java.util.Map<String, PriorityProtocol> LJIIIZ(EnumC210828Pe convertType) {
        o.LJIIIZ(convertType, "convertType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C8PW<PriorityProtocol>> entry : LJIIIIZZ().entrySet()) {
            String originKey = entry.getKey();
            C8PW<PriorityProtocol> value = entry.getValue();
            o.LJIIIZ(originKey, "originKey");
            int i = C210818Pd.LIZ[convertType.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                originKey = "";
            }
            linkedHashMap.put(originKey, value.LIZ);
        }
        return linkedHashMap;
    }

    public final void LJIILJJIL(C8PW<PriorityProtocol> c8pw) {
        MutableLiveData<Boolean> LIZ;
        if (c8pw != null && o.LJ(c8pw, this.LJIIIIZZ)) {
            return;
        }
        C8PW<PriorityProtocol> c8pw2 = this.LJIIIIZZ;
        if (c8pw2 != null && (LIZ = c8pw2.LIZ()) != null) {
            LIZ.removeObserver(this.LJIIIZ);
        }
        this.LJIIIIZZ = c8pw;
    }

    public final void LIZ(ViewGroup container, C8PX context) {
        java.util.Set<String> LIZJ;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(context, "context");
        this.LIZIZ = context;
        java.util.Set<String> LIZIZ = context.LIZIZ();
        if (LIZIZ == null || LIZIZ.isEmpty()) {
            LIZJ = context.LIZJ();
        } else {
            LIZJ = context.LIZIZ();
        }
        this.LIZJ = LIZJ;
        this.LIZ = container;
        if (container.getId() > 0) {
            this.LIZLLL = container.getId();
        }
        LJII().observe(context.getLifecycleOwner(), new AObserverS71S0100000_3(this, 70));
    }

    public final void LJIILLIIL(PriorityProtocol priority, boolean z) {
        o.LJIIIZ(priority, "priority");
        C8PW<PriorityProtocol> c8pw = LJIIIIZZ().get(priority.y2());
        if (c8pw != null && o.LJ(c8pw.LIZJ, Boolean.TRUE)) {
            J8V.LJIILJJIL(c8pw.LIZ(), Boolean.valueOf(z));
        }
    }

    public final void LJIIL(PriorityProtocol priority, Boolean bool, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(priority, "priority");
        C8PW<PriorityProtocol> c8pw = new C8PW<>(priority, bool, interfaceC88472Yns);
        if (LJIIIIZZ().containsValue(c8pw)) {
            return;
        }
        boolean containsKey = LJIIIIZZ().containsKey(c8pw.LIZ.y2());
        LJIIIIZZ().put(c8pw.LIZ.y2(), c8pw);
        if (!containsKey) {
            J8V.LJIILJJIL(LJII(), c8pw);
        }
    }
}
