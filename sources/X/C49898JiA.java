package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JiA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49898JiA implements InterfaceC49886Jhy {
    @Override // X.InterfaceC49886Jhy
    public final void LIZ(List<? extends SearchMixFeed> list, List<? extends SearchMixFeed> list2, String str, String str2, String str3, int i) {
        String str4;
        if (list2 == null || list2.isEmpty()) {
            str4 = "dual_response_empty";
        } else {
            List LJIJJLI = C49825Jgz.LJIJJLI(list2);
            if (LJIJJLI == null) {
                LJIJJLI = C61878OQg.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJIJJLI, 10));
            Iterator it = LJIJJLI.iterator();
            while (it.hasNext()) {
                arrayList.add(((Aweme) it.next()).getAid());
            }
            List LJIJJLI2 = C49825Jgz.LJIJJLI(list);
            if (LJIJJLI2 == null) {
                LJIJJLI2 = C61878OQg.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIJJLI2, 10));
            Iterator it2 = LJIJJLI2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Aweme) it2.next()).getAid());
            }
            if (!(!ORZ.LJZI(arrayList, arrayList2).isEmpty())) {
                return;
            } else {
                str4 = "dual_optional_repeat";
            }
        }
        C49899JiB c49899JiB = new C49899JiB();
        c49899JiB.LIZLLL("event", str4);
        JSONObject LIZIZ = C1B8.LIZIZ("session_id", str, "cursor", i);
        LIZIZ.put("inner_search_id", str2);
        LIZIZ.put("backTrace", str3);
        String jSONObject = LIZIZ.toString();
        o.LJIIIIZZ(jSONObject, "JSONObject().apply {\n   …             }.toString()");
        c49899JiB.LIZLLL("params", jSONObject);
        c49899JiB.LJIILIIL();
    }
}
