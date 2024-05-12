package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Puk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65966Puk {
    public static void LIZ(Fragment fragment) {
        String str;
        ArrayList arrayList;
        if (ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            List<String> list = ViewOnAttachStateChangeListenerC65968Pum.LJLJLJ;
            synchronized (list) {
                StringBuilder LIZ = X1D.LIZ();
                ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
                if (mo49getActivity != null) {
                    str = mo49getActivity.getClass().getName();
                } else {
                    str = null;
                }
                LIZ.append(str);
                LIZ.append('@');
                LIZ.append(fragment.getClass().getName());
                ((ArrayList) list).add(X1D.LIZIZ(LIZ));
                arrayList = new ArrayList(list);
            }
            C65964Pui<String> c65964Pui = C65960Pue.LJIIIZ;
            if (c65964Pui != null) {
                String abstractCollection = arrayList.toString();
                o.LJIIIIZZ(abstractCollection, "currentFragment.toString()");
                c65964Pui.offer(abstractCollection);
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ViewOnAttachStateChangeListenerC65968Pum.LJLJL;
            if (concurrentHashMap.size() > 15) {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((ViewOnAttachStateChangeListenerC65968Pum) entry.getValue()).LJLIL.get() == null) {
                        List<String> list2 = ViewOnAttachStateChangeListenerC65968Pum.LJLJLJ;
                        synchronized (list2) {
                            ((ArrayList) list2).remove(((ViewOnAttachStateChangeListenerC65968Pum) entry.getValue()).LJLILLLLZI);
                        }
                        it.remove();
                    }
                }
            }
        }
    }

    public static ViewOnAttachStateChangeListenerC65968Pum LIZIZ(Fragment f) {
        o.LJIIIZ(f, "f");
        if (ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
            return (ViewOnAttachStateChangeListenerC65968Pum) ((ConcurrentHashMap) ViewOnAttachStateChangeListenerC65968Pum.LJLJL).get(Integer.valueOf(f.hashCode()));
        }
        return null;
    }
}
