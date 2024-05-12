package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Jzl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50989Jzl {
    public static final int LIZ = C00F.LIZ(31744, 6, "adjust_search_result_activity_limit", true);
    public static final CopyOnWriteArrayList<CopyOnWriteArrayList<SearchResultActivity>> LIZIZ = new CopyOnWriteArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static SearchResultActivity LIZIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_search_use_origin_top", false)) {
                return LJ();
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        List LIZLLL = LIZLLL();
        if (!LIZLLL.isEmpty()) {
            for (C2058786d c2058786d : ORZ.LLIILII(ORZ.LLJJI(LIZLLL))) {
                if (!((Activity) c2058786d.LIZIZ).isFinishing()) {
                    return (SearchResultActivity) c2058786d.LIZIZ;
                }
            }
        }
        return null;
    }

    public static SearchResultActivity LIZJ() {
        CopyOnWriteArrayList<CopyOnWriteArrayList<SearchResultActivity>> copyOnWriteArrayList = LIZIZ;
        ListIterator<CopyOnWriteArrayList<SearchResultActivity>> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        o.LJIIIIZZ(listIterator, "groupActivityQueue.listI…(groupActivityQueue.size)");
        while (listIterator.hasPrevious()) {
            CopyOnWriteArrayList<SearchResultActivity> previous = listIterator.previous();
            ListIterator<SearchResultActivity> listIterator2 = previous.listIterator(previous.size());
            o.LJIIIIZZ(listIterator2, "list.listIterator(list.size)");
            while (listIterator2.hasPrevious()) {
                SearchResultActivity previous2 = listIterator2.previous();
                if (!previous2.isFinishing()) {
                    return previous2;
                }
            }
        }
        return null;
    }

    public static List LIZLLL() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ORZ.LLFII(LIZIZ);
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList;
        }
        return new ArrayList();
    }

    public static SearchResultActivity LJ() {
        List LIZLLL = LIZLLL();
        if (LIZLLL.isEmpty()) {
            return null;
        }
        return (SearchResultActivity) C64504PTg.LIZIZ(LIZLLL, -1, LIZLLL);
    }

    public static void LIZ(Activity activity) {
        Iterator<CopyOnWriteArrayList<SearchResultActivity>> it = LIZIZ.iterator();
        while (it.hasNext()) {
            CopyOnWriteArrayList<SearchResultActivity> list = it.next();
            o.LJIIIIZZ(list, "list");
            Iterator<SearchResultActivity> it2 = list.iterator();
            while (it2.hasNext()) {
                if (o.LJ(it2.next(), activity)) {
                    Iterator<SearchResultActivity> it3 = list.iterator();
                    o.LJIIIIZZ(it3, "list.iterator()");
                    while (it3.hasNext()) {
                        SearchResultActivity next = it3.next();
                        if (!o.LJ(next, activity)) {
                            list.remove(next);
                            next.finish();
                        }
                    }
                    return;
                }
            }
        }
    }

    public static boolean LJFF(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        Iterator<CopyOnWriteArrayList<SearchResultActivity>> it = LIZIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CopyOnWriteArrayList<SearchResultActivity> list = it.next();
            o.LJIIIIZZ(list, "list");
            Iterator<SearchResultActivity> it2 = list.iterator();
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

    public static final boolean LJI(Context context) {
        if (context == null) {
            return false;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && !o.LJ(LJ(), LJJIFFI)) {
            return false;
        }
        return true;
    }
}
