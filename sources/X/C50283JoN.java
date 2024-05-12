package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.JoN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50283JoN extends AbstractC65781Prl implements InterfaceC88471Ynr<C50700Jv6, C50154JmI, C50700Jv6> {
    public static final C50283JoN LJLIL = new C50283JoN();

    public C50283JoN() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C50700Jv6 invoke(C50700Jv6 c50700Jv6, C50154JmI c50154JmI) {
        Object obj;
        C50700Jv6 state = c50700Jv6;
        C50154JmI action = c50154JmI;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        if (state.LJLIL) {
            return state;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(state.LJLJL);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((SearchIntermediateAwemeInfo) obj).groupId, action.LIZ.groupId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SearchIntermediateAwemeInfo searchIntermediateAwemeInfo = (SearchIntermediateAwemeInfo) obj;
        if (searchIntermediateAwemeInfo == null) {
            arrayList.add(action.LIZ);
        } else {
            long j = searchIntermediateAwemeInfo.innerPlayTime + searchIntermediateAwemeInfo.outerPlayTime;
            SearchIntermediateAwemeInfo searchIntermediateAwemeInfo2 = action.LIZ;
            if (j <= searchIntermediateAwemeInfo2.innerPlayTime + searchIntermediateAwemeInfo2.outerPlayTime) {
                arrayList.remove(searchIntermediateAwemeInfo);
                arrayList.add(action.LIZ);
            }
        }
        if (arrayList.size() > 10) {
            ORS.LJJLJLI(arrayList);
        }
        return C50700Jv6.LIZ(state, false, false, 0L, 0L, null, null, arrayList, 63);
    }
}
