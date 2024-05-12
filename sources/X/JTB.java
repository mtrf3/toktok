package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JTB {
    public static List LIZ(ActivityC45651qj activityC45651qj) {
        if (activityC45651qj == null) {
            return C61878OQg.INSTANCE;
        }
        SearchSeparateTabHorizontalVM LIZIZ = LIZIZ(activityC45651qj);
        List<Aweme> jv0 = LIZIZ.jv0(LIZIZ.LJLLI, false);
        if (jv0 == null) {
            jv0 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : jv0) {
            if (C78685UuP.LJJJZ(aweme.getAid())) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    public static SearchSeparateTabHorizontalVM LIZIZ(ActivityC45651qj component) {
        o.LJIIIZ(component, "component");
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(component, 183);
        return (SearchSeparateTabHorizontalVM) new C214378bB(C65352Pkq.LIZ(SearchSeparateTabHorizontalVM.class), aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(component, false), C184077Kh.LJLIL, JTA.INSTANCE, C78926UyI.LJIIJJI(component), C78926UyI.LJIILL(component)).getValue();
    }

    public static boolean LIZJ(ActivityC45651qj activityC45651qj) {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        if (activityC45651qj == null || (interfaceC65784Pro = LIZIZ(activityC45651qj).LLD) == null || !interfaceC65784Pro.invoke().booleanValue()) {
            return false;
        }
        return true;
    }
}
