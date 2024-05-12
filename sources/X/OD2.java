package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class OD2 extends OEL {
    public final /* synthetic */ OD0 LIZJ;

    @Override // X.OEL
    public final void LIZ() {
        OC6.LIZ("gecko-debug-tag", "trigger update start delay 2s");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ConcurrentHashMap) this.LIZJ.LJ).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) ((Map.Entry) it.next()).getValue());
        }
        ((ConcurrentHashMap) this.LIZJ.LJ).clear();
        this.LIZJ.LIZ(7, 0, arrayList);
    }

    @Override // X.OEL
    public final int LIZIZ() {
        return 7;
    }

    public OD2(OD0 od0) {
        this.LIZJ = od0;
    }
}
