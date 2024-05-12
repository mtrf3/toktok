package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PWq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64592PWq {
    public final List<C64562PVm> LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ() {
        if (this.LIZJ && this.LIZIZ == this.LIZ.size()) {
            this.LIZIZ = 0;
            this.LIZJ = false;
        }
        if (this.LIZIZ >= this.LIZ.size()) {
            return false;
        }
        return true;
    }

    public C64592PWq(List<C64562PVm> list) {
        this.LIZ = list;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() < PWY.LIZ().LJFF.get()) {
            ArrayList arrayList2 = new ArrayList(list);
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayList2);
            this.LIZJ = true;
        }
        if (arrayList.size() > 1) {
            this.LIZJ = true;
        }
    }
}
