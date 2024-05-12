package X;

import Y.AfS65S0100000_13;
import Y.IDaS222S0100000_13;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.TiR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75395TiR {
    public final HashMap<String, C75396TiS> LIZ = new HashMap<>();
    public final String LIZIZ;

    public final void LIZ() {
        Iterator<Map.Entry<String, C75396TiS>> it = this.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().LIZ("clearAll");
        }
        this.LIZ.clear();
    }

    public C75395TiR() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkStateTipsHelperManager");
        LIZ.append(hashCode());
        this.LIZIZ = X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(List<String> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append("_updateState resetByList size = ");
        ArrayList arrayList = (ArrayList) list;
        LIZ.append(arrayList.size());
        C0NB.LIZIZ("NetworkStateTips", X1D.LIZIZ(LIZ));
        if (arrayList.isEmpty()) {
            this.LIZ.clear();
            return;
        }
        for (OSZ osz : C5UN.LJJLJLI(this.LIZ)) {
            if (!arrayList.contains(osz.getFirst())) {
                Object first = osz.getFirst();
                C75396TiS c75396TiS = this.LIZ.get(first);
                if (c75396TiS != null) {
                    c75396TiS.LIZ("removeTipsHelper");
                }
                this.LIZ.remove(first);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!this.LIZ.containsKey(next)) {
                this.LIZ.put(next, new C75396TiS());
            }
        }
    }

    public final void LIZJ(int i, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        C75396TiS c75396TiS = this.LIZ.get(linkMicId);
        if (c75396TiS == null) {
            c75396TiS = new C75396TiS();
            this.LIZ.put(linkMicId, c75396TiS);
        }
        boolean LJ = o.LJ(linkMicId, C78886Uxe.LJJJJLL(C8E.LJ()));
        EnumC75338ThW LJJIII = C77117UOj.LJJIII(i);
        c75396TiS.LJ = i;
        StringBuilder LIZ = X1D.LIZ();
        C0EH.LIZLLL(LIZ, c75396TiS.LJFF, "_updateState networkState = ", i, " isSelf = ");
        C19U.LIZJ(LIZ, LJ, LIZ, "NetworkStateTips");
        if (LJ) {
            if (c75396TiS.LIZLLL == null) {
                c75396TiS.LIZLLL = (C73411SrX) TMC.LJJI(2L, TimeUnit.SECONDS).LJJJJZI(new AfS65S0100000_13(c75396TiS, 254));
            }
            if (c75396TiS.LIZJ == null) {
                c75396TiS.LIZJ = (C73411SrX) TMC.LJIL(60L, 60L, TimeUnit.SECONDS).LJJJJZI(new AfS65S0100000_13(c75396TiS, 255));
            }
            if (LJJIII == EnumC75338ThW.VERY_BAD || LJJIII == EnumC75338ThW.BAD) {
                if (c75396TiS.LIZIZ == null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    C12400eC.LIZIZ(LIZ2, c75396TiS.LJFF, "_updateState create toastDisposable", LIZ2, "NetworkStateTips");
                    c75396TiS.LIZIZ = (C73411SrX) C265112h.LIZ(TMC.LJIL(8L, 8L, TimeUnit.SECONDS)).LJIJ(new IDaS222S0100000_13(c75396TiS, 21)).LJJIFFI(new C75397TiT(c75396TiS)).LJJJJZI(new AfS65S0100000_13(c75396TiS, 256));
                    return;
                }
                return;
            }
            C73411SrX c73411SrX = c75396TiS.LIZIZ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c75396TiS.LIZIZ = null;
        }
    }
}
