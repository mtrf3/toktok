package X;

import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EXm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36586EXm implements InterfaceC36587EXn {
    @Override // X.InterfaceC36587EXn
    public final boolean LIZIZ(String str) {
        return true;
    }

    @Override // X.InterfaceC36587EXn
    public final boolean LIZ(String str) {
        List list;
        MajorComponentsAllowList majorComponentsAllowList = C36945Eej.LIZ;
        if (majorComponentsAllowList == null || (list = majorComponentsAllowList.contentProviders) == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C38354F3m.LIZJ((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }
}
