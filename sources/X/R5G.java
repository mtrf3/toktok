package X;

import Y.IDComparatorS39S0000000_11;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class R5G {
    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((BaseLoginMethod) next).m102isOneClickLogin()) {
                arrayList.add(next);
            }
        }
        List LLILII = ORZ.LLILII(new IDComparatorS39S0000000_11(11), arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next2;
            if (!baseLoginMethod.m102isOneClickLogin() && baseLoginMethod.isHistoryLogin()) {
                arrayList3.add(next2);
            }
        }
        List LLILII2 = ORZ.LLILII(new IDComparatorS39S0000000_11(12), arrayList3);
        if (LLILII.size() >= 4) {
            LoginMethodListFragment.LLD = 4;
            LoginMethodListFragment.LL = 0;
            return ORZ.LLJILJILJ(ORZ.LLILLL(LLILII, 4));
        }
        int size = 4 - LLILII.size();
        LoginMethodListFragment.LLD = LLILII.size();
        List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLIIIZ(ORZ.LLILLL(LLILII2, size), LLILII));
        LoginMethodListFragment.LL = ((ArrayList) LLJILJILJ).size() - LoginMethodListFragment.LLD;
        return LLJILJILJ;
    }
}
