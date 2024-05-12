package X;

import Y.ARunnableS20S0000000_14;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class WMO implements InterfaceC82169WMr {
    public final WME LIZ;
    public final /* synthetic */ WMI LIZIZ;

    @Override // X.InterfaceC82169WMr
    public final void execute() {
        WME wme;
        ARunnableS20S0000000_14 aRunnableS20S0000000_14 = WMI.LJIIL;
        if (this.LIZIZ.LIZIZ.LIZ() == null) {
            return;
        }
        List<Record> LIZIZ = this.LIZIZ.LIZIZ.LIZIZ();
        WME wme2 = this.LIZ;
        for (int size = ((ArrayList) LIZIZ).size() - 1; size >= 0; size--) {
            Record record = (Record) ListProtector.get(LIZIZ, size);
            if (size == r2.size() - 1) {
                WMI.LJI(this.LIZIZ.LIZ, record.LJLIL, wme2, null, true, aRunnableS20S0000000_14);
                if (!record.LJLILLLLZI) {
                    return;
                }
            } else {
                if (wme2 == WME.RESUMED) {
                    wme = WME.STARTED;
                } else {
                    wme = WME.STARTED;
                    if (wme2 != wme && wme2 != (wme = WME.ACTIVITY_CREATED) && wme2 != (wme = WME.VIEW_CREATED)) {
                        wme = null;
                    }
                }
                WMI.LJI(this.LIZIZ.LIZ, record.LJLIL, wme, null, true, aRunnableS20S0000000_14);
                if (!record.LJLILLLLZI) {
                    return;
                }
            }
        }
    }

    public WMO(WMI wmi, WME wme) {
        this.LIZIZ = wmi;
        this.LIZ = wme;
    }
}
