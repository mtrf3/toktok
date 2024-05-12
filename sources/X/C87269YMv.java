package X;

import com.ss.android.ugc.aweme.search.source.neo.model.CardConsumption;
import com.ss.android.ugc.aweme.search.source.neo.model.CreationSearchSignalState;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchSceneInfo;
import defpackage.g0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.YMv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87269YMv extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationSearchSignalState, YN3, CreationSearchSignalState> {
    public static final C87269YMv LJLIL = new C87269YMv();

    public C87269YMv() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final CreationSearchSignalState invoke(CreationSearchSignalState creationSearchSignalState, YN3 yn3) {
        String str;
        SearchSceneInfo searchSceneInfo;
        long currentTimeMillis;
        CreationSearchSignalState lastState = creationSearchSignalState;
        YN3 action = yn3;
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
        if (!lastState.searchMusicSceneInfo.isEmpty() && (searchSceneInfo = (SearchSceneInfo) ORZ.LLFII(lastState.searchMusicSceneInfo)) != null) {
            String str3 = null;
            CardConsumption cardConsumption = (CardConsumption) g0.LJJ(searchSceneInfo.cardConsumptionMap, sb2, new CardConsumption(null, null, null, null, null, null, null, null, null, null, 1023, null));
            if (!cardConsumption.actSet.contains(action.LJLJJLL.getAct())) {
                String str4 = action.LJLIL;
                String str5 = action.LJLILLLLZI;
                if ((str5 == null || str5.length() <= 0) && ((str5 = cardConsumption.listItemId) == null || str5.length() <= 0)) {
                    str5 = null;
                }
                String str6 = action.LJLJI;
                if ((str6 == null || str6.length() <= 0) && ((str6 = cardConsumption.tokenType) == null || str6.length() <= 0)) {
                    str6 = null;
                }
                Long LJJIJ = g0.LJJIJ(action.LJLJJL, String.valueOf(cardConsumption.musicPlayTime));
                String str7 = action.LJLJJI;
                if ((str7 != null && str7.length() > 0) || ((str7 = cardConsumption.docRank) != null && str7.length() > 0)) {
                    str3 = str7;
                }
                java.util.Set<String> set = cardConsumption.actSet;
                EnumC87257YMj enumC87257YMj = action.LJLJJLL;
                switch (C87267YMt.LIZ[enumC87257YMj.ordinal()]) {
                    case 2:
                        set = F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.MUSIC_FAVORITE_CANCEL.getAct());
                        break;
                    case 3:
                        set = F5P.LJIIJ(F5P.LJIIL(set, enumC87257YMj.getAct()), EnumC87257YMj.MUSIC_FAVORITE.getAct());
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        set = F5P.LJIIL(set, enumC87257YMj.getAct());
                        break;
                }
                Long l = cardConsumption.timestamp;
                if (l != null) {
                    currentTimeMillis = l.longValue();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                CardConsumption LIZ = CardConsumption.LIZ(cardConsumption, str4, str5, str6, null, null, null, str3, LJJIJ, Long.valueOf(currentTimeMillis), set, 56);
                java.util.Map<String, CardConsumption> map = searchSceneInfo.cardConsumptionMap;
                if (map.size() < K3T.LIZIZ().searchCardNum && (map instanceof ConcurrentHashMap)) {
                    map.put(sb2, LIZ);
                }
            }
        }
        return lastState;
    }
}
