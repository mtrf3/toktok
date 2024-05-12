package X;

import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KA3 implements KAP {
    @Override // X.KAP
    public final List<SearchHistory> LJJIIZI(KA7 ka7) {
        int i;
        Integer num;
        ECSearchEntranceData ecSearchEntranceData;
        String historyMaxCount;
        Integer LJJIL;
        C50948Jz6 c50948Jz6 = ka7.LIZ;
        if (c50948Jz6 != null && (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) != null && (historyMaxCount = ecSearchEntranceData.getHistoryMaxCount()) != null && (LJJIL = C38350F3i.LJJIL(historyMaxCount)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 20;
        }
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        C50948Jz6 c50948Jz62 = ka7.LIZ;
        ECSearchEntranceData eCSearchEntranceData = null;
        if (c50948Jz62 != null) {
            num = Integer.valueOf(c50948Jz62.getEcSearchEntranceValue());
        } else {
            num = null;
        }
        C50948Jz6 c50948Jz63 = ka7.LIZ;
        if (c50948Jz63 != null) {
            eCSearchEntranceData = c50948Jz63.getEcSearchEntranceData();
        }
        List<SearchHistory> LIZIZ = LLLZI.LJJLJLI(eCSearchEntranceData, num).LIZIZ();
        o.LJIIIIZZ(LIZIZ, "get().getService(ISearch…          ).searchHistory");
        return ORZ.LLILLL(LIZIZ, i);
    }

    @Override // X.KAP
    public final String LJJZ(KA7 ka7, boolean z) {
        ECSearchEntranceData eCSearchEntranceData;
        C50948Jz6 c50948Jz6 = ka7.LIZ;
        if (c50948Jz6 != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        return C51258K9u.LIZJ(eCSearchEntranceData, z);
    }

    @Override // X.KAP
    public final void LJLILLLLZI(KA7 ka7, String str, boolean z) {
        ECSearchEntranceData eCSearchEntranceData;
        C50948Jz6 c50948Jz6 = ka7.LIZ;
        if (c50948Jz6 != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        C51258K9u.LIZLLL(str, eCSearchEntranceData, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    @Override // X.KAP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(X.C50948Jz6 r38, java.lang.String r39, X.C51256K9s r40, boolean r41, com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor.ISearchSuggestContextAbilityNew r42, X.InterfaceC67352kd r43) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KA3.LJJJJLI(X.Jz6, java.lang.String, X.K9s, boolean, com.ss.android.ugc.aweme.ecommerce.search.suggest.refactor.ISearchSuggestContextAbilityNew, X.2kd):java.lang.Object");
    }
}
