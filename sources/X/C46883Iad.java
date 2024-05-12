package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Iad, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46883Iad {
    public final List<WeakReference<C46882Iac>> LIZ = new CopyOnWriteArrayList();

    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference.get() == null || ((TTVideoEngine) reference.get()).LJJJJLL()) {
                arrayList.add(reference);
            }
        }
        if (arrayList.size() > 0) {
            ((CopyOnWriteArrayList) this.LIZ).removeAll(arrayList);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("EngineInstanceWatcher:");
        sb.append(((CopyOnWriteArrayList) this.LIZ).size());
        sb.append("[");
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            C46882Iac c46882Iac = (C46882Iac) ((Reference) it.next()).get();
            if (c46882Iac != null) {
                sb.append(c46882Iac);
                sb.append('#');
                sb.append(c46882Iac.LJJI.LIZLLL);
                sb.append(":");
                int LJJII = c46882Iac.LJJII(57);
                if (LJJII != 1) {
                    if (LJJII != 2) {
                        if (LJJII != 3) {
                            if (LJJII != 4) {
                                if (LJJII != 5) {
                                    str = "UNKNOWN";
                                } else {
                                    str = "RELEASE";
                                }
                            } else {
                                str = "ERROR";
                            }
                        } else {
                            str = "PLAYER_RUNNING";
                        }
                    } else {
                        str = "PARSING_DNS";
                    }
                } else {
                    str = "FETCHING_INFO";
                }
                sb.append(str);
                sb.append(",");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final void LIZIZ(C46882Iac c46882Iac) {
        LIZ();
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        Reference reference = null;
        while (it.hasNext()) {
            Reference reference2 = (Reference) it.next();
            if (reference2.get() == c46882Iac) {
                reference = reference2;
            }
        }
        if (reference != null) {
            ((CopyOnWriteArrayList) this.LIZ).remove(reference);
            SimRadar.keyScan("MTTVideoEngine", toString(), new Object[0]);
        }
    }
}
