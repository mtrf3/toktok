package X;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

/* renamed from: X.Ilr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47579Ilr extends TimerTask {
    public final C47581Ilt LJLIL;
    public final InterfaceC47580Ils LJLILLLLZI;

    public final void LIZ() {
        ArrayList arrayList;
        C47581Ilt c47581Ilt = this.LJLIL;
        List<Integer> list = c47581Ilt.LIZ;
        java.util.Map<Long, Float> map = c47581Ilt.LIZLLL;
        if (map == null || map.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(c47581Ilt.LIZLLL.values());
        }
        InterfaceC47580Ils interfaceC47580Ils = this.LJLILLLLZI;
        if (interfaceC47580Ils != null && list != null && arrayList != null) {
            C47147Iet.LIZ.LJ().businessEvent(31213, String.valueOf(((C47577Ilp) interfaceC47580Ils).LIZ(list, arrayList)));
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47579Ilr(C47581Ilt c47581Ilt, InterfaceC47580Ils interfaceC47580Ils) {
        this.LJLIL = c47581Ilt;
        this.LJLILLLLZI = interfaceC47580Ils;
    }
}
