package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public class WMP implements InterfaceC82169WMr {
    public final WME LIZ;
    public final boolean LIZIZ = true;
    public final /* synthetic */ WMI LIZJ;

    @Override // X.InterfaceC82169WMr
    public final void execute() {
        if (this.LIZJ.LIZIZ.LIZ() == null) {
            return;
        }
        List<Record> LIZIZ = this.LIZJ.LIZIZ.LIZIZ();
        if (this.LIZIZ) {
            ArrayList arrayList = new ArrayList(LIZIZ);
            Collections.reverse(arrayList);
            LIZIZ = arrayList;
        }
        for (int i = 0; i < LIZIZ.size(); i++) {
            WMI.LJI(this.LIZJ.LIZ, ((Record) ListProtector.get(LIZIZ, i)).LJLIL, this.LIZ, null, true, null);
        }
    }

    public WMP(WMI wmi, WME wme) {
        this.LIZJ = wmi;
        this.LIZ = wme;
    }
}
