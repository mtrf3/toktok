package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* renamed from: X.Jzk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50988Jzk {
    public static final Queue<List<EcSearchResultActivity>> LIZ = new LinkedList();

    /* JADX WARN: Multi-variable type inference failed */
    public static EcSearchResultActivity LIZIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_search_use_origin_top", false)) {
                return LIZLLL();
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        List LIZJ = LIZJ();
        if (!LIZJ.isEmpty()) {
            for (C2058786d c2058786d : ORZ.LLIILII(ORZ.LLJJI(LIZJ))) {
                if (!((Activity) c2058786d.LIZIZ).isFinishing()) {
                    return (EcSearchResultActivity) c2058786d.LIZIZ;
                }
            }
        }
        return null;
    }

    public static List LIZJ() {
        List list = (List) ORZ.LLFFF(LIZ);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static EcSearchResultActivity LIZLLL() {
        List LIZJ = LIZJ();
        if (LIZJ.isEmpty()) {
            return null;
        }
        return (EcSearchResultActivity) C64504PTg.LIZIZ(LIZJ, -1, LIZJ);
    }

    public static void LIZ(Activity activity) {
        Iterator<T> it = LIZ.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            o.LJIIIIZZ(list, "list");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (o.LJ(it2.next(), activity)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        EcSearchResultActivity ecSearchResultActivity = (EcSearchResultActivity) it3.next();
                        if (!o.LJ(ecSearchResultActivity, activity)) {
                            it3.remove();
                            ecSearchResultActivity.finish();
                        }
                    }
                    return;
                }
            }
        }
    }

    public static boolean LJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        Iterator<T> it = LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            o.LJIIIIZZ(list, "list");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (o.LJ(it2.next(), activity)) {
                    if (list.size() > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
