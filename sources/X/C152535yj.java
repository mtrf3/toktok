package X;

import Y.IDComparatorS335S0100000_2;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152535yj {
    public static final C152535yj LIZ = new C152535yj();

    public static final LanguageDetail[] LIZIZ() {
        return (LanguageDetail[]) SettingsManager.LIZLLL().LJIIIIZZ("burn_in_language_list", LanguageDetail[].class, null);
    }

    public static final ArrayList<LanguageDetail> LIZJ() {
        LanguageDetail[] LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            List LJJZZIII = ORY.LJJZZIII(LIZIZ);
            if (LJJZZIII != null && !LJJZZIII.isEmpty()) {
                C152535yj c152535yj = LIZ;
                o.LJII(LJJZZIII, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail> }");
                ArrayList<LanguageDetail> arrayList = (ArrayList) LJJZZIII;
                c152535yj.getClass();
                java.util.Set<String> keySet = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getLocaleMap().keySet();
                HashMap hashMap = new HashMap();
                int size = keySet.size();
                for (int i = 0; i < size; i++) {
                    Object LJLJLJ = ORZ.LJLJLJ(keySet, i);
                    o.LJIIIIZZ(LJLJLJ, "list.elementAt(i)");
                    hashMap.put(LJLJLJ, Integer.valueOf(i));
                }
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS335S0100000_2(hashMap, 2));
                return arrayList;
            }
        }
        H78.LIZ("InlineCaptionFragment -> obtain language list failed");
        return null;
    }

    public static final String LIZ(String str) {
        List LJJZZIII;
        Object obj;
        LanguageDetail[] LIZIZ = LIZIZ();
        if (LIZIZ == null || (LJJZZIII = ORY.LJJZZIII(LIZIZ)) == null) {
            return null;
        }
        Iterator it = LJJZZIII.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((LanguageDetail) obj).localName, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LanguageDetail languageDetail = (LanguageDetail) obj;
        if (languageDetail == null) {
            return null;
        }
        return languageDetail.code;
    }
}
