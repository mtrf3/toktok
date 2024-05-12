package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.JZx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49389JZx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49390JZy.LJLIL);

    public static java.util.Map LIZJ() {
        return (java.util.Map) LIZ.getValue();
    }

    public static void LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            LIZJ().put(num, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LinkedList<SearchMixFeed> LIZIZ(LinkedList<SearchMixFeed> linkedList, int i, boolean z, boolean z2) {
        int i2;
        SearchMixFeed searchMixFeed;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fullFillSingleCard: ");
        LIZ2.append(Integer.valueOf(linkedList.size()));
        X1D.LIZIZ(LIZ2);
        if (!z && !C49967JjH.LIZIZ()) {
            if (linkedList.size() == 0) {
                Object obj = LIZJ().get(Integer.valueOf(i));
                if (obj != null) {
                    linkedList.add(0, obj);
                }
                LIZJ().put(Integer.valueOf(i), null);
            }
            int i3 = 0;
            loop0: while (true) {
                i2 = 0;
                while (i3 < linkedList.size()) {
                    if (!LIZJ().containsKey(Integer.valueOf(i)) || LIZJ().get(Integer.valueOf(i)) == null) {
                        if (!(!C49152JQu.LIZIZ.contains(Integer.valueOf(((AbstractC49325JXl) linkedList.get(i3)).getFeedType()))) || ((searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i3, linkedList)) != null && C44729Hgz.LJJIJIL(searchMixFeed, EnumC46469ILp.GENERAL_SEARCH))) {
                            i2++;
                            i3++;
                        } else if (i2 % 2 == 0) {
                            i3++;
                        } else {
                            LIZJ().put(Integer.valueOf(i), linkedList.remove(i3 - 1));
                        }
                    } else {
                        Object obj2 = LIZJ().get(Integer.valueOf(i));
                        o.LJI(obj2);
                        linkedList.add(i3, obj2);
                        LIZJ().put(Integer.valueOf(i), null);
                        i3++;
                        i2 = 1;
                    }
                }
                break loop0;
            }
            if (i2 % 2 != 0 && z2 && linkedList.size() > 1) {
                LIZJ().put(Integer.valueOf(i), linkedList.remove(i3 - 1));
            }
        }
        return linkedList;
    }
}
