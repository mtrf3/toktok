package X;

import com.ss.android.ugc.aweme.search.source.neo.model.CardConsumption;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSessionData;
import defpackage.g0;
import defpackage.s;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.YMx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87271YMx extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationSearchSignalState, YN7, CreationSearchSignalState> {
    public static final C87271YMx LJLIL = new C87271YMx();

    public C87271YMx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final CreationSearchSignalState invoke(CreationSearchSignalState creationSearchSignalState, YN7 yn7) {
        SearchSessionData searchSessionData;
        s<SearchSceneInfo> sVar;
        SearchSceneInfo searchSceneInfo;
        long currentTimeMillis;
        CreationSearchSignalState lastState = creationSearchSignalState;
        YN7 action = yn7;
        o.LJIIIZ(lastState, "lastState");
        o.LJIIIZ(action, "action");
        String str = action.LJLIL;
        if (!lastState.searchEffectSceneInfo.isEmpty() && (searchSessionData = (SearchSessionData) ORZ.LLFII(lastState.searchEffectSceneInfo)) != null && (sVar = searchSessionData.searchIdInfo) != null && (searchSceneInfo = (SearchSceneInfo) ORZ.LLFII(sVar)) != null) {
            String str2 = null;
            CardConsumption cardConsumption = (CardConsumption) g0.LJJ(searchSceneInfo.cardConsumptionMap, str, new CardConsumption(null, null, null, null, null, null, null, null, null, null, 1023, null));
            if (!cardConsumption.actSet.contains(action.LJLJJI.getAct())) {
                String str3 = action.LJLIL;
                String str4 = action.LJLILLLLZI;
                if ((str4 == null || str4.length() <= 0) && ((str4 = cardConsumption.tokenType) == null || str4.length() <= 0)) {
                    str4 = null;
                }
                String str5 = action.LJLJI;
                if ((str5 != null && str5.length() > 0) || ((str5 = cardConsumption.docRank) != null && str5.length() > 0)) {
                    str2 = str5;
                }
                java.util.Set<String> set = cardConsumption.actSet;
                EnumC87257YMj enumC87257YMj = action.LJLJJI;
                if (C87267YMt.LIZ[enumC87257YMj.ordinal()] == 5) {
                    set = F5P.LJIIL(set, enumC87257YMj.getAct());
                }
                Long l = cardConsumption.timestamp;
                if (l != null) {
                    currentTimeMillis = l.longValue();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                CardConsumption LIZ = CardConsumption.LIZ(cardConsumption, str3, null, str4, null, null, null, str2, null, Long.valueOf(currentTimeMillis), set, 186);
                java.util.Map<String, CardConsumption> map = searchSceneInfo.cardConsumptionMap;
                if (map.size() < K3T.LIZIZ().searchCardNum && (map instanceof ConcurrentHashMap)) {
                    map.put(str, LIZ);
                }
            }
        }
        return lastState;
    }
}
