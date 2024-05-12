package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJZ {
    public static final List<C81975WFf> LIZ(WK0 toolbarManager) {
        int i;
        o.LJIIIZ(toolbarManager, "toolbarManager");
        ArrayList arrayList = new ArrayList();
        List<C81975WFf> items = toolbarManager.getItems();
        int LJLLI = toolbarManager.LJLLI();
        if (items.size() > LJLLI) {
            if (toolbarManager.LIZ() != null) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(items.subList(LJLLI - i, items.size()));
        }
        return arrayList;
    }

    public static final List LIZIZ(int i, List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "items");
        if (list.size() > i) {
            LJ.addAll(list.subList(0, i));
        } else {
            LJ.addAll(list);
        }
        return LJ;
    }

    public static final List<C81975WFf> LIZJ(List<? extends C81975WFf> items, int i, C81975WFf c81975WFf) {
        int i2;
        o.LJIIIZ(items, "items");
        if (items.size() > i) {
            if (c81975WFf != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            List<C81975WFf> LIZIZ = LIZIZ(i - i2, items);
            if (c81975WFf != null) {
                ((ArrayList) LIZIZ).add(c81975WFf);
                return LIZIZ;
            }
            return LIZIZ;
        }
        return LIZIZ(i, items);
    }

    public static final int LIZLLL(ActivityC45651qj activity, ShortVideoContext shortVideoContext, C82068WIu toolbarState, int i) {
        int i2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(toolbarState, "toolbarState");
        boolean LJJLIIIJILLIZJL = V16.LJJLIIIJILLIZJL(shortVideoContext);
        boolean LJJJI = shortVideoContext.LJJJI();
        if (C41013G7t.LIZ()) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        if (LJJLIIIJILLIZJL) {
            i2++;
        }
        if (LJJJI) {
            i2++;
        }
        if (toolbarState.LIZLLL) {
            i2++;
        }
        if (toolbarState.LJ) {
            i2++;
        }
        if (toolbarState.LJFF) {
            i2++;
        }
        if (toolbarState.LJII) {
            i2++;
        }
        int i3 = i2 + 1;
        if (L2F.LIZ()) {
            return i + 1;
        }
        return i3;
    }
}
