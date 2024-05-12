package X;

import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245319jz {
    public final TuxActionSheet LIZ = new TuxActionSheet();
    public boolean LIZIZ;
    public boolean LIZJ;

    public final TuxActionSheet LIZJ() {
        boolean z;
        TuxActionSheet tuxActionSheet = this.LIZ;
        boolean z2 = this.LIZIZ;
        tuxActionSheet.LJLZ = !z2;
        if (z2 && !this.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        tuxActionSheet.LJZ = z;
        return tuxActionSheet;
    }

    public final void LIZ(C252659vp... ags) {
        o.LJIIIZ(ags, "ags");
        ((ArrayList) this.LIZ.LJLLI).add(ORY.LJJZZIII(ags));
        this.LIZIZ = true;
    }

    public final void LIZIZ(C252669vq... ags) {
        o.LJIIIZ(ags, "ags");
        ((ArrayList) this.LIZ.LJLLI).add(ORY.LJJZZIII(ags));
        this.LIZJ = true;
    }

    public final void LIZLLL(int i) {
        this.LIZ.LJLLLLLL = Integer.valueOf(i);
    }

    public final void LJ(List list) {
        o.LJIIIZ(list, "list");
        ((ArrayList) this.LIZ.LJLLI).add(list);
        this.LIZIZ = true;
    }

    public final void LJFF(List list) {
        o.LJIIIZ(list, "list");
        ((ArrayList) this.LIZ.LJLLI).add(list);
        this.LIZJ = true;
    }

    public final void LJI(int i) {
        this.LIZ.LJLLJ = Integer.valueOf(i);
    }

    public final void LJII(String title) {
        o.LJIIIZ(title, "title");
        this.LIZ.LJLLILLLL = title;
    }
}
