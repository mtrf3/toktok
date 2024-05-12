package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class B7K {
    public static final List<Dialog> LIZ = new ArrayList();
    public static final java.util.Map<Long, List<DialogFragment>> LIZIZ = new LinkedHashMap();

    public static final void LIZ(long j) {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            C29306Beo.LJJJJ((Dialog) it.next());
        }
        ((ArrayList) LIZ).clear();
        List list = (List) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j));
        if (list != null) {
            Iterator it2 = list.iterator();
            loop1: while (it2 != null) {
                while (it2.hasNext()) {
                    try {
                        ((DialogFragment) it2.next()).dismiss();
                    } catch (Exception unused) {
                    }
                }
                break loop1;
            }
        }
        List list2 = (List) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j));
        if (list2 != null) {
            list2.clear();
        }
    }
}
