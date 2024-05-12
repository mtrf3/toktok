package X;

import com.ss.android.ugc.aweme.search.source.neo.model.CardConsumption;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import defpackage.g0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.YMw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87270YMw extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchBehaviorSignalState, YN5, SearchBehaviorSignalState> {
    public static final C87270YMw LJLIL = new C87270YMw();

    public C87270YMw() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final SearchBehaviorSignalState invoke(SearchBehaviorSignalState searchBehaviorSignalState, YN5 yn5) {
        String str;
        SearchSceneInfo searchSceneInfo;
        java.util.Set<String> set;
        long currentTimeMillis;
        SearchBehaviorSignalState lastState = searchBehaviorSignalState;
        YN5 action = yn5;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        StringBuilder sb = new StringBuilder();
        sb.append(action.LJLIL);
        String str2 = action.LJLILLLLZI;
        if (str2 == null || str2.length() == 0 || o.LJ(action.LJLILLLLZI, action.LJLIL)) {
            str = "";
        } else {
            str = "_" + action.LJLILLLLZI;
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!lastState.searchSceneInfo.isEmpty() && (searchSceneInfo = (SearchSceneInfo) ORZ.LLFII(lastState.searchSceneInfo)) != null) {
            CardConsumption cardConsumption = (CardConsumption) g0.LJJ(searchSceneInfo.cardConsumptionMap, sb2, new CardConsumption(null, null, null, null, null, null, null, null, null, null, 1023, null));
            if (!cardConsumption.actSet.contains(action.LJLJL.getAct())) {
                String str3 = action.LJLJJLL;
                if (str3 != null && str3.length() > 0) {
                    java.util.Set set2 = cardConsumption.productIdList;
                    if (set2 == null) {
                        set2 = OQY.INSTANCE;
                    }
                    set = F5P.LJIIL(set2, str3);
                } else {
                    set = cardConsumption.productIdList;
                }
                String str4 = action.LJLIL;
                String str5 = action.LJLILLLLZI;
                if ((str5 == null || str5.length() <= 0) && ((str5 = cardConsumption.listItemId) == null || str5.length() <= 0)) {
                    str5 = null;
                }
                String str6 = action.LJLJI;
                if ((str6 == null || str6.length() <= 0) && ((str6 = cardConsumption.tokenType) == null || str6.length() <= 0)) {
                    str6 = null;
                }
                Long LJJIJ = g0.LJJIJ(action.LJLJJI, String.valueOf(cardConsumption.innerPlayTime));
                Long LJJIJ2 = g0.LJJIJ(action.LJLJJL, String.valueOf(cardConsumption.outerPlayTime));
                java.util.Set<String> LIZ = C87273YMz.LIZ(cardConsumption.actSet, action.LJLJL);
                Long l = cardConsumption.timestamp;
                if (l != null) {
                    currentTimeMillis = l.longValue();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                CardConsumption LIZ2 = CardConsumption.LIZ(cardConsumption, str4, str5, str6, LJJIJ, LJJIJ2, set, null, null, Long.valueOf(currentTimeMillis), LIZ, 192);
                java.util.Map<String, CardConsumption> map = searchSceneInfo.cardConsumptionMap;
                if (map.size() < K3T.LIZIZ().searchCardNum && (map instanceof ConcurrentHashMap)) {
                    map.put(sb2, LIZ2);
                }
            }
        }
        return lastState;
    }
}
