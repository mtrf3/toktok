package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.e;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.K3z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51107K3z {
    public static List<OptionConfigParams> LIZIZ;
    public static final C51107K3z LIZ = new C51107K3z();
    public static final java.util.Map<Integer, List<OptionConfigParams>> LIZJ = new LinkedHashMap();

    public final synchronized List<OptionConfigParams> LIZLLL() {
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("search_filter_options_config", "");
            o.LJIIIIZZ(LJI, "getInstance().getStringV…ptionsConfig::class.java)");
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LJIILIIL = true;
            LIZIZ = (List) eVar.LIZ().LJII(LJI, new K40().getType());
        } catch (Throwable unused) {
        }
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r0.isEmpty() == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams r2) {
        /*
            r1 = 0
            if (r2 == 0) goto L2e
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.filterOptionStruct
            if (r0 == 0) goto L1e
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.filterOptionStruct
            kotlin.jvm.internal.o.LJI(r0)
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L51
        L1e:
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.followerNumberOptionStruct
            if (r0 == 0) goto L2e
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2f
        L2e:
            return r1
        L2f:
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.profilesTypesOptionStruct
            if (r0 == 0) goto L2e
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L40
            goto L2e
        L40:
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.otherPreferencesOption
            if (r0 == 0) goto L2e
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6d
            goto L2e
        L51:
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.sortTypeOptionStruct
            if (r0 == 0) goto L1e
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.search.filter.FilterOptionStruct r0 = r2.sortTypeOptionStruct
            kotlin.jvm.internal.o.LJI(r0)
            java.util.List r0 = r0.getOptionStructList()
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6d
            goto L1e
        L6d:
            r1 = 1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51107K3z.LIZ(com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams):boolean");
    }

    public final OptionConfigParams LIZJ(String str) {
        String str2;
        if (LIZIZ == null) {
            LIZLLL();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("config: ");
        List<OptionConfigParams> list = LIZIZ;
        if (list != null) {
            str2 = list.toString();
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        List<OptionConfigParams> list2 = LIZIZ;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (OptionConfigParams optionConfigParams : list2) {
            if (TextUtils.equals(optionConfigParams.searchType, str)) {
                arrayList.add(optionConfigParams);
            }
        }
        return (OptionConfigParams) ORZ.LJLLLL(arrayList);
    }

    public final OptionConfigParams LIZIZ(int i, String searchType) {
        String str;
        o.LJIIIZ(searchType, "searchType");
        java.util.Map<Integer, List<OptionConfigParams>> map = LIZJ;
        List<OptionConfigParams> list = (List) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (list == null) {
            list = LIZLLL();
            map.put(Integer.valueOf(i), list);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("config: ");
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (OptionConfigParams optionConfigParams : list) {
            if (TextUtils.equals(optionConfigParams.searchType, searchType)) {
                arrayList.add(optionConfigParams);
            }
        }
        return (OptionConfigParams) ORZ.LJLLLL(arrayList);
    }
}
