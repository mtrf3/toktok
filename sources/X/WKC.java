package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WKC {
    public static final /* synthetic */ int LIZ = 0;

    public static final List<C81975WFf> LIZ(WKB toolbarManager) {
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
}
